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
public class FrameLatihan extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public FrameLatihan(String nama, String absen, String jurusan, String alamat, String kelas) {
        initComponents();
        Nama.setText(nama);
        Absen.setText(absen);
        Jurusan.setText(jurusan);
        Alamat.setText(alamat);
        Kelas.setText(kelas);
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
        Nama = new javax.swing.JLabel();
        Absen = new javax.swing.JLabel();
        Kelas = new javax.swing.JLabel();
        Jurusan = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("HASIL BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 190, 60);

        Nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nama.setText("NAMA");
        getContentPane().add(Nama);
        Nama.setBounds(20, 90, 210, 20);

        Absen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Absen.setText("ABSEN");
        getContentPane().add(Absen);
        Absen.setBounds(20, 130, 210, 30);

        Kelas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kelas.setText("KELAS");
        getContentPane().add(Kelas);
        Kelas.setBounds(20, 180, 230, 22);

        Jurusan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jurusan.setText("JURUSAN");
        getContentPane().add(Jurusan);
        Jurusan.setBounds(20, 230, 220, 20);

        Alamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Alamat.setText("ALAMAT");
        getContentPane().add(Alamat);
        Alamat.setBounds(20, 270, 410, 40);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(210, 0, 260, 270);

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 270, 210, 110);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 470, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 380);

        setBounds(0, 0, 485, 424);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrameLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Absen;
    private javax.swing.JLabel Alamat;
    private javax.swing.JLabel Jurusan;
    private javax.swing.JLabel Kelas;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
