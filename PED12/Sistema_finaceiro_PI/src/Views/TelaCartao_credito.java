/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.moduloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pc
 */
public class TelaCartao_credito extends javax.swing.JFrame {

    /**
     * Creates new form TelaCartao_credito
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    TelaCartaoCredito_consulta Tela_CartaoConsulta;
    
    public TelaCartao_credito() {
        initComponents();
        conexao = moduloConexao.conector();
        this.setLocationRelativeTo(null);
    }
     void inicio(){
         
         TelaPrincipal TelaPrincipal = null;
         
         if (TelaPrincipal == null) {

             TelaPrincipal = new TelaPrincipal();

             TelaPrincipal.setVisible(true);

             TelaPrincipal.receberID(txt_id.getText());
             
             

         } else {

             TelaPrincipal.setVisible(true);

             TelaPrincipal.setState(TelaPrincipal.NORMAL);

             TelaPrincipal.receberID(txt_id.getText());
         }
         
         this.dispose();
    }
     
    void sair(){
         //telaCliente cadastroCliente = new telaCliente();
         TelaLogin tela_login = new TelaLogin();
         tela_login.setVisible(true);
         this.dispose();
    }
    
   void TelaConsulta_CartaoCredito(){
        
        TelaCartaoCredito_consulta TelaConsulta = null;

        if (TelaConsulta == null) {

            TelaConsulta = new TelaCartaoCredito_consulta();

            TelaConsulta.setVisible(true);

            TelaConsulta.receberID(txt_id.getText());

        } else {

            TelaConsulta.setVisible(true);

            TelaConsulta.setState(TelaCartaoCredito_cadastrar.NORMAL);

            TelaConsulta.receberID(txt_id.getText());

        }

        this.dispose();
        
    }
    
    void receita(){
        
         TelaReceita TelaReceita = null;

           if (TelaReceita == null) {

               TelaReceita = new TelaReceita();

               TelaReceita.setVisible(true);
               
               TelaReceita.receberID(txt_id.getText());

           } else {

               TelaReceita.setVisible(true);

               TelaReceita.setState(TelaPrincipal.NORMAL);

               TelaReceita.receberID(txt_id.getText());
                
           }
           
         this.dispose();
    }
    
      void cadastra_cartao(){
          
         TelaCartaoCredito_cadastrar TelaCadastra_CartaoCredito = null;
     
           if (TelaCadastra_CartaoCredito == null) {

               TelaCadastra_CartaoCredito = new  TelaCartaoCredito_cadastrar();

               TelaCadastra_CartaoCredito.setVisible(true);
               
               TelaCadastra_CartaoCredito.receberID(txt_id.getText());

           } else {

               TelaCadastra_CartaoCredito.setVisible(true);

               TelaCadastra_CartaoCredito.setState(TelaPrincipal.NORMAL);

               TelaCadastra_CartaoCredito.receberID(txt_id.getText());
                
           }
           
         this.dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btn_inicio_CC = new javax.swing.JButton();
        btn_receitaCC = new javax.swing.JButton();
        btn_sairCC = new javax.swing.JButton();
        btn_novoCartao_cc = new javax.swing.JButton();
        btnConsulta_CC = new javax.swing.JButton();
        btn_exclui_cc = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Usuário");

        jTextField2.setText("Cartão de Crédito");

        btn_inicio_CC.setText("Inicio");
        btn_inicio_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_CCActionPerformed(evt);
            }
        });

        btn_receitaCC.setText("Receitas");
        btn_receitaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_receitaCCActionPerformed(evt);
            }
        });

        btn_sairCC.setText("Sair");
        btn_sairCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairCCActionPerformed(evt);
            }
        });

        btn_novoCartao_cc.setText("Novo Cartão");
        btn_novoCartao_cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoCartao_ccActionPerformed(evt);
            }
        });

        btnConsulta_CC.setText("Consulta");
        btnConsulta_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta_CCActionPerformed(evt);
            }
        });

        btn_exclui_cc.setText("Exclui cartão");

        txt_id.setEditable(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_inicio_CC)
                                .addGap(65, 65, 65)
                                .addComponent(btn_receitaCC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sairCC)))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_novoCartao_cc)
                                .addGap(60, 60, 60)
                                .addComponent(btnConsulta_CC)
                                .addGap(41, 41, 41)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(btn_exclui_cc)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inicio_CC)
                    .addComponent(btn_receitaCC)
                    .addComponent(btn_sairCC))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novoCartao_cc)
                    .addComponent(btnConsulta_CC)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btn_exclui_cc)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairCCActionPerformed
        // TODO add your handling code here:
        sair();
    }//GEN-LAST:event_btn_sairCCActionPerformed

    private void btn_inicio_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_CCActionPerformed
        // TODO add your handling code here:
        inicio();
    }//GEN-LAST:event_btn_inicio_CCActionPerformed

    private void btn_receitaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_receitaCCActionPerformed
        // TODO add your handling code here:
        receita();
    }//GEN-LAST:event_btn_receitaCCActionPerformed

    private void btn_novoCartao_ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoCartao_ccActionPerformed
        // TODO add your handling code here:
        cadastra_cartao();
    }//GEN-LAST:event_btn_novoCartao_ccActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btnConsulta_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta_CCActionPerformed
        // TODO add your handling code here:
        TelaConsulta_CartaoCredito();
        //Tela_CartaoConsulta.receberID(txt_id.getText());
    }//GEN-LAST:event_btnConsulta_CCActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCartao_credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCartao_credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCartao_credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCartao_credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCartao_credito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta_CC;
    private javax.swing.JButton btn_exclui_cc;
    private javax.swing.JButton btn_inicio_CC;
    private javax.swing.JButton btn_novoCartao_cc;
    private javax.swing.JButton btn_receitaCC;
    private javax.swing.JButton btn_sairCC;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables


    public void receberID(String recebe){

        txt_id.setText(recebe);
    }


}
