# Explicación del diseño:
- DIAGRAMA E-R:
  - Partiendo desde la tabla central (Videojuego):

  # TABLAS INFERIORES (Premio, Género, Modo de Juego)
  - Un videojuego puede tener 1 o varios modos de juego (1,N). Un modo de juego puede estar incluido en 1 o varios videojuegos (1,N). --> (N:M)
  - Un videojuego puede tener 1 o varios géneros (1,N). Un género puede pertenecer a 1 o varios videojuegos (1,N). --> (N:M)
  - Un videojuego puede otorgar 1 o varios premios (1,N). Un premio en concreto puede ser otorgado solo en un videojuego en concreto (0,N). --> (N:M)

  # TABLAS SUPERIORES (Desarrollador, Distribuidor):
  - Un videojuego puede pertenecer solo a 1 desarrollador (1,1). Un desarrollador puede tener 1 o varios videojuegos (1,N). --> (1:N)
  - Un videojuego puede ser publicado por 1 o varias distribuidoras (1,N). Un distribuidor puede publicar 1 o varios videojuego (1,N). --> (N:M)
 
  # TABLAS LADO DERECHO (Diseñador, Plataforma):
  - Un videojuego puede estar diseñado por 1 o varios diseñadores (1,N). Un diseñador puede diseñar 1 o varios videojuego (1,N)
  - Un videojuego puede ser publicado en 1 o varias plataformas distintas (1,N). En una plataforma se puede publicar 1 o varios videojuegos (1,N). --> (N:M)
 
  # TABLA AISLADA (Uusuario):
  - La tabla usuario está aislada porque dentro del diseño E-R no esta relacionada directamente, no participa en las relaciones principales de la tabla videojuegos. No hay una función que las conecte, la tabla usuarios se encarga de guardar los registros de usuarios guardando sus datos básicos de acceso. Si se quisiera relacionar la tabla de alguna manera se necesitarian futuras ampliaciones del proyecto, la tabla de usuario se podría relacionar con la tabla de videojuego mediante otra tabla intermedia.
