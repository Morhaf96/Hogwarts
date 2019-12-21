/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class VisaKurserForEnElev extends javax.swing.JFrame {

    private InfDB databasen;
    private DataHanterare dataHanterare;

    /**
     * Creates new form KurserForEnLarare
     */
    public VisaKurserForEnElev() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        taVisaKurserForElev = new javax.swing.JTextArea();
        lblKurser = new javax.swing.JLabel();
        btnKor = new javax.swing.JButton();
        lblAngeNamn = new javax.swing.JLabel();
        tfElevensFornamn = new javax.swing.JTextField();
        tfElevensEfternamn = new javax.swing.JTextField();
        lblElevensFornamn = new javax.swing.JLabel();
        lblElevensEfternamn = new javax.swing.JLabel();
        btnStang = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taVisaKurserForElev.setEditable(false);
        taVisaKurserForElev.setColumns(20);
        taVisaKurserForElev.setRows(5);
        jScrollPane1.setViewportView(taVisaKurserForElev);

        lblKurser.setText("Kurser:");

        btnKor.setText("Visa kurser");
        btnKor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKorActionPerformed(evt);
            }
        });

        lblAngeNamn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAngeNamn.setText("Ange namnet på en elev nedan");

        lblElevensFornamn.setText("Förnamn:");

        lblElevensEfternamn.setText("Efternamn:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAngeNamn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblElevensFornamn)
                            .addComponent(tfElevensFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblElevensEfternamn)
                            .addComponent(tfElevensEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnStang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnKor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKurser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKurser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAngeNamn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblElevensFornamn)
                            .addComponent(lblElevensEfternamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfElevensFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfElevensEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(btnKor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(btnStang)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * textfälten kontrolleras så att det finns input. elevens idn hämtas, om
     * eleven inte hittas skickas ett meddelande. om eleven finns hämtas en
     * lista på registrerade kurser som sedan listas och skrivs ut. om eleven
     * inte har några kurser skickas ett meddelande. är ett textfält tomt
     * skickas ett meddelande.
     *
     * @param evt
     */
    private void btnKorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKorActionPerformed
        if (!Validering.FaltArTomUtanPopUp(tfElevensFornamn) && !Validering.FaltArTomUtanPopUp(tfElevensEfternamn)) {
            String fornamn = dataHanterare.namnFormat(tfElevensFornamn.getText());
            String efternamn = dataHanterare.efternamnFormat(tfElevensEfternamn.getText());
            int elevId = dataHanterare.getElevId(fornamn, efternamn);
            if (elevId != 0) {
                try {
                    taVisaKurserForElev.setText(null);
                    ArrayList<String> kursListan = dataHanterare.listaKurserForEnElev(fornamn, efternamn);
                    int i = 0;
                    String skrivut = "";
                    while (i < kursListan.size()) {
                        skrivut += kursListan.get(i) + "\n";
                        i++;
                    }
                    taVisaKurserForElev.setText(skrivut);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Eleven är inte registrerad på någon kurs!");
                    System.out.println("Exception Internt felmeddelande:" + e.getMessage());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i alla textfält ovan!");

        }

    }//GEN-LAST:event_btnKorActionPerformed

    private void btnStangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStangActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnStangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKor;
    private javax.swing.JButton btnStang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAngeNamn;
    private javax.swing.JLabel lblElevensEfternamn;
    private javax.swing.JLabel lblElevensFornamn;
    private javax.swing.JLabel lblKurser;
    private javax.swing.JTextArea taVisaKurserForElev;
    private javax.swing.JTextField tfElevensEfternamn;
    private javax.swing.JTextField tfElevensFornamn;
    // End of variables declaration//GEN-END:variables
}
