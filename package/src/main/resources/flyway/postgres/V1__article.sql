create Table article (
	id serial PRIMARY KEY,
	name VARCHAR (50) NOT NULL,
	price numeric(10,2) NOT NULL
);
alter table article alter column price type numeric(10,2);

insert into article(name, price) values ('dummy-article', 1.23);