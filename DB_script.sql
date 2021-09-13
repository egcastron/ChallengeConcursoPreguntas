CREATE SCHEMA challenge_concurso_preguntas;

USE challenge_concurso_preguntas;

CREATE TABLE preguntas(
    id_nivel integer,
    pregunta varchar(170),
    respuesta1 varchar(50),
    respuesta2 varchar(50),
    respuesta3 varchar(50),
    respuesta4 varchar(50),
    res_correcta varchar(50)
);

CREATE TABLE participantes(
    nombre varchar(50),
    premio integer,
    preg_max integer,
    fecha datetime
);

INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(101, 'En una disciplina del atletismo olímpico los corredores saltan', 'Tapias', 'Matones', 'Canecas', 'Vallas', 'Vallas');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(102, 'Uno de los siguientes animales no se reproduce por huevos', 'Pinguino', 'Gallina', 'Murciélago', 'Tortuga', 'Murciélago');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(103, 'El "papá" de Mickey Mouse fue un hombre llamado', 'William', 'Walt', 'Carlos', 'Miguelito', 'Walt');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(104, 'Un finado es', 'Una persona con gusto', 'Una tela fina', 'Un instrumento afinado', 'Una persona muerta', 'Una persona muerta');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(105, 'Este instrumento hace parte obligatoria de un conjunto tradicional de joropo', 'Arpa', 'Redoblante', 'Acordeón', 'Platillos', 'Arpa');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(201, '¿Qué animal le daba buenos consejos a Pinocho?', 'Un grillo', 'Un león', 'Un burro', 'Un pollito', 'Un grillo');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(202, 'Los sacramentos son actos típicos del', 'Judaísmo', 'Budismo', 'Sintoísmo', 'Catolicismo', 'Catolicismo');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(203, '¿Qué es la Bilirrubina?', 'Una hormona sexual', 'Un pigmento biliar', 'Una célula maligna', 'Un tipo de glóbulo rojo', 'Un pigmento biliar');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(204, 'Según la Biblia, Abel, el hijo de Adán y Eva, se dedicaba a', 'Escribir el Génesis', 'Ordeñar las vacas', 'Labrar la tierra', 'Pastorear ovejas', 'Pastorear ovejas');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(205, 'El número máximo de personas que pueden admitirse en un estadio o teatro, se conoce con el nombre de', 'Apostado', 'Apero', 'Alineación', 'Aforo', 'Aforo');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(301, 'El Cóndor fue declarado monumento natural en', 'Estados Unidos', 'Venezuela', 'Colombia', 'Chile', 'Chile');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(302, 'Saddam Hussein fue dictador de', 'Irán', 'Arabia Saudita', 'Irak', 'Siria', 'Irak');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(303, 'Es más probable encontrar malecones en una ciudad', 'Costera', 'Rivereña', 'Montañosa', 'Subterránea', 'Costera');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(304, 'Francisco José de Caldas nació en', 'Pereira', 'Pasto', 'Popayán', 'Pitalito', 'Popayán');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(305, '¿De qué nacionalidad es el famoso diseñador de moda Óscar de la Renta?', 'Español', 'Dominicano', 'Colombiano', 'Portugués', 'Dominicano');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(401, 'Una organización táctica para el combate creada en la Antigua Grecia, fue', 'La legión', 'El pretorio', 'La falange', 'La quilla', 'La falange');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(402, 'El poeta latino Horacio escribió la obra', 'Pónticas', 'Odas', 'El Vesubio', 'Fiestas Galantes', 'Odas');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(403, 'Los calvinistas se dividen en estos grupos mayoritarios', 'Puritanos, socinistas e independientes', 'Fanáticos y luteranos', 'Creyentes y puritanos', 'Devotos, independientes y luteranos', 'Puritanos, socinistas e independientes');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(404, 'El juramento Nightingale es un compromiso con su profesión que hacen', 'Abogados', 'Enfermeras', 'Economistas', 'Odontólogos', 'Enfermeras');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(405, '¿A qué organización religiosa se convirtió Malcolm X durante su encarcelamiento?', 'Iglesia mormona', 'Adventistas', 'Nación del Islam', 'Testigos de Jehová', 'Nación del Islam');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(501, '¿A qué corriente pertenece el arquitecto Víctor Horta?', 'Bauhaus', 'Art Nouveau', 'Gótica', 'Flamenca', 'Art Nouveau');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(502, 'Los estadounidenses Lewis y Clark conformaron una famosa pareja de', 'Legisladores', 'Tenistas', 'Exploradores', 'Cómicos', 'Exploradores');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(503, 'De acuerdo a la obra de teatro de Moliére, Tartufo es', 'Un rey', 'Un cocinero', 'Un mosquetero', 'Un impostor', 'Un impostor');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(504, 'La listeria es un tipo de', 'Planta', 'Ave', 'Bacteria', 'Alga', 'Bacteria');
INSERT  INTO  preguntas(id_nivel, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, res_correcta) VALUES(505, '¿Cuál es la nacionalidad del tenista Novak Djokovic?', 'Rumana', 'Serbia', 'Rusa', 'Eslovena', 'Serbia');
