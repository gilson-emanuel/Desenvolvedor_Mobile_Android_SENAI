CREATE DATABASE ComaBem;

USE ComaBem;

CREATE TABLE Unidades
(
	cd_unidade INT PRIMARY KEY AUTO_INCREMENT,
    ds_unidade VARCHAR(200) NOT NULL
);

CREATE TABLE Produtos
(
	cd_produto INT PRIMARY KEY AUTO_INCREMENT,
    ds_produto VARCHAR(200) NOT NULL,
    vl_produto DOUBLE NOT NULL,
    qt_produto DOUBLE NOT NULL,
    cd_unidade INT NOT NULL,
    CONSTRAINT fk_produto_unidade FOREIGN KEY (cd_unidade) REFERENCES Unidades (cd_unidade)
)

