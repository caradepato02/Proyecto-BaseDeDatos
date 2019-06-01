CREATE DEFINER=`root`@`localhost` TRIGGER `usuarios_BEFORE_INSERT` BEFORE INSERT ON `usuarios` FOR EACH ROW BEGIN
	declare idLocker int;
    declare idEntrenador int;
    declare  idDireccion int;
    declare idTarjeta int;
    
    #AsignaLocker
    
    if new.id_locker = 0 then
    set idLocker = AsignarLocker();
	update locker set libre = 0 where id_locker = idLocker;
    set new.id_locker = idLocker;
    end if;
    
    #Asigna entrenador
    set idEntrenador = AsignarEntrenador();
    if new.id_entrenador = 0 then
    update entrenadores set cantidad_usuarios = cantidad_usuarios + 1 where id_entrenador = idEntrenador;
    set new.id_entrenador = idEntrenador;
    
    #Asigna la id de direccion
    SELECT id_direccion FROM direcciones ORDER BY id_direccion DESC LIMIT 1 into idDireccion;
    set new.id_direccion =  idDireccion;
    
    #Asigna la id de la tarjeta
    SELECT id_tarjeta FROM tarjetas ORDER BY id_tarjeta DESC LIMIT 1 into idTarjeta;
    set new.id_tarjeta = idTarjeta;
    
    
    end if;
END