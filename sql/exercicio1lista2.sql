/*use db_generation_game_online;
create table tb_personagem(
id bigint auto_increment,
nome varchar(50),
 ataque decimal (5),
 forca decimal (5),
 defesa decimal (5),
tamanho decimal (6),

classe_id bigint,
primary key (id),
foreign key (classe_id) references tb_classe(id)
);*/

/*insert into tb_classe(compotador,internet,programa) values(true,true,true);
insert into tb_classe(compotador,internet,programa) values(true,true,true);
insert into tb_classe(compotador,internet,programa) values(true,true,true);
insert into tb_classe(compotador,internet,programa) values(true,true,true);
insert into tb_classe(compotador,internet,programa) values(true,true,true);*/

/*insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(4.5,5.7,"Raz",8.9,6.2);
insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(2.6,5.7,"Zill",9.9,6.3);
insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(2.5,5.7,"Mago",4.9,6.5);
insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(8.5,5.7,"Feiticeiro",2.9,1.8);
insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(10.0,5.7,"atirador",8.9,6.8);
insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(7.5,5.7,"lau",6.9,2.8);
insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(9.5,5.7,"zaara",5.9,6.8);
insert into tb_personagem( forca, tamanho, nome, defesa,ataque) values(6.5,5.7,"isabel",8.9,4.8);*/

/*select * from tb_personagem where ataque>2.0;*/
/*select * from tb_personagem where forca >7.0 and forca <10.0;*/
/*select * from tb_personagem;*/
/*use db_genaration_game_online;*/
/*alter table tb_personagem
modify column forca decimal (4,2);*/
/*select * from tb_personagem where forca >7.0 and forca <10.0;*/
/*select * from tb_personagem where nome like"%c%"*/
select * from tb_personagem inner join tb_classe on tb_classe.id=tb_personagem.classe_id 
where tb_classe.id=3





