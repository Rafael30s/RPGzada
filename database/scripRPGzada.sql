create database RPGzada;
use RPGzada;

create table usuario(
idUser int primary key auto_increment,
nome varchar(150) not null,
email varchar(150) not null,
senha varchar(50) not null
);

create table grupo(
idGroup int primary key auto_increment,
nome varchar(20) not null,
descricao varchar(150)
);

create table UsuarioGrupo(
idUserGroup int primary key auto_increment,
fk_user int not null,
fk_group int not null,
cargo varchar(20),
foreign key(fk_user) references usuario(idUser),
foreign key(fk_group) references grupo(idGroup)
);

create table personagem(
idPersonagem int primary key auto_increment,
nomePersonagem varchar(45),
forca int,destreza int,sabedoria int,constituicao int,intenligencia int,carisma int,
pontosDeVidaMax int,pontosDeVida int,pontosDeManaMax int,pontosDeManaAtual int,
habilidade_magias varchar(1000),
equipamento varchar(1000)
);

create table atributos(
idAtributo int primary key auto_increment,
atributo varchar(45)
);

insert into atributos(atributo) values
('FOR'),('DES'),('SAB'),('CON'),('INT'),('CAR'),('Pontos de vida(max)'),('Pontos de vida(Atual)'),('Pontos de mana(max)'),('Pontos de mana(Atual)');

create table personagemAtributo(
idPersonagemAtributo int primary key auto_increment,
personagem int,
atributo int,
foreign key(personagem) references atributo(idPersonagem),
foreign key(atributo) references atributo(idAtributo)
);