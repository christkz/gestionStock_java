

package base_de_donnée;
import Application.Parameter;
import Application.ResultSetTableModel;
import Application.BDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Hp
 */
public class Cachier extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
    int old,dec,now;
    
    public Cachier() {
        
        db = new BDD(new Parameter().HOST_DB,new Parameter().USERNAME_DB,
                new Parameter().PASSWORD_DB,new Parameter().IPHOST,new Parameter().PORT);
        
        
        initComponents();
        table();
       jam();    }
    public void table()
    {
    String colon[]={"code_produit","reference","designation","rangement","fournisseur","remise","prix","stock"};
            rs = db.querySelect(colon,"produit");
            table_prod.setModel(new ResultSetTableModel(rs));
    }
    void actualiser(){
     txt_cod.setText("");
            txt_ref.setText("");
           // txt_des.setText("");
            txt_rang.setText("");
            txt_four.setText("");
            txt_rem.setText("");
            txt_prix.setText("");
            txtsto.setText("");
            txtnou.setText("");
            
    }
  
    public void importer(){
         String colon[] ={"num_facture","code_produit","reference","prix_vente","stock_sortie","subtotal"};
         rs = db.fcSelectCommand(colon, "vente","num_facture='" + txt_fact.getText() + "'");
         table_vente.setModel(new ResultSetTableModel(rs));
         
    
    }
    public void jam(){
    Date s = new Date();
    SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
    SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
    lbl1.setText(jam.format(s));
    lbl12.setText(tgl.format(s));
    
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_prod = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        com_rech = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        txt_rech = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_ref = new javax.swing.JTextField();
        txt_cod = new javax.swing.JTextField();
        txt_prix = new javax.swing.JTextField();
        txt_rem = new javax.swing.JTextField();
        txtnou = new javax.swing.JTextField();
        txt_rang = new javax.swing.JTextField();
        txt_four = new javax.swing.JTextField();
        txtsto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lbltot1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_vente = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbltot2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbltot4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_fact = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        table_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "code_produit", "reference", "designation", "rangement", "fourniseur", "remise", "prix", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_prod);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 50, 780, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("caissier");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 10, 70, 24);

        lbl1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jPanel1.add(lbl1);
        lbl1.setBounds(20, 10, 130, 30);
        jPanel1.add(lbl12);
        lbl12.setBounds(734, 10, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 0, 1330, 170);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("recherche par categorie:");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        com_rech.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "numero", "code_produit", "reference", "designation", "rangement", "fournisseur", "remise", "prix", "stock", " ", " " }));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("recherche");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txt_rech.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rechActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("code_produit:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("rangement:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("fournisseur :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("reference :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("remise% :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("stock_sortie :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("prix :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("nouveau_prix :");

        txt_ref.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_cod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_prix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prixActionPerformed(evt);
            }
        });

        txt_rem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtnou.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnou.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnouKeyReleased(evt);
            }
        });

        txt_rang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_four.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtsto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstoKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel15.setText("PR:");

        lbltot1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltot1.setText("0");
        lbltot1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbltot1KeyReleased(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("ajouter au produit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("actualiser");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_rang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnou, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbltot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(txt_four, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtsto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 300, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_rang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltot1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_four, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnou, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 170, 600, 530);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("num_facture:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 20, 100, 30);

        txt_pay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_payKeyReleased(evt);
            }
        });
        jPanel3.add(txt_pay);
        txt_pay.setBounds(400, 300, 130, 40);

        table_vente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_facture", "code_produit", "reference", "prix_vente", "stock_sortie", "subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_vente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_venteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_vente);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 70, 560, 120);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("supprime");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(370, 20, 120, 30);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("recherche");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(240, 20, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("Payer apres");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(280, 300, 110, 41);

        lbltot2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lbltot2.setText("0");
        jPanel3.add(lbltot2);
        lbltot2.setBounds(250, 230, 170, 41);

        lbl2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jPanel3.add(lbl2);
        lbl2.setBounds(640, 10, 130, 30);

        lbltot4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lbltot4.setText("PR:");
        jPanel3.add(lbltot4);
        lbltot4.setBounds(150, 230, 72, 41);

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel16.setText("Total");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(60, 230, 72, 41);

        txt_fact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_fact);
        txt_fact.setBounds(140, 20, 90, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel17.setText("Cash");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(60, 300, 72, 41);

        txt_cash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cashKeyReleased(evt);
            }
        });
        jPanel3.add(txt_cash);
        txt_cash.setBounds(140, 300, 110, 40);

        jButton10.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jButton10.setText("Annuler");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(100, 410, 180, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(630, 170, 730, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // rechercher
 if(txt_rech.getText().equals("")) //si le textfield de recherche est vide le programe il va affiche "SVP"
         {
    JOptionPane.showMessageDialog(this, "SVP entrer klk chose");
 }else{
            if(com_rech.getSelectedItem().equals("numero")){
                rs = db.querySelectAll("produit","numero LIKE '%" +txt_rech.getText() +"%'");
            table_prod.setModel(new ResultSetTableModel(rs));
            }else if(com_rech.getSelectedItem().equals("code_produit")){
            
             rs = db.querySelectAll("produit","code_produit LIKE '%" +txt_rech.getText() +"%'");
              table_prod.setModel(new ResultSetTableModel(rs));
            }
 else if(com_rech.getSelectedItem().equals("reference")){
            
             rs = db.querySelectAll("produit","reference LIKE '%" +txt_rech.getText() +"%'");
              table_prod.setModel(new ResultSetTableModel(rs));
            }
           /* else if(com_rech.getSelectedItem().equals("desegnation")){
            
             rs = db.querySelectAll("produit","designation LIKE '%" +txt_rech.getText() +"%'");
             table_prod.setModel(new ResultSetTableModel(rs));
            }*/
            else if(com_rech.getSelectedItem().equals("rangement")){
            
             rs = db.querySelectAll("produit","rangement LIKE '%" +txt_rech.getText() +"%'");
              table_prod.setModel(new ResultSetTableModel(rs));
            }
            else if(com_rech.getSelectedItem().equals("fournisseur")){
            
             rs = db.querySelectAll("produit","fournisseur LIKE '%" +txt_rech.getText() +"%'");
              table_prod.setModel(new ResultSetTableModel(rs));
            }
           
             else if(com_rech.getSelectedItem().equals("remise")){
            
             rs = db.querySelectAll("produit","remise LIKE '%" +txt_rech.getText() +"%'");
              table_prod.setModel(new ResultSetTableModel(rs));
            }
             else if(com_rech.getSelectedItem().equals("prix")){
            
             rs = db.querySelectAll("produit","prix LIKE '%" +txt_rech.getText() +"%'");
              table_prod.setModel(new ResultSetTableModel(rs));
            }
            else if(com_rech.getSelectedItem().equals("stock")){
            
             rs = db.querySelectAll("produit","stock LIKE '%" +txt_rech.getText() +"%'");
              table_prod.setModel(new ResultSetTableModel(rs));
            }
            
       
            }
        //System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prixActionPerformed

    private void txt_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rechActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
   
        //supprime
        String id = String.valueOf(table_vente.getValueAt(table_vente.getSelectedRow(),0));
          if(JOptionPane.showConfirmDialog(this,"attention!!","etes- vous sur de vouloir supprimer",
                  JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
              db.queryDelete("vente", "num_facture=" + id);
          } else {
              return;
          }
          importer();
            table();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        importer();
        total();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
//
        String id = txt_fact.getText();
        if(JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux supprimer"
        ,"attention",JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
        
        db.queryDelete("vente","num_facture" +id);
        }else {
        return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txtstoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstoKeyReleased
        subtotal();
    }//GEN-LAST:event_txtstoKeyReleased

    private void txt_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payKeyReleased
 
    }//GEN-LAST:event_txt_payKeyReleased

    private void txt_cashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyReleased
          payaprés();
    }//GEN-LAST:event_txt_cashKeyReleased

    private void table_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_prodMouseClicked
        txt_cod.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 0)));
        txt_ref.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 1)));
        txt_rang.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 3)));
         txt_four.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 4)));
          txt_rem.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 5)));
           txt_prix.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 6)));
           cout();
    }//GEN-LAST:event_table_prodMouseClicked

    private void table_venteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_venteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_venteMouseClicked

    private void txtnouKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnouKeyReleased
        subtotal();
    }//GEN-LAST:event_txtnouKeyReleased

    private void lbltot1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbltot1KeyReleased

    }//GEN-LAST:event_lbltot1KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if(txt_cod.getText().equals("") || txt_ref.getText().equals("") 
                || txt_rang.getText().equals("") || txt_four.getText().equals("") || txt_rem.getText().equals("") ||
                 txt_prix.getText().equals("") || txtsto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "SVP entrer les information complete");
       }else if(txt_fact.getText().equals("")){JOptionPane.showMessageDialog (this, "veuiller saisir le num de facture" );
       }else{
       String[] colon={"num_facture","code_produit","reference","prix_vente","stock_sortie","subtotal" };
       String[] isi={txt_fact.getText(),txt_cod.getText(),txt_ref.getText(),txtnou.getText(),txtsto.getText(),lbltot1.getText() };
       System.out.println(db.queryInsert("vente", colon,isi));
       try{
       if(!test_stock()){
           JOptionPane.showMessageDialog(this,"le stock est limite");
             }else{
       def();
       table();
       }
       
       
       }catch(SQLException ex){Logger.getLogger(Cachier.class.getName()).log(Level.SEVERE,null, ex);System.err.println("\n" +ex); }
       subtotal();
       total();
       importer();
       
       
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       actualiser();
       table();
    }//GEN-LAST:event_jButton1ActionPerformed

     public void cout(){
   double a = Double.parseDouble (txt_prix.getText());
    double b = Double.parseDouble (txt_rem.getText());
    double c = a - a * (b / 100);
    txtnou.setText(String.valueOf(c));
    
    }
    
    public void subtotal(){
    double a = Double.parseDouble (txtnou.getText());
    double b = Double.parseDouble (txtsto.getText());
    double c = a * b;
    lbltot1.setText(String.valueOf(c));
    }
    public void total()
    {
    rs = db.exécutionQuery("SELECT SUM(subtotal) as subtotal FROM vente WHERE num_facture='" + txt_fact.getText()+ "'");
    try{
        rs.next();
        lbltot2.setText(rs.getString("subtotal"));
        
    }catch (SQLException ex){Logger.getLogger(Cachier.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    public boolean test_stock() throws SQLException {//pour tester que le stock ne pas depasse le stock sortie
    boolean teststock;
    rs = db.querySelectAll("produit","code_produit='" + txt_cod.getText() + "'");
    while(rs.next());
    {
    old = rs.getInt("stock");

    }dec = Integer.parseInt(txtsto.getText());
    if(old<dec){
    teststock=false;
    }else {
        teststock=true;
    }return teststock;
    }
    
    public void def()throws SQLException{
     rs = db.querySelectAll("produit","code_produit='" + txt_cod.getText() + "'");
    while(rs.next());
    {
    old = rs.getInt("stock");

    }dec = Integer.parseInt(txtsto.getText());
    now =old - dec;
    String nvstock = Integer.toString(now);
    
    String a = String.valueOf(nvstock);
    String[] colon = {"stock"};
    String[] si ={a};
    System.out.println(db.queryUpdate("produit",colon,si,"code_produit='" + txt_cod.getText() + "'" ));
    
    
    }
    public void payaprés(){
    
    int a = Integer.parseInt(lbltot2.getText());
    int b = Integer.parseInt(txt_cash.getText());
    int c = b - a;
    txt_pay.setText(Integer.toString(c));
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
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cachier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> com_rech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbltot1;
    private javax.swing.JLabel lbltot2;
    private javax.swing.JLabel lbltot4;
    private javax.swing.JTable table_prod;
    private javax.swing.JTable table_vente;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_fact;
    private javax.swing.JTextField txt_four;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_prix;
    private javax.swing.JTextField txt_rang;
    private javax.swing.JTextField txt_rech;
    private javax.swing.JTextField txt_ref;
    private javax.swing.JTextField txt_rem;
    private javax.swing.JTextField txtnou;
    private javax.swing.JTextField txtsto;
    // End of variables declaration//GEN-END:variables
}
