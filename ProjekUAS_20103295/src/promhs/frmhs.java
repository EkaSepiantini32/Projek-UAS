package promhs;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

/**
 *
 * @author 20103295 Ni Putu Eka Sepiantini
 */
public class frmhs extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    static ResultSet rs;
    static Statement stmt;
    dbkoneksi cnn = new dbkoneksi();
    loadIMG img = new loadIMG();
    
    public frmhs() {
        initComponents();
        this.initTable();
        this.getdata();
    }
    
    private void initTable(){
        model = new DefaultTableModel();
        Tmhs.setModel(model);
        model.addColumn("NIM");
        model.addColumn("Nama Mahasiswa");
        model.addColumn("Tgl Lahir");
        model.addColumn("Jurusan");
        model.addColumn("Jenis Kelamin");
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
        String sql = " Select NIM, NAMA, TGLLAHIR, JURUSAN, JK FROM mhs;";
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try{
            this.tampildata(sql);
            while(this.rs.next()){
                Object[] obj = new Object[5];
                obj[0] = this.rs.getString("NIM");
                obj[1] = this.rs.getString("NAMA");
                obj[2] = this.rs.getString("TGLLAHIR");
                obj[3] = this.rs.getString("JURUSAN");
                String txJK = this.rs.getString("jk");
                if(txJK.equals("L")){
                    obj[4] = "Laki - laki";
                }else{
                    obj[4] = "Perempuan ";
                }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cmdBaru = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tmhs = new javax.swing.JTable();
        lbCURD = new javax.swing.JLabel();
        imgPhoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txNIM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txTgl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txJkl = new javax.swing.JRadioButton();
        txJkp = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txJur = new javax.swing.JComboBox<>();
        cmdstore = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdBatal = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("List Data Mahasiswa");

        cmdBaru.setText("Data Baru");
        cmdBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBaruActionPerformed(evt);
            }
        });

        Tmhs.setModel(new javax.swing.table.DefaultTableModel(
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
        Tmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tmhs);

        lbCURD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbCURD.setText("Detail");

        imgPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/v.jpg"))); // NOI18N

        jLabel4.setText("NIM");

        jLabel5.setText("Nama Mahasiswa");

        jLabel6.setText("Tgl Lahir");

        jLabel7.setText("Jenis Kelamin");

        buttonGroup1.add(txJkl);
        txJkl.setText("Laki - laki");

        txJkp.setText("Perempuan");

        jLabel8.setText("Jurusan");

        txJur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan", "KAB", "MTI", "DGM", "SK" }));

        cmdstore.setText("Simpan Data");
        cmdstore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdstoreActionPerformed(evt);
            }
        });

        cmdUpdate.setText("Update Data");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdDelete.setText("Hapus Data");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdBatal.setText("Batal");
        cmdBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBatalActionPerformed(evt);
            }
        });

        cmdClose.setText("Tutup Form");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdBaru))
                            .addComponent(lbCURD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(imgPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txNIM)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(58, 58, 58)
                                        .addComponent(txTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txNama)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdstore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txJkl)
                                    .addGap(18, 18, 18)
                                    .addComponent(txJkp))
                                .addComponent(jLabel8)
                                .addComponent(txJur, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdClose)
                                .addGap(15, 15, 15))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmdBaru))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbCURD)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txJkl)
                            .addComponent(txJkp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txJur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdstore)
                    .addComponent(cmdUpdate)
                    .addComponent(cmdDelete)
                    .addComponent(cmdClose)
                    .addComponent(cmdBatal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBatalActionPerformed
       this.cmdClose.setEnabled(true);
       this.cmdBaru.setEnabled(true);
       this.cmdstore.setEnabled(false);
       this.cmdBatal.setVisible(false);
    }//GEN-LAST:event_cmdBatalActionPerformed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
       String NIM = this.txNIM.getText();
       String NAMA = this.txNama.getText();
       String TGL = this.txTgl.getText();
       String JUR = this.txJur.getSelectedItem().toString();
       String JKEL = "L";
       if(this.txJkp.isSelected()){
           JKEL = "P";
       }
       String SQLUpdate = "UPDATE mhs SET NAMA='"+NAMA+"', JURUSAN='"+JUR+"', JK='"+JKEL+"', TGLLAHIR='"+TGL+"' WHERE NIM='"+NIM+"';";
       if(this.UpdateData(SQLUpdate)){
           this.getdata();
           JOptionPane.showMessageDialog(null,"data telah di Update");
       }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        String NIM = this.txNIM.getText();
        String NAMA = this.txNama.getText();
        
        int opsi = JOptionPane.showConfirmDialog(null, "Yakin Akan Menghapus Data dari "+NAMA+"("+NIM+")?","Konfirmasi", JOptionPane.YES_NO_OPTION );
        if(opsi == JOptionPane.YES_OPTION ){
            String SQLDelete = "DELETE FROM mhs WHERE NIM = '"+NIM+"';";
            if(this.UpdateData(SQLDelete)){
                this.getdata();
                JOptionPane.showMessageDialog(null, "Data Telah Terhapus");
            }
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBaruActionPerformed
        this.cmdBaru.setEnabled(false);
        this.cmdUpdate.setEnabled(false);
        this.cmdDelete.setEnabled(false);
        this.cmdClose.setEnabled(false);
        this.cmdstore.setVisible(true);
        this.cmdBatal.setVisible(true);
        
        this.txNIM.setText("");
        this.txNama.setText("");
        this.txTgl.setText("");
        this.txJur.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_cmdBaruActionPerformed

    private void cmdstoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdstoreActionPerformed
       String NIM = this.txNIM.getText();
       String NAMA = this.txNama.getText();
       String TGL = this.txTgl.getText();
       String JUR = this.txJur.getSelectedItem().toString();
       String JKEL = "L";
       if(this.txJkp.isSelected()){
            JKEL = "P";
        }
       String SQLInsert = "INSERT INTO mhs(NIM,NAMA,JURUSAN,JK,TGLLAHIR) VALUES('"+NIM+"','"+NAMA+"','"+JUR+"','"+JKEL+"','"+TGL+"');";
       if(this.UpdateData(SQLInsert)){
           this.getdata();
           JOptionPane.showMessageDialog(null, "Data telah di Tambahkan");
        }
        this.cmdstore.setEnabled(false);
        this.cmdBatal.setVisible(false);
        this.cmdClose.setEnabled(true);
        this.cmdBaru.setEnabled(true);
         
    }//GEN-LAST:event_cmdstoreActionPerformed

    private void TmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmhsMouseClicked
      String urlGambarNull = "src/img/gambar.jpg";
      this.txNIM.setText( model.getValueAt(Tmhs.getSelectedRow(), 0).toString());
      this.txNama.setText( model.getValueAt(Tmhs.getSelectedRow(), 1).toString());
      this.txTgl.setText( model.getValueAt(Tmhs.getSelectedRow(), 2).toString());
      this.txJur.setSelectedItem(model.getValueAt(Tmhs.getSelectedRow(), 3).toString());
      String txJK = model.getValueAt(Tmhs.getSelectedRow(), 4).toString();
      if(txJK.equals("Perempuan")){
            this.txJkp.setSelected(true);
      }else{
            this.txJkl.setSelected(true);
      }
      String urlGambar = "src/img/"+this.txNIM.getText() + ".jpg";
      BufferedImage loadImg = img.loadImage(urlGambar);
      if(loadImg == null){
            loadImg = img.loadImage(urlGambarNull);
      }
      ImageIcon imageIcon = new ImageIcon(loadImg);
      this.imgPhoto.setIcon(imageIcon);
        
      this.lbCURD.setText("Edit Data "+this.txNIM.getText());
      this.cmdstore.setEnabled(false);
      this.cmdUpdate.setEnabled(true);
      this.cmdDelete.setEnabled(true);
    }//GEN-LAST:event_TmhsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tmhs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cmdBaru;
    private javax.swing.JButton cmdBatal;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton cmdstore;
    private javax.swing.JLabel imgPhoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCURD;
    private javax.swing.JRadioButton txJkl;
    private javax.swing.JRadioButton txJkp;
    private javax.swing.JComboBox<String> txJur;
    private javax.swing.JTextField txNIM;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txTgl;
    // End of variables declaration//GEN-END:variables

    
}
