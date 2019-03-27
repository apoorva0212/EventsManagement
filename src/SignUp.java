
import java.sql.*;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    PreparedStatement pst;

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        con = DBConnect.connectMySQL();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        signupBTN = new javax.swing.JButton();
        phoneTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        pswrdPF = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        imgLBL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        signupBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signupBTN.setText("SIGNUP");
        signupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBTNActionPerformed(evt);
            }
        });
        jPanel1.add(signupBTN);
        signupBTN.setBounds(310, 350, 130, 40);
        jPanel1.add(phoneTF);
        phoneTF.setBounds(180, 240, 240, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PHONE NO.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 240, 140, 30);

        jLabel6.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GET STARTED....");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 10, 370, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 140, 30);
        jPanel1.add(emailTF);
        emailTF.setBounds(180, 130, 240, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMAIL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 130, 100, 28);
        jPanel1.add(nameTF);
        nameTF.setBounds(180, 80, 240, 30);
        jPanel1.add(pswrdPF);
        pswrdPF.setBounds(180, 190, 240, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 70, 110, 50);

        backBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backBTN.setText("BACK TO LOGIN PAGE");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        jPanel1.add(backBTN);
        backBTN.setBounds(10, 360, 240, 31);

        imgLBL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        imgLBL.setForeground(new java.awt.Color(255, 255, 255));
        imgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/SP.jpg"))); // NOI18N
        jPanel1.add(imgLBL);
        imgLBL.setBounds(-20, 0, 490, 410);
        imgLBL.getAccessibleContext().setAccessibleName("Name\n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 60, 460, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-476)/2, (screenSize.height-448)/2, 476, 448);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        new login_form().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    private void signupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBTNActionPerformed
        String name = nameTF.getText();
        String email = emailTF.getText();
        String password = new String(pswrdPF.getPassword());
        String user_phone = phoneTF.getText();
        String sql = "insert into CUSTOMER(username,email,password,user_phone) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4, user_phone);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"You have successfully created your account");
            new login_form().setVisible(true);
            this.dispose();
            rs.close();
            stmt.close();
            

        } catch (Exception e) {
           e.getMessage();
        }


    }//GEN-LAST:event_signupBTNActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel imgLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JPasswordField pswrdPF;
    private javax.swing.JButton signupBTN;
    // End of variables declaration//GEN-END:variables
}
