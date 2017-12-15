insert into class_info
(ciname,cidesc)
values('IOT', '천하제일 똑똑한반'),
('3D','쓰리디프린터따위'),
('정보보안','훗');

select * from class_info;

insert into user_info(uiname, uiage , uiid, uipwd, cino)
values('홍길동',30,'red','red',1),
('금길동',20,'gold','gold',2),
('백길동',10,'white','white',3);


select * from user_info ui,class_info ci 
where ui.cino=ci.cino;


select @@autocommit;  		  #자동저장 확인

set @@autocommit =0;				#자동저장 1 키기 ,0 끄기

iot2
insert into user_info(uiname, uiage , uiid, uipwd, cino)
values('청길동',30,'blue3','blue',1);

select * from user_info;


rollback;				# 다시 돌아가기 
commit; 					#  자동 저장이 아닐때 수동 저장 하는법

alter table user_info									#기존 태이블에 컬럼 추가할때는 이렇게 한다. add로 하기 
add column uiregdate datetime default now();  		  # now는 현재시간 구하는 마스퀠 함수.



select uino, concat(uiname,uiage) uinamnage, uiid from user_info;      # 셀병합 하는 방법  concat 사용( 문자 +숫자 )
select uino, concat(1,uiname,uiage) uinamnage, uiid from user_info;     #이렇게 하면 바로 숫자가 붙어버려 개싄기