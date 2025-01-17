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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class TelaCartaoCredito_consulta extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaCartaoCredito_consulta() {
        initComponents();
        conexao = moduloConexao.conector();
        this.setLocationRelativeTo(null);
    }
    
    private void consultar(){
       String sql = "select * from cartao_credito where conta_id_conta =?";
        
       try {
           String id = txt_id.getText();
           pst = conexao.prepareStatement(sql);
           pst.setString(1, txt_id.getText());
           rs=pst.executeQuery();
           
           if(rs.next()){
               txt_SetNumeroCC.setText(rs.getString(1));
               txt_SetLimiteCC.setText(rs.getString(2));
               txt_DiaFatCC.setText(rs.getString(3));
               txt_valorFatCC1.setText(rs.getString(4));
               txt_SetBandeira.setText(rs.getString(5));
           }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao realizar consulta");
        }
    }
    
    void volta_telaCartaoDeCredito() {
       
        TelaCartao_credito TelaCartao_credito = null;

        if (TelaCartao_credito == null) {

            TelaCartao_credito = new TelaCartao_credito();

            TelaCartao_credito.setVisible(true);

            TelaCartao_credito.receberID(txt_id.getText());

        } else {

            TelaCartao_credito.setVisible(true);

            TelaCartao_credito.setState(TelaPrincipal.NORMAL);

            TelaCartao_credito.receberID(txt_id.getText());

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_DiaFatCC = new javax.swing.JTextField();
        txt_SetBandeira = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_SetNumeroCC = new javax.swing.JTextField();
        txt_SetLimiteCC = new javax.swing.JTextField();
        txt_valorFatCC1 = new javax.swing.JTextField();
        btn_Consultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnDeletar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaCC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Número");

        jLabel2.setText("Limite");

        jLabel3.setText("Dia da fatura");

        jLabel4.setText("Valor da fatura");

        jLabel5.setText("Bandeira");

        txt_SetBandeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SetBandeiraActionPerformed(evt);
            }
        });

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_SetLimiteCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SetLimiteCCActionPerformed(evt);
            }
        });

        txt_valorFatCC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorFatCC1ActionPerformed(evt);
            }
        });

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        btnDeletar.setText("Deletar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Consulta de Cartão de Crédito");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jtConsultaCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Cartão Crédito", "Limite", "Dia da Fatura", "Valor da Fatura", "Bandeira"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtConsultaCC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_SetBandeira)
                                    .addComponent(txt_SetNumeroCC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_SetLimiteCC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_DiaFatCC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_valorFatCC1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAlterar)
                                .addComponent(btn_Consultar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar)
                            .addComponent(btnDeletar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Consultar)
                            .addComponent(btnDeletar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnAlterar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnVoltar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_SetNumeroCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SetLimiteCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_DiaFatCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_valorFatCC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_SetBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_SetBandeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SetBandeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SetBandeiraActionPerformed

    private void txt_SetLimiteCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SetLimiteCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SetLimiteCCActionPerformed

    private void txt_valorFatCC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorFatCC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorFatCC1ActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:

        volta_telaCartaoDeCredito();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        DefaultTableModel mp1 = (DefaultTableModel) jtConsultaCC.getModel();
        
        int l = mp1.getRowCount();
        
        if(l>0){
            while(l>0){
                //Limpa tabela sempre que for fazer uma nova consulta
                ((DefaultTableModel) jtConsultaCC.getModel()).removeRow(l - 1);
                
                //Menos um pois a primeira linha é a linha zero
                l--;
            }
        }
        
        try{
            
            String pesquisa = "select * from cartao_credito where conta_id_conta=?";

            pst = conexao.prepareStatement(pesquisa);
            
            pst.setInt(1, Integer.parseInt(txt_id.getText()));

            DefaultTableModel mp = (DefaultTableModel) jtConsultaCC.getModel();
            
            rs = pst.executeQuery();    

            while(rs.next()) {
               
                
                
                String Col0 = rs.getString("n_cartao_credito");
                String Col1 = rs.getString("limite");
                String Col2 = rs.getString("dia_fatura");
                String Col3 = rs.getString("valor_fatura");
                String Col4 = rs.getString("bandeira");
                
                
                //Redimensiona a tabela
                //TamanhoColunas();
                
                mp.addRow(new String[] {Col0,Col1,Col2,Col3,Col4});
                
            }
            
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
        jtConsultaCC.setAutoCreateRowSorter(true);
        
    
        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TelaCartaoCredito_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCartaoCredito_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCartaoCredito_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCartaoCredito_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCartaoCredito_consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnDeletar;
    private javax.swing.JToggleButton btnVoltar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultaCC;
    private javax.swing.JTextField txt_DiaFatCC;
    private javax.swing.JTextField txt_SetBandeira;
    private javax.swing.JTextField txt_SetLimiteCC;
    private javax.swing.JTextField txt_SetNumeroCC;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_valorFatCC1;
    // End of variables declaration//GEN-END:variables

     public void receberID(String recebe){

        txt_id.setText(recebe);
    }
}
