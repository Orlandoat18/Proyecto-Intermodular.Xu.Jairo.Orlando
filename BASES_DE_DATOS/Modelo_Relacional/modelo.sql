- Desarrollador (P·Id_Desarrollador, Nombre_Desarrollador, Pais_Desarrollador, Ciudad_Desarrollador, Fecha_fundacion_Des, Sitio_web_Des, Descripcion_Des)

- Distribuidor (P·Id_Distribuidor, Nombre_Distribuidor, Pais_Distribuidor,  Ciudad_Distribuidor, Fecha_fundacion_Des, Sitio_web_Des, Descripcion_Des)
- Publicar (PF·Id_Distribuidor, PF·Id_Videojuego)

- Diseñador (P·Id_Diseñador, Nomnbre_Diseñador, Apellido_Diseñador, Fecha_nacimiento, Nacionalidad)
- Tener (PF·Id_Diseñador, PF·Id_Videojuego)

- Plataforma (P·Id_Plataforma, Nombre_Plataforma, Fabricante, Descripcion_P)
- Publicar (PF·Id_Plataforma, PF·Id_Videojuego)

- Premio (P·Id_Premio, Año, Nombre_Premio, Categoria)
- Otorgar (PF·Id_Premio, PF·Id_Videojuego)

- Género (P·Id_Genero, Nombre_Genero, Descripcion_Genero)
- Tener (PF·Id_Genero, PF·Id_Videojuego)

- Modo de Juego (P·Id_ModoJuego, Nombre_Modo, Descripcion_Modo)
- Tener (PF·Id_ModoJuego, PF·Id_Videojuego)

- Videojuego (P·Id_Videojuego, Titulo, Descripcion_Videojuego, clasificacion_edad, imagen_portada, F·Id_Dearrollador -> Desarrollador)
