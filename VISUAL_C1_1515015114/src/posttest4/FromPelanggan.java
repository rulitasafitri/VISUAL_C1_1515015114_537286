/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FromPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form FromPelanggan
     */
    public FromPelanggan() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        Bproses = new javax.swing.JButton();
        Bulang = new javax.swing.JButton();
        Bkeluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jr = new javax.swing.JRadioButton();
        je = new javax.swing.JRadioButton();
        Sdiskon = new javax.swing.JSlider();
        persen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttlp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtberat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });

        Bproses.setBackground(new java.awt.Color(0, 102, 204));
        Bproses.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Bproses.setForeground(new java.awt.Color(255, 255, 255));
        Bproses.setText("Proses");
        Bproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BprosesActionPerformed(evt);
            }
        });

        Bulang.setBackground(new java.awt.Color(0, 102, 204));
        Bulang.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Bulang.setForeground(new java.awt.Color(255, 255, 255));
        Bulang.setText("Ulang");
        Bulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulangActionPerformed(evt);
            }
        });

        Bkeluar.setBackground(new java.awt.Color(0, 102, 204));
        Bkeluar.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Bkeluar.setForeground(new java.awt.Color(255, 255, 255));
        Bkeluar.setText("Keluar");
        Bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkeluarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Atur Diskon");

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Jasa");

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Harga");

        txttotal.setForeground(new java.awt.Color(0, 102, 204));
        txttotal.setText("Rp.");

        buttonGroup1.add(jr);
        jr.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jr.setForeground(new java.awt.Color(255, 255, 255));
        jr.setText("Reguler");

        buttonGroup1.add(je);
        je.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        je.setForeground(new java.awt.Color(255, 255, 255));
        je.setText("Express");

        Sdiskon.setForeground(new java.awt.Color(255, 255, 255));
        Sdiskon.setMajorTickSpacing(10);
        Sdiskon.setPaintLabels(true);
        Sdiskon.setPaintTicks(true);
        Sdiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SdiskonStateChanged(evt);
            }
        });

        persen.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        persen.setForeground(new java.awt.Color(255, 255, 255));
        persen.setText("0%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jr)
                        .addGap(18, 18, 18)
                        .addComponent(je))
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Sdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(persen)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(je, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        txtnama.setForeground(new java.awt.Color(0, 102, 255));
        txtnama.setText("Masukan Nama Anda");
        txtnama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnamaCaretUpdate(evt);
            }
        });
        txtnama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnamaMouseClicked(evt);
            }
        });
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnamaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No . Telepon");

        txttlp.setForeground(new java.awt.Color(0, 102, 204));
        txttlp.setText("Masukan No Tlp ");
        txttlp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttlpCaretUpdate(evt);
            }
        });
        txttlp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttlpMouseClicked(evt);
            }
        });
        txttlp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttlpActionPerformed(evt);
            }
        });
        txttlp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttlpKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Berat Barang");

        txtberat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtberatCaretUpdate(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("kg");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txttlp)
                        .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttlp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtberat, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(Bproses)
                        .addGap(119, 119, 119)
                        .addComponent(Bulang)
                        .addGap(106, 106, 106)
                        .addComponent(Bkeluar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bproses)
                    .addComponent(Bulang)
                    .addComponent(Bkeluar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String jenis;
    Float Diskon,Total,Uang;
    
    private void BkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BkeluarActionPerformed

    private void txtnamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnamaCaretUpdate
        // TODO add your handling code here:
        if (txtnama.getText().length() !=0 && txttlp.getText().length() !=0 && txtberat.getText().length() !=0){
           Bproses.setEnabled(true);}
        else{
            
            Bproses.setEnabled(false);}
    }//GEN-LAST:event_txtnamaCaretUpdate

    private void txttlpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttlpCaretUpdate
        // TODO add your handling code here:
        if (txtnama.getText().length() !=0 && txttlp.getText().length() !=0 && txtberat.getText().length() !=0){
           Bproses.setEnabled(true);}
        else{
            
            Bproses.setEnabled(false);}
    }//GEN-LAST:event_txttlpCaretUpdate

    private void txtberatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtberatCaretUpdate
        // TODO add your handling code here:
        if (txtnama.getText().length() !=0 && txttlp.getText().length() !=0 && txtberat.getText().length() !=0 && ! txtberat.getText().matches("[0]")){
           Bproses.setEnabled(true);}
        else{
            
            Bproses.setEnabled(false);}
    }//GEN-LAST:event_txtberatCaretUpdate

    private void SdiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SdiskonStateChanged
        // TODO add your handling code here:
         persen.setText(String.valueOf(Sdiskon.getValue())+"%");
    }//GEN-LAST:event_SdiskonStateChanged

    private void BprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BprosesActionPerformed
        // TODO add your handling code here:
        if (jr.isSelected()){
            Diskon = Float.valueOf(Sdiskon.getValue());
            Total = 11500*(Float.valueOf(txtberat.getText()))-((Diskon/100)*11500);
            Uang = Total;
           //F.Total(Total);
        }
        else if (je.isSelected()){
            Diskon = Float.valueOf(Sdiskon.getValue());
            Total = 11500*(Float.valueOf(txtberat.getText()))-((Diskon/100)*11500);
            Uang = 1.5f*Total;
        }
        
        txttotal.setText(""+Uang);
    }//GEN-LAST:event_BprosesActionPerformed

    private void BulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulangActionPerformed
        // TODO add your handling code here:
        txtnama.setText("");
        txttlp.setText("");
        txtberat.setText("");
        txttotal.setText("");
        buttonGroup1.clearSelection();
        Sdiskon.setValue(0);
        
    }//GEN-LAST:event_BulangActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtnama.setText("");
        
        txttlp.setText("");
      
        
        txtberat.setText("");
       
        
        txttotal.setText("");
        
    }//GEN-LAST:event_formWindowOpened

    private void txttlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttlpActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txttlpActionPerformed

    private void txtnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyPressed
        // TODO add your handling code here:
       if (evt.getKeyCode()== evt.VK_ENTER)
       {
        if(txtnama.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null," TIDAK BOLEH KOSONG","KONFIRMASI",
                    JOptionPane.INFORMATION_MESSAGE);
            
            txtnama.requestFocus();
            return;
        }
           Bproses.requestFocus();
       } 
    }//GEN-LAST:event_txtnamaKeyPressed

    private void txttlpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttlpKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== evt.VK_ENTER)
       {
        if(txttlp.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null," TIDAK BOLEH KOSONG","KONFIRMASI",
                    JOptionPane.INFORMATION_MESSAGE);
            
            txttlp.requestFocus();
            return;
        }
           Bproses.requestFocus();
       } 
    }//GEN-LAST:event_txttlpKeyPressed

    private void txtnamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnamaMouseClicked
        // TODO add your handling code here:
        txtnama.setText("");
    }//GEN-LAST:event_txtnamaMouseClicked

    private void txttlpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttlpMouseClicked
        // TODO add your handling code here:
         txttlp.setText("");
    }//GEN-LAST:event_txttlpMouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        Bproses.setBackground(Color.blue);
        Bproses.setForeground(Color.white);
        
        Bulang.setBackground(Color.blue);
        Bulang.setForeground(Color.white);
        
        Bkeluar.setBackground(Color.blue);
        Bkeluar.setForeground(Color.white);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        Bproses.setBackground(Color.blue);
        Bproses.setForeground(Color.gray);
        
        Bulang.setBackground(Color.blue);
        Bulang.setForeground(Color.gray);
        
        Bkeluar.setBackground(Color.blue);
        Bkeluar.setForeground(Color.gray);
    }//GEN-LAST:event_formMouseExited

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
            java.util.logging.Logger.getLogger(FromPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bkeluar;
    private javax.swing.JButton Bproses;
    private javax.swing.JButton Bulang;
    private javax.swing.JSlider Sdiskon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton je;
    private javax.swing.JRadioButton jr;
    private javax.swing.JLabel persen;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttlp;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
