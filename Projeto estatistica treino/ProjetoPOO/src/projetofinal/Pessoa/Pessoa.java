/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal.Pessoa;

import EnumCidade.Cidade;
import java.util.Objects;

/**
 *
 * @author Pg
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private Cidade endereco;
    private String telefone;
    private boolean empregado;
    private boolean atingido;
    private boolean conheceAtingido;
    private String sexo;
    private double salario;
    
    

    public Pessoa(String nome, String cpf,int idade, Cidade endereco, String telefone,boolean empregado,String sexo, double salario,boolean atingido, boolean conheceAtingido){
        
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmpregado(empregado);
        setSexo(sexo);
        setSalario(salario);
        setAtingido(atingido);
        setConheceAtingido(conheceAtingido);
        
        
    }
    
    public Pessoa(String nome, String cpf,int idade, Cidade endereco, String telefone,boolean empregado,String sexo, boolean atingido, boolean conheceAtingido)
    {
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmpregado(empregado);
        setSexo(sexo);
        setAtingido(atingido);
        setConheceAtingido(conheceAtingido);
        this.salario = 0.0;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public void setEndereco(Cidade endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEmpregado(boolean empregado)
    {
        this.empregado = empregado;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAtingido(boolean atingido) {
        this.atingido = atingido;
    }

    public void setConheceAtingido(boolean conheceAtingido) {
        this.conheceAtingido = conheceAtingido;
    }

    public int getIdade() {
        return idade;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cidade getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public boolean getEmpregado()
    {
        return empregado;
    }

    public String getSexo() {
        return sexo;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isAtingido() {
        return atingido;
    }

    public boolean isConheceAtingido() {
        return conheceAtingido;
    }
    
    
    
    
    @Override
    public String toString() {
        //Aqui fazemos a filtragem de String, se for true é sim e false não, fazendo um if e else 
        //para tornar visualmente melhor o entendimento do sistema, invés de só deixar como true e false
        String statusConheceAtingido = conheceAtingido ? "sim" : "nao";
        String statusAtingido = atingido ? "sim" : "nao";
        String StatusEmprego = empregado ? "sim" : "nao";
        return  "DADOS DA PESSOA"+ "\n"
                + "Nome: " + nome + "\n"
                + "CPF: " + cpf + "\n" +
                "Endereco: " + endereco + "\n" +
                "Telefone: " + telefone + "\n" +
                "Empregado: " + StatusEmprego + "\n" +
                "Salario: " + salario + "\n" +
                "Atingido: " + statusAtingido + "\n" +
                "Conhece Alguém atingido: " + statusConheceAtingido + "\n";
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.cpf);
        hash = 37 * hash + Objects.hashCode(this.endereco);
        hash = 37 * hash + Objects.hashCode(this.telefone);
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
        final Pessoa other = (Pessoa) obj;
        if (this.empregado != other.empregado) {
            return false;
        }
        if (this.atingido != other.atingido) {
            return false;
        }
        if (this.conheceAtingido != other.conheceAtingido) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        return this.endereco == other.endereco;
    }


    
    
}
