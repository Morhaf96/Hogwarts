/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import java.util.ArrayList;
import oru.inf.InfDB;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class KollaEleverIEttElevhem extends javax.swing.JFrame {

    private InfDB databasen;
    private DataHanterare dataHanterare;

    /**
     * Creates new form KollaEleverIEttElevhem
     */
    public KollaEleverIEttElevhem() {
        databasen = DataHanterare.dataHanterare();
        dataHanterare = new DataHanterare();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisaElever = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtElever = new javax.swing.JTextArea();
        cboxElevhem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnVisaElever.setText("Visa elever");
        btnVisaElever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaEleverActionPerformed(evt);
            }
        });

        txtElever.setEditable(false);
        txtElever.setColumns(20);
        txtElever.setRows(5);
        jScrollPane1.setViewportView(txtElever);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Välj Elevhem");

        btnClose.setText("Stäng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Lista alla elever");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVisaElever)
                            .addComponent(cboxElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnClose))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboxElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisaElever)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(btnClose)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * metoden skriver ut alla medlemmar i ett specifikt elevhem när knappen
     * klickas.
     *
     * @param evt
     */
    private void btnVisaEleverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaEleverActionPerformed
        txtElever.setText(null);
        ArrayList<String> fornamn = dataHanterare.ListaFornamnIEttElevhem(cboxElevhem);
        ArrayList<String> efternamn = dataHanterare.ListaEfternamnIEttElevhem(cboxElevhem);
        int i = 0;
        String skrivut = "";
        while (i < fornamn.size()) {
            skrivut += fornamn.get(i) + " " + efternamn.get(i) + "\n";
            i++;
        }
        txtElever.setText(skrivut);
    }//GEN-LAST:event_btnVisaEleverActionPerformed

    // Lägger till alla elevhemsnamn till comboboxen.
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (cboxElevhem.getItemCount() == 0) {
            dataHanterare.laggTillElevhem(cboxElevhem);
        }
    }//GEN-LAST:event_formWindowActivated

    //Stänger ner befentliga JFrame
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnVisaElever;
    private javax.swing.JComboBox<String> cboxElevhem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtElever;
    // End of variables declaration//GEN-END:variables
}
