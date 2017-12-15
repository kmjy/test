primary key (num1, num2);         #프라이머리 키를 두개로 설정을 하게 되면 , 2개같이 비교해야 다른거다 그래서 지금 이게 다른거야 .
											#유니크로 잡으면 모든것이  중복이 안되어야 하기 때문에 , 유니크랑 프라이머리랑  다른차이다.
insert into test
values (1,2),
(1,1);

select *from test;

#이렇게 하면 값은 가져가지 않은 테이블이 생성된다.
#(보통 디비에서 용량이 많아졌을때 삭제를 한다고 가비지내용은 삭제안되어서 용량은 줄지 않는다 , 
#그래서 이렇게 테이블을 템프로 저장해두고 그전거 전부 드롭 하고 탬프를 다시 불러오는 방식으로 용량을 줄인다. 대신, 꼭꼭꼭꼭꼭 템프사용하면 꼭 드롭해주기 
/**/
create table tmp_cu as			
			
select  ui.*, ci.ciname, ci.cidesc from class_info ci,user_info ui								
where ci.cino = ui.cino;

select * from class_info;
select * from user_info;



####################

alter table user_info
add column address varchar(500) default '';

####################
select date_format( ui.uiregdate,'%y-%m-%d'),ci.ciname, ci.cidesc from class_info ci,user_info ui				
#'%y/%m/%d'	'%y-%m-%d' 요것도 대고 뭐 다되	.근데 이건 now 안써서이 컬럼을 생성햇을때에 날짜가 나온다.
where ci.cino = ui.cino;

select date_format( ui.uiregdate,now()'%y-%m-%d'),ci.ciname, ci.cidesc from class_info ci,user_info ui				
#now()꼭 써줘야  지금 시간으로 포맷할수있다 


select date_format( ui.uiregdate,'%h%i%s'),ci.ciname, ci.cidesc from class_info ci,user_info ui					
#이건 시간


####################