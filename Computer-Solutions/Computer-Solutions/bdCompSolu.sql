create database bdcs;
use bdcs;
create table evento(
idEvent int primary key auto_increment,
nome varchar(45) not null,
descEvent varchar(250),
dataInicio date not null,
dataFim date not null,
horaInicio date not null,
horaFim date not null
);


create table usuario(
idUsu int primary key auto_increment,
nomeUsu varchar(50) not null,
idadeUsu int not null,
emailUsu varchar(100) not null,
cpfUsu char(9) not null,
senhaUsu char(6) not null,
sexoUsu varchar(9)
);

alter table usuario drop column idadeUsu;
alter table usuario add dataNascUsuario date;

ALTER TABLE USUARIO DROP column cpfUsu;
alter table usuario add cpfUsu char(11);

select * from usuario;


create table administrador(
idAdm int primary key auto_increment,
nomeAdm varchar(50) not null,
idadeUsu int not null,
emailUsu varchar (100) not null,
cpfAdm char(9) not null,
senhaAdm char(6) not null,
sexoAdm varchar(9)
);


alter table administrador add idEvento int;
alter table administrador add idUsuario int;

ALTER TABLE administrador ADD CONSTRAINT FK_idEvento FOREIGN KEY 
(idEvento) REFERENCES evento (idEvent);
ALTER TABLE administrador ADD CONSTRAINT FK_idUsuario FOREIGN KEY 
(idUsuario) REFERENCES usuario (idUsu);

create table administra (
idAdministra int primary key auto_increment,
idAdm int not null, 
idUsu int not null
);

ALTER TABLE administra ADD CONSTRAINT FK_idAdm FOREIGN KEY 
(idAdm) REFERENCES administrador (idAdm);
ALTER TABLE administra ADD CONSTRAINT FK_idUsu FOREIGN KEY 
(idUsu) REFERENCES usuario (idUsu);

create table participa (
idParticipa int primary key auto_increment,
idEvento int not null,
idUsuario int not null
);

ALTER TABLE participa ADD CONSTRAINT FK_idEve FOREIGN KEY 
(idEvento) REFERENCES evento (idEvent);
ALTER TABLE participa ADD CONSTRAINT FK_idUser FOREIGN KEY 
(idUsuario) REFERENCES usuario (idUsu);






