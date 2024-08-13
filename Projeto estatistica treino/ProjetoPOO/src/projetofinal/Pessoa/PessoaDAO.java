/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal.Pessoa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import EnumCidade.Cidade;

/**
 *
 * @author Pg
 */
public class PessoaDAO implements DAO {
    
   ArrayList<Pessoa> cadastro = new ArrayList<>();
    
   
   //metodo para fazer os cadastro dentro do meu Arraylist tipo Pessoa
   @Override
   public boolean cadastrar(Object obj)
   {
       if(obj instanceof Pessoa)
       {   
           Pessoa nova = (Pessoa) obj;
           this.cadastro.add(nova);
           return true;
       }
       return false;
   }
   
   //metodo para excluir a pessoa do ArrayList apartir do CPF
   @Override
   public boolean excluirPeloCpf(String cpf)
   {      
        
        Pessoa p = pesquisar(cpf);
        if(p != null)
        {
            cadastro.remove(p);
            return true;
        }
        return false;
   }
   
   //metodo de pesquisa, para encontrar a pessoa pelo CPF
    @Override
    public Pessoa pesquisar(String cpfAchar)
   {
        for(int i = 0; i < cadastro.size(); i++)
        {
           Pessoa p = cadastro.get(i);
           String cpf = p.getCpf();
           if(cpf.equalsIgnoreCase(cpfAchar))
            {
              return cadastro.get(i);
            }
        }
    
      return null;
   }
   
    //metodo para listar as pessoas salvas dentro do meu ArrayList
   public boolean listar(){
      
       if(cadastro.isEmpty())
       {
           return false;
       }
       else
       {
          Iterator it = cadastro.iterator();
          while(it.hasNext()){
            System.out.println(it.next());  
          } 
        }
       return true;
    }
   
   //get para pegar as informações das pessoas cadastradas
   public ArrayList getCadastros()
   {
       return cadastro;
   }

    
}
