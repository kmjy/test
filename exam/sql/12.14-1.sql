create table class_info(
cino int auto_increment primary key,
ciname varchar(100) not null,
cidesc varchar(500) 
);

insert into class_info(ciname,cidesc)
values('포토일러  ','포토샵과 일러스트반 ');




alter table user_info
add column cino int not null default 1;

select user_info.* from  user_info as ui;  #as 생략 가능 my-squl 에서 서브쿼리로 () 가 들어갈때는 as 를 생략할수없다. 그니까 그냥 전부다 as 써주는게 좋다 .

select ui.userno as no;  #이라고 이름이 길때 별칭을 줘서 이름을 재정의 할수있다


select count(1),ui.userno,ui.username,ci.cino,ciname,cidesc from user_info as ui,class_info as ci   #이것처럼 아무리 중복이 안돼도 머머점 이라고 써주는게 나중에 중복될경우를 위해서라도 써주는게 가장좋다.습관화
where ui.cino = ci.cino 
and ci.cino=1;

/**/

select *from class_info;

/**/
select *from user_info;

drop table class_info;

/**/

update user_info
set cino=2
where userno>2;

/**/

select ci.cino, ci.ciname,count(1)
from user_info as ui,class_info as ci  
where ui.cino = ci.cino 
and ci.cino=2;

/**/
#요거 다시보고 그룹바이 
select ci.cino, ci.ciname,count(1)
from user_info as ui,class_info as ci  
where ui.cino = ci.cino 
group by ci.ciname;   


/**/
#요거 다시보기 : 서브쿼리를 써서 cino가 중복되지 않아도 count 값을 출력하기(컬럼에 새로 생성되네 ...신기....원래 데이터에 추가되는건 아니고 출력만 되는거 ) 
select ci.*,(select count(1) from user_info as ui where ui.cino =ci.cino) from class_info as ci;

/**/
select count(1) from user_info as ui 
where ui.cino =ci.cino;




/*             12.14 오전문제 

1.ciname 포토일러 cidesc 포토샵과 일러스트반 class_info 
2,이름 오길동 나이 20 아이다 oh 비번 oh ,cino 는 위에 추가한 포토일러의 cino를 가지고 있는 데이터를 user_info에 추가해주세요.
3. ciname 이 IOT 인 user_info 의 모든 컬럼을 출력해주세요.
4. 나이가 30 이상이면서 cidesc에 반이라는 글자가 있는 user_info와 class_info 의 모든 컬럼을 출력해주세요.
5.ciname 에 퍼블이라는 글자가 있는 user_info 와 class_info 의 모든 컬럼 출력해주세요.

*/

create table class_info(
cino int auto_increment primary key,
ciname varchar(100) not null,
cidesc varchar(500) 
);


#.1
insert into class_info(ciame,cidesc)
values('포토일러 ','포토샵과 일러스트반 ');

#.2
insert into user_info(username, userid, userpwd , userage, (select cino from class_info where ciname='포토일러')   
values('오길동','oh','oh',20); 	


#.3
select * from user_info as ui,class_info as ci  
where ui.cino = ci.cino 
and ciname = 'IOT';   

#.4

select * from user_info as ui,class_info as ci  
where ui.cino = ci.cino 

and userage >=30
and cidesc like '%반%';   

#.5

select * from user_info as ui,class_info as ci  
where ui.cino = ci.cino 
and ciname like '%퍼블%' ;

#### 확인차 ######
select *from class_info;
select *from user_info;


select *from user_info;

insert into user_info(username,userage, userid, userpwd, cino)
values('test' , 20 , 'test','test',5);

delete from class_info
where cino=4;


/**/
alter tavle user_info
add Foreign key (cino)
references class_info (cino);
/**/






















