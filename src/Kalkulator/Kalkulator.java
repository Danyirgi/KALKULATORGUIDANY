/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

/**
 *
 * @author DANYAV
 */
public class Kalkulator extends javax.swing.JFrame {
String angka="";
double jumlah,angka1,angka2;
int pilih;

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
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

        out = new javax.swing.JTextField();
        c = new javax.swing.JButton();
        hps = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        sama = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tk = new javax.swing.JButton();
        akar = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KALKULATOR ");
        setResizable(false);
        getContentPane().setLayout(null);

        out.setEditable(false);
        out.setBackground(new java.awt.Color(153, 153, 153));
        out.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        out.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        getContentPane().add(out);
        out.setBounds(10, 10, 460, 120);

        c.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c);
        c.setBounds(110, 140, 180, 60);

        hps.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hps.setText("DEL");
        hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpsActionPerformed(evt);
            }
        });
        getContentPane().add(hps);
        hps.setBounds(290, 140, 90, 60);

        bagi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bagi.setText(" ÷ ");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        getContentPane().add(bagi);
        bagi.setBounds(380, 140, 90, 60);

        tujuh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        getContentPane().add(tujuh);
        tujuh.setBounds(110, 200, 90, 60);

        delapan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        getContentPane().add(delapan);
        delapan.setBounds(200, 200, 90, 60);

        sembilan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        getContentPane().add(sembilan);
        sembilan.setBounds(290, 200, 90, 60);

        kali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        getContentPane().add(kali);
        kali.setBounds(380, 200, 90, 60);

        empat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        getContentPane().add(empat);
        empat.setBounds(110, 260, 90, 60);

        lima.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        getContentPane().add(lima);
        lima.setBounds(200, 260, 90, 60);

        enam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        getContentPane().add(enam);
        enam.setBounds(290, 260, 90, 60);

        kurang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        getContentPane().add(kurang);
        kurang.setBounds(380, 260, 90, 60);

        satu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        getContentPane().add(satu);
        satu.setBounds(110, 320, 90, 60);

        dua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        getContentPane().add(dua);
        dua.setBounds(200, 320, 90, 60);

        tiga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        getContentPane().add(tiga);
        tiga.setBounds(290, 320, 90, 60);

        tambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah);
        tambah.setBounds(380, 320, 90, 60);

        nol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });
        getContentPane().add(nol);
        nol.setBounds(110, 380, 180, 60);

        koma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        koma.setText(",");
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });
        getContentPane().add(koma);
        koma.setBounds(290, 380, 90, 60);

        sama.setBackground(new java.awt.Color(102, 255, 51));
        sama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sama.setText("=");
        sama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samaActionPerformed(evt);
            }
        });
        getContentPane().add(sama);
        sama.setBounds(380, 380, 90, 60);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);

        tk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tk.setText("±");
        tk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkActionPerformed(evt);
            }
        });
        jPanel1.add(tk);
        tk.setBounds(10, 140, 70, 60);

        akar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akar.setText("√");
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });
        jPanel1.add(akar);
        akar.setBounds(10, 200, 70, 60);

        persen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });
        jPanel1.add(persen);
        persen.setBounds(10, 260, 70, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("x²");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 320, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 450);

        setSize(new java.awt.Dimension(497, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
        // TODO add your handling code here:
           double ops = Double.parseDouble(String.valueOf(out.getText()));
            ops = Math.sqrt(ops);
            out.setText(String.valueOf(ops));
    }//GEN-LAST:event_akarActionPerformed

    private void tkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkActionPerformed
        // TODO add your handling code here:
            double ops = Double.parseDouble(String.valueOf(out.getText()));
            ops = ops *(-1);
            out.setText(String.valueOf(ops));
    }//GEN-LAST:event_tkActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        // TODO add your handling code here:
         angka1=Double.parseDouble(angka);
out.setText("%");
angka="";
pilih=(5);
    }//GEN-LAST:event_persenActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
       // TODO add your handling code here:
         angka += "7";
out.setText(angka);
        
    }//GEN-LAST:event_tujuhActionPerformed

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
        // TODO add your handling code here:
        angka += ".";
out.setText(angka);
    }//GEN-LAST:event_komaActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        angka += "1";
out.setText(angka);
    }//GEN-LAST:event_satuActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        // TODO add your handling code here:
         angka += "9";
out.setText(angka);
        
    }//GEN-LAST:event_sembilanActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        // TODO add your handling code here:
         angka += "8";
out.setText(angka);
    }//GEN-LAST:event_delapanActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
out.setText("-");
angka="";
pilih=2;
    }//GEN-LAST:event_kurangActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
         angka += "2";
out.setText(angka);
        
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        // TODO add your handling code here:
         angka += "3";
out.setText(angka);
    }//GEN-LAST:event_tigaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        // TODO add your handling code here:
         angka += "6";
out.setText(angka);
    }//GEN-LAST:event_enamActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        // TODO add your handling code here:
         angka += "5";
out.setText(angka);
    }//GEN-LAST:event_limaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        // TODO add your handling code here:
         angka += "4";
out.setText(angka);
    }//GEN-LAST:event_empatActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        // TODO add your handling code here:
         angka += "0";
out.setText(angka);
        
    }//GEN-LAST:event_nolActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
out.setText("+");
angka="";
pilih=1;
    }//GEN-LAST:event_tambahActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
out.setText("/");
angka="";
pilih=4;
    }//GEN-LAST:event_bagiActionPerformed

    private void samaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samaActionPerformed
        // TODO add your handling code here:
        switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            out.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            out.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            out.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            out.setText(angka);
            break;
        case 5:
            jumlah = angka1/100;
            angka = Double.toString(jumlah);
            out.setText(angka);
            break;
        case 6:
            jumlah = Math.pow(angka1, 2);
            angka = Double.toString(jumlah);
            out.setText(angka);
            break;
            default:
            break;
        }
    }//GEN-LAST:event_samaActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
out.setText("x");
angka="";
pilih=3;
    }//GEN-LAST:event_kaliActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
        out.setText("");
angka1=0;
angka2=0;
jumlah=0;
angka="";
    }//GEN-LAST:event_cActionPerformed

    private void hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpsActionPerformed
        // TODO add your handling code here:
        String hps = null;
        if(out.getText().length() > 0)
        {
            StringBuilder strB = new StringBuilder(out.getText());
            strB.deleteCharAt(out.getText().length() - 1);
            hps = strB.toString();
            out.setText(hps);
        }
    }//GEN-LAST:event_hpsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        out.setText("*");
        angka="";
        pilih = (6);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akar;
    private javax.swing.JButton bagi;
    private javax.swing.JButton c;
    private javax.swing.JButton delapan;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hps;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kali;
    private javax.swing.JButton koma;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JTextField out;
    private javax.swing.JButton persen;
    private javax.swing.JButton sama;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tk;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
