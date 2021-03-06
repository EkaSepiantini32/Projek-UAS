package promhs;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20103295 Ni Putu Eka Sepiantini
 */
public class frmk extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    static ResultSet rs;
    static Statement stmt;
    dbkoneksi cnn = new dbkoneksi();
    
    public frmk() {
        initComponents();
        this.initTable();
        this.getdata();
    }
    
    private void initTable(){
        model = new DefaultTableModel();
        Tmk.setModel(model);
        model.addColumn("Id MK");
        model.addColumn("Nama MK");
        model.addColumn("Id DSN");
    }
    
    private void tampildata(String sql){
        try{
            Statement stmt = cnn.koneksi().createStatement();
            this.rs = stmt.executeQuery(sql);
        }catch(Exception e){
            System.out.println("Terjadi kendala pada query");
        }
    }
    
    private void getdata(){
        String sql = " Select IDMATKUL, NAMAMK, IDDSN FROM mk;";
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try{
            this.tampildata(sql);
            while(this.rs.next()){
                Object[] obj = new Object[3];
                obj[0] = this.rs.getString("IDMATKUL");
                obj[1] = this.rs.getString("NAMAMK");
                obj[2] = this.rs.getString("IDDSN");
                
                model.addRow(obj);
            }
        }catch(Exception e){
                
        }
    }
        private boolean UpdateData(String SQL){
            boolean hsl = false;
            try{
                Statement stmt = cnn.koneksi().createStatement();
                stmt.executeUpdate(SQL);
                hsl = true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Terjadi Kendala Pada Instruksi");
            }
        return hsl;
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
        cmdbaru = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tmk = new javax.swing.JTable();
        lbCURD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txIDMK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txNMMK = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txIDDSN = new javax.swing.JTextField();
        cmdstore = new javax.swing.JButton();
        cmdupdate = new javax.swing.JButton();
        cmddelete = new javax.swing.JButton();
        cmdbatal = new javax.swing.JButton();
        cmdclose = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Mata Kuliah");

        cmdbaru.setText("Data Baru");
        cmdbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbaruActionPerformed(evt);
            }
        });

        Tmk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TmkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tmk);

        lbCURD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbCURD.setText("Detail");

        jLabel3.setText("ID Mata Kuliah");

        txIDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDMKActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Mata Kuliah");

        jLabel5.setText("ID Dosen");

        cmdstore.setText("Simpan Data");
        cmdstore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdstoreActionPerformed(evt);
            }
        });

        cmdupdate.setText("Update Data");
        cmdupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdupdateActionPerformed(evt);
            }
        });

        cmddelete.setText("Hapus Data");
        cmddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeleteActionPerformed(evt);
            }
        });

        cmdbatal.setText("Batal");
        cmdbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbatalActionPerformed(evt);
            }
        });

        cmdclose.setText("Tutup Form");
        cmdclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdbaru))
                            .addComponent(lbCURD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txIDMK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdstore)
                                .addGap(30, 30, 30)
                                .addComponent(cmdupdate)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txNMMK, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txIDDSN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmddelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdbatal)
                                .addGap(18, 18, 18)
                                .addComponent(cmdclose)
                                .addGap(7, 7, 7))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdbaru)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCURD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txIDMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNMMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txIDDSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdstore)
                    .addComponent(cmdupdate)
                    .addComponent(cmddelete)
                    .addComponent(cmdbatal)
                    .addComponent(cmdclose))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txIDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIDMKActionPerformed

    private void TmkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmkMouseClicked
        this.txIDMK.setText( model.getValueAt(Tmk.getSelectedRow(), 0).toString());
        this.txNMMK.setText( model.getValueAt(Tmk.getSelectedRow(), 1).toString());
        this.txIDDSN.setText( model.getValueAt(Tmk.getSelectedRow(), 2).toString());

        this.lbCURD.setText("Edit Data "+this.txIDMK.getText());
        this.cmdstore.setEnabled(false);
        this.cmdupdate.setEnabled(true);
        this.cmddelete.setEnabled(true);
    }//GEN-LAST:event_TmkMouseClicked

    private void cmdbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbaruActionPerformed
        this.cmdbaru.setEnabled(false);
        this.cmdupdate.setEnabled(false);
        this.cmddelete.setEnabled(false);
        this.cmdclose.setEnabled(false);
        this.cmdstore.setVisible(true);
        this.cmdbatal.setVisible(true);

        this.txIDMK.setText("");
        this.txNMMK.setText("");
        this.txIDDSN.setText("");
    }//GEN-LAST:event_cmdbaruActionPerformed

    private void cmdupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdupdateActionPerformed
        String IDMATKUL = this.txIDMK.getText();
        String NAMAMK = this.txNMMK.getText();
        String IDDSN = this.txIDDSN.getText();
        String SQLUpdate = "UPDATE mk SET NAMAMK='"+NAMAMK+"', IDDSN='"+IDDSN+"' WHERE IDMATKUL='"+IDMATKUL+"';";
        if(this.UpdateData(SQLUpdate)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data telah di Update");
        }
    }//GEN-LAST:event_cmdupdateActionPerformed

    private void cmddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeleteActionPerformed
        String IDMATKUL = this.txIDMK.getText();
        String NAMAMK = this.txNMMK.getText();

        int opsi = JOptionPane.showConfirmDialog(null,"Yakin akan menghapus data dari "+NAMAMK+"("+IDMATKUL+")?","Konfirmasi", JOptionPane.YES_NO_OPTION );
        if(opsi == JOptionPane.YES_OPTION){
            String SQLDelete = "DELETE FROM mk WHERE IDMATKUL='"+IDMATKUL+"';";
            if(this.UpdateData(SQLDelete)){
                this.getdata();
                JOptionPane.showMessageDialog(null, "Data telah dihapus");
            }
        }
    }//GEN-LAST:event_cmddeleteActionPerformed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        this.cmdclose.setEnabled(true);
        this.cmdbaru.setEnabled(true);
        this.cmdstore.setEnabled(false);
        this.cmdbatal.setVisible(false);
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void cmdcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdcloseActionPerformed

    private void cmdstoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdstoreActionPerformed
        String IDMATKUL = this.txIDMK.getText();
        String NAMAMK = this.txNMMK.getText();
        String IDDSN = this.txIDDSN.getText();
        String SQLInsert = "INSERT INTO mk (IDMATKUL,NAMAMK,IDDSN) VALUES('"+IDMATKUL+"','"+NAMAMK+"','"+IDDSN+"');";
        if(this.UpdateData(SQLInsert)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data telah di Tambahkan");
        }
        this.cmdstore.setEnabled(false);
        this.cmdbatal.setVisible(false);
        this.cmdclose.setEnabled(true);
        this.cmdbaru.setEnabled(true);
    }//GEN-LAST:event_cmdstoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tmk;
    private javax.swing.JButton cmdbaru;
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdclose;
    private javax.swing.JButton cmddelete;
    private javax.swing.JButton cmdstore;
    private javax.swing.JButton cmdupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCURD;
    private javax.swing.JTextField txIDDSN;
    private javax.swing.JTextField txIDMK;
    private javax.swing.JTextField txNMMK;
    // End of variables declaration//GEN-END:variables
}
