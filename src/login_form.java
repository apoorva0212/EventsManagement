import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.sql.*;
import javax.swing.JOptionPane;
public class login_form extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;
    Timer t;

    public login_form() {
        initComponents();
        try {
            con = DBConnect.connectMySQL();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        t = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n;
                n = (int) (Math.random() * 5) + 1;
                System.out.println(n);
                ImageIcon icon = new ImageIcon(this.getClass().getResource("/login_frame_pics/pic" + n + ".jpg"));
                Image img = icon.getImage().getScaledInstance(670, 410, image.SCALE_DEFAULT);
                imgLBL.setIcon(new ImageIcon(img));
            }
        });
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginBTN = new javax.swing.JButton();
        pswrdPF = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        userTF = new javax.swing.JTextField();
        imgLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 410));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("     IT IS ALL UR CHOICE IN OUR STYLE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 60, 500, 60);

        jLabel2.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 140, 140, 30);

        loginBTN.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        loginBTN.setForeground(new java.awt.Color(51, 51, 51));
        loginBTN.setText("LOGIN");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });
        jPanel1.add(loginBTN);
        loginBTN.setBounds(460, 330, 120, 40);

        pswrdPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswrdPFActionPerformed(evt);
            }
        });
        jPanel1.add(pswrdPF);
        pswrdPF.setBounds(330, 190, 210, 30);

        jLabel4.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 190, 140, 41);

        backBTN.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        jPanel1.add(backBTN);
        backBTN.setBounds(53, 330, 110, 40);
        jPanel1.add(userTF);
        userTF.setBounds(330, 140, 210, 30);

        imgLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imgLBL.setForeground(new java.awt.Color(255, 255, 255));
        imgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_frame_pics/pic1.jpg"))); // NOI18N
        jPanel1.add(imgLBL);
        imgLBL.setBounds(0, -30, 670, 470);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-638)/2, (screenSize.height-436)/2, 638, 436);
    }// </editor-fold>//GEN-END:initComponents

    private void pswrdPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswrdPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswrdPFActionPerformed

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
        String sql = "select*from customer where UserName=? and Password=?";
        String uid = userTF.getText();
        String pwd = new String(pswrdPF.getPassword());
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, uid);
            pst.setString(2, pwd);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "login success");
                new event_selection().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "login failed");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_loginBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        new Homepage().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBTNActionPerformed

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
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel imgLBL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBTN;
    private javax.swing.JPasswordField pswrdPF;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}