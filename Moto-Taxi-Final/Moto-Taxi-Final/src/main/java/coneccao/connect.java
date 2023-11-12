/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coneccao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallan
 */
public class connect {
    Connection conectar = null;
    
    String usuario = "postgres";
    String password = "root";
    String bd = "postgres";
    String ip = "localhost";
    String port="5432";
    
    String canal ="jdbc:postgresql://"+ip+":"+port+"/"+bd;
    
    public Connection establishConnect(){
        
           try{
               Class.forName("org.postgresql.Driver");
               conectar = DriverManager.getConnection(canal,usuario,password);
               JOptionPane.showMessageDialog(null,"Conectou-se corretamente ao banco de dados.");
           }catch (HeadlessException | ClassNotFoundException | SQLException e){
               JOptionPane.showMessageDialog(null,"Erro ao conectar ao Banco de Dados, erro:" + e.toString());
           } 
         
           return conectar;
    }
            
            
            
}
