drop table member;

create table member(
	memNo int primary key,
	memName varchar(20),
	memEmail varchar(60),
	memPw varchar(50),
	regDate varchar(20)
);

insert into member(memNo, memName, memEmail, memPw, regDate)
values(1, 'KIM', 'kim@kim.com', 'kim', '2022-08-21');
insert into member(memNo, memName, memEmail, memPw, regDate)
values(2, 'LEE', 'lee@lee.com', 'lee', '2022-08-22');
insert into member(memNo, memName, memEmail, memPw, regDate)
values(3, 'PARK', 'park@park.com', 'park', '2022-08-23');

commit

select * from member;