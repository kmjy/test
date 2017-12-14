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

set @@autocommit =0;				#자동저장 1 키기 ,0 끠기


insert into user_info(uiname, uiage , uiid, uipwd, cino)
values('청길동',30,'blue','blue',1);

select * from user_info;


rollback;				# 다시 돌아가기 
commit;