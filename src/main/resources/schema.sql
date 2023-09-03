CREATE TABLE MEMBER (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    createdDate TIMESTAMP,
    updatedDate TIMESTAMP,
    createdBy VARCHAR(255),
    updatedBy VARCHAR(255)
    );