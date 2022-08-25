drop table member;

create table member(
	mNo int primary key,
	mName varchar(20),
	Email varchar(60),
	Pw varchar(50)
);

insert into member(mNo, mName, Email, Pw)
values(1, 'KIM', 'kim@kim.com', 'kim');
insert into member(mNo, mName, Email, Pw)
values(2, 'LEE', 'lee@lee.com', 'lee');
insert into member(mNo, mName, Email, Pw)
values(3, 'PARK', 'park@park.com', 'park');

commit

select * from member;