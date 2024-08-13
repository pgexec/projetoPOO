/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal.Pessoa;

/**
 *
 * @author Pg
 */
public interface DAO {
    
    boolean cadastrar(Object obj);
    
    boolean excluirPeloCpf(String cpf);
    
    Pessoa pesquisar(String cpf); 
}
