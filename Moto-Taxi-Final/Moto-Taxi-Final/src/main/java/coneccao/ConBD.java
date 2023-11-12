/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author jpcas
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConBD {
    private Connection c = null;//Variavel de conexão
    public void ConBD() throws SQLException {//Metodo de conexão
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/TesteImplementJava",
            "postgres", "qesavy48");
      } catch (Exception e) {//Encontra exceção do BD
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("BD CONECTADO COM SUCESSO");
    }
    //Talvez vai ter que virar inBD e criar upBD
    public void EntBD(String sql) throws SQLException {//Entrada da dados no BD
        ConBD();//conecta
        Statement stmnt = c.createStatement();
        try{
            stmnt.executeUpdate(sql);//Insert
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Entrada de dados bem sucedida");
    }
    
    public ResultSet OutBD(String sql) throws SQLException{//Saida de dados do BD
        ConBD();//Conecta
        Statement stmnt = c.createStatement();
        ResultSet rst = null;
        try{
            rst = stmnt.executeQuery(sql);//Query
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    System.out.println("Saida de dados bem sucedida");
    return rst;
    }
    
    public void DelBD(String sql) throws SQLException{//Exclusão de dados do BD
        ConBD();//conecta
        Statement stmnt = c.createStatement();
        try{
            stmnt.executeUpdate(sql);//delete
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Exclusão de dados bem sucedida");
    }

    public boolean TstBD(String sql) throws SQLException{//Comparação de dados no BD
        ConBD();//Conecta
        Statement stmnt = c.createStatement();
        ResultSet rst = null;
        try{
            rst = stmnt.executeQuery(sql);//Query, recebe resultados
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        if(rst != null){
          System.out.println("Encontrada informação igual");
          return true;//Foi encontrado uma tupla com informação igual
        }else{
          System.out.println("Não encontrada informação igual");
          return false;//Não foi encontrado uma tupla com informação igual
        }
    }
}