--INSERTS DE USUARIO

INSERT INTO Usuario (Nombre_usuario, Email, Contrasena, Fecha_registro)
VALUES ('Orlando', 'orlando@arcadepedia.com', 'orlando123', '2026-04-23');

INSERT INTO Usuario (Nombre_usuario, Email, Contrasena, Fecha_registro)
VALUES ('Jairo', 'jairo@arcadepedia.com', 'jairo123', '2026-04-23');

INSERT INTO Usuario (Nombre_usuario, Email, Contrasena, Fecha_registro)
VALUES ('Xu', 'xu@arcadepedia.com', 'xu123', '2026-04-23');

INSERT INTO Usuario (Nombre_usuario, Email, Contrasena, Fecha_registro)
VALUES ('RetroKing', 'retroking@arcadepedia.com', 'retro123', '2026-04-23');

INSERT INTO Usuario (Nombre_usuario, Email, Contrasena, Fecha_registro)
VALUES ('PixelNova', 'pixelnova@arcadepedia.com', 'pixel123', '2026-04-23');


--INSERTS DE VIDEOJUEGO

INSERT INTO Videojuego (Id_Desarrollador, Id_Personaje, Titulo, Descripcion_Videojuego, Clasificacion_edad)
VALUES (1, 1, 'Sekiro: Shadows Die Twice', 'Sekiro: Shadows Die Twice es un videojuego de acción-aventura desarrollado por FromSoftware y publicado por Activision. Fue dirigido por Hidetaka Miyazaki y lanzado el 22 de marzo de 2019 para PlayStation 4, Xbox One y Microsoft Windows. Su historia está 
protagonizada por un shinobi conocido como Sekiro, cuya misión es vengarse de un samurái que lo atacó y secuestró a su señor. Ambientado en los últimos años del período Sengoku, el juego presenta un mundo marchito pero aún vibrante, construido a partir de 
una reinterpretación de la estética japonesa tradicional, donde se desarrolla la historia de un guerrero regido por el código del deber. El jugador recorre entornos tridimensionales abiertos, meticulosamente diseñados y llenos de secretos por descubrir, 
mientras utiliza habilidades de combate, sigilo y movilidad para enfrentarse a enemigos poderosos en una experiencia desafiante e inmersiva.','PEGI 18');

INSERT INTO Videojuego (Id_Desarrollador, Id_Personaje, Titulo, Descripcion_Videojuego, Clasificacion_edad)
VALUES (2,2,'Minecraft','Minecraft es un videojuego de mundo abierto desarrollado por Mojang Studios y publicado por Xbox Game Studios. Fue creado originalmente por Markus Persson y lanzado oficialmente el 18 de noviembre de 2011 para múltiples plataformas, 
incluyendo Microsoft Windows, consolas y dispositivos móviles. Su propuesta se basa en la creatividad y la supervivencia en un mundo generado de forma procedimental, donde los jugadores pueden recolectar recursos, construir estructuras y explorar entornos 
infinitos. Minecraft permite tanto un modo creativo, enfocado en la construcción libre sin limitaciones, como un modo supervivencia, donde el jugador debe gestionar su salud, hambre y enfrentarse a enemigos hostiles. Su estilo visual de bloques y su jugabilidad 
abierta han convertido al juego en una experiencia única, fomentando la imaginación y la exploración en un entorno dinámico lleno de posibilidades.','PEGI 7');

INSERT INTO Videojuego (Id_Desarrollador, Id_Personaje, Titulo, Descripcion_Videojuego, Clasificacion_edad)
VALUES (3, 3, 'God of War','God of War es un videojuego de acción y aventura desarrollado por Santa Monica Studio y publicado por Sony Interactive Entertainment. Dirigido por Cory Barlog, fue lanzado el 20 de abril de 2018 para PlayStation 4. La historia sigue a Kratos, 
un antiguo dios de la guerra, que ahora vive en el mundo de la mitología nórdica junto a su hijo Atreus. Tras la muerte de su esposa, ambos emprenden un viaje para cumplir su último deseo, enfrentándose a criaturas mitológicas y dioses mientras fortalecen su relación. 
El juego presenta un sistema de combate renovado, más estratégico y cercano, con una cámara en tercera persona continua que intensifica la inmersión. Ambientado en un mundo rico en detalles y narrativa, God of War combina exploración, resolución de acertijos y combates 
intensos, ofreciendo una experiencia emocional y profunda que redefine la saga.','PEGI 18');

INSERT INTO Videojuego (Id_Desarrollador, Id_Personaje, Titulo, Descripcion_Videojuego, Clasificacion_edad)
VALUES (4, 4,'Hollow Knight','Hollow Knight es un videojuego de acción y aventura estilo metroidvania desarrollado y publicado por Team Cherry. Fue lanzado el 24 de febrero de 2017 para Microsoft Windows, y posteriormente para otras plataformas como Nintendo Switch, 
PlayStation 4 y Xbox One. El juego sigue a un misterioso caballero que explora el reino subterráneo de Hallownest, un mundo en ruinas lleno de criaturas extrañas, secretos ocultos y desafíos constantes. A medida que avanza, el jugador desbloquea habilidades que 
le permiten acceder a nuevas áreas y enfrentarse a poderosos enemigos y jefes. Su estética dibujada a mano, acompañada de una atmósfera melancólica y una banda sonora envolvente, crea una experiencia inmersiva única. Hollow Knight destaca por su diseño de niveles 
interconectado, su dificultad desafiante y la profundidad de su mundo, invitando a la exploración y al descubrimiento constante.','PEGI 7');

INSERT INTO Videojuego (Id_Desarrollador, Id_Personaje, Titulo, Descripcion_Videojuego, Clasificacion_edad)
VALUES (5,5,'Asphalt Legends Unite', 'Asphalt Legends Unite es un videojuego de carreras desarrollado por Gameloft Barcelona y publicado por Gameloft. Originalmente lanzado como Asphalt 9: Legends el 25 de julio de 2018, el título evolucionó posteriormente a Asphalt 
Legends Unite, incorporando nuevas funciones multijugador y compatibilidad entre plataformas como Microsoft Windows, Xbox, PlayStation, Nintendo Switch y dispositivos móviles. El juego ofrece una experiencia de conducción arcade centrada en la velocidad extrema, 
los derrapes espectaculares y las acrobacias aéreas en circuitos ambientados en diferentes partes del mundo. Los jugadores pueden desbloquear y personalizar una amplia variedad de vehículos licenciados de marcas reconocidas, mejorando su rendimiento para competir 
en eventos, temporadas y desafíos en línea. Con gráficos detallados, efectos visuales dinámicos y un sistema de progresión competitivo, Asphalt Legends Unite destaca por ofrecer carreras intensas y accesibles, combinando acción rápida con una presentación visual 
moderna y llamativa.','PEGI 12');


--INSERTS DE GENERO

INSERT INTO Genero (Nombre_Genero, Descripcion_Genero)
VALUES ('Acción', 'Género centrado en combates rápidos, reflejos y enfrentamientos intensos contra enemigos.');

INSERT INTO Genero (Nombre_Genero, Descripcion_Genero)
VALUES ('Aventura','Género enfocado en la exploración, narrativa y descubrimiento de entornos, personajes y secretos.');

INSERT INTO Genero (Nombre_Genero, Descripcion_Genero)
VALUES ('RPG','Género de rol donde el jugador desarrolla habilidades, 
progresa personajes y toma decisiones dentro de una historia.');


--INSERTS DE PERSONAJE

INSERT INTO Personaje (Nombre_Personaje, Descripcion_Personaje)
VALUES ('Sekiro','Es un shinobi que sirve a un joven señor descendiente de un antiguo linaje. Ligado a su honor, es un 
hombre sereno y reservado, aunque también despiadado a la hora de completar su misión de venganza con los métodos que sean necesarios.');

INSERT INTO Personaje (Nombre_Personaje, Descripcion_Personaje)
VALUES ( 'Steve', 'Steve es el personaje principal y predeterminado de Minecraft. Puede explorar, construir estructuras,
 recolectar recursos y sobrevivir frente a criaturas hostiles en un mundo abierto generado proceduralmente.' );

INSERT INTO Personaje (Nombre_Personaje, Descripcion_Personaje)
VALUES ( 'Kratos', 'Kratos es el protagonista de God of War, un antiguo dios de la guerra espartano que viaja junto 
a su hijo Atreus enfrentándose a criaturas y dioses de la mitología nórdica.' );

INSERT INTO Personaje (Nombre_Personaje, Descripcion_Personaje)
VALUES ( 'The Knight', 'The Knight es el protagonista silencioso de Hollow Knight, un guerrero misterioso que 
explora el reino subterráneo de Hallownest enfrentándose a enemigos y descubriendo secretos ocultos.' );

INSERT INTO Personaje (Nombre_Personaje, Descripcion_Personaje)
VALUES ('Driver Syndicate', 'Driver Syndicate representa a uno de los pilotos principales de Asphalt Legends Unite, 
participando en carreras arcade de alta velocidad utilizando vehículos deportivos de lujo.' );


--INSERTS DE PREMIOS

INSERT INTO Premio (Año, Nombre_Premio, Categoría)
VALUES (2018, 'The Game Awards', 'Mejor Juego de Acción');

INSERT INTO Premio (Año, Nombre_Premio, Categoría)
VALUES (2019, 'Golden Joystick Awards', 'Juego del Año');

INSERT INTO Premio (Año, Nombre_Premio, Categoría)
VALUES (2020, 'BAFTA Games Awards', 'Mejor Diseño de Juego');

INSERT INTO Premio (Año, Nombre_Premio, Categoría)
VALUES (2021, 'DICE Awards', 'Mejor Dirección Artística');

INSERT INTO Premio (Año, Nombre_Premio, Categoría)
VALUES (2022, 'Steam Awards', 'Juego Más Innovador');