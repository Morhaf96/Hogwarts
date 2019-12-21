/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class SeKurserForEnLarareMellanDatum extends javax.swing.JFrame {

    private InfDB databasen;
    private DataHanterare dataHanterare;

    /**
     * Creates new form SeKurserForEnLarareMellanDatum
     */
    public SeKurserForEnLarareMellanDatum() {
        databasen = DataHanterare.dataHanterare();
        dataHanterare = new DataHanterare();
        initComponents();
        this.setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        taVisaKurserForLarare = new javax.swing.JTextArea();
        lblAngeLararensNamn = new javax.swing.JLabel();
        btnVisaKurser = new javax.swing.JButton();
        tfArStartdatum = new javax.swing.JTextField();
        tfManadStartdatum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblArStartdatum = new javax.swing.JLabel();
        lblManadStartdatum = new javax.swing.JLabel();
        lblDagStartdatum = new javax.swing.JLabel();
        tfDagStartdatum = new javax.swing.JTextField();
        lblKurser = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        lblArSlutdatum = new javax.swing.JLabel();
        lblManadSlutdatum = new javax.swing.JLabel();
        lblDagSlutdatum = new javax.swing.JLabel();
        tfArSlutdatum = new javax.swing.JTextField();
        tfManadSlutdatum = new javax.swing.JTextField();
        tfDagSlutdatum = new javax.swing.JTextField();
        tfLararensFornamn = new javax.swing.JTextField();
        tfLararensEfternamn = new javax.swing.JTextField();
        lblLararensFornamn = new javax.swing.JLabel();
        lblLararensEfternamn = new javax.swing.JLabel();
        btnRensa = new javax.swing.JButton();
        btgStang = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taVisaKurserForLarare.setEditable(false);
        taVisaKurserForLarare.setColumns(20);
        taVisaKurserForLarare.setRows(5);
        jScrollPane1.setViewportView(taVisaKurserForLarare);

        lblAngeLararensNamn.setText("Ange lärarens namn:");

        btnVisaKurser.setText("Visa kurser");
        btnVisaKurser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaKurserActionPerformed(evt);
            }
        });

        jLabel1.setText("Startdatum:");

        lblArStartdatum.setText("ÅÅÅÅ");

        lblManadStartdatum.setText("MM");

        lblDagStartdatum.setText("DD");

        lblKurser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblKurser.setText("Kurser:");

        lblSlutdatum.setText("Slutdatum:");

        lblArSlutdatum.setText("ÅÅÅÅ");

        lblManadSlutdatum.setText("MM");

        lblDagSlutdatum.setText("DD");

        tfDagSlutdatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDagSlutdatumActionPerformed(evt);
            }
        });

        lblLararensFornamn.setText("Förnamn:");

        lblLararensEfternamn.setText("Efternamn:");

        btnRensa.setText("Rensa");
        btnRensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRensaActionPerformed(evt);
            }
        });

        btgStang.setText("Stäng");
        btgStang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgStangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRensa, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btgStang)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblSlutdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblArStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfArStartdatum))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfManadStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblManadStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDagStartdatum)
                                    .addComponent(tfDagStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLararensFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLararensFornamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLararensEfternamn)
                                    .addComponent(tfLararensEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAngeLararensNamn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnVisaKurser, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(lblArSlutdatum))
                                        .addComponent(tfArSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfManadSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfDagSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblManadSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblDagSlutdatum))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKurser, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKurser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAngeLararensNamn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLararensFornamn)
                            .addComponent(lblLararensEfternamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLararensEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLararensFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArStartdatum)
                            .addComponent(lblManadStartdatum)
                            .addComponent(lblDagStartdatum))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfArStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfManadStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDagStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblSlutdatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArSlutdatum)
                            .addComponent(lblManadSlutdatum)
                            .addComponent(lblDagSlutdatum))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfArSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfManadSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDagSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisaKurser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btgStang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRensa))
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * textfält valideras (input + datattyp för siffror). lärares idn hämtas.
     * hittas läraren så hämtas en lista med kurser som på något sätt är
     * inom/mellan datumen valda. kurser skrivs ut. om inga kurser hittas
     * skickas ett meddelande. meddelande skickas om något inte stämmer vid
     * valideringen.
     *
     * @param evt
     */
    private void btnVisaKurserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaKurserActionPerformed

        if (!Validering.FaltArTomUtanPopUp(tfLararensFornamn) && !Validering.FaltArTomUtanPopUp(tfLararensEfternamn) && !Validering.FaltArTomUtanPopUp(tfArStartdatum) && !Validering.FaltArTomUtanPopUp(tfManadStartdatum) && !Validering.FaltArTomUtanPopUp(tfDagStartdatum) && !Validering.FaltArTomUtanPopUp(tfArSlutdatum) && !Validering.FaltArTomUtanPopUp(tfManadSlutdatum) && !Validering.FaltArTomUtanPopUp(tfDagSlutdatum)) {
            if (Validering.arHeltal(tfArStartdatum) && Validering.arHeltal(tfManadStartdatum) && Validering.arHeltal(tfDagStartdatum) && Validering.arHeltal(tfArSlutdatum) && Validering.arHeltal(tfManadSlutdatum) && Validering.arHeltal(tfDagSlutdatum)) {
                if (Validering.giltigDag(tfDagStartdatum) && Validering.giltigDag(tfDagSlutdatum) && Validering.giltigManad(tfManadStartdatum) && Validering.giltigManad(tfManadSlutdatum)) {
                    if (Validering.datumOrdning(tfArStartdatum, tfManadStartdatum, tfDagStartdatum, tfArSlutdatum, tfManadSlutdatum, tfDagSlutdatum)) {
                        String fornamn = dataHanterare.namnFormat(tfLararensFornamn.getText());
                        String efternamn = dataHanterare.efternamnFormat(tfLararensEfternamn.getText());
                        int larareId = dataHanterare.getLararID(fornamn, efternamn);
                        if (larareId != 0) {
                            try {
                                taVisaKurserForLarare.setText(null);

                                ArrayList<String> kuserForLararen = dataHanterare.ListaKurserHosLarare(larareId, tfArStartdatum, tfManadStartdatum, tfDagStartdatum, tfArSlutdatum, tfManadSlutdatum, tfDagSlutdatum);
                                int i = 0;
                                String skrivut = "";
                                while (i < kuserForLararen.size()) {
                                    skrivut += kuserForLararen.get(i) + "\n";
                                    i++;
                                }

                                taVisaKurserForLarare.setText(skrivut);

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Läraren har inga kurser mellan de valda datumen!");
                                System.out.println("Internt felmeddelande:" + e.getMessage());
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i alla textfält ovan!");

        }
    }//GEN-LAST:event_btnVisaKurserActionPerformed

    public void tomFalten() {

        tfLararensFornamn.setText(null);
        tfLararensEfternamn.setText(null);
        tfDagSlutdatum.setText(null);
        tfManadStartdatum.setText(null);
        tfDagStartdatum.setText(null);
        tfArStartdatum.setText(null);
        tfArSlutdatum.setText(null);
        tfManadSlutdatum.setText(null);
    }

    private void btnRensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRensaActionPerformed

        tomFalten();
    }//GEN-LAST:event_btnRensaActionPerformed

    private void btgStangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgStangActionPerformed

        this.dispose();
    }//GEN-LAST:event_btgStangActionPerformed

    private void tfDagSlutdatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDagSlutdatumActionPerformed

    }//GEN-LAST:event_tfDagSlutdatumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btgStang;
    private javax.swing.JButton btnRensa;
    private javax.swing.JButton btnVisaKurser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblAngeLararensNamn;
    private javax.swing.JLabel lblArSlutdatum;
    private javax.swing.JLabel lblArStartdatum;
    private javax.swing.JLabel lblDagSlutdatum;
    private javax.swing.JLabel lblDagStartdatum;
    private javax.swing.JLabel lblKurser;
    private javax.swing.JLabel lblLararensEfternamn;
    private javax.swing.JLabel lblLararensFornamn;
    private javax.swing.JLabel lblManadSlutdatum;
    private javax.swing.JLabel lblManadStartdatum;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JTextArea taVisaKurserForLarare;
    private javax.swing.JTextField tfArSlutdatum;
    private javax.swing.JTextField tfArStartdatum;
    private javax.swing.JTextField tfDagSlutdatum;
    private javax.swing.JTextField tfDagStartdatum;
    private javax.swing.JTextField tfLararensEfternamn;
    private javax.swing.JTextField tfLararensFornamn;
    private javax.swing.JTextField tfManadSlutdatum;
    private javax.swing.JTextField tfManadStartdatum;
    // End of variables declaration//GEN-END:variables
}
