SELECT * FROM Usuario;


SELECT Nombre_Genero
    FROM Genero
    ORDER BY Nombre_Genero ASC;


SELECT Nombre_usuario, Email
    FROM Usuario
    WHERE Fecha_registro > '2026-01-01';


SELECT *
    FROM Genero
    WHERE Nombre_Genero = 'Acción';


SELECT Nombre_Desarrollador,
    COUNT(Videojuego.Id_Videojuego) AS Total_Juegos
    FROM Desarrollador
    INNER JOIN Videojuego
    ON Desarrollador.Id_Desarrollador = Videojuego.Id_Desarrollador
    GROUP BY Nombre_Desarrollador;


SELECT Titulo
    FROM Videojuego
    WHERE Titulo LIKE '%War%';


SELECT *
    FROM Usuario
    WHERE Nombre_usuario = 'Orlando';


SELECT Titulo, Clasificacion_edad
    FROM Videojuego
    WHERE Clasificacion_edad = 'PEGI 7';


SELECT Titulo, Nombre_Desarrollador
    FROM Videojuego
    INNER JOIN Desarrollador
    ON Videojuego.Id_Desarrollador = Desarrollador.Id_Desarrollador;


SELECT Titulo, Clasificacion_edad
    FROM Videojuego
    WHERE Clasificacion_edad = 'PEGI 18'
    ORDER BY Titulo ASC;