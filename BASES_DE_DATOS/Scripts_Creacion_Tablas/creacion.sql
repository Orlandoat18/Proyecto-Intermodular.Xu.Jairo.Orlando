create database Arcadepedia;
use Arcadepedia;

create table Usuario(
    Id_Usuario int not null auto_increment,
    Nombre_usuario varchar(100) not null,
    Email varchar(150) unique not null,
    Contrasena varchar(255) not null,
    Fecha_registro date not null,
    primary key (Id_Usuario)
);

create table Desarrollador(
    Id_Desarrollador int not null auto_increment,
    Nombre_Desarrollador varchar(150) not null,
    Pais_Desarrollador varchar(100) not null,
    Ciudad_Desarrollador varchar(100) not null,
    Fecha_fundacion_Des date not null,
    Sitio_web_Des varchar(255),
    Descripcion_Des text not null,
    primary key (Id_Desarrollador)
);

create table Distribuidor(
    Id_Distribuidor int not null auto_increment,
    Nombre_Distribuidor varchar(150) not null,
    Pais_Distribuidor varchar(100) not null,
    Ciudad_Distribuidor varchar(100) not null,
    Fecha_fundacion_Dis date not null,
    Sitio_web_Dis varchar(255),
    Descripcion_Dis text not null,
    primary key (Id_Distribuidor)
);

create table Diseñador(
    Id_Diseñador int not null auto_increment,
    Nombre_Diseñador varchar(100) not null,
    Apellido_Diseñador varchar(100) not null,
    Fecha_nacimiento date not null,
    Nacionalidad varchar(100) not null,
    primary key (Id_Diseñador)
);

create table Plataforma(
    Id_Plataforma int not null auto_increment,
    Nombre_Plataforma varchar(100) not null,
    Fabricante varchar(100) not null,
    Descripcion_P text not null,
    primary key (Id_Plataforma)
);

create table Premio(
    Id_Premio int not null auto_increment,
    Año year not null,
    Nombre_Premio varchar(150) not null,
    Categoría varchar(100) not null,
    primary key (Id_Premio)
);

create table Genero(
    Id_Genero int not null auto_increment,
    Nombre_Genero varchar(100) not null,
    Descripcion_Genero text,
    primary key (Id_Genero)
);

create table ModoDeJuego(
    Id_ModoJuego int not null auto_increment,
    Nombre_Modo varchar(100) not null,
    Descripcion_Modo text,
    primary key (Id_ModoJuego)
);

create table Videojuego(
    Id_Videojuego int not null auto_increment,
    Titulo varchar(150) not null,
    Descripcion_Videojuego text not null,
    Clasificacion_edad varchar(10) not null,
    Imagen_portada varchar(255) not null,
    primary key (Id_Videojuego),
    foreign key (Id_Desarrollador) references Desarrollador(Id_Desarrollador)
);

create table Videojuego_Distribuidor(
    Id_Videojuego int not null auto_increment,
    Id_Distribuidor int not null auto_increment,
    primary key (Id_Videojuego,Id_Distribuidor),
    foreign key (Id_Videojuego) references Videojuego(Id_Videojuego),
    foreign key (Id_Distribuidor) references Distribuidor(Id_Distribuidor)
);

create table Videojuego_Diseñador(
    Id_Videojuego int not null auto_increment,
    Id_Diseñador int not null auto_increment,
    primary key (Id_Videojuego,Id_Diseñador),
    foreign key (Id_Videojuego) references Videojuego(Id_Videojuego),
    foreign key (Id_Diseñador) references Diseñador(Id_Diseñador)
);

create table Videojuego_Plataforma(
    Id_Videojuego int not null auto_increment,
    Id_Plataforma int not null auto_increment,
    primary key (Id_Videojuego,Id_Plataforma),
    foreign key (Id_Videojuego) references Videojuego(Id_Videojuego),
    foreign key (Id_Plataforma) references Plataforma(Id_Plataforma)
);

create table Videojuego_Premio(
    Id_Videojuego int not null auto_increment,
    Id_Premio int not null auto_increment,
    primary key (Id_Videojuego,Id_Premio),
    foreign key (Id_Videojuego) references Videojuego(Id_Videojuego),
    foreign key (Id_Premio) references Premio(Id_Premio)
);

create table Videojuego_Genero(
    Id_Videojuego int not null auto_increment,
    Id_Genero int not null auto_increment,
    primary key (Id_Videojuego,Id_Genero),
    foreign key (Id_Videojuego) references Videojuego(Id_Videojuego),
    foreign key (Id_Genero) references Genero(Id_Genero)
  );

create table Videojuego_ModoDeJuego(
    Id_Videojuego int not null auto_increment,
    Id_ModoJuego int not null auto_increment,
    primary key (Id_Videojuego,Id_ModoJuego),
    foreign key (Id_Videojuego) references Videojuego(Id_Videojuego),
    foreign key (Id_ModoJuego) references ModoDeJuego(Id_ModoJuego)
    );