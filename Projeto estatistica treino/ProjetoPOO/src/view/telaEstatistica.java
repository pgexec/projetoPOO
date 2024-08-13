       /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import EnumCidade.Cidade;
import estatistica.estatisticaControle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetofinal.Pessoa.Pessoa;
import projetofinal.Pessoa.PessoaDAO;

/**
 *
 * @author Pg
 */
public class telaEstatistica extends javax.swing.JFrame {

    PessoaDAO cadastros = new PessoaDAO();
    
    public telaEstatistica() {
        initComponents();
    }
    //construtor que faz o recebimento dos cadastrados e salvo no PessoaDAO da tela
    public telaEstatistica(PessoaDAO cadastrada) {
        initComponents();
        this.cadastros = cadastrada;   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jCidade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jmdSalarial = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMasc = new javax.swing.JLabel();
        jFem = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jAtgdEmpregado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtotalCadastrados = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jindiceZero = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jindiceUm = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jIndiceDois = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jIndiceTres = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jIndiceQuatro = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CANOAS", "PORTO ALEGRE", "VIAMAO", "CAXIAS DO SUL", "PELOTAS" }));

        jLabel1.setText("Escolha a cidade que você deseja obter a estatistica:");

        jButton1.setText("CONFIRMAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Media salarial das pessoas atingidas:");

        jmdSalarial.setText("Media");

        jLabel6.setText("Porcentagem por sexo Atingidos:");

        jLabel7.setText("Masculino:");

        jLabel8.setText("Feminino: ");

        jMasc.setText("0%");

        jFem.setText("0%");

        jLabel11.setText("Porcentagem de quantos dos atingidos estavam empregados:");

        jAtgdEmpregado.setText("0%");

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Total de Pessoas cadastradas da cidade em questão:");

        jLabel9.setText("faixa Etária de quem foi atingido:");

        jLabel10.setText("0  - 7 anos");

        jLabel12.setText("8 - 15 anos");

        jLabel13.setText("16 - 18 anos");

        jLabel14.setText("19 - 30 anos");

        jLabel15.setText("31 - 90 anos");

        jLabel16.setText("foram");

        jindiceZero.setText("0");

        jLabel18.setText("pessoas atingidas");

        jLabel19.setText("foram ");

        jindiceUm.setText("0");

        jLabel21.setText("pessoas atingidas");

        jLabel22.setText("foram ");

        jIndiceDois.setText("0");

        jLabel24.setText("pessoas atingidas");

        jLabel25.setText("foram");

        jIndiceTres.setText("0");

        jLabel27.setText("pessoas atingidas");

        jLabel28.setText("foram");

        jIndiceQuatro.setText("0");

        jLabel30.setText("pessoas atingidas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jMasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAtgdEmpregado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jmdSalarial))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtotalCadastrados))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jIndiceTres)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jIndiceDois, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jindiceZero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jindiceUm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel21)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jIndiceQuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addGap(9, 9, 9)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtotalCadastrados))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jmdSalarial))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jMasc)
                    .addComponent(jFem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jAtgdEmpregado))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel16)
                    .addComponent(jindiceZero)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19)
                    .addComponent(jindiceUm)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel22)
                        .addComponent(jIndiceDois)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel25)
                    .addComponent(jIndiceTres)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel28)
                    .addComponent(jIndiceQuatro)
                    .addComponent(jLabel30))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   //Botão de confirmação da cidade
   //gatilho para chamar metodos e entregar as estatisticas
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //variaveis utilizadas
        
         int totalCadastrados = 0;
         double salarioMedia = 0.0;
         double atgdEmpregadosPor = 0.0;
         ArrayList<Pessoa> pessoas = new ArrayList <>();
         double[] sexo = new double[2];
         int[] faixaEtaria = new int[6];
         String cidadeEscolhida = (String) jCidade.getSelectedItem();
         Cidade cidade = cidadeEscolhida(cidadeEscolhida);
        System.out.println(cidade);
         
                                       
         for(int i = 0; i < cadastros.getCadastros().size(); i++)
         {
             Pessoa pessoa = (Pessoa) cadastros.getCadastros().get(i);
             pessoas.add(pessoa);
         }
         if (!pessoas.isEmpty()) 
         {
             //chamando o metodo estatico que faz a contagem de quantas pessoas estão cadastrado 
             //na cidade em questão
             totalCadastrados = estatisticaControle.totalCadastrados(pessoas, cidade);
             jtotalCadastrados.setText(String.format("%d Pessoas", totalCadastrados));
             
             //chamando metodo estatico que faz a contagem da FAIXA ETÁRIA das pessoas cadastradas 
             //na cidade em questão
             faixaEtaria = estatisticaControle.idadeAtingida(pessoas, cidade);
             jindiceZero.setText(String.format("%d ", faixaEtaria[0]));
             jindiceUm.setText(String.format("%d ", faixaEtaria[1]));
             jIndiceDois.setText(String.format("%d ",faixaEtaria[2]));
             jIndiceTres.setText(String.format("%d ", faixaEtaria[3]));
            jIndiceQuatro.setText(String.format("%d ", faixaEtaria[4]));
             
            //chamando o metodo estatico para fazer a média, depois modificando a label dentro da janela pela media
            salarioMedia = estatisticaControle.mediaSalarialAtingidos(pessoas, cidade);
            jmdSalarial.setText(String.format("R$ %.2f", salarioMedia));
            
            //chamando o metodo estatico para fazer a porcentagem por sexo que foi atingido
            sexo = estatisticaControle.quantidadeAtingidoPorSexo(pessoas, cidade);
            jMasc.setText(String.format("%.2f%%", sexo[0]));
            jFem.setText(String.format("%.2f%%", sexo[1]));
            
            //chamando metodo estatico para fazer percentual de pessoas empregadas atingidas
            atgdEmpregadosPor = estatisticaControle.percentualEmpregadosAtingidos(pessoas, cidade);
            jAtgdEmpregado.setText(String.format("%.2f%%", atgdEmpregadosPor));    
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Nenhuma pessoa encontrada.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //botão de voltar, faço a criação da Tela Principal e desativo está em seguida
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       telaPrincipal tlP = new telaPrincipal(cadastros);
       tlP.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaEstatistica().setVisible(true);
            }
        });
    }
    
    //metodo para verificar a cidade que a pessoa escolheu no SELECT e transformar 
    //de STRING para ENUM
    public Cidade cidadeEscolhida(String nomeCidade)
    {
        for(Cidade cidade : Cidade.values())
        {
            if(cidade.getNomeDaCidade().equalsIgnoreCase(nomeCidade)) {
                
                return cidade;
            } 
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAtgdEmpregado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCidade;
    private javax.swing.JLabel jFem;
    private javax.swing.JLabel jIndiceDois;
    private javax.swing.JLabel jIndiceQuatro;
    private javax.swing.JLabel jIndiceTres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jMasc;
    private javax.swing.JLabel jindiceUm;
    private javax.swing.JLabel jindiceZero;
    private javax.swing.JLabel jmdSalarial;
    private javax.swing.JLabel jtotalCadastrados;
    // End of variables declaration//GEN-END:variables
}
