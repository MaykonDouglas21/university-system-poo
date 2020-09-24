/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.IU;

/**
 *
 * @author gabri
 */
public class IUCadFunctionaries extends javax.swing.JFrame {

    /**
     * Creates new form IUCadFunctionaries
     */
    public IUCadFunctionaries() {
        initComponents();
        this.setTitle("Cadastro de Funcionários");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        labelFuncionario = new javax.swing.JLabel();
        radioTecnico = new javax.swing.JRadioButton();
        radioDocEfetivo = new javax.swing.JRadioButton();
        radioDocSubs = new javax.swing.JRadioButton();
        labelCodFunc = new javax.swing.JLabel();
        labelNomeFunc = new javax.swing.JLabel();
        campoCodFunc = new javax.swing.JTextField();
        campoNomeFunc = new javax.swing.JTextField();
        ComboBoxListaNiveis = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxListaFuncoes = new javax.swing.JComboBox<>();
        labelFuncao = new javax.swing.JLabel();
        labelTitulacao = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        ComboBoxListaTitulacoes = new javax.swing.JComboBox<>();
        ComboBoxListaAreas = new javax.swing.JComboBox<>();
        labelCargaHorariaSubs = new javax.swing.JLabel();
        radio12Horas = new javax.swing.JRadioButton();
        radio24Horas = new javax.swing.JRadioButton();
        btnSalvarFunc = new javax.swing.JButton();
        btnVoltarFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelFuncionario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        labelFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFuncionario.setText("CADASTRO DE FUNCIONÁRIO");

        buttonGroup3.add(radioTecnico);
        radioTecnico.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        radioTecnico.setText("Técnico");
        radioTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTecnicoActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioDocEfetivo);
        radioDocEfetivo.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        radioDocEfetivo.setText("Docente Efetivo");
        radioDocEfetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDocEfetivoActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioDocSubs);
        radioDocSubs.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        radioDocSubs.setText("Docente Substituto");
        radioDocSubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDocSubsActionPerformed(evt);
            }
        });

        labelCodFunc.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        labelCodFunc.setText("Código:");

        labelNomeFunc.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        labelNomeFunc.setText("Nome:");

        campoCodFunc.setEnabled(false);
        campoCodFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodFuncActionPerformed(evt);
            }
        });
        campoCodFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoCodFuncKeyReleased(evt);
            }
        });

        campoNomeFunc.setEnabled(false);
        campoNomeFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoNomeFuncKeyReleased(evt);
            }
        });

        ComboBoxListaNiveis.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        ComboBoxListaNiveis.setEnabled(false);
        ComboBoxListaNiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxListaNiveisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel1.setText("Nível:");

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel2.setText("Salário base: R$ 1.500,00");

        ComboBoxListaFuncoes.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        ComboBoxListaFuncoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acessor", "Laboratório", "Secretário" }));
        ComboBoxListaFuncoes.setEnabled(false);

        labelFuncao.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        labelFuncao.setText("Função:");

        labelTitulacao.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        labelTitulacao.setText("Titulação:");

        labelArea.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        labelArea.setText("Área:");

        ComboBoxListaTitulacoes.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        ComboBoxListaTitulacoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduação", "Mestrado", "Doutorado", "Livre-Docente", "Titular" }));
        ComboBoxListaTitulacoes.setEnabled(false);

        ComboBoxListaAreas.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        ComboBoxListaAreas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biológicas", "Exatas", "Humanas", "Saúde" }));
        ComboBoxListaAreas.setEnabled(false);
        ComboBoxListaAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxListaAreasActionPerformed(evt);
            }
        });

        labelCargaHorariaSubs.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        labelCargaHorariaSubs.setText("Carga horária do substituto:");

        buttonGroup4.add(radio12Horas);
        radio12Horas.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        radio12Horas.setText("12");
        radio12Horas.setEnabled(false);

        buttonGroup4.add(radio24Horas);
        radio24Horas.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        radio24Horas.setText("24");
        radio24Horas.setEnabled(false);

        btnSalvarFunc.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        btnSalvarFunc.setText("Salvar");
        btnSalvarFunc.setEnabled(false);
        btnSalvarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncActionPerformed(evt);
            }
        });

        btnVoltarFunc.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        btnVoltarFunc.setText("Voltar");
        btnVoltarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(radioTecnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioDocEfetivo)
                .addGap(75, 75, 75)
                .addComponent(radioDocSubs)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeFunc)
                            .addComponent(labelCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFuncao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ComboBoxListaTitulacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTitulacao))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ComboBoxListaAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelArea))
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(ComboBoxListaNiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnSalvarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCargaHorariaSubs)
                        .addGap(18, 18, 18)
                        .addComponent(radio12Horas)
                        .addGap(29, 29, 29)
                        .addComponent(radio24Horas))
                    .addComponent(ComboBoxListaFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDocEfetivo)
                    .addComponent(radioDocSubs)
                    .addComponent(radioTecnico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeFunc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuncao)
                    .addComponent(jLabel1)
                    .addComponent(labelArea)
                    .addComponent(labelTitulacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxListaFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxListaTitulacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxListaAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxListaNiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio24Horas)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCargaHorariaSubs)
                        .addComponent(radio12Horas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTecnicoActionPerformed
        // TODO add your handling code here:
        
        if  (radioTecnico.isSelected()) {
            campoCodFunc.setEnabled(radioTecnico.isSelected());
            campoNomeFunc.setEnabled(radioTecnico.isSelected());
            ComboBoxListaFuncoes.setEnabled(radioTecnico.isSelected());
            ComboBoxListaNiveis.setEnabled(radioTecnico.isSelected());
            
            if("T1".equals(ComboBoxListaNiveis.getItemAt(0)) || "T2".equals(ComboBoxListaNiveis.getItemAt(1))) {
                ComboBoxListaNiveis.removeItem("T1");
                ComboBoxListaNiveis.removeItem("T2");
            }
            
            ComboBoxListaNiveis.addItem("T1");
            ComboBoxListaNiveis.addItem("T2");
            ComboBoxListaNiveis.removeItem("S1");
            ComboBoxListaNiveis.removeItem("S2");
            ComboBoxListaNiveis.removeItem("D1");
            ComboBoxListaNiveis.removeItem("D2");
            ComboBoxListaNiveis.removeItem("D3");
            
            ComboBoxListaTitulacoes.setEnabled(false);
            ComboBoxListaAreas.setEnabled(false);
            radio12Horas.setEnabled(false);
            radio24Horas.setEnabled(false);
        }       
         
        else {
            ComboBoxListaNiveis.removeItemAt(0);
            ComboBoxListaNiveis.removeItemAt(1);
        
        }
        
    }//GEN-LAST:event_radioTecnicoActionPerformed

    private void radioDocSubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDocSubsActionPerformed
        // TODO add your handling code here:
        if  (radioDocSubs.isSelected()) {
            campoCodFunc.setEnabled(radioDocSubs.isSelected());
            campoNomeFunc.setEnabled(radioDocSubs.isSelected());
            ComboBoxListaNiveis.setEnabled(radioDocSubs.isSelected());
            
            if("S1".equals(ComboBoxListaNiveis.getItemAt(0)) || "S2".equals(ComboBoxListaNiveis.getItemAt(1))) {
                ComboBoxListaNiveis.removeItem("S1");
                ComboBoxListaNiveis.removeItem("S2");
            }
            
            ComboBoxListaNiveis.addItem("S1");
            ComboBoxListaNiveis.addItem("S2");
            ComboBoxListaNiveis.removeItem("T1");
            ComboBoxListaNiveis.removeItem("T2");
            ComboBoxListaNiveis.removeItem("D1");
            ComboBoxListaNiveis.removeItem("D2");
            ComboBoxListaNiveis.removeItem("D3");
            
            
            
            ComboBoxListaTitulacoes.setEnabled(radioDocSubs.isSelected());
            radio12Horas.setEnabled(radioDocSubs.isSelected());
            radio24Horas.setEnabled(radioDocSubs.isSelected());
            ComboBoxListaAreas.setEnabled(radioDocSubs.isSelected());
            
            ComboBoxListaFuncoes.setEnabled(false);
        }
    }//GEN-LAST:event_radioDocSubsActionPerformed

    private void campoCodFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodFuncActionPerformed

    private void ComboBoxListaNiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxListaNiveisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxListaNiveisActionPerformed

    private void btnSalvarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncActionPerformed
        // TODO add your handling code here:
        String nomeFun = campoNomeFunc.getText();
        String codFun = campoCodFunc.getText();
    }//GEN-LAST:event_btnSalvarFuncActionPerformed

    private void ComboBoxListaAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxListaAreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxListaAreasActionPerformed

    private void radioDocEfetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDocEfetivoActionPerformed
        // TODO add your handling code here:
        
        if  (radioDocEfetivo.isSelected()) {
            campoCodFunc.setEnabled(radioDocEfetivo.isSelected());
            campoNomeFunc.setEnabled(radioDocEfetivo.isSelected());
            ComboBoxListaTitulacoes.setEnabled(radioDocEfetivo.isSelected());
            ComboBoxListaAreas.setEnabled(radioDocEfetivo.isSelected());
            ComboBoxListaNiveis.setEnabled(radioDocEfetivo.isSelected());
            
            
            if("D1".equals(ComboBoxListaNiveis.getItemAt(0)) || "D2".equals(ComboBoxListaNiveis.getItemAt(1)) || "D3".equals(ComboBoxListaNiveis.getItemAt(2))) {
                ComboBoxListaNiveis.removeItem("D1");
                ComboBoxListaNiveis.removeItem("D2");
                ComboBoxListaNiveis.removeItem("D3");
            }
            
            ComboBoxListaNiveis.addItem("D1");
            ComboBoxListaNiveis.addItem("D2");
            ComboBoxListaNiveis.addItem("D3");
            ComboBoxListaNiveis.removeItem("T1");
            ComboBoxListaNiveis.removeItem("T2");
            ComboBoxListaNiveis.removeItem("S1");
            ComboBoxListaNiveis.removeItem("S2");

            
            
            ComboBoxListaFuncoes.setEnabled(false);
            radio12Horas.setEnabled(false);
            radio24Horas.setEnabled(false);
        }
        
    }//GEN-LAST:event_radioDocEfetivoActionPerformed

    private void campoCodFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodFuncKeyReleased
        // TODO add your handling code here:
        if (campoCodFunc.getText().length()>0){
                btnSalvarFunc.setEnabled(true);
                campoNomeFuncKeyReleased(evt);
            } else if (campoCodFunc.getText().length()<= 0) {
                btnSalvarFunc.setEnabled(false);
            }
    }//GEN-LAST:event_campoCodFuncKeyReleased

    private void campoNomeFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeFuncKeyReleased
        // TODO add your handling code here:
       if (campoNomeFunc.getText().length()>0){
                btnSalvarFunc.setEnabled(true);
            } else if (campoNomeFunc.getText().length()<= 0) {
                btnSalvarFunc.setEnabled(false);
        }
    }//GEN-LAST:event_campoNomeFuncKeyReleased

    private void btnVoltarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarFuncActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnVoltarFuncActionPerformed

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
            java.util.logging.Logger.getLogger(IUCadFunctionaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadFunctionaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadFunctionaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadFunctionaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUCadFunctionaries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxListaAreas;
    private javax.swing.JComboBox<String> ComboBoxListaFuncoes;
    private javax.swing.JComboBox<String> ComboBoxListaNiveis;
    private javax.swing.JComboBox<String> ComboBoxListaTitulacoes;
    private javax.swing.JButton btnSalvarFunc;
    private javax.swing.JButton btnVoltarFunc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField campoCodFunc;
    private javax.swing.JTextField campoNomeFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelCargaHorariaSubs;
    private javax.swing.JLabel labelCodFunc;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelNomeFunc;
    private javax.swing.JLabel labelTitulacao;
    private javax.swing.JRadioButton radio12Horas;
    private javax.swing.JRadioButton radio24Horas;
    private javax.swing.JRadioButton radioDocEfetivo;
    private javax.swing.JRadioButton radioDocSubs;
    private javax.swing.JRadioButton radioTecnico;
    // End of variables declaration//GEN-END:variables
}
