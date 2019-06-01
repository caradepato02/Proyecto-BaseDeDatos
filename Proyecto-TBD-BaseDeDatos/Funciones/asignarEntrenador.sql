CREATE DEFINER=`root`@`localhost` FUNCTION `AsignarEntrenador`() RETURNS int(11)
BEGIN
declare id int;
declare min int;
    #Encuentra la cantidad minima de usuarios que tiene un entrenador
	select min(cantidad_usuarios) as "minimo" from entrenadores into min;
    #Selecciona a un solo entrenador que tenga la cantidad minima
    select id_entrenador from entrenadores where cantidad_usuarios = min limit 1 into id;
RETURN id;
END