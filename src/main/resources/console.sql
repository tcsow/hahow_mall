use hahow_mall;
CREATE TABLE product
(
    id                 BIGINT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
    product_name       VARCHAR(128)   NOT NULL,
    category           VARCHAR(32)    NOT NULL,
    image_url          VARCHAR(256)   NOT NULL,
    price              DECIMAL(10, 2) NOT NULL,
    stock              INT            NOT NULL,
    description        VARCHAR(1024),
    created_date       DATETIME       NOT NULL,
    last_modified_date DATETIME       NOT NULL
);

INSERT INTO product (product_name, category, image_url, price, stock, description, created_date, last_modified_date)
VALUES ('蘋果', 'FOOD', 'https://cdn.pixabay.com/photo/2014/02/01/17/28/apple-256261__480.jpg', 20, 10,
        '這是來自澳洲的蘋果！', '2022-03-01 02:41:28', '2022-03-01 02:41:32');
