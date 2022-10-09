package pck_principal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private String caminho = "jdbc:mysql://localhost:3306/comabem";
    private String usuario = "root";
    private String senha = "gilson780"; //mudar a senha para 12345 antes de fazer o upload
    public Connection conn;

    public void conexao(){
        try
        {
            conn = DriverManager.getConnection(caminho,usuario, senha);
            System.out.println("CONECTADO COM SUCESSO");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("ERRO DE CONEXÃO");
        }
    }
    public void desconecta(){
        try
        {
            conn.close();
            System.out.println("DESCONECTADO COM SUCESSO!");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("ERRO AO FECHAR CONEXÃO");
        }
    }

    public static void main(String[] args) {
        Conexao obj_conexao = new Conexao();
        obj_conexao.conexao();
    }
}
