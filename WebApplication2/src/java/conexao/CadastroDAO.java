/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import br.com.spring.dominio.Cadastro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kdezen
 */
public class CadastroDAO {
    
    public void inserir(Cadastro cadastro) throws SQLException{
        
        Conexao conn=new Conexao();
        String sql="INSERT INTO cadastro(nome,telefone,endereco, email) values (?,?,?,?)";
        
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        
        ps.setString(1, cadastro.getNome());
        ps.setString(2, cadastro.getEndereco());
        ps.setInt(3, cadastro.getTelefone());
        ps.setString(4, cadastro.getEmail());
        
        ps.execute();
        
        
    }
    
    public List<Cadastro> busca() throws SQLException{
        List<Cadastro> lista=new ArrayList();
        
        Conexao conn=new Conexao();
        
        String sql="SELECT * FROM cadastro";
        
        PreparedStatement ps= conn.getConexao().prepareStatement(sql);
        
        ResultSet rs= ps.executeQuery();
        
        while(rs.next()){
            Cadastro cadastro = new Cadastro();
            
            cadastro.setNome(rs.getString("nome"));
            cadastro.setEndereco(rs.getString("Endereco"));
            cadastro.setTelefone(rs.getInt("telefone"));
            cadastro.setEmail(rs.getString("email"));
            
           lista.add(cadastro);
            
            
        }
        
        return lista;
        
        
        
        
        
    }
    
}
