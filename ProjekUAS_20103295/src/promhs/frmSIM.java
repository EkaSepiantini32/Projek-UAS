package promhs;

/**
 *
 * @author 20103295
 */
public class frmSIM extends javax.swing.JFrame {
    frmhs fm;
    frmtest fd;
    frmk fk;
    
    public frmSIM() {
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

        dskUtama = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MNfile = new javax.swing.JMenu();
        MNfexit = new javax.swing.JMenuItem();
        MNmhs = new javax.swing.JMenu();
        MNdosen = new javax.swing.JMenu();
        MNmk = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dskUtamaLayout = new javax.swing.GroupLayout(dskUtama);
        dskUtama.setLayout(dskUtamaLayout);
        dskUtamaLayout.setHorizontalGroup(
            dskUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        dskUtamaLayout.setVerticalGroup(
            dskUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        getContentPane().add(dskUtama, java.awt.BorderLayout.CENTER);

        MNfile.setText("File");

        MNfexit.setText("Exit");
        MNfexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNfexitActionPerformed(evt);
            }
        });
        MNfile.add(MNfexit);

        jMenuBar1.add(MNfile);

        MNmhs.setText("DataMahasiswa");
        MNmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNmhsMouseClicked(evt);
            }
        });
        MNmhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNmhsActionPerformed(evt);
            }
        });
        jMenuBar1.add(MNmhs);

        MNdosen.setText("DataDosen");
        MNdosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNdosenMouseClicked(evt);
            }
        });
        jMenuBar1.add(MNdosen);

        MNmk.setText("DataMataKuliah");
        MNmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNmkMouseClicked(evt);
            }
        });
        jMenuBar1.add(MNmk);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MNfexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNfexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_MNfexitActionPerformed

    private void MNmhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNmhsActionPerformed
        
    }//GEN-LAST:event_MNmhsActionPerformed

    private void MNmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNmhsMouseClicked
        if(fm==null || fm.isClosed()){
            fm = new frmhs();
            dskUtama.add(fm);
            fm.setLocation(this.getWidth()/2 - fm.getWidth()/2, this.getHeight()/2-fm.getHeight()/2);
            fm.setVisible(true);
        }else{
            fm.setVisible(true);
        }
    }//GEN-LAST:event_MNmhsMouseClicked

    private void MNdosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNdosenMouseClicked
        if(fd==null || fd.isClosed()){
            //fd = new frdsn();
            fd = new frmtest(); 
            dskUtama.add(fd);
            fd.setLocation(this.getWidth()/2 - fd.getWidth()/2, this.getHeight()/2-fd.getHeight()/2);
            fd.setVisible(true);
        }else{
            fd.setVisible(true);
        }
    }//GEN-LAST:event_MNdosenMouseClicked

    private void MNmkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNmkMouseClicked
        if(fk==null || fk.isClosed()){
            fk = new frmk();
            dskUtama.add(fk);
            fk.setLocation(this.getWidth()/2 - fk.getWidth()/2, this.getHeight()/2-fk.getHeight()/2);
            fk.setVisible(true);
        }else{
            fk.setVisible(true);
        }
    }//GEN-LAST:event_MNmkMouseClicked

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
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSIM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MNdosen;
    private javax.swing.JMenuItem MNfexit;
    private javax.swing.JMenu MNfile;
    private javax.swing.JMenu MNmhs;
    private javax.swing.JMenu MNmk;
    private javax.swing.JDesktopPane dskUtama;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
