/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author khadamikhwan
 */
import java.awt.HeadlessException;
import utility.KoneksiDB;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utility.Helper;

public class EquipmentScreen extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    Connection konek = KoneksiDB.BuatKoneksi();
    private DefaultTableModel tabmode;
    Helper helper = new Helper();

    /**
     * Creates new form EquipmentScreen
     */
    public EquipmentScreen() {
        initComponents();
        datatable();
        fetchKategoriSelction();
        fetchBrandSelction();
        Clear();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btn_keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_nama_barang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selectionKategori = new javax.swing.JComboBox<>();
        selectionBrand = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txt_harga_barang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        selectionSize = new javax.swing.JComboBox<>();
        add_kategori = new javax.swing.JButton();
        add_brand = new javax.swing.JButton();
        add_ukuran = new javax.swing.JButton();
        clear_nama_barang = new javax.swing.JButton();
        clear_harga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo-safa-long.png"))); // NOI18N

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Kategori Barang", "Brand", "Harga", "Ukuran"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.getTableHeader().setReorderingAllowed(false);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
            tabel.getColumnModel().getColumn(4).setResizable(false);
            tabel.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_keluar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Management Peralatan");

        btn_add.setText("Tambah Data");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setText("Edit Data");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setText("Hapus Data");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel8.setText("Nama Barang");

        txt_nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_barangActionPerformed(evt);
            }
        });

        jLabel9.setText("Kategori Barang");

        selectionKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionKategoriActionPerformed(evt);
            }
        });

        jLabel10.setText("Brand Barang");

        txt_harga_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_harga_barangActionPerformed(evt);
            }
        });

        jLabel11.setText("Harga Barang");

        jLabel13.setText("Ukuran Barang");

        selectionSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionSizeActionPerformed(evt);
            }
        });

        add_kategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus+.png"))); // NOI18N
        add_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_kategoriActionPerformed(evt);
            }
        });

        add_brand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus+.png"))); // NOI18N
        add_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_brandActionPerformed(evt);
            }
        });

        add_ukuran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus+.png"))); // NOI18N
        add_ukuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ukuranActionPerformed(evt);
            }
        });

        clear_nama_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        clear_nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_nama_barangActionPerformed(evt);
            }
        });

        clear_harga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/x.png"))); // NOI18N
        clear_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(selectionBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(add_brand))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(selectionKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(add_kategori)
                                            .addComponent(clear_nama_barang)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_harga_barang)
                                            .addComponent(jLabel13)
                                            .addComponent(selectionSize, 0, 254, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add_ukuran)
                                            .addComponent(clear_harga))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear_nama_barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectionKategori))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_brand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectionBrand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_harga_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_ukuran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectionSize)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void fetchKategoriSelction() {
        try {
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery("SELECT * FROM category");

            while (hasil.next()) {
                selectionKategori.addItem("KTG_" + hasil.getString("id_category") + ": " + hasil.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("erorr: fetchKategoriSelction" + e);
        }
    }

    protected void fetchBrandSelction() {
        try {
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery("SELECT * FROM brand");

            while (hasil.next()) {
                selectionBrand.addItem("BRD_" + hasil.getString("id_brand") + ": " + hasil.getString("brand_name"));
            }
        } catch (Exception e) {
            System.out.println("erorr: fetchKategoriSelction" + e);
        }
    }

    protected void fetchSizeSelection(String category) {
//        System.out.println("category: " + category);
        PreparedStatement stat = null;
        ResultSet hasil = null;
        try {
            String query = "SELECT * FROM size WHERE id_category = ?";
            stat = konek.prepareStatement(query);
            stat.setString(1, category);
            hasil = stat.executeQuery();
            selectionSize.removeAllItems(); 
            while (hasil.next()) {
                selectionSize.addItem("SZ_" + hasil.getString("id_size") + ": " + hasil.getString("size_label"));
            }

            // Force refresh of the selectionSize JComboBox
            selectionSize.revalidate();
            selectionSize.repaint();
        } catch (SQLException e) {
            System.out.println("Error fetching size selection: " + e.getMessage());
            // You might want to display an error message to the user here
        } finally {
            // Close the ResultSet and PreparedStatement
            if (hasil != null) {
                try {
                    hasil.close();
                } catch (SQLException e) {
                    System.out.println("Error closing ResultSet: " + e.getMessage());
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error closing PreparedStatement: " + e.getMessage());
                }
            }
        }
    }

    protected void datatable() {
        Object[] Baris = {"IDBarang", "Nama barang", "Kategori Barang", "Brand", "Harga", "Ukuran"};
        tabmode = new DefaultTableModel(null, Baris);
        try {
            String query = "SELECT\n"
                    + "    e.id_equipment,\n"
                    + "    e.equipment_name,\n"
                    + "    c.name AS category_name,\n"
                    + "    b.brand_name,\n"
                    + "    e.price,\n"
                    + "    s.size_label\n"
                    + "FROM\n"
                    + "    equipment e\n"
                    + "JOIN\n"
                    + "    category c ON e.id_category = c.id_category\n"
                    + "JOIN\n"
                    + "    size s ON e.id_size = s.id_size AND s.id_category = c.id_category\n"
                    + "JOIN\n"
                    + "    brand b ON e.id_brand = b.id_brand";

            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(query);

            while (hasil.next()) {
                tabmode.addRow(new Object[]{
                    "BRG_" + hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6)
                });
            }
            tabel.setModel(tabmode);
        } catch (Exception e) {
            System.out.println("erorr: " + e);
        }
    }

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if (txt_nama_barang.getText().equals("") || txt_harga_barang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data harus di isi semua", "error", JOptionPane.INFORMATION_MESSAGE);
        } else {

            System.out.println(" btn_addActionPerformed " + selectionKategori.getSelectedItem().toString());
            try {
                String sql = "insert into equipment values (?,?,?,?,?,?)";
                PreparedStatement stat = konek.prepareStatement(sql);
                stat.setString(1, null);
                stat.setString(2, txt_nama_barang.getText());
                stat.setString(3, selectionKategori.getSelectedItem().toString().split(":")[0].trim().replaceAll("[^0-9]", ""));
                stat.setString(4, selectionBrand.getSelectedItem().toString().split(":")[0].trim().replaceAll("[^0-9]", ""));
                stat.setString(5, txt_harga_barang.getText());
                stat.setString(6, selectionSize.getSelectedItem().toString().split(":")[0].trim().replaceAll("[^0-9]", ""));
                stat.executeUpdate();

                JOptionPane.showMessageDialog(null, "Berhasil tambah data", "success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.out.println("erorr: btn_addActionPerformed " + e);
            }
            datatable();
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_barangActionPerformed

    private void selectionKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionKategoriActionPerformed
        // TODO add your handling code here:
        String selectedCategory = selectionKategori.getSelectedItem().toString().split(":")[0];
        System.out.println("selectionKategoriActionPerformed " + selectedCategory.replaceAll("[^0-9]", ""));
        fetchSizeSelection(selectedCategory.replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_selectionKategoriActionPerformed

    private void txt_harga_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_harga_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_harga_barangActionPerformed

    private void selectionSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectionSizeActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int selectedRow = tabel.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("selectedRow " + selectedRow);

        int ok = JOptionPane.showConfirmDialog(null, "hapus", "konfirmasi dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {

            try {
                String idBarang = tabel.getValueAt(selectedRow, 0).toString().substring(4);
                String sql = "delete from equipment where id_equipment ='" + idBarang + "'";
                PreparedStatement stat = konek.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil menghapus " + tabel.getValueAt(selectedRow, 0).toString() + tabel.getValueAt(selectedRow, 1).toString(), "success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "error", JOptionPane.INFORMATION_MESSAGE);
            }
            datatable();
            Clear();

        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void add_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_kategoriActionPerformed
        // TODO add your handling code here:
        AddKategoriScreen addKategoriScreen = new AddKategoriScreen();
        addKategoriScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_kategoriActionPerformed

    private void add_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_brandActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        AddBrandScreen addBrandScreen = new AddBrandScreen();
        addBrandScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_brandActionPerformed

    private void add_ukuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ukuranActionPerformed
        // TODO add your handling code here:
        AddSizeScreen addSizeScreen = new AddSizeScreen();
        addSizeScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_ukuranActionPerformed

    private void clear_nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_nama_barangActionPerformed
        // TODO add your handling code here:
        txt_nama_barang.setText("");
    }//GEN-LAST:event_clear_nama_barangActionPerformed

    private void clear_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_hargaActionPerformed
        // TODO add your handling code here:
        txt_harga_barang.setText("");
    }//GEN-LAST:event_clear_hargaActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:

        int selectedRow = tabel.getSelectedRow();
        if (selectedRow != -1) {
            btn_add.setEnabled(false);
            btn_batal.setEnabled(true);
            btn_edit.setEnabled(true);
            btn_delete.setEnabled(true);

            txt_nama_barang.setText(tabel.getValueAt(selectedRow, 1).toString());
            selectionKategori.setSelectedIndex(helper.updateComboBoxSelection(selectionKategori, tabel.getValueAt(selectedRow, 2).toString()));
            selectionBrand.setSelectedIndex(helper.updateComboBoxSelection(selectionBrand, tabel.getValueAt(selectedRow, 3).toString()));
            txt_harga_barang.setText(tabel.getValueAt(selectedRow, 4).toString());
            selectionSize.setSelectedIndex(helper.updateComboBoxSelection(selectionSize, tabel.getValueAt(selectedRow, 5).toString()));
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        btn_add.setEnabled(true);
        Clear();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        if (txt_nama_barang.getText().equals("") || txt_harga_barang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data harus di isi semua", "error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                int selectedRow = tabel.getSelectedRow();
                String idBarang = tabel.getValueAt(selectedRow, 0).toString().substring(4);
                // Construct the SQL update query
                String sql = "UPDATE equipment "
                        + "SET equipment_name = ?, "
                        + "id_category = ?, "
                        + "id_brand = ?, "
                        + "price = ?, "
                        + "id_size = ? "
                        + "WHERE id_equipment = ?"; // Assuming you have an ID column

                PreparedStatement stat = konek.prepareStatement(sql);
                stat.setString(1, txt_nama_barang.getText());
                stat.setString(2, selectionKategori.getSelectedItem().toString().split(":")[0].trim().replaceAll("[^0-9]", ""));
                stat.setString(3, selectionBrand.getSelectedItem().toString().split(":")[0].trim().replaceAll("[^0-9]", ""));
                stat.setString(4, txt_harga_barang.getText());
                stat.setString(5, selectionSize.getSelectedItem().toString().split(":")[0].trim().replaceAll("[^0-9]", ""));
                stat.setString(6, idBarang);

                // Execute the update query
                int rowsAffected = stat.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Berhasil update data", "success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal update data", "error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("erorr: btn_addActionPerformed " + e);
            }
            datatable(); // Refresh the table data
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void Clear() {
        txt_harga_barang.setText("");
        txt_nama_barang.setText("");
        btn_add.setEnabled(true);
        btn_batal.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(EquipmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipmentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquipmentScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_brand;
    private javax.swing.JButton add_kategori;
    private javax.swing.JButton add_ukuran;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton clear_harga;
    private javax.swing.JButton clear_nama_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectionBrand;
    private javax.swing.JComboBox<String> selectionKategori;
    private javax.swing.JComboBox<String> selectionSize;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txt_harga_barang;
    private javax.swing.JTextField txt_nama_barang;
    // End of variables declaration//GEN-END:variables
}
