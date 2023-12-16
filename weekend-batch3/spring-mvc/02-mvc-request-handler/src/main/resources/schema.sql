create table course (
	id int primary key auto_increment,
	name varchar(50) not null,
	duration int not null,
	price int not null,
	level varchar(20) not null
);