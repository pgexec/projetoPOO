/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinal;

import Login.User;
import Login.UserDAO;
import java.util.ArrayList;
import java.util.Iterator;
import projetofinal.Pessoa.Pessoa;
import java.util.Scanner;
import projetofinal.Pessoa.PessoaDAO;
import view.telaLogin;
import view.telaPrincipal;


/**
 *
 * @author Pg
 */
public class ProjetoFinal{

   
    public static void main(String[] args) {
        
      //Sora karen seu cadastro de admin para entrar é:
      //user:karenadmin
      //senha: karenadmin
      
      //criação da tela de Login ao executar a main
      telaLogin tlLogin = new telaLogin();
      tlLogin.setVisible(true);        
    }     
}
