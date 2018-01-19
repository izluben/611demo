CREATE TABLE user_account
(
    id INTEGER NOT NULL,
    name VARCHAR (255) NOT NULL,
    vip_status VARCHAR (255) NOT NULL,
    support_desk_id VARCHAR (255),
    PRIMARY KEY (id)
);

CREATE TABLE x1_account
(
    id INTEGER NOT NULL,
    account_number VARCHAR (255) NOT NULL,
    fk_user_id INTEGER,
    FOREIGN KEY (fk_user_id) REFERENCES user_account(id),
    PRIMARY KEY (id)
);