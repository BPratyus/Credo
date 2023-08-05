import java.awt.Frame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Market
     */
    public Customer() {
        initComponents();
        confirmlbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepane = new javax.swing.JPanel();
        Marketbtn = new javax.swing.JButton();
        Profilebtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        HistoryBtn = new javax.swing.JButton();
        Chng_PwdBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        market = new javax.swing.JPanel();
        FruitsBtn = new javax.swing.JButton();
        VegetablesBtn = new javax.swing.JButton();
        DiaryBtn = new javax.swing.JButton();
        PoultryBtn = new javax.swing.JButton();
        BeeBtn = new javax.swing.JButton();
        MarineBtn = new javax.swing.JButton();
        History = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        his = new javax.swing.JTable();
        Password = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pwd1 = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();
        pwd2 = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        pwd3 = new javax.swing.JPasswordField();
        savepwdbtn = new javax.swing.JButton();
        confirmlbl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Profile = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        dist = new javax.swing.JTextField();
        Pay = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paytb = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home ");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/Logos/favicon.png")).getImage()
        );
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(900, 760));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(0, 153, 204));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Marketbtn.setBackground(new java.awt.Color(0, 153, 204));
        Marketbtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Marketbtn.setForeground(new java.awt.Color(0, 153, 51));
        Marketbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/market-basket-.png"))); // NOI18N
        Marketbtn.setText("Market");
        Marketbtn.setOpaque(false);
        Marketbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketbtnActionPerformed(evt);
            }
        });
        sidepane.add(Marketbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 60));

        Profilebtn.setBackground(new java.awt.Color(0, 153, 204));
        Profilebtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Profilebtn.setForeground(new java.awt.Color(0, 153, 51));
        Profilebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/user.png"))); // NOI18N
        Profilebtn.setText("Profile settings");
        Profilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfilebtnActionPerformed(evt);
            }
        });
        sidepane.add(Profilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 60));

        LogoutBtn.setBackground(new java.awt.Color(0, 153, 204));
        LogoutBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(0, 153, 51));
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/logout.png"))); // NOI18N
        LogoutBtn.setText("Log Out");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        sidepane.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 230, 60));

        HistoryBtn.setBackground(new java.awt.Color(0, 153, 204));
        HistoryBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        HistoryBtn.setForeground(new java.awt.Color(0, 153, 51));
        HistoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/bill.png"))); // NOI18N
        HistoryBtn.setText("History");
        HistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryBtnActionPerformed(evt);
            }
        });
        sidepane.add(HistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 60));

        Chng_PwdBtn.setBackground(new java.awt.Color(0, 153, 204));
        Chng_PwdBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Chng_PwdBtn.setForeground(new java.awt.Color(0, 153, 51));
        Chng_PwdBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/password.png"))); // NOI18N
        Chng_PwdBtn.setText("Change Password");
        Chng_PwdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chng_PwdBtnActionPerformed(evt);
            }
        });
        sidepane.add(Chng_PwdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 50));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/payment-method.png"))); // NOI18N
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sidepane.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, 60));

        getContentPane().add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 540));

        header.setBackground(new java.awt.Color(153, 153, 153));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/twitter_header_photo_78.jpg"))); // NOI18N
        header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 910, 200));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1060, 200));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        market.setBackground(new java.awt.Color(204, 255, 204));
        market.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FruitsBtn.setBackground(new java.awt.Color(255, 255, 0));
        FruitsBtn.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        FruitsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download.jpg"))); // NOI18N
        FruitsBtn.setText("Fruits");
        FruitsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FruitsBtn.setMinimumSize(new java.awt.Dimension(200, 200));
        FruitsBtn.setPreferredSize(new java.awt.Dimension(200, 200));
        FruitsBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        FruitsBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FruitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FruitsBtnActionPerformed(evt);
            }
        });
        market.add(FruitsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 171));

        VegetablesBtn.setBackground(new java.awt.Color(255, 255, 0));
        VegetablesBtn.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        VegetablesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Veget.jpg"))); // NOI18N
        VegetablesBtn.setText("Vegetables");
        VegetablesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VegetablesBtn.setMinimumSize(new java.awt.Dimension(200, 200));
        VegetablesBtn.setPreferredSize(new java.awt.Dimension(200, 200));
        VegetablesBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        VegetablesBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        VegetablesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VegetablesBtnActionPerformed(evt);
            }
        });
        market.add(VegetablesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 192, 171));

        DiaryBtn.setBackground(new java.awt.Color(255, 255, 0));
        DiaryBtn.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        DiaryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (2).jpg"))); // NOI18N
        DiaryBtn.setText("Dairy");
        DiaryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DiaryBtn.setMinimumSize(new java.awt.Dimension(200, 200));
        DiaryBtn.setPreferredSize(new java.awt.Dimension(200, 200));
        DiaryBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DiaryBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DiaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaryBtnActionPerformed(evt);
            }
        });
        market.add(DiaryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, 142));

        PoultryBtn.setBackground(new java.awt.Color(255, 255, 0));
        PoultryBtn.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        PoultryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/poultry.jpg"))); // NOI18N
        PoultryBtn.setText("Poultry");
        PoultryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PoultryBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PoultryBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PoultryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoultryBtnActionPerformed(evt);
            }
        });
        market.add(PoultryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 192, 142));

        BeeBtn.setBackground(new java.awt.Color(255, 255, 0));
        BeeBtn.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        BeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/honey.jpg"))); // NOI18N
        BeeBtn.setText("Bee culture");
        BeeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BeeBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BeeBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeeBtnActionPerformed(evt);
            }
        });
        market.add(BeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 190, 133));

        MarineBtn.setBackground(new java.awt.Color(255, 255, 0));
        MarineBtn.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        MarineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (5).jpg"))); // NOI18N
        MarineBtn.setText("Marine culture");
        MarineBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MarineBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        MarineBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MarineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarineBtnActionPerformed(evt);
            }
        });
        market.add(MarineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 192, 133));

        jLayeredPane1.add(market, "card2");

        History.setBackground(new java.awt.Color(255, 255, 153));

        his.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of commodity", "Price", "unit", "Type", "Seller name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        his.setOpaque(false);
        jScrollPane1.setViewportView(his);

        javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(History);
        History.setLayout(HistoryLayout);
        HistoryLayout.setHorizontalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        HistoryLayout.setVerticalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLayeredPane1.add(History, "card5");

        Password.setOpaque(false);
        Password.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 153));
        jLabel23.setText("Change Password");
        Password.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 153));
        jLabel20.setText("Old password");
        Password.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        Password.add(pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 170, 30));

        jLabel21.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 153));
        jLabel21.setText("New password");
        Password.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        Password.add(pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, 30));

        jLabel22.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 153));
        jLabel22.setText("Confirm Password");
        Password.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        Password.add(pwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 170, 30));

        savepwdbtn.setBackground(new java.awt.Color(153, 255, 153));
        savepwdbtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        savepwdbtn.setForeground(new java.awt.Color(0, 0, 255));
        savepwdbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/save.png"))); // NOI18N
        savepwdbtn.setText("Save");
        savepwdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savepwdbtnActionPerformed(evt);
            }
        });
        Password.add(savepwdbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 150, 50));

        confirmlbl.setEnabled(false);
        confirmlbl.setFocusable(false);
        confirmlbl.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/updated.png"))); // NOI18N
        jLabel3.setText("Password sucessfully changed");
        confirmlbl.add(jLabel3);

        Password.add(confirmlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 250, 50));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled presentation (5).jpg"))); // NOI18N
        Password.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        jLayeredPane1.add(Password, "card4");

        Profile.setBackground(new java.awt.Color(204, 255, 255));
        Profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Name");
        Profile.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 241, 45));

        jLabel18.setText("First Name");
        Profile.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel19.setText("Last name");
        Profile.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));
        Profile.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 186, 33));
        Profile.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 186, 32));

        update.setText("Update Profile");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        Profile.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jLabel24.setText("E-mail");
        Profile.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel25.setText("Phone number");
        Profile.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel26.setText("District");
        Profile.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        Profile.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 186, 35));
        Profile.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 186, 42));
        Profile.add(dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 186, 46));

        jLayeredPane1.add(Profile, "card5");

        paytb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Unit"
            }
        ));
        jScrollPane2.setViewportView(paytb);

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/cash-on-delivery.png"))); // NOI18N
        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PayLayout = new javax.swing.GroupLayout(Pay);
        Pay.setLayout(PayLayout);
        PayLayout.setHorizontalGroup(
            PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayLayout.createSequentialGroup()
                .addGroup(PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PayLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        PayLayout.setVerticalGroup(
            PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Pay, "card6");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 760, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MarketbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarketbtnActionPerformed
        market.setVisible(true);
        Profile.setVisible(false);
        History.setVisible(false);
        Password.setVisible(false);
    }//GEN-LAST:event_MarketbtnActionPerformed

    private void ProfilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfilebtnActionPerformed
        market.setVisible(false);
        Profile.setVisible(true);
        History.setVisible(false);
        Password.setVisible(false);

        fn.setText(d.first_name);
        ln.setText(d.last_name);
        num.setText(d. mob_no);
        mail.setText(d.mail);
        dist.setText(d.dist);
    }//GEN-LAST:event_ProfilebtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        Loginpg x=new Loginpg();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void HistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryBtnActionPerformed
        market.setVisible(false);
        Profile.setVisible(false);
        History.setVisible(true);
        Password.setVisible(false);

        DefaultTableModel mod=(DefaultTableModel)his.getModel();
        { int row=mod.getRowCount();
                if (row>0)
                {for(int i=0;i<row;i++)
                    mod.removeRow(0);
                }
          }

        try{ Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/credo", "root", "root");
            Statement st=con.createStatement();
            String sql="select name_of_comm,price,units,type,seller_name from trans where customer_name like'%"+d.first_name+"%';";
            ResultSet rs=st.executeQuery(sql);

            while(rs.next()){
                String name=rs.getString(1);
                String price=rs.getString(2);
                String units=rs.getString(3);
                String type=rs.getString(4);
                String seller=rs.getString(5);

                mod.addRow(new Object[]{name,price,units,type,seller});
            }

            rs.close();
            st.close();
            con.close();         }
        catch(Exception e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_HistoryBtnActionPerformed

    private void Chng_PwdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chng_PwdBtnActionPerformed
        market.setVisible(false);
        Profile.setVisible(false);
        History.setVisible(false);
        Password.setVisible(true);
    }//GEN-LAST:event_Chng_PwdBtnActionPerformed

    private void FruitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FruitsBtnActionPerformed

        my.check(1);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FruitsBtnActionPerformed

    private void VegetablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VegetablesBtnActionPerformed
        my.check(2);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VegetablesBtnActionPerformed

    private void DiaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaryBtnActionPerformed
        my.check(3);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DiaryBtnActionPerformed

    private void PoultryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoultryBtnActionPerformed
        my.check(4);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PoultryBtnActionPerformed

    private void BeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeeBtnActionPerformed
        my.check(5);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BeeBtnActionPerformed

    private void MarineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarineBtnActionPerformed
        my.check(6);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MarineBtnActionPerformed

    private void savepwdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savepwdbtnActionPerformed
        String p1=pwd1.getText();
        String p2=pwd2.getText();
        String p3=pwd3.getText();

        if(p1.equals(d.pwd))
        { if(p2.equals(p3)){
            try{ Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/credo", "root", "root");
                Statement st=con.createStatement();
                String sql="Update profile set password='"+p3+"' where password='"+p1+"';";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "database updated");
                confirmlbl.setVisible(true);
                pwd1.setText("");
                pwd2.setText("");
                pwd3.setText("");
                

                st.close();
                con.close();

            }

            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());}
        }
        else
        JOptionPane.showMessageDialog(this,"password not matching");
        }else
        JOptionPane.showMessageDialog(this,"Incorrect password");
    }//GEN-LAST:event_savepwdbtnActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String Fn=fn.getText();
        String Ln=ln.getText();
        String Num=num.getText();
        String Mail=mail.getText();
        String Dist=dist.getText();

        int ans=JOptionPane.showConfirmDialog(this, "Confirm?");
        if(ans==0)
       
        { try{ Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/credo", "root", "root");
            Statement st=con.createStatement();
            String sql="Update profile set first_name='"+Fn+"',last_name='"+Ln+"',email='"+Mail+"',district='"+Dist+"',mobile_no='"+Num+"' where first_name='"+d.first_name+"';";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "database updated");

            st.close();
            con.close();
          
        }

        catch(Exception e){JOptionPane.showMessageDialog(this, e.getMessage());}

        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Payments p=new Payments();
       p.setVisible(true);
       this.dispose();
       try{ Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/credo", "root", "root");
            Statement st=con.createStatement();
            String sql="Update trans set status='Paid' where Customer_no="+d.Sno+";";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "database updated");

            st.close();
            con.close();
          
        }

        catch(Exception e){JOptionPane.showMessageDialog(this, e.getMessage());}

       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pay.setVisible(true);
         market.setVisible(false);
        Profile.setVisible(false);
        History.setVisible(false);
        Password.setVisible(false);
        
        DefaultTableModel mod=(DefaultTableModel)paytb.getModel();
        
        try{ Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/credo", "root", "root");
            Statement st=con.createStatement();
            String sql="select Name_of_comm,Price,units,seller_name from trans where customer_no="+d.Sno+" and status='Agreed';";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                mod.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            
            }
            rs.close();
            st.close();
            con.close();
        }
        catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
    }//GEN-LAST:event_jButton1ActionPerformed
    Global my=new Global();
        Market c=new Market();
        data d=new data();
       
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
                      // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeeBtn;
    private javax.swing.JButton Chng_PwdBtn;
    private javax.swing.JButton DiaryBtn;
    private javax.swing.JButton FruitsBtn;
    private javax.swing.JPanel History;
    private javax.swing.JButton HistoryBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton MarineBtn;
    private javax.swing.JButton Marketbtn;
    private javax.swing.JPanel Password;
    private javax.swing.JPanel Pay;
    private javax.swing.JButton PoultryBtn;
    private javax.swing.JPanel Profile;
    private javax.swing.JButton Profilebtn;
    private javax.swing.JButton VegetablesBtn;
    private javax.swing.JPanel confirmlbl;
    private javax.swing.JTextField dist;
    private javax.swing.JTextField fn;
    private javax.swing.JPanel header;
    private javax.swing.JTable his;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mail;
    private javax.swing.JPanel market;
    private javax.swing.JTextField num;
    private javax.swing.JTable paytb;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JPasswordField pwd2;
    private javax.swing.JPasswordField pwd3;
    private javax.swing.JButton savepwdbtn;
    private javax.swing.JPanel sidepane;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
