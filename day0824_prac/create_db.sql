drop table member;

create table member(
	mNo int primary key,
	mName varchar(20),
	Email varchar(60),
	Pw varchar(50)
);

drop sequence seq_member;
create sequence seq_member start with 100;
---------------------------------------------------
insert into member(mNo, mName, Email, Pw)
values(nextval('seq_member'), 'KIM', 'kim@kim.com', 'kim');
insert into member(mNo, mName, Email, Pw)
values(nextval('seq_member'), 'LEE', 'lee@lee.com', 'lee');
insert into member(mNo, mName, Email, Pw)
values(nextval('seq_member'), 'PARK', 'park@park.com', 'park');

drop table carProduct;

create table carProduct(
	pno int,
	pname varchar(30),
	company varchar(30),
	price int,
	ea int
);

drop sequence seq_carproduct;
create sequence seq_carproduct start with 1000;
---------------------------------------------
insert into carProduct(pno, pname, company, price, ea)
values(nextval('seq_carproduct'), '쏘나타', 'HYUNDAI', 2000, 10);
insert into carProduct(pno, pname, company, price, ea)
values(nextval('seq_carproduct'), '셀토스', 'KIA', 3000, 5);
insert into carProduct(pno, pname, company, price, ea)
values(nextval('seq_carproduct'), 'K5', 'KIA', 1500, 13);

commit

select * from member;
select * from carProduct;