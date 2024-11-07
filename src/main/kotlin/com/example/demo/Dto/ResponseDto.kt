package com.example.demo.Dto

import lombok.AllArgsConstructor
import lombok.Data

@Data
@AllArgsConstructor(staticName = "set")
data class ResponseDto<D> private constructor(
    private val result: Boolean,
    private val message: String,
    private val data: D? = null
) {
    companion object {
        // 성공 상태 생성 메서드
        fun <D> setSuccess(message: String): ResponseDto<D> {
            return ResponseDto(true, message, null)
        }

        // 실패 상태 생성 메서드
        fun <D> setFailed(message: String): ResponseDto<D> {
            return ResponseDto(false, message, null)
        }

        // 성공 상태와 데이터 포함 생성 메서드
        fun <D> setSuccessData(message: String, data: D): ResponseDto<D> {
            return ResponseDto(true, message, data)
        }

        // 실패 상태와 데이터 포함 생성 메서드
        fun <D> setFailedData(message: String, data: D): ResponseDto<D> {
            return ResponseDto(false, message, data)
        }
    }

    // result에 대한 getter 메서드
    fun getResult(): Boolean = result

    // message에 대한 getter 메서드
    fun getMessage(): String = message

    // data에 대한 getter 메서드
    fun getData(): D? = data
}