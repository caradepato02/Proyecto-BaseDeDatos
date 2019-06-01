CREATE DEFINER=`root`@`localhost` FUNCTION `calorias`(id int, anno varchar(5), mes varchar(3) ) RETURNS int(11)
BEGIN
declare caloriasTot int;

declare fecha1 date;
declare fecha2 date;


set fecha1 = concat(anno,"/",mes,"/","01");
set fecha2 = concat(anno,"/",mes,"/","30");



select sum(calorias) as calo into caloriasTot from estadisticas_usuario  where id_usuario = id and fecha between fecha1 and fecha2 ;




RETURN caloriasTot;
END