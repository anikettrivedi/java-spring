CREATE TABLE cart (
  cart_id INT NOT NULL PRIMARY KEY,
  total decimal(10,0) NOT NULL,
  name varchar(10) DEFAULT NULL
);

CREATE TABLE cart_item (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  cart_id INT NOT NULL,
  item_id varchar(10) NOT NULL,
  item_total decimal(10,0) NOT NULL,
  quantity INT NOT NULL,
  CONSTRAINT items_ibfk_1 FOREIGN KEY (cart_id) REFERENCES Cart (cart_id)
)