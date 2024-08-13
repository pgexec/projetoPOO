/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estatistica;
import java.util.ArrayList;
import projetofinal.Pessoa.Pessoa;
import EnumCidade.Cidade;


/**
 *
 * @author PG
 */
public class estatisticaControle {
    
    //Retorna a quantidade de pessoas atingidas por faixa etaria
    /*
    indice 0 - 0 a 7 anos
    indice 1 - 8 a 15 anos
    indice 2 - 16 a 18 anos
    indice 3 - 19 a 30 anos
    indice 4 - 31 a 90 anos
    indice 5 - total
    */
    public static int[] idadeAtingida(ArrayList<Pessoa> ArrayListPessoas, Cidade cidade){
        int faixaEtaria[] = new int[6];
        ArrayList<Pessoa> pessoas = ArrayListPessoas;
        
        for(Pessoa pessoa : pessoas){
            if(pessoa.isAtingido() && pessoa.getEndereco().equals(cidade)){
                if(pessoa.getIdade() > 0 && pessoa.getIdade() <= 7){
                    faixaEtaria[0]++;
                    faixaEtaria[5]++;
                }
                else if(pessoa.getIdade() > 7 && pessoa.getIdade() <= 15){
                    faixaEtaria[1]++;
                    faixaEtaria[5]++;
                }
                else if(pessoa.getIdade() > 15 && pessoa.getIdade() <= 18){
                    faixaEtaria[2]++;
                    faixaEtaria[5]++;
                }
                else if(pessoa.getIdade() > 18 && pessoa.getIdade() <= 30){
                    faixaEtaria[3]++;
                    faixaEtaria[5]++;
                }
                else if(pessoa.getIdade() > 30 && pessoa.getIdade() <= 90){
                    faixaEtaria[4]++;
                    faixaEtaria[5]++;
                }
            }
        }
        return faixaEtaria;
    }
    
    /*
    Função que retorna a quantidade de pessoas atingidas por sexo
    indice 0 - sexo masculino
    indice 1 - sexo feminino
    */
  public static double[] quantidadeAtingidoPorSexo(ArrayList<Pessoa> ArrayListPessoas, Cidade cidade){
        int contagemSexo[] = new int[2];
        double porcentagemSexo[] = new double[2];
        int totalAtingidos = 0;
        ArrayList<Pessoa> pessoas = ArrayListPessoas;
        
        for(Pessoa pessoa : pessoas){
            if(pessoa.isAtingido() && pessoa.getEndereco().equals(cidade)){
                if(pessoa.getSexo().equals("M")){
                   contagemSexo[0]++; 
                }
                else if(pessoa.getSexo().equals("F")){
                    contagemSexo[1]++;
                }
                totalAtingidos++;
            }
        }
        
        if (totalAtingidos > 0) { // Evitar divisão por zero
            porcentagemSexo[0] = (double) contagemSexo[0] / totalAtingidos * 100;
            porcentagemSexo[1] = (double) contagemSexo[1] / totalAtingidos * 100;
        }
        return porcentagemSexo;
    }
    
    
    public static double percentualEmpregadosAtingidos(ArrayList<Pessoa> ArrayListPessoas, Cidade cidade) {
    int empregados = 0;
    int empregadosAtingidos = 0;
    
    for (Pessoa pessoa : ArrayListPessoas) {
        if (pessoa.getEndereco().equals(cidade) && pessoa.getEmpregado()) {
            empregados++;  // Conta todos os empregados na cidade
            if (pessoa.isAtingido()) {
                empregadosAtingidos++;  // Conta empregados que foram atingidos
            }
        }
    }
    if (empregados > 0) {  
        return (double) empregadosAtingidos / empregados * 100;
    } else {
        return 0;  
    }
}
   
    public static int totalCadastrados(ArrayList<Pessoa> ArrayListPessoas, Cidade cidade){
        
        int totalcadastrado = 0;
        for(Pessoa pessoa : ArrayListPessoas)
        if(pessoa.getEndereco() == cidade)
        {
            totalcadastrado++;
        }
        return totalcadastrado;
    }
    
    public static double mediaSalarialAtingidos(ArrayList<Pessoa> pessoas, Cidade cidade) {
        double somaSalarios = 0;
        int contador = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.isAtingido() && pessoa.getEndereco() == cidade) {
                somaSalarios += pessoa.getSalario();
                System.out.println(somaSalarios);
                contador++;
            }
        }
        if (contador == 0) {
            return 0;
        }

        return somaSalarios / contador;
    }
}
    
    
    

