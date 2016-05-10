create database if not exists RPG;

use RPG;

drop table if exists rpg;
create table rpg (
ID int primary key not null auto_increment,
name varchar(100) not null,
pass varchar(100) not null,
HP int not null
);