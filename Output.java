/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPage;

/**
 *
 * @author ASUS
 */
public class Output extends javax.swing.JFrame {
    String nama,nim,kelas;
    /**
     * Creates new form Output
     */
    public Output(String nama, String nim, String kelas) {
        initComponents();
        //tampil output nama
        this.nama = nama;
        lbnama.setText("Nama  :"+ this.nama);
        //tampil output nim
        this.nim = nim;
        lbnim.setText("NIM   :" + this.nim);
        //tampil output kelas
        this.kelas = kelas;
        lbkelas.setText("Kelas  :" + this.kelas);
    }

    private Output() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lboutput = new javax.swing.JLabel();
        lbnama = new javax.swing.JLabel();
        lbnim = new javax.swing.JLabel();
        lbkelas = new javax.swing.JLabel();
        btnkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lboutput.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lboutput.setText("Output");
        lboutput.setToolTipText("");

        lbnama.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbnama.setText("Nama   :");

        lbnim.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbnim.setText("NIM     :");

        lbkelas.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbkelas.setText("Kelas   :");

        btnkembali.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbnim)
                    .addComponent(lbnama)
                    .addComponent(lbkelas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnkembali)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(lboutput)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lboutput)
                .addGap(30, 30, 30)
                .addComponent(lbnama)
                .addGap(18, 18, 18)
                .addComponent(lbnim)
                .addGap(18, 18, 18)
                .addComponent(lbkelas)
                .addGap(18, 18, 18)
                .addComponent(btnkembali)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Output().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkembali;
    private javax.swing.JLabel lbkelas;
    private javax.swing.JLabel lbnama;
    private javax.swing.JLabel lbnim;
    private javax.swing.JLabel lboutput;
    // End of variables declaration//GEN-END:variables
}
