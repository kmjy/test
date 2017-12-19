create table user_info(
userno int auto_increment primary key,                      /*primary key 가 값의 중복을 방지해준다 */
username varchar(100) not null, 
userage int not null,
userid varchar(100) not null,
userpwd varchar(100) not null
);

/**/iot2user
insert into user_info(username, userid, userpwd , userage)   /*초기에 생성한 순서 말고 새로 생성 */
values('임임임꺽정','test','test',20); 								/* 값의 순서는 똑같이 하기  */

/**/
select userno from user_info;

select userno,userid from user_info;

select * from user_info
where userno in(1,2,3) ; 												   /*  콤마를쓰게 되면 1000개 정도밖에 안된다 그래서 or을 써줘야해 */

select * from user_info
where userno  =1 or userno  =2; 										    /* or 쓰려면 이렇게 userno 달아줘야한다 */

select * from user_info
where userno != 1;

select * from user_info
where userno <> 1;

select * from user_info
where userno not in(1,2);

select * from user_info; 											/*테이블 확인해볼때 요거 실행 */

select * from user_info
where username = '임꺽정';

select * from user_info
where username like '%임'; 										 /*요렇게 하면 무조건마지막  임 인걸 찾는다 */

select * from user_info
where username like '%꺽정%';									  /*  %를 양쪽에 넣으면 자리 상관없이 단어자체만으로 찾는다 */

select * from user_info
where username not like '%꺽정%';  

/**/
update user_info
set username = '이순신' , userage=20     						 /*두개를 바꿀때는  콤마를 꼭 쓰기 */
where userno=1;    												   /*where 로 꼭 하나만 바꿔줘야해 꼭꼭꼭꼭꼭꼭꼭!!!!안그럼 다 바뀌어!!!!!!!!!꼭꼭 실무에서 많이 실수해 */

select *from user_info;

/**/

delete from user_info											/*delete 얘는 별표를 안써준다. */
where userno =5;

select *from user_info;

/**/
select *from user_info
where username='임임임꺽정'
and userno=9;													/*얘는 and 로 하네 */

select min(userno), max(userno),count(2) from user_info
where username='임임임꺽정';

/**/

select *from user_info
where username='청길동';
and userno in(select userno from user_info
where username='청길동');							

/**/

select sum(userage),avg(userage),count(1) from user_info;   	/*window 함수 */

/**/

 
select * from user_info;  
/* C create R read U update D delete  = I insert  S select  U update  D delete*/

drop table user_info;						/*전체데이터 삭제 */

/**/

insert into user_info(username,userage,userid,userpwd)
values('홍길동',30,'hong','hong'),
('흙길동',10,'black','black'),
('백길동',40,'white','white'),
('청길동',52,'blue','blue')
;

/**/
#1)
select * from user_info
where userage <= 30
and username like('흙%');

#2)나이가 52와 같거나 userid가 hong 인 사람을 
select * from user_info
where userage =52
or userid ='hong';


#3)나이가 20보다 크거나 30보다 작은사람

select * from user_info
where userage >20
or userage <30;

#4)userage 가 제일 작음 사람이거나 제일많은 사람을 검색해주세요.


select * from user_info
where userage=(select min(userage) from user_info)
or userage=(select max(userage) from user_info);

#in 을 써서하면 

select * from user_info
where userage in((select min(userage) from user_info) , (select max(userage) from user_info))
;


