CREATE TABLE cart (
  cart_id INT NOT NULL PRIMARY KEY,
  total decimal(10,0) NOT NULL,
  name varchar(10) DEFAULT NULL
);

CREATE TABLE cart_item (
  id INT NOT NULL PRIMARY KEY,
  cart_id INT NOT NULL,
  item_id varchar(10) NOT NULL,
  item_total decimal(10,0) NOT NULL,
  quantity INT NOT NULL,
  CONSTRAINT items_ibfk_1 FOREIGN KEY (cart_id) REFERENCES Cart (cart_id)
);

INSERT INTO cart VALUES
(1, 10.0, 'cart-1');

INSERT INTO cart_item VALUES
(1, 1, 'xyz', 1.0, 1),
(2, 1, 'asdf', 1.0, 1);