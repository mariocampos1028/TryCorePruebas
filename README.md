# TryCorePruebas
#patronDiseño 
------------
para el desarrollo del back se uso un patron de diseño tipo facade, donde se implemento las fachadas para tratar todo el core de negocio y dejar aislado los componentes de controller, entitys, y dao

este desarrollo esta definido en un front y un back el cual tiene unas apis tipo REST estas son consumidas por un front diseñado en angular 10, HTML, CSS3, Bootstrap que consume cada servicio segun a peticion

#back 
---
en el back cuenta con los siguientes paquetes

controller
fachada
fachadaimpl
dao
entitys

#front
----
en el front se realizo la creacion de componentes para:
-  la navegacion, vista persona, vista detallepersona, vista planeta, vista planetadetalle
-  se crearon los servicios que hacen el llamado a los rest del back personaService y planetaService
-  las clases modelo para persona y detalle 


#BD
---
la base de datos de uso: H2 DBMS


#USO
-------
para el uso lo primero que se debe hacer es poblar la BD por lo cual se relaciona unos scripts de insercion para poder validar el funcionamiento.

#Scripts:
---------

- Entidad Planeta:

INSERT INTO PLANETA (CONTADOR,DIAMETRO,NOMBRE,CANTIDAD_PERSONAS) VALUES (0,20000,'TIERRA',0);
INSERT INTO PLANETA (CONTADOR,DIAMETRO,NOMBRE,CANTIDAD_PERSONAS) VALUES (0,12000,'MARTE',0);
INSERT INTO PLANETA (CONTADOR,DIAMETRO,NOMBRE,CANTIDAD_PERSONAS) VALUES (0,350000,'JUPITER',0);
INSERT INTO PLANETA (CONTADOR,DIAMETRO,NOMBRE,CANTIDAD_PERSONAS) VALUES (0,124986,'MERCURIO',0);
INSERT INTO PLANETA (CONTADOR,DIAMETRO,NOMBRE,CANTIDAD_PERSONAS) VALUES (0,155986,'VENUS',0);

- Entidad Persona:


INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(174,0,32,'Mario Alberto Campos',1);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(170,0,27,'Daniel Cardozo',1);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(178,0,29,'Marcos Andres Perez',1);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(165,0,27,'Maria Alejandra Caceres',1);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(167,0,27,'Leonardo Andres Mora',1);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(140,0,27,'ET',2);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(120,0,27,'Alf',2);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(210,0,27,'Extraterrestre 1',3);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(220,0,27,'Extraterrestre 2',3);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(225,0,27,'Extraterrestre 3',3);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(220,0,27,'Extraterrestre 4',3);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(225,0,27,'Extraterrestre 5',4);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(225,0,27,'Extraterrestre 6',4);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(225,0,27,'Extraterrestre 7',5);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(225,0,27,'Extraterrestre 8',5);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(225,0,27,'Extraterrestre 9',5);
INSERT INTO PERSONA (ALTURA, CONTADOR, EDAD, NOMBRE, PLANETA_ID) VALUES(225,0,27,'Extraterrestre 10',5);



#Interfaz
---------

una vez se haya ejecutado los scripts y se haya subido el front y back accediendo a la ruta por defecto
http://localhost:4200/#/home
se encontrara dos botones para guiar hacia que interfaz desea ingresar si persona o planeta.

- si ingresamos a la pantalla de persona esta nos mostrara el listado de las personas en el sistema correspondiente segun el requerimiento y tendra una vista detalle donde nos mostrara un poco mas a detalle sobre la persona seleccionada en una pantalla alterna.

- si ingresamos a la pantalla de planeta nos mostrara dos cosas, la primera es un link que nos mostrara un modal del top 3 de planetas con mas visitas y la segunda es una tabla donde estaran los planetas registrados en el sistema y este tambien segun las especificaciones del requerimiento este tambien tendra una vista detalle del planeta seleccionado, adicionalmente como uno de los plus esta la vista lite dentro del detalle del planeta donde muestra las personas que pertenecen al planeta que se selecciono en el detalle.

- adicionalmente a lo dicho anteriormente este aplicativo tiene las reglas definidas dentro del documento de requerimientos, en cuanto a incremento de contadores tanto para las pantallas de persona y planeta.
