package pck_principal;

public class Principal {

    /*classe principal para executar as demais classes do projeto*/
    public static void main(String[] args) { //método principal do projeto
       DAO_Produtos obj_produtos = new DAO_Produtos(); //instancia da classe DAO_Produtos
       DAO_Unidades obj_unidades = new DAO_Unidades(); //instancia da classe DAO_Unidades

       /*CONSULTAR PRODUTOS
       obj_produtos.consultar(); //chamada ao método consultar produtos
       */

       /*INSERIR PRODUTOS
       Produto novoProduto = new Produto(13, "Pera", 30.00, 10.0, 2); //instancia da classe Produto passando parâmetros
       obj_produtos.inserir(novoProduto); //chamada ao método inserir produtos
       */

       /*ALTERAR PRODUTOS
       Produto produtoAlterado = new Produto(13, "Pera Alterado", 20.00, 5.0, 3); //instancia da classe Produto passando parâmetros
       obj_produtos.alterar(produtoAlterado); //chamada ao método alterar produtos
       */

       /*EXCLUIR PRODUTOS
       obj_produtos.excluir(13); //chamada ao método excluir produtos
       */

       /*CONSULTAR UNIDADES
       obj_unidades.consultar(); //chamada ao método consultar unidades
       */

       /*INSERIR UNIDADES
       Unidade novaUnidade = new Unidade(6, "Unidade Nova"); //instancia da classe Unidade passando parâmetros
       obj_unidades.inserir(novaUnidade); //chamada ao método inserir
       */

       /*ALTERAR UNIDADES
       Unidade unidadeAlterada = new Unidade(6, "Unidade Nova Alterada"); //instancia da classe Unidade passando parâmetros
       obj_unidades.alterar(unidadeAlterada); //chamada ao metodo alterar
       */

       /*EXCLUIR UNIDADES
       obj_unidades.excluir(6); //chamada ao método excluir unidades
       */


    }

}
