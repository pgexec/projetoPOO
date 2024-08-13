/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pg
 */
public class UserDAO implements DAOUser {
    
    ArrayList<User> cadastroUser = new ArrayList <>();

    
    //metodo que faz o cadastro dos usuários
    @Override
    public boolean cadastrar(Object obj) {
        
          if(obj instanceof User)
          {
              User novo = (User) obj;
              cadastroUser.add(novo);
              return true;
          }
          return false;
    }
    
    //faz a verificação se o usuário está de fato no arrayList
    //apartir da sua senha e User/Login
    @Override
    public User verificarUser(String user, char[] senha) {

       for (User usuario : cadastroUser) { 
            if (Arrays.equals(usuario.getSenha(), senha)) 
            { 
                if (user.equalsIgnoreCase(usuario.getUser())) 
                { 
                    return usuario; 
                }
            }
        }
       return null;
    }
    
       
    @Override
    public User buscarUser(Object obj)
    {
     if (obj instanceof User) {
        User userBuscar = (User) obj;
        char[] senhaBuscar = userBuscar.getSenha();
        String usuarioBuscar = userBuscar.getUser();

        for (int i = 0; i < cadastroUser.size(); i++) {
            User userCadastrado = cadastroUser.get(i);
            String userCadastradoNome = userCadastrado.getUser();
            char[] senhaCadastrada = userCadastrado.getSenha();

            if (userCadastradoNome.equalsIgnoreCase(usuarioBuscar)) {
                if (Arrays.equals(senhaCadastrada, senhaBuscar)) {
                    return userCadastrado; 
                }
            }
        }
    }
        return null;
    }
    
    
            
    public ArrayList getUser()
    {
        return cadastroUser;
    }

    
}
