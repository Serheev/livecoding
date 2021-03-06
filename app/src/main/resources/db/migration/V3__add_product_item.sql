CREATE TABLE product_item
(
    id   BIGINT PRIMARY KEY NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    name varchar(255)
);

INSERT INTO product_item (id, name)
VALUES (1, 'meat'),
       (2, 'milk'),
       (3, 'fish');

ALTER TABLE product
    ADD COLUMN "product_item_id" BIGINT;

ALTER table product
    ADD CONSTRAINT product_item___fk
        FOREIGN KEY (product_item_id) REFERENCES product_item (id);

UPDATE product
SET product_item_id = (SELECT id FROM product_item WHERE name = 'meat')
WHERE name ilike '%meat%';

UPDATE product
SET product_item_id = (SELECT id FROM product_item WHERE name = 'milk')
WHERE name ilike '%milk%';