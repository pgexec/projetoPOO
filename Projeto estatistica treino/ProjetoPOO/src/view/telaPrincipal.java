    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import EnumCidade.Cidade;
import Login.User;
import Login.UserDAO;
import projetofinal.Pessoa.Pessoa;
import projetofinal.Pessoa.PessoaDAO;

/**
 *
 * @author Pg
 */
public class telaPrincipal extends javax.swing.JFrame {

    PessoaDAO cadastros = new PessoaDAO();
    UserDAO adms = new UserDAO();
    
    
    //construtor que inicia os componentes da tela e inicializa os pré cadastrados
    public telaPrincipal() {
        initComponents();
        inicializarCadastros();
    }
   
    //construtor que recebe as pessoas cadastradas e inicia os componentes da tela
    public telaPrincipal(PessoaDAO cadastrada)
    {
        this.cadastros = cadastrada;
        initComponents();
    }
    
    //construtor que recebe qual USUÁRIO que encontrou, inica os componentes da tela
    //faz aparecer um texto na tela com o nome do usuário que encontrou no software
    //adiciona a pessoa que logou no cadastro dos adms.
    public telaPrincipal(User logado)
    {
        initComponents();
        inicializarCadastros();
        adms.cadastrar(logado);
        User temp = adms.buscarUser(logado);
        nomeDoUsuario.setText("Bem-vindo, " + temp.getNome() +  "!");   
    }
    
    //Inicialização de algumas pessoas para fazer TESTE das funcionalidades
    private void inicializarCadastros() {
        Pessoa p1 = new Pessoa("João Silva", "123.456.789-01", 30, Cidade.PELOTAS, "999990001", true, "M", 5000, true, true);
        Pessoa p2 = new Pessoa("Maria Fernanda", "987.654.321-00", 25, Cidade.PELOTAS, "888880002", true, "F", 6200, false, true);
        Pessoa p3 = new Pessoa("Carlos Eduardo", "111.222.333-44", 45, Cidade.CANOAS, "777770003", true, "M", 3500, true, true);
        Pessoa p4 = new Pessoa("Fernanda Lima", "555.666.777-88", 28, Cidade.PORTO_ALEGRE, "666660004", true, "F", 4500, true, true);
        Pessoa p5 = new Pessoa("Roberto Souza", "999.888.777-66", 35, Cidade.PORTO_ALEGRE, "555550005", true,"M", 3000, false, true);
        Pessoa p6 = new Pessoa("Aline Barbosa", "333.444.555-66", 32, Cidade.CAXIAS_DO_SUL, "444440006", true, "F", 4700, true, true);
        Pessoa p7 = new Pessoa("Pedro Martins", "222.333.444-55", 29, Cidade.VIAMAO, "333330007", true, "M", 5200, true, true);
        Pessoa p8 = new Pessoa("Luciana Castro", "111.222.333-66", 27, Cidade.CANOAS, "222220008", true, "F", 6100, true, true);
        Pessoa p9 = new Pessoa("Marcos Almeida", "666.777.888-99", 40, Cidade.PELOTAS, "111110009", true, "M", 4900, true, true);
        Pessoa p10 = new Pessoa("Paula Pereira", "555.666.777-00", 26, Cidade.PORTO_ALEGRE, "000000010", true, "F", 5600, true, true);
        Pessoa p11 = new Pessoa("Renata Silva", "444.555.666-77", 37, Cidade.VIAMAO, "999990011", true, "F", 5300, true, true);
        Pessoa p12 = new Pessoa("Juliana Santos", "333.444.555-88", 31, Cidade.CAXIAS_DO_SUL, "888880012", true, "F", 4800, true, true);
        Pessoa p13 = new Pessoa("André Costa", "222.333.444-99", 38, Cidade.CANOAS, "777770013", true, "M", 4600, true, true);
        Pessoa p14 = new Pessoa("Beatriz Rodrigues", "111.222.333-00", 23, Cidade.PELOTAS, "666660014", true, "F", 5800, true, true);
        Pessoa p15 = new Pessoa("Fábio Carvalho", "777.888.999-00", 34, Cidade.PORTO_ALEGRE, "555550015", true, "M", 5400, true, true);
        Pessoa p16 = new Pessoa("Gustavo Freitas", "999.777.555-44", 36, Cidade.VIAMAO, "444440016", true, "M", 5100, true, true);
        Pessoa p17 = new Pessoa("Carla Mendes", "888.666.444-33", 29, Cidade.CAXIAS_DO_SUL, "333330017", true, "F", 4700, false, true);
        Pessoa p18 = new Pessoa("Vinícius Oliveira", "777.555.333-22", 41, Cidade.VIAMAO, "222220018", true, "M", 6000, true, true);
        Pessoa p19 = new Pessoa("Mariana Ribeiro", "666.444.222-11", 27, Cidade.CAXIAS_DO_SUL, "111110019", true, "F", 4900, true, true);   
        Pessoa p20 = new Pessoa("Eduardo Gomes", "555.333.111-00", 33, Cidade.VIAMAO, "000000020", true, "M", 5300, false, true);
        Pessoa p26 = new Pessoa("Ana Paula Moreira", "123.654.789-10", 35, Cidade.PELOTAS, "555550026", false, "F", 0, true, true);
        Pessoa p27 = new Pessoa("Bruno Teixeira", "234.765.890-11", 40, Cidade.CANOAS, "444440027", false, "M", 0, true, true);
        Pessoa p28 = new Pessoa("Claudia Ferreira", "345.876.901-12", 28, Cidade.VIAMAO, "333330028", false, "F", 0, true, true);
        Pessoa p29 = new Pessoa("Daniel Marques", "456.987.012-13", 31, Cidade.CAXIAS_DO_SUL, "222220029", false, "M", 0, true, true);
        Pessoa p30 = new Pessoa("Elaine Costa", "567.098.123-14", 26, Cidade.PORTO_ALEGRE, "111110030", false, "F", 0, true, true);
        Pessoa p31 = new Pessoa("Felipe Azevedo", "678.109.234-15", 38, Cidade.PELOTAS, "000000031", false, "M", 0, true, true);
        Pessoa p32 = new Pessoa("Gisele Pereira", "789.210.345-16", 33, Cidade.CANOAS, "999990032", false, "F", 0, true, true);
        Pessoa p33 = new Pessoa("Henrique Lopes", "890.321.456-17", 29, Cidade.VIAMAO, "888880033", false, "M", 0, false, true);
        Pessoa p34 = new Pessoa("Isabela Martins", "901.432.567-18", 27, Cidade.CAXIAS_DO_SUL, "777770034", false, "F", 0, false, true);
        Pessoa p35 = new Pessoa("João Pedro Silva", "012.543.678-19", 36, Cidade.PORTO_ALEGRE, "666660035", false, "M", 0, true, true);
        Pessoa p36 = new Pessoa("Gabriel Almeida", "789.654.123-00", 6, Cidade.PELOTAS, "123450036", false, "M", 0, true, true);
        Pessoa p37 = new Pessoa("Laura Santos", "321.456.789-00", 4, Cidade.CANOAS, "654320037", false, "F", 0, true, true);
        Pessoa p38 = new Pessoa("Lucas Ferreira", "231.546.879-00", 5, Cidade.CAXIAS_DO_SUL, "789012038", false, "M", 0, true, true);
        Pessoa p39 = new Pessoa("Beatriz Souza", "654.321.987-00", 10, Cidade.VIAMAO, "123450039", false, "F", 0, true, true);
        Pessoa p40 = new Pessoa("Carlos Mendes", "987.654.321-00", 14, Cidade.CANOAS, "654320040", false, "M", 0, true, true);
        Pessoa p41 = new Pessoa("Ana Clara Souza", "321.654.987-00", 15, Cidade.PELOTAS, "987650041", false, "F", 0, true, true);
        Pessoa p42 = new Pessoa("João Pedro Martins", "654.321.987-00", 17, Cidade.CAXIAS_DO_SUL, "789012042", false, "M", 0, true, true);
        Pessoa p43 = new Pessoa("Ana Clara Souza", "987.654.321-00", 18, Cidade.VIAMAO, "123456043", false, "F", 0, true, true);
        Pessoa p44 = new Pessoa("Lucas Almeida", "321.654.987-00", 16, Cidade.PELOTAS, "987650044", false, "M", 0, true, true);
        cadastros.cadastrar(p1);
        cadastros.cadastrar(p2);
        cadastros.cadastrar(p3);
        cadastros.cadastrar(p4);
        cadastros.cadastrar(p5);
        cadastros.cadastrar(p6);
        cadastros.cadastrar(p7);
        cadastros.cadastrar(p8);
        cadastros.cadastrar(p9);
        cadastros.cadastrar(p10);
        cadastros.cadastrar(p11);
        cadastros.cadastrar(p12);
        cadastros.cadastrar(p13);
        cadastros.cadastrar(p14);
        cadastros.cadastrar(p15);
        cadastros.cadastrar(p16);
        cadastros.cadastrar(p17);
        cadastros.cadastrar(p18);
        cadastros.cadastrar(p19);
        cadastros.cadastrar(p20);
        cadastros.cadastrar(p26);
        cadastros.cadastrar(p27);
        cadastros.cadastrar(p28);
        cadastros.cadastrar(p29);
        cadastros.cadastrar(p30);
        cadastros.cadastrar(p31);
        cadastros.cadastrar(p32);
        cadastros.cadastrar(p33);
        cadastros.cadastrar(p34);
        cadastros.cadastrar(p35);
        cadastros.cadastrar(p36);
        cadastros.cadastrar(p37);
        cadastros.cadastrar(p38);
        cadastros.cadastrar(p39);
        cadastros.cadastrar(p40);
        cadastros.cadastrar(p41);
        cadastros.cadastrar(p42);
        cadastros.cadastrar(p43);
        cadastros.cadastrar(p44);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nomeDoUsuario = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pgdc-high-resolution-logo-transparent.png"))); // NOI18N

        jButton4.setText("CADASTRAR PESSOA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("PESQUISAR CADASTRADO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("EXCLUIR CADASTRADO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText(" MENU PRINCIPAL ");

        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DADOS ESTATISTÍCOS ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("software de cadastro de pessoas atingidas pela chuva no RS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nomeDoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(nomeDoUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //botão que faz a criação da tela de CADASTRO e desativa a do Principal
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        telaCadastro telacadUser = new telaCadastro(cadastros);
        telacadUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    //botão que faz a criação da tela de EXCLUIR e desativa a do Principal
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
       telaExcluir telaExcluirP = new telaExcluir(cadastros);
       telaExcluirP.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_jButton6ActionPerformed

   //botão que faz a criação da tela de PESQUISA e desativa a PRINCIPAL
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        telaPesquisar telaPesquisa = new telaPesquisar(cadastros);      
        telaPesquisa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    //botão que faz a criação da tela de LOGIN e desativa a PRINCIPAL
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        telaLogin telaL = new telaLogin();
        telaL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    //botão que faz a criação da tela de ESTATISTÍCA e desativa a PRINCIPAL
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        telaEstatistica telaE = new telaEstatistica(cadastros);
        telaE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nomeDoUsuario;
    // End of variables declaration//GEN-END:variables
}
