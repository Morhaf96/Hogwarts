/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import javax.swing.JComboBox;
import oru.inf.InfDB;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class RegistreraNyLarare extends javax.swing.JFrame {

    private DataHanterare dataHanterare;
    private InfDB databasen;
    //new RegistreraNyLarare().setVisible(true);

    /**
     * Creates new form RegistreraNyLarare
     */
    public RegistreraNyLarare() {
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
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblPw = new javax.swing.JLabel();
        cboxAdmin = new javax.swing.JComboBox<>();
        lblAdmin = new javax.swing.JLabel();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        txtPw = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblLyckad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitel.setText("Registrera ny lärare");

        lblFornamn.setText("Förnamn:");

        lblEfternamn.setText("Efternamn:");

        lblPw.setText("Lösenord:");

        cboxAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nej", "Ja" }));

        lblAdmin.setText("Administratörstatus:");

        btnGo.setText("Registrera lärare");
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

        lblLyckad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFornamn)
                                    .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEfternamn)
                                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPw, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdmin)
                            .addComponent(cboxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLyckad)
                            .addComponent(btnGo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEfternamn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPw, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFornamn)
                        .addComponent(lblAdmin)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLyckad)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * kontrollerar vilket värde som är valt och returnerar rätt värde för db.
     *
     * @param cboxA
     * @return
     */
    public String cboxKontroll(JComboBox cboxA) {
        String admin = "";
        if (cboxA.getSelectedItem().toString().equals("Ja")) {
            admin = "T";
        } else if (cboxA.getSelectedItem().toString().equals("Nej")) {
            admin = "F";
        }
        return admin;
    }

    /**
     * textfält valideras. lärare registreras (namn, lösenord och admin status)
     * status meddelande skrivs ut
     *
     * @param evt
     */
    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        if (!Validering.FaltArTom(txtFornamn)) {
            if (!Validering.FaltArTom(txtEfternamn)) {
                if (!Validering.FaltArTom(txtPw)) {
                    String fornamn = dataHanterare.namnFormat(txtFornamn.getText());
                    String efternamn = dataHanterare.efternamnFormat(txtEfternamn.getText());
                    String pw = txtPw.getText();
                    String a = cboxKontroll(cboxAdmin);
                    if (dataHanterare.registreraNyLarare(fornamn, efternamn, pw, a)) {
                        lblLyckad.setText(fornamn + " " + efternamn + " är nu registrerad");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGo;
    private javax.swing.JComboBox<String> cboxAdmin;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblLyckad;
    private javax.swing.JLabel lblPw;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtPw;
    // End of variables declaration//GEN-END:variables
}