/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spring.controller;

import br.com.spring.dominio.Cadastro;
import conexao.CadastroDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author kdezen
 */
@Controller
public class IniciandoController {
    @RequestMapping("/inicio")
    public String index(Model model,Cadastro cadastro){
        
       CadastroDAO dao = new CadastroDAO();
       
       
        try {
            dao.inserir(cadastro);
            
            model.addAttribute("nome", cadastro.getNome());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       
        return "index";
    }
   
    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
    
     @RequestMapping("/lsita")
    public String lista(Model model){
        CadastroDAO dao = new CadastroDAO();
        
        try {
            model.addAttribute("lista",dao.busca());
        } catch (Exception ex) {
            
        }
        
        
        return "exibir";
    }
    
}
