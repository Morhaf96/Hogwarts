/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import javax.swing.JOptionPane;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class HuvudMeny extends javax.swing.JFrame {

    /**
     * Creates new form HuvudMeny
     */
    public HuvudMeny() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lblValjAnvandare = new javax.swing.JLabel();
        cmbValjAnvandare = new javax.swing.JComboBox<>();
        btnGaVidare = new javax.swing.JButton();
        btnStang = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValjAnvandare.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        lblValjAnvandare.setText("Välj användare");
        lblValjAnvandare.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cmbValjAnvandare.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        cmbValjAnvandare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elev", "Lärare" }));

        btnGaVidare.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnGaVidare.setText("Gå vidare");
        btnGaVidare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaVidareActionPerformed(evt);
            }
        });

        btnStang.setText("Stäng");
        btnStang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStangActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hogwarts/Hogwarts-logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStang)
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbValjAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblValjAnvandare))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnGaVidare, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addComponent(lblLogo)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValjAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbValjAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGaVidare, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnStang))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * kontrollerar innehållet i comboboxen och skapar nytt objekt av
     * elevmeny-klassen eller inloggnings-klassen.
     *
     * @param evt
     */
    private void btnGaVidareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaVidareActionPerformed

        String valtVarde = cmbValjAnvandare.getSelectedItem().toString();
        if (valtVarde.equals("Elev")) { //kollar om valet "elev" är vald och visar JFrame till elev isåfall
            JOptionPane.showMessageDialog(null, "Välkommen elev!");
            new ElevMeny().setVisible(true);

        } else if (valtVarde.equals("Lärare")) { //kollar om valet "lärare" är vald och visar JFrame till lärare isåfall
            new LarareInloggning().setVisible(true);

        }
    }//GEN-LAST:event_btnGaVidareActionPerformed

    private void btnStangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStangActionPerformed
        //Stänger ner befentlig JFrame
        this.dispose();
    }//GEN-LAST:event_btnStangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaVidare;
    private javax.swing.JButton btnStang;
    private javax.swing.JComboBox<String> cmbValjAnvandare;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblValjAnvandare;
    // End of variables declaration//GEN-END:variables
}
