CREATE DEFINER=`root`@`localhost` FUNCTION `AsignarLocker`() RETURNS int(11)
BEGIN
declare id int;
select id_locker from locker where libre = 1 limit 1 into id;
RETURN id;
END