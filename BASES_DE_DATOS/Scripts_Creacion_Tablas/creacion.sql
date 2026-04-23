create database Arcadepedia;
use Arcadepedia;

create table Usuario(
    Id_Usuario int not null auto_increment,
    Nombre_usuario varchar(100) not null,
    Email varchar(150) unique not null,
    Contrasena varchar(255) not null,
    Fecha_registro date not null
);

create table Videojuego(
    Id_Videojuego int not null auto_increment,
    Titulo varchar(150) not null,
    Descripcion_Videojuego text not null ,
    clasificacion_edad varchar(10) not null ,
    imagen_portada varchar(255) not null
);

create table Desarrollador(
    Id_Desarrollador int not null auto_increment,
    Nombre_Desarrollador varchar(150) not null,
    Pais_Desarrollador varchar(100) not null,
    Ciudad_Desarrollador varchar(100) not null,
    Fecha_fundacion_Des date not null,
    Sitio_web_Des varchar(255),
    Descripcion_Des text not null
);

create table Distribuidor(
    Id_Distribuidor int not null auto_increment,
    Nombre_Distribuidor varchar(150) not null,
    Pais_Distribuidor varchar(100) not null,
    Ciudad_Distribuidor varchar(100) not null,
    Fecha_fundacion_Dis date not null,
    Sitio_web_Dis varchar(255),
    Descripcion_Dis text not null
);

create table Diseñador(
    Id_Diseñador int not null auto_increment,
    Nombre_Diseñador varchar(100) not null,
    Apellido_Diseñador varchar(100) not null,
    Fecha_nacimiento date not null,
    Nacionalidad varchar(100) not null
);

create table Plataforma(
    Id_Plataforma int not null auto_increment,
    Nombre_Plataforma varchar(100) not null,
    Fabricante varchar(100) not null,
    Descripcion_P text not null
);

create table Premio(
    Id_Premio int not null auto_increment,
    Año year not null,
    Nombre_Premio varchar(150) not null,
    Categoría varchar(100) not null
);

create table Genero(
    Id_Genero int not null auto_increment,
    Nombre_Genero varchar(100) not null,
    Descripcion_Genero text
);

create table ModoDeJuego(
    Id_ModoJuego int not null auto_increment,
    Nombre_Modo varchar(100) not null,
    Descripcion_Modo text
);