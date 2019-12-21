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
public class GeAdminstatus extends javax.swing.JFrame {

    private DataHanterare dataHanterare;
    private InfDB databasen;

    /**
     * Creates new form GeAdminstatus
     */
    public GeAdminstatus() {
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

        lblTitel = new javax.swing.JLabel();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblLyckad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitel.setText("Ge en lärare administratörstatus");

        btnGo.setText("Ge administratörstatus");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnClose.setText("Stäng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblFornamn.setText("Förnamn:");

        lblEfternamn.setText("Efternamn:");

        lblLyckad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(btnGo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFornamn)
                                        .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(lblEfternamn))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(21, 85, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLyckad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornamn)
                    .addComponent(lblEfternamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLyckad, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        if (!Validering.FaltArTom(txtFornamn)) {
            if (!Validering.FaltArTom(txtEfternamn)) {
                String fornamn = txtFornamn.getText();
                String lararensFornamn = dataHanterare.namnFormat(fornamn);
                String efternamn = txtEfternamn.getText();
                String lararensEfternamn = dataHanterare.efternamnFormat(efternamn);
                int id = dataHanterare.getLararID(lararensFornamn, lararensEfternamn);
                if (id != 0) {
                    if (dataHanterare.geAdminStatus(id)) {
                        lblLyckad.setText(txtFornamn.getText() + " " + txtEfternamn.getText() + " har nu administratörstatus");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblLyckad;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtFornamn;
    // End of variables declaration//GEN-END:variables
}
