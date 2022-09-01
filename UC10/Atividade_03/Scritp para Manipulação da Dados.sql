USE ComaBem;

/*INSERINDO DADOS NA TABELA*/
INSERT INTO Unidades (ds_unidade) VALUES ("Quilo");
INSERT INTO Unidades (ds_unidade) VALUES ("Unidade");
INSERT INTO Unidades (ds_unidade) VALUES ("Litro");
INSERT INTO Unidades (ds_unidade) VALUES ("Metro");
INSERT INTO Unidades (ds_unidade) VALUES ("Duzia");

INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Carne", 30.00, 2, 1);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Óleo", 10.00, 1, 2);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Leite", 8.00, 1.5, 3);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Alface", 3.00, 1, 2);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Banana", 5.00, 5, 5);

/*SELECIONANDO DADOS DA TABELA*/
Select * from Produtos;
Select * from Unidades;

/*ALTERANDO DADOS DA TABELA*/
UPDATE Produtos SET ds_produto = "Frango" WHERE cd_produto = 2;
UPDATE Unidades SET ds_unidade = "Unid." WHERE cd_unidade = 2;

/*DELETANDO DADOS DA TABELA*/
DELETE FROM Produtos WHERE cd_produto = 1;

/*DELETANDO DADOS DA TABELA COM INTERVALO ENTRE ELES*/
DELETE FROM Unidades WHERE cd_unidade BETWEEN 9 AND 25;