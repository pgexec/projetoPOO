/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Pg
 */
public class User {
    
    String nome;
    String user;
    char[] senha;
   
    
    public User(String nome,String user, char[] senha)
    {
        setNome(nome);
        setUser(user);
        setSenha(senha);
        
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setUser(String user)
    {
         this.user = user;
    }
    public void setSenha(char[] senha)
    {
        this.senha = senha;
    }
    
    public String getUser()
    {
        return user;
    }
    
    public char[] getSenha()
    {
        return senha;
    }
     public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.user);
        hash = 67 * hash + Arrays.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return Arrays.equals(this.senha, other.senha);
    }

    @Override
    public String toString() {
        return "User{" + "nome=" + nome + ", user=" + user + ", senha=" + senha + '}';
    }
    
   
    
    
    
   

    
}
