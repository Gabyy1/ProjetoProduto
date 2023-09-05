Create database crudProdutos
Go
Use crudProdutos;
Go

Create Table Produto (
codigo	varchar(8)	not null primary key,
nome	varchar(40)	 null,
data	varchar(8)	 null
)
Go
select * from Produto

insert into Produto values
('a', 'a', 'a')