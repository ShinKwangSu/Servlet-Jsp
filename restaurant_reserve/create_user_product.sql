-- Mother table
drop table product;

create table product (
rno number(4) primary key,
rtitle varchar2(100) not null,
rprice number(7)
);

drop sequence seq_product;
create sequence seq_product start with 100;
-------------------------------------------------
insert into product(rno, rtitle, rprice)
values (nextval('seq_product'), '점심예약', 150000);
insert into product(rno, rtitle, rprice)
values (nextval('seq_product'), '저녁예약', 190000);
insert into product(rno, rtitle, rprice)
values (nextval('seq_product'), '주말점심예약', 160000);
insert into product(rno, rtitle, rprice)
values (nextval('seq_product'), '주말저녁예약', 200000);

-- Child table
drop table people;

create table people (
pno number primary key,
name varchar2(50) not null,
phone char(13) not null,
rpay char(1),
rno number,
constraint people_fk
foreign key (rno)
references product(rno)
on delete cascade
);

create sequence seq_people start with 1000;

insert into people(pno, name, phone, rpay, rno)
values(nextval('seq_people'), '이유림', '010-1111-1111', 'T', (select max(rno) from product));
insert into people(pno, name, phone, rpay, rno)
values(nextval('seq_people'), '김범준', '010-1111-1112', 'F', (select max(rno)-1 from product));
insert into people(pno, name, phone, rpay, rno)
values(nextval('seq_people'), '염기승', '010-1111-1113', 'F', (select max(rno)-2 from product));

select * from tab;
select * from seq;

select * from product;
select * from people;

commit