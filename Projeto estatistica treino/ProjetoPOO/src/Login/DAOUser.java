/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;


public interface DAOUser {
    
   public boolean cadastrar(Object obj);
   public User verificarUser(String user, char[] senha);
   public User buscarUser(Object obj);
}
