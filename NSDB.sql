CREATE TABLE user(
	id varchar(255) NOT NULL PRIMARY KEY,
    email varchar(255) NOT NULL,
    name varchar(255),
    password varchar(255) NOT NULL,
    phone_number varchar(20),
    user_type varchar(255) DEFAULT 'counselor',
    token varchar(255) NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    edited_at datetime DEFAULT current_timestamp,
    last_login_at datetime(6)
);    
    
    
    
    
    