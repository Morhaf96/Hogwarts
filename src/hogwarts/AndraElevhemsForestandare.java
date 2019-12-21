/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import oru.inf.InfDB;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class AndraElevhemsForestandare extends javax.swing.JFrame {

    private DataHanterare dataHanterare;
    private InfDB databasen;

    /**
     * Creates new form AndraElevhemsForstandare
     */
    public AndraElevhemsForestandare() {
        databasen = DataHanterare.dataHanterare();
        dataHanterare = new DataHanterare();
        initComponents();
        this.setLocationRelativeTo(null); // Gör att JFramen dyker upp i mitten av skärmen
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
        cmbElevhem = new javax.swing.JComboBox<>();
        lblLararensFornamn = new javax.swing.JLabel();
        tfLararensFornamn = new javax.swing.JTextField();
        lblLararensEfternamn = new javax.swing.JLabel();
        tfLararensEfternamn = new javax.swing.JTextField();
        btnAndraElevhemsForestandare = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblStatusSvar = new javax.swing.JLabel();
        btnStang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Välj ett elevhem och en ange en ny elevhemsföresåndare");

        lblLararensFornamn.setText("Lärarens förnamn:");
        lblLararensFornamn.setAlignmentX(5.0F);
        lblLararensFornamn.setAlignmentY(5.0F);

        lblLararensEfternamn.setText("Lärarens efternamn:");

        btnAndraElevhemsForestandare.setText("Ändra!");
        btnAndraElevhemsForestandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraElevhemsForestandareActionPerformed(evt);
            }
        });

        lblStatus.setText("Status:");

        btnStang.setText("Stäng");
        btnStang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cmbElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLararensFornamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfLararensFornamn))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLararensEfternamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfLararensEfternamn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnAndraElevhemsForestandare))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(lblStatus)
                            .addGap(18, 18, 18)
                            .addComponent(lblStatusSvar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStang))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLararensFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLararensEfternamn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLararensFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLararensEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAndraElevhemsForestandare, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(lblStatusSvar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStang)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraElevhemsForestandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraElevhemsForestandareActionPerformed
        //Validering att fälten inte är tomma.
        if (Validering.FaltArTom(tfLararensFornamn) || Validering.FaltArTom(tfLararensEfternamn)) { //kollar att inmatningsfälten inte är tomma
            lblStatusSvar.setText("Ändringen lyckades ej!"); // visar felmeddelande ifall inmatningsfälten är tomma
        } else {
            String elevhemsNamn = cmbElevhem.getSelectedItem().toString(); //hämtar vald text från comboboxen för elevhem
            String fornamn = tfLararensFornamn.getText();   // hämtar förnamnet från textfältet för förnamn
            String lararensFornamn = dataHanterare.namnFormat(fornamn); //gör det hämtade förnamnet till godkänd form
            String efternamn = tfLararensEfternamn.getText(); //hämtar efternamn från textfält för efternamn
            String lararensEfternamn = dataHanterare.efternamnFormat(efternamn); //gör det hämtade efternamnet till godkänd form
            if (dataHanterare.andraElevhemsForestandare(elevhemsNamn, lararensFornamn, lararensEfternamn)) { //metodantop som ändrar elevhemsföreståndare i databasen
                lblStatusSvar.setText("Ändringen lyckades!"); //visar text om ändringen lyckats
            } else {
                lblStatusSvar.setText("Ändringen lyckades ej!"); // visar text om ändringen lyckades ej
            }
        }
    }//GEN-LAST:event_btnAndraElevhemsForestandareActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (cmbElevhem.getItemCount() == 0) {
            dataHanterare.laggTillElevhem(cmbElevhem); // hämtar elevhemsnamn från databasen och lägger in det i elevhems comboboxen.
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnStangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStangActionPerformed
        //Stänger ner befentlig JFrame
        this.dispose();
    }//GEN-LAST:event_btnStangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraElevhemsForestandare;
    private javax.swing.JButton btnStang;
    private javax.swing.JComboBox<String> cmbElevhem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLararensEfternamn;
    private javax.swing.JLabel lblLararensFornamn;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusSvar;
    private javax.swing.JTextField tfLararensEfternamn;
    private javax.swing.JTextField tfLararensFornamn;
    // End of variables declaration//GEN-END:variables
}
