
-- insert into x1_account (id, account_number) values (1, '11111111111');
-- insert into x1_account (id, account_number) values (2, '22222222222');
-- insert into x1_account (id, account_number) values (3, '33333333333');
--
-- insert into user_account (id, name, vip_status, support_desk_id) values (1, 'Stas Menshykov', 'vip', '12345');
-- insert into user_account (id, name, vip_status, support_desk_id) values (2, 'Ivan Ivanov', '', '12345');
--
-- update x1_account set fk_user_id=1 where id=1;
-- update x1_account set fk_user_id=2 where id=2;
-- update x1_account set fk_user_id=1 where id=3;

insert into user_account (id, name, vip_status, support_desk_id) values (1, 'Stas Menshykov', 'vip', '12345');
insert into user_account (id, name, vip_status, support_desk_id) values (2, 'Ivan Ivanov', '', '12345');

insert into x1_account (id, account_number, fk_user_id) values (1, '11111111111', 1);
insert into x1_account (id, account_number, fk_user_id) values (2, '22222222222', 2);
insert into x1_account (id, account_number, fk_user_id) values (3, '33333333333', 1);