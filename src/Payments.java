
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anand
 */
public class Payments extends javax.swing.JFrame {

    /**
     * Creates new form Payments
     */
    public Payments() {
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

        Parent = new javax.swing.JPanel();
        Axis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ICICI = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Paypal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HDFC = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Paytm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SBI = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Headerpnl = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pay Seller");
        setIconImage(new ImageIcon(getClass().getResource("/Logos/favicon.png")).getImage()
        );
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Parent.setBackground(new java.awt.Color(204, 204, 255));

        Axis.setBackground(new java.awt.Color(255, 255, 255));
        Axis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AxisMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/axis.jpg"))); // NOI18N

        javax.swing.GroupLayout AxisLayout = new javax.swing.GroupLayout(Axis);
        Axis.setLayout(AxisLayout);
        AxisLayout.setHorizontalGroup(
            AxisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AxisLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        AxisLayout.setVerticalGroup(
            AxisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AxisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        ICICI.setBackground(new java.awt.Color(255, 255, 255));
        ICICI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICICIMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icici.png"))); // NOI18N

        javax.swing.GroupLayout ICICILayout = new javax.swing.GroupLayout(ICICI);
        ICICI.setLayout(ICICILayout);
        ICICILayout.setHorizontalGroup(
            ICICILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ICICILayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        ICICILayout.setVerticalGroup(
            ICICILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ICICILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Paypal.setBackground(new java.awt.Color(255, 255, 255));
        Paypal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaypalMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paypal.jpg"))); // NOI18N

        javax.swing.GroupLayout PaypalLayout = new javax.swing.GroupLayout(Paypal);
        Paypal.setLayout(PaypalLayout);
        PaypalLayout.setHorizontalGroup(
            PaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaypalLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        PaypalLayout.setVerticalGroup(
            PaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaypalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HDFC.setBackground(new java.awt.Color(255, 255, 255));
        HDFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HDFCMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hdfc.png"))); // NOI18N

        javax.swing.GroupLayout HDFCLayout = new javax.swing.GroupLayout(HDFC);
        HDFC.setLayout(HDFCLayout);
        HDFCLayout.setHorizontalGroup(
            HDFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HDFCLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        HDFCLayout.setVerticalGroup(
            HDFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HDFCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        Paytm.setBackground(new java.awt.Color(255, 255, 255));
        Paytm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaytmMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paytm.png"))); // NOI18N

        javax.swing.GroupLayout PaytmLayout = new javax.swing.GroupLayout(Paytm);
        Paytm.setLayout(PaytmLayout);
        PaytmLayout.setHorizontalGroup(
            PaytmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaytmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        PaytmLayout.setVerticalGroup(
            PaytmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaytmLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        SBI.setBackground(new java.awt.Color(255, 255, 255));
        SBI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SBIMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sbi.png"))); // NOI18N

        javax.swing.GroupLayout SBILayout = new javax.swing.GroupLayout(SBI);
        SBI.setLayout(SBILayout);
        SBILayout.setHorizontalGroup(
            SBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SBILayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        SBILayout.setVerticalGroup(
            SBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ParentLayout = new javax.swing.GroupLayout(Parent);
        Parent.setLayout(ParentLayout);
        ParentLayout.setHorizontalGroup(
            ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentLayout.createSequentialGroup()
                .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParentLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HDFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paypal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ParentLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Axis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ParentLayout.createSequentialGroup()
                        .addComponent(Paytm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174))
                    .addGroup(ParentLayout.createSequentialGroup()
                        .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ICICI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        ParentLayout.setVerticalGroup(
            ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Axis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Paytm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ParentLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Paypal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ICICI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HDFC, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 980, 600));

        Headerpnl.setBackground(new java.awt.Color(102, 0, 204));

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Choose Preferred bank for Payment");

        javax.swing.GroupLayout HeaderpnlLayout = new javax.swing.GroupLayout(Headerpnl);
        Headerpnl.setLayout(HeaderpnlLayout);
        HeaderpnlLayout.setHorizontalGroup(
            HeaderpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(HeaderpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderpnlLayout.createSequentialGroup()
                    .addContainerGap(175, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        HeaderpnlLayout.setVerticalGroup(
            HeaderpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
            .addGroup(HeaderpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderpnlLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(Headerpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AxisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AxisMouseClicked
           try {
   
   URI uri= new URI("https://retail.axisbank.co.in/wps/portal/rBanking/axisebanking/AxisRetailLogin/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNAzxMjIwNjLwsQp0MDBw9PUOd3HwdDQwMjIEKIoEKDHAARwNC-sP1o_ArMYIqwGNFQW6EQaajoiIAVNL82A!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/?_ga=2.62168044.1910879370.1566732683-1787913023.1566732683");
   
   java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");
    Customer c=new Customer();
    c.setVisible(true);
    
    this.dispose();
  } catch (Exception e) {
   e.printStackTrace();
  }
    }//GEN-LAST:event_AxisMouseClicked

    private void PaytmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaytmMouseClicked
            try {
   
   URI uri= new URI("https://paytm.com/");
   
   java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");
    Customer c=new Customer();
    c.setVisible(true);
    this.dispose();
  } catch (Exception e) {
   
   e.printStackTrace();
  }
    }//GEN-LAST:event_PaytmMouseClicked

    private void PaypalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaypalMouseClicked
            try {
   
   URI uri= new URI("https://www.paypal.com/in/signin");
   
   java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");
    Customer c=new Customer();
    c.setVisible(true);
    this.dispose();
  } catch (Exception e) {
   
   e.printStackTrace();
  }
    }//GEN-LAST:event_PaypalMouseClicked

    private void ICICIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICICIMouseClicked
            try {
   
   URI uri= new URI("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_primer_login_btn_desk&_ga=2.225934879.489696222.1566733135-865102603.1537717525");
   
   java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");
    Customer c=new Customer();
    c.setVisible(true);
    this.dispose();
  } catch (Exception e) {
   
   e.printStackTrace();
  }
    }//GEN-LAST:event_ICICIMouseClicked

    private void HDFCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HDFCMouseClicked
           try {
   
   URI uri= new URI("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176220901.1941450953.1566733051-129161666.1566733051");
   
   java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");
    Customer c=new Customer();
    c.setVisible(true);
    this.dispose();
  } catch (Exception e) {
   
   e.printStackTrace();
  }
    }//GEN-LAST:event_HDFCMouseClicked

    private void SBIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SBIMouseClicked
         try {
   
   URI uri= new URI("https://retail.onlinesbi.com/retail/login.htm");
   
   java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");
    Customer c=new Customer();
    c.setVisible(true);
    this.dispose();
  } catch (Exception e) {
   
   e.printStackTrace();
  }
    }//GEN-LAST:event_SBIMouseClicked

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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Axis;
    private javax.swing.JPanel HDFC;
    private javax.swing.JPanel Headerpnl;
    private javax.swing.JPanel ICICI;
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel Paypal;
    private javax.swing.JPanel Paytm;
    private javax.swing.JPanel SBI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
