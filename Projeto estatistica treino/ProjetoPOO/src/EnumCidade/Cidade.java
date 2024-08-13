/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnumCidade;

/**
 *
 * @author Pg
 */
public enum Cidade {
      
       CANOAS(1, "Canoas"),
       PORTO_ALEGRE(2, "Porto Alegre"),
       VIAMAO(3, "Viamao"),
       CAXIAS_DO_SUL(4, "Caxias do sul"),
       PELOTAS(5,"Pelotas");
    
       private  int id;
       private  String nomeCidade;
       
       public int getId()
       {
           return id;
       }
       public String getNomeDaCidade()
       {
           return nomeCidade;
       }
       
       Cidade(int id, String nomeCidade)
       {
           this.id = id;
           this.nomeCidade = nomeCidade;
       }
       
       //metodo que recebe o int e compara com os Ids das
       //constantes criadas no enum
       public static Cidade cidadeEscolher(int id)
        {
           for(Cidade cidade : Cidade.values())
           {
               if(cidade.getId() == id)
               {
                   return cidade;  
               }
           }
           return null;
        }
       
       
   }
