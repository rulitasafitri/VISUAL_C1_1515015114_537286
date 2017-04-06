/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;
import java.awt.Color;
 import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



/**
 *
 * @author USER
 */
public class rumahsakit extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private Connection con = MyConnection.getConnection();
    private Statement stt;
    private ResultSet rss;
    private PreparedStatement pst;

    /**
     * Creates new form rumahsakit
     */
    public rumahsakit() {
        initComponents();
    }
    
    private void InitTable(){
        model = new DefaultTableModel();
        model.addColumn("Nama Pasien");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Usia");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Diagnosa");
        model.addColumn("Dokter");
        model.addColumn("Ruangan");
        model.addColumn("Tanggal Masuk");
        Tabel.setModel(model);
    }
    
    private void TampilData(){
        try{
            String sql = "SELECT * FROM rumahsakit";
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o = new Object [9];
                o[0] = rss.getString("nama_pasien");
                o[1] = rss.getString("tl");
                o[2] = rss.getString("usia");
                o[3] = rss.getString("jk");
                o[4] = rss.getString("diagnosa");
                o[5] = rss.getString("dokter");
                o[6] = rss.getString("ruangan");
                o[7] = rss.getString("tgl_masuk");
                
                model.addRow(o);
            }
            stt.close();
            rss.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void TambahData(String nama_pasien,String tl,String usia,String jk,String diagnosa,String dokter,String ruangan,String tgl_masuk){
            try{
                String sql ="INSERT INTO rumahsakit VALUES (NULL,'"+ nama_pasien+"','"+tl+"','"+usia+"','"+jk+"','"+diagnosa+"','"+dokter+"','"+ruangan+"','"+tgl_masuk+"')";
                stt = con.createStatement();
                stt.executeUpdate(sql);
                model.addRow(new Object[]{nama_pasien,tl,usia,jk,diagnosa,dokter,ruangan,tgl_masuk} );
            
            }catch(SQLException e){
               System.out.println(e.getMessage());
            }
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPasien = new javax.swing.JTextField();
        txtUsia = new javax.swing.JTextField();
        raLaki = new javax.swing.JRadioButton();
        raPer = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDiagnosa = new javax.swing.JList();
        cbDokter = new javax.swing.JComboBox();
        cbRuangan = new javax.swing.JComboBox();
        txtTl = new javax.swing.JTextField();
        txtmasuk = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        cbcari = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Rumah Sakit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(403, 403, 403))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Nama Pasien");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Tanggal Lahir");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Usia");

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Diagnosa");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Dokter");

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Ruangan");

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Tanggal Masuk");

        txtPasien.setBackground(new java.awt.Color(255, 102, 0));
        txtPasien.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        txtPasien.setForeground(new java.awt.Color(255, 255, 255));
        txtPasien.setEnabled(false);

        txtUsia.setBackground(new java.awt.Color(255, 102, 0));
        txtUsia.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        txtUsia.setForeground(new java.awt.Color(255, 255, 255));
        txtUsia.setEnabled(false);
        txtUsia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsiaKeyPressed(evt);
            }
        });

        buttonGroup1.add(raLaki);
        raLaki.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        raLaki.setForeground(new java.awt.Color(255, 102, 0));
        raLaki.setText("L");
        raLaki.setEnabled(false);

        buttonGroup1.add(raPer);
        raPer.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        raPer.setForeground(new java.awt.Color(255, 102, 51));
        raPer.setText("P");
        raPer.setEnabled(false);

        listDiagnosa.setBackground(new java.awt.Color(255, 102, 0));
        listDiagnosa.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        listDiagnosa.setForeground(new java.awt.Color(255, 255, 255));
        listDiagnosa.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Flu", "Flu & Batuk", "Sakit Kepala", "Demam", "Diare", "Mual - Mual", "Panas & Dingin", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listDiagnosa.setEnabled(false);
        jScrollPane1.setViewportView(listDiagnosa);

        cbDokter.setBackground(new java.awt.Color(255, 102, 0));
        cbDokter.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        cbDokter.setForeground(new java.awt.Color(255, 102, 0));
        cbDokter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dr. Rulita Safitri", "dr.Resty Primadana", "dr.Fetriste Delp Parenden", "dr.Evi Lolita Apriyani", "dr.Tasik Somba", "dr.Hijratul Aini", "dr.Suyani Junita patandianan", "dr.jumarni", "dr.Nonik Sriningsing" }));
        cbDokter.setEnabled(false);
        cbDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbDokterMouseClicked(evt);
            }
        });

        cbRuangan.setBackground(new java.awt.Color(255, 102, 0));
        cbRuangan.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        cbRuangan.setForeground(new java.awt.Color(255, 102, 0));
        cbRuangan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mawar", "Melati", "Kamboja", "Dahlia", "Anggrek", " " }));
        cbRuangan.setEnabled(false);
        cbRuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbRuanganMouseClicked(evt);
            }
        });

        txtTl.setBackground(new java.awt.Color(255, 102, 0));
        txtTl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        txtTl.setForeground(new java.awt.Color(255, 255, 255));
        txtTl.setEnabled(false);

        txtmasuk.setBackground(new java.awt.Color(255, 102, 0));
        txtmasuk.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        txtmasuk.setForeground(new java.awt.Color(255, 255, 255));
        txtmasuk.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbRuangan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbDokter, 0, 246, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(raLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(raPer, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsia)
                    .addComponent(txtPasien)
                    .addComponent(txtTl)
                    .addComponent(txtmasuk))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(raLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(raPer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbDokter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtmasuk))
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        Tabel.setBackground(new java.awt.Color(255, 102, 0));
        Tabel.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Tabel.setForeground(new java.awt.Color(255, 255, 255));
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Pasien", "Tanggal Lahir", "Usia", "Jenis Kelamin", "Diagnosa", "Dokter", "Ruangan", "Tanggal Masuk"
            }
        ));
        jScrollPane2.setViewportView(Tabel);

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        btntambah.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        btntambah.setForeground(new java.awt.Color(255, 153, 102));
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 153, 102));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 153, 102));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Search");

        txtcari.setBackground(new java.awt.Color(255, 102, 0));
        txtcari.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        txtcari.setForeground(new java.awt.Color(255, 255, 255));
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcariKeyTyped(evt);
            }
        });

        cbcari.setBackground(new java.awt.Color(255, 102, 0));
        cbcari.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        cbcari.setForeground(new java.awt.Color(255, 102, 0));
        cbcari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nama_pasien", "dokter" }));

        jLabel11.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("By:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(31, 31, 31)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbcari, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        txtPasien.setEnabled(true);
        txtTl.setEnabled(true);
        txtUsia.setEnabled(true);
        raLaki.setEnabled(true);
        raPer.setEnabled(true);
        listDiagnosa.setEnabled(true);
        cbDokter.setEnabled(true);
        cbRuangan.setEnabled(true);
        txtmasuk.setEnabled(true);
        btnSimpan.setEnabled(true);
        btnKeluar.setEnabled(true);
        
    }//GEN-LAST:event_btntambahActionPerformed

    private void cbDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDokterMouseClicked
        // TODO add your handling code here:
        cbDokter.getSelectedItem();
        cbDokter.setBackground(Color.orange);
        cbDokter.setForeground(Color.white);
    }//GEN-LAST:event_cbDokterMouseClicked

    private void cbRuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRuanganMouseClicked
        // TODO add your handling code here:
        cbRuangan.getSelectedItem();
    }//GEN-LAST:event_cbRuanganMouseClicked

    private void txtUsiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsiaKeyPressed
        // TODO add your handling code here:
        txtUsia.addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e){
            char karakter = e.getKeyChar();
            if(((karakter < '0')|| (karakter > '9')) && (karakter != ',')){
                e.consume();
            }
          }
        }
       );
    }//GEN-LAST:event_txtUsiaKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String nama_pasien = txtPasien.getText();
        String tl   = txtTl.getText();
        String usia = txtUsia.getText();
        String jk   = null;
        if(raLaki.isSelected()){
            jk=raLaki.getText();
        }
        else if (raPer.isSelected()){
            jk=raPer.getText();
        }
        String diagnosa = (String) listDiagnosa.getSelectedValue();
        String dokter   = cbDokter.getSelectedItem().toString();
        String ruangan   = cbRuangan.getSelectedItem().toString();
        String tgl_masuk = txtmasuk.getText();
        TambahData(nama_pasien,tl,usia,jk,diagnosa,dokter,ruangan,tgl_masuk);
        
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyTyped
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        String search = cbcari.getSelectedItem().toString();
        
        try{
            String sql="SELECT * FROM rumahsakit where "+search+" like '%"+txtcari.getText()+"%'";
            stt = con. createStatement();
            rss = stt. executeQuery(sql);
            ResultSet rss=stt.executeQuery(sql);
            while(rss.next()){
                Object[] o=new Object[9];
                o[0]=rss.getString("nama_pasien");
                o[1]=rss.getDate("tl");
                o[2]=rss.getString("usia");
                o[3]=rss.getString("jk");
                o[4]=rss.getString("diagnosa");
                o[5]=rss.getString("dokter");
                o[6]=rss.getString("ruangan");
                o[7]=rss.getDate("tgl_masuk");
                
                model.addRow(o);
            }
            stt.close();
            rss.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_txtcariKeyTyped

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
            java.util.logging.Logger.getLogger(rumahsakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rumahsakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rumahsakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rumahsakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rumahsakit().setVisible(true);
                
              }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private static javax.swing.JComboBox cbDokter;
    private static javax.swing.JComboBox cbRuangan;
    private javax.swing.JComboBox cbcari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JList listDiagnosa;
    private static javax.swing.JRadioButton raLaki;
    private static javax.swing.JRadioButton raPer;
    private static javax.swing.JTextField txtPasien;
    private static javax.swing.JTextField txtTl;
    private static javax.swing.JTextField txtUsia;
    private javax.swing.JTextField txtcari;
    private static javax.swing.JTextField txtmasuk;
    // End of variables declaration//GEN-END:variables
}