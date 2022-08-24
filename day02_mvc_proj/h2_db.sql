CREATE TABLE member(
no int PRIMARY KEY auto_increment,
name varchar(20),
phone varchar(20)
);

CREATE TABLE bbs(
no int PRIMARY KEY auto_increment,
name varchar(20),
phone varchar(20)
);

CREATE TABLE shop(
no int PRIMARY KEY auto_increment,
name varchar(20),
date varchar(20)
);

drop table member;
drop table bbs;
drop table shop;

select * from member;

insert into member(name, phone) values('SHIN', '010-1111-1111');
insert into member(name, phone) values('a', '010-1111-1111');
insert into member(name, phone) values('b', '010-1111-1111');
insert into member(name, phone) values('c', '010-1111-1111');