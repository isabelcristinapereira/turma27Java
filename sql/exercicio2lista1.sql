/*use db_pizzaria_legal;
create table tb_categoria(
id bigint (50)auto_increment,
pizzaDoce decimal (4,2)not null,
pizzaGrande decimal (4,2)not null,
pizzaSalgada decimal (4,2)not null,
primary key(id)

);*/
/*use db_pizzaria_legal;
create table tb_pizza(
id bigint auto_increment,
pizzaChocolate decimal (6,2),
pizzaCalabresa decimal (6,2),
pizzaFrango decimal (6,2),
pizzaNutella decimal (6,2),
pizzaQueijo decimal (6,2),
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)


);*/
/*insert into tb_categoria(pizzaDoce,PizzaGrande,PizzaSalgada) values(45.00,50.50,75.00);
insert into tb_categoria(pizzaDoce,PizzaGrande,PizzaSalgada) values(10.00,30.50,35.00);
insert into tb_categoria(pizzaDoce,PizzaGrande,PizzaSalgada) values(12.00,80.50,25.00);
insert into tb_categoria(pizzaDoce,PizzaGrande,PizzaSalgada) values(40.00,30.50,15.00);
insert into tb_categoria(pizzaDoce,PizzaGrande,PizzaSalgada) values(46.00,20.50,15.50);*/
/*insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(15.00,16.00,17.00,18.00,19.00);
insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(15.00,13.00,17.00,18.00,12.00);
insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(14.00,15.00,17.00,19.00,11.00);
insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(15.00,12.00,17.00,18.00,19.00);
insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(15.00,10.00,17.00,18.00,13.00);
insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(15.00,12.00,17.00,18.00,19.00);
insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(15.00,19.00,17.00,18.00,15.00);
insert into tb_pizza(pizzaChocolate,pizzaCalabresa,pizzaFrango,pizzaNutella,pizzaQueijo)values(15.00,16.00,17.00,18.00,18.00);*/
/*select*from tb_categoria;*/
/*select * from tb_categoria where pizzaSalgada >45.00;*/
/*select * from tb_categoria where pizzaSalgada >=29.00 and pizzaSalgada <=49.00;*/
/*select * from tb_pizza where pizzaChocolate like "%c%";*/
select * from tb_pizza inner join tb_categoria on tb_categoria.id=tb_pizza.categoria_id where tb_pizza.tb_categoria_id=3;