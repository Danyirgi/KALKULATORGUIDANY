/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author DANYAV
 */
public class Latihan2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Latihan2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pilihanjurusan = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        varNama = new javax.swing.JTextField();
        varAbsen = new javax.swing.JTextField();
        rdbTkj = new javax.swing.JRadioButton();
        rdbRpl = new javax.swing.JRadioButton();
        cbProgram = new javax.swing.JCheckBox();
        cbDesign = new javax.swing.JCheckBox();
        cbAnimator = new javax.swing.JCheckBox();
        cbVideo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        ButtonSubmit = new javax.swing.JButton();
        ButtonRemove = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 0, 110, 30);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 40, 60, 20);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 90, 60, 30);

        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 140, 80, 14);

        jLabel5.setText("Hobi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 190, 50, 14);

        varNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNamaActionPerformed(evt);
            }
        });
        getContentPane().add(varNama);
        varNama.setBounds(190, 40, 250, 30);

        varAbsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varAbsenActionPerformed(evt);
            }
        });
        getContentPane().add(varAbsen);
        varAbsen.setBounds(190, 90, 250, 30);

        Pilihanjurusan.add(rdbTkj);
        rdbTkj.setText("TKJ");
        rdbTkj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbTkjActionPerformed(evt);
            }
        });
        getContentPane().add(rdbTkj);
        rdbTkj.setBounds(190, 140, 60, 23);

        Pilihanjurusan.add(rdbRpl);
        rdbRpl.setText("RPL");
        getContentPane().add(rdbRpl);
        rdbRpl.setBounds(370, 140, 70, 23);

        cbProgram.setForeground(new java.awt.Color(255, 255, 255));
        cbProgram.setText("Programming");
        getContentPane().add(cbProgram);
        cbProgram.setBounds(180, 190, 100, 23);

        cbDesign.setForeground(new java.awt.Color(255, 255, 255));
        cbDesign.setText("Designer");
        getContentPane().add(cbDesign);
        cbDesign.setBounds(180, 280, 100, 23);

        cbAnimator.setForeground(new java.awt.Color(255, 255, 255));
        cbAnimator.setText("Animator");
        cbAnimator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnimatorActionPerformed(evt);
            }
        });
        getContentPane().add(cbAnimator);
        cbAnimator.setBounds(360, 190, 110, 23);

        cbVideo.setForeground(new java.awt.Color(255, 255, 255));
        cbVideo.setText("Video Editing");
        cbVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVideoActionPerformed(evt);
            }
        });
        getContentPane().add(cbVideo);
        cbVideo.setBounds(360, 280, 110, 23);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 370, 290, 120);

        ButtonSubmit.setText("Submit");
        ButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSubmit);
        ButtonSubmit.setBounds(170, 320, 90, 23);

        ButtonRemove.setText("Remove");
        getContentPane().add(ButtonRemove);
        ButtonRemove.setBounds(280, 320, 100, 23);

        ButtonExit.setText("Exit");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonExit);
        ButtonExit.setBounds(400, 320, 70, 23);

        jLabel6.setText("Hasil");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 350, 34, 14);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\Untitled.png")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 40, 650, 460);

        setBounds(0, 0, 710, 529);
    }// </editor-fold>//GEN-END:initComponents

    private void varAbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varAbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varAbsenActionPerformed

    private void rdbTkjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbTkjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbTkjActionPerformed

    private void cbAnimatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnimatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnimatorActionPerformed

    private void ButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubmitActionPerformed
String nama = varNama.getText();
String absen = varAbsen.getText();
String jurusan;
String hobi = "";

// pilihan jurusan
if (rdbRpl.isSelected())
    jurusan = "RPL";
else if (rdbTkj.isSelected())
    jurusan = "TKJ";
else
    jurusan = " ";
//pilihan checkbox
if(cbAnimator.isSelected())
    hobi+=cbAnimator.getText()+", ";
if(cbDesign.isSelected())
    hobi+=cbDesign.getText()+", ";
if(cbProgram.isSelected())
    hobi+=cbProgram.getText()+", ";
if(cbVideo.isSelected())
    hobi+=cbVideo.getText()+"  ";
//hasil
Hasil.setText("Nama anda :" +nama+"\n Absen anda : "+absen+"\nJurusan anda : "+jurusan+"\n Hobi anda : "+hobi);
    }//GEN-LAST:event_ButtonSubmitActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
dispose();
//System.exit(1);// TODO add your handling code here:
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void varNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNamaActionPerformed
varNama.setText("");
varAbsen.setText("");
Pilihanjurusan.clearSelection();
Hasil.setText(" ");
cbProgram.setSelected(false);
cbAnimator.setSelected(false);
cbDesign.setSelected(false);
cbVideo.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_varNamaActionPerformed

    private void cbVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVideoActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonRemove;
    private javax.swing.JButton ButtonSubmit;
    private javax.swing.JTextArea Hasil;
    private javax.swing.ButtonGroup Pilihanjurusan;
    private javax.swing.JCheckBox cbAnimator;
    private javax.swing.JCheckBox cbDesign;
    private javax.swing.JCheckBox cbProgram;
    private javax.swing.JCheckBox cbVideo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbRpl;
    private javax.swing.JRadioButton rdbTkj;
    private javax.swing.JTextField varAbsen;
    private javax.swing.JTextField varNama;
    // End of variables declaration//GEN-END:variables
}
