/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
public class Conexao {
    private Connection conn;
    private void conectar() throws SQLException{
        System.out.println("Conectando ao banco ...");
        try{
            Class.forName("com.mysql.jdb.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost/iniciandospring","root","");
             System.out.println("Conectado...");
        }catch(ClassNotFoundException e){
             System.out.println("Problemas com a biblioteca ...");
             java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE,null,e);
        }
    }   
    
    public Connection getConexao() throws SQLException{
        conectar();
        return conn;
    }
}
