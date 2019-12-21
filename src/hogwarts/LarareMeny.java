/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class LarareMeny extends javax.swing.JFrame {

    private int id;

    /**
     * Creates new form LarareMeny
     *
     * @param id
     */
    public LarareMeny(int id) {

        this.id = id;
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

        btnAndraPw = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        btnRegistreraNyElev = new javax.swing.JButton();
        btnAndraInfoElev = new javax.swing.JButton();
        BtnRegistreraBetyg = new javax.swing.JButton();
        btnAndraHuspoang = new javax.swing.JButton();
        btnAndrabetyg = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAndraPw.setText("Ändra lösenord");
        btnAndraPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraPwActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRubrik.setText("Vad vill du göra idag?");

        btnRegistreraNyElev.setText("Registrera nya elever");
        btnRegistreraNyElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraNyElevActionPerformed(evt);
            }
        });

        btnAndraInfoElev.setText("Ändra information om existerande elever");
        btnAndraInfoElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoElevActionPerformed(evt);
            }
        });

        BtnRegistreraBetyg.setText("Registrera kursbetyg för elever");
        BtnRegistreraBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistreraBetygActionPerformed(evt);
            }
        });

        btnAndraHuspoang.setText("Registrera / dra av huspoäng");
        btnAndraHuspoang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraHuspoangActionPerformed(evt);
            }
        });

        btnAndrabetyg.setText("Ändra kursbetyg för elever");
        btnAndrabetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndrabetygActionPerformed(evt);
            }
        });

        btnClose.setText("Logga ut");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnClose))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAndraHuspoang)
                                    .addComponent(lblRubrik)
                                    .addComponent(BtnRegistreraBetyg)
                                    .addComponent(btnAndraPw))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistreraNyElev)
                        .addGap(49, 310, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAndrabetyg)
                            .addComponent(btnAndraInfoElev))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistreraNyElev)
                .addGap(18, 18, 18)
                .addComponent(btnAndraInfoElev)
                .addGap(18, 18, 18)
                .addComponent(BtnRegistreraBetyg)
                .addGap(18, 18, 18)
                .addComponent(btnAndrabetyg)
                .addGap(18, 18, 18)
                .addComponent(btnAndraHuspoang)
                .addGap(18, 18, 18)
                .addComponent(btnAndraPw)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//knapptryck skapar nya objekt av andra jframe klasser.
    private void btnAndraPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraPwActionPerformed
        new BytLosenord(id).setVisible(true);
    }//GEN-LAST:event_btnAndraPwActionPerformed

    private void btnAndraHuspoangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraHuspoangActionPerformed
        new AndraHuspoang().setVisible(true);
    }//GEN-LAST:event_btnAndraHuspoangActionPerformed

    private void btnAndrabetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndrabetygActionPerformed
        new AndraKursbetygForEnElev().setVisible(true);
    }//GEN-LAST:event_btnAndrabetygActionPerformed

    private void BtnRegistreraBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistreraBetygActionPerformed
        new RegistreraKursbetygForEnElev().setVisible(true);
    }//GEN-LAST:event_BtnRegistreraBetygActionPerformed

    private void btnAndraInfoElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoElevActionPerformed
        new AndraInformationPaEnElev().setVisible(true);
    }//GEN-LAST:event_btnAndraInfoElevActionPerformed

    private void btnRegistreraNyElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraNyElevActionPerformed
        new RegistreraNyElev().setVisible(true);
    }//GEN-LAST:event_btnRegistreraNyElevActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        //Stänger ner befentlig JFrame
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistreraBetyg;
    private javax.swing.JButton btnAndraHuspoang;
    private javax.swing.JButton btnAndraInfoElev;
    private javax.swing.JButton btnAndraPw;
    private javax.swing.JButton btnAndrabetyg;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnRegistreraNyElev;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
