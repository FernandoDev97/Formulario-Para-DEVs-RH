
package br.com.formulario.view;

import br.com.formulario.model.Formulario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaForm extends javax.swing.JFrame {
    
    List<Formulario> lista = new ArrayList<>();
   
    public void listarTodos (){
        
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        
        lista.forEach(formulario -> {
            dados.addRow(new Object[]{
                formulario.getNome(),
                formulario.getSobrenome(),
                formulario.getAplicacao(),
                formulario.getSenioridade(),
                formulario.getTecnologias()
                
            });
        });
    }
    
    public TelaForm() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        subTitulo = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoSobrenome = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        sobrenome = new javax.swing.JLabel();
        ladoAplicacao = new javax.swing.JLabel();
        radioFront = new javax.swing.JRadioButton();
        radioBack = new javax.swing.JRadioButton();
        radioFull = new javax.swing.JRadioButton();
        senioridade = new javax.swing.JLabel();
        boxSenioridade = new javax.swing.JComboBox<>();
        tecnologias = new javax.swing.JLabel();
        boxHtml = new javax.swing.JCheckBox();
        boxCss = new javax.swing.JCheckBox();
        boxJavascript = new javax.swing.JCheckBox();
        boxPhp = new javax.swing.JCheckBox();
        boxJava = new javax.swing.JCheckBox();
        boxCcha = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        salvar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 48)); // NOI18N
        titulo.setText("Cadastro de DEVs");

        subTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subTitulo.setText("Complete suas informações");

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSobrenomeActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setText("Nome");

        sobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sobrenome.setText("Sobrenome");

        ladoAplicacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ladoAplicacao.setText("De qual lado da aplicação você desenvolve?");

        radioFront.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioFront.setText("Front-End");
        radioFront.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioFrontMouseClicked(evt);
            }
        });
        radioFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFrontActionPerformed(evt);
            }
        });

        radioBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioBack.setText("Back-End");
        radioBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBackActionPerformed(evt);
            }
        });

        radioFull.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioFull.setText("Fullstack");
        radioFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFullActionPerformed(evt);
            }
        });

        senioridade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senioridade.setText("Senioridade");

        boxSenioridade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxSenioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Junior", "Pleno", "Sênior" }));
        boxSenioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSenioridadeActionPerformed(evt);
            }
        });

        tecnologias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tecnologias.setText("Selecione as tecnologias que ultiliza:");

        boxHtml.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxHtml.setText("HTML");
        boxHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHtmlActionPerformed(evt);
            }
        });

        boxCss.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxCss.setText("CSS");
        boxCss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCssActionPerformed(evt);
            }
        });

        boxJavascript.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxJavascript.setText("JavaScript");
        boxJavascript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJavascriptActionPerformed(evt);
            }
        });

        boxPhp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxPhp.setText("PHP");

        boxJava.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxJava.setText("JAVA");

        boxCcha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxCcha.setText("C#");
        boxCcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCchaActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Aplicacao", "Senioridade", "Tecnologias"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        salvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salvar.setText("Salvar");
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarMouseClicked(evt);
            }
        });

        editar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editar.setText("Editar");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });

        deletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deletar.setText("Deletar");
        deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tecnologias)
                            .addComponent(boxSenioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senioridade)
                            .addComponent(radioFull)
                            .addComponent(radioBack)
                            .addComponent(radioFront)
                            .addComponent(ladoAplicacao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sobrenome)
                                    .addComponent(campoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxHtml)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxCss)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxJavascript)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxPhp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxJava)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxCcha))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(salvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editar)
                                    .addGap(125, 125, 125)
                                    .addComponent(deletar))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(subTitulo)
                        .addGap(411, 411, 411))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subTitulo)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(sobrenome))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(ladoAplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioFront)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioFull)
                .addGap(18, 18, 18)
                .addComponent(senioridade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSenioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tecnologias)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxCss)
                    .addComponent(boxJavascript)
                    .addComponent(boxPhp)
                    .addComponent(boxJava)
                    .addComponent(boxCcha)
                    .addComponent(boxHtml))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(editar)
                    .addComponent(deletar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSobrenomeActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void radioBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBackActionPerformed

    private void radioFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFrontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFrontActionPerformed

    private void radioFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFullActionPerformed

    private void boxSenioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSenioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSenioridadeActionPerformed

    private void boxCssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCssActionPerformed

    private void boxCchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCchaActionPerformed

    private void boxJavascriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJavascriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxJavascriptActionPerformed

    private void salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseClicked
        Formulario formulario = new Formulario();
        formulario.setNome (campoNome.getText());
        formulario.setSobrenome(campoSobrenome.getText());
        formulario.setAplicacao(Arrays.deepToString(radioFront.getSelectedObjects()));
        
        formulario.setSenioridade(boxSenioridade.getSelectedItem().toString());  
      
       
        
        lista.add(formulario);
        listarTodos();
        
    }//GEN-LAST:event_salvarMouseClicked

    private void radioFrontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioFrontMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFrontMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        // TODO add your handling code here:
        Formulario formulario1 = new Formulario();
        formulario1.setNome(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        formulario1.setSobrenome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        formulario1.setSenioridade(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        
        for (Formulario formulario : lista){
            if(formulario.getNome() == formulario1.getNome()){
                int posicao = lista.indexOf(formulario);
                
                Formulario dev = new Formulario();
                dev.setNome(campoNome.getText());
                dev.setSobrenome(campoSobrenome.getText());
                dev.setSenioridade(boxSenioridade.getSelectedItem().toString());
                
                lista.set(posicao, dev);
                JOptionPane.showMessageDialog (null, "Cadastro atualizado!");
           
            }
            listarTodos();
        
        }
    }//GEN-LAST:event_editarMouseClicked

    private void boxHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHtmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxHtmlActionPerformed

    private void deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarMouseClicked
        // TODO add your handling code here:
        Formulario formulario1 = new Formulario();
        formulario1.setNome(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        
        for (Formulario formulario : lista){
            
            if(formulario.getNome() == formulario1.getNome()){
                lista.remove(formulario);
                JOptionPane.showMessageDialog (null, "Excluido com sucesso!");
                listarTodos();
            }
        
        }
        
    }//GEN-LAST:event_deletarMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxCcha;
    private javax.swing.JCheckBox boxCss;
    private javax.swing.JCheckBox boxHtml;
    private javax.swing.JCheckBox boxJava;
    private javax.swing.JCheckBox boxJavascript;
    private javax.swing.JCheckBox boxPhp;
    private javax.swing.JComboBox<String> boxSenioridade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSobrenome;
    private javax.swing.JButton deletar;
    private javax.swing.JButton editar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ladoAplicacao;
    private javax.swing.JLabel nome;
    private javax.swing.JRadioButton radioBack;
    private javax.swing.JRadioButton radioFront;
    private javax.swing.JRadioButton radioFull;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel senioridade;
    private javax.swing.JLabel sobrenome;
    private javax.swing.JLabel subTitulo;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel tecnologias;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
