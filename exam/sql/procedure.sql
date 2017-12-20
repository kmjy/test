
#프로시저=저장된 프로시저 만들기
#빠르다,
delimiter $$
create procedure p_insert_class_info(
in p_ciname varchar(100),
p_cidesc varchar(500))
begin
   start transaction;
   insert into class_info(ciname, cidesc)
   values(p_ciname, p_cidesc);
   commit;
   select * from class_info;
end
$$
delimiter ;

delimiter $$
create procedure p_insert_class_info(
in p_ciname varchar(100),
p_cidesc varchar(500))
begin
   declare exit handler for sqlexception
   begin
      get diagnostics condition 1
      @er_no = returned_sqlstate, @er_msg=message_text;
      select @er_no, @er_msg;
      rollback;
   end;
   
   start transaction;
   insert into user_info(uiname, uiage, uiid, uipwd, cino)
   values('test', 20, 'test', 'test', 1);
   insert into class_info(ciname, cidesc)
   values(p_ciname, p_cidesc);
   commit;
   select * from class_info;
end
$$
delimiter ;

# 드래그하고 콘트롤 f9하면 선택영역 실행(마지막에 
delimiter $$
$$
delimiter ;

#프로시저 불러오기
;
call procedure p_insert_class_info;
drop procedure piot2_insert_class_info;














