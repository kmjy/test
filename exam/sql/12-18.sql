create user `test`@`localhost`identified by 'test';    # localhost 를 %로하면 다를사람들도 접속가능하다. #localhost 는 생성컴퓨터에서만 접속이 가능하다.

create database test2;

grant all privileges on test2. *to `test`@`localhost`;  #권한 주는 방법
#위에는 걍 외워야해 어쩔수없엉....



select table_schema,data_length,index_length from information_schema.tables			  
where table_schema='iot2';
#쓰고있는 데이터양  그냥 나오는 것은 단위가 바이트야


select sum(data_length + index_length)/1024/1024 from information_schema.tables			 
where table_schema='iot2';
 #이렇게sum 을써서 그냥 더해줄수있다...   sum 은 row를 더하는거야 !! 
 
select @@ autocommit;

show variables
where variable_name ='autocommit';

#요걸로도 autocommit 을 확인할수도있다.

select @@version; 
show variables
where variable_name ='version';

#버전도 이렇게 확인가능


select @@general_log;
show variables
where variable_name ='version';
set global general_log=1;

#제네럴로그설정

select @@version,@@general_log;
show variables
where variable_name ='version';
set global general_log=1;

#같이 확인할때는 요렇게 콤마로 


##################################

create table user_info(
user_num inr(3) auto_increment primary key,
user_id varchar(30) not null,
user_name varchar(30) not null,
unique index(user_id));   				#유니크인덱스주기

create table board(
b_num int(3) auto_increment primary key,
b_title varchar(30) not null,
user_num int(3) not null,
foreign key(user_num) references user_info(user_num));  #user_info 테이블의 user_num과 외래키로 연결

##################################



