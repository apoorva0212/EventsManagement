
import java.sql.*;
import java.awt.Image;
import javax.swing.ImageIcon;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRYSTAL
 */
public class christian extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    PreparedStatement pst;
    String sql = "select * from wed_themes where theme_name=?";
    /**
     * Creates new form christian
     */
    String string;

    public christian() {
        initComponents();
        con = DBConnect.connectMySQL();
    }

    christian(String string) {
        this();
        this.string = string;
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/pics/" + string + ".jpg"));

        if (("christian_wedding").equals(string) || ("christian_reception").equals(string)) {
            Image img = icon.getImage().getScaledInstance(910, 390, Image.SCALE_DEFAULT);
            jLabel2.setIcon(new ImageIcon(img));
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

        THEME = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chargesTF = new javax.swing.JTextField();
        nextBTN = new javax.swing.JButton();
        floralRBN = new javax.swing.JRadioButton();
        simpleRBN = new javax.swing.JRadioButton();
        beachRBN = new javax.swing.JRadioButton();
        royalRBN = new javax.swing.JRadioButton();
        valentineRBN = new javax.swing.JRadioButton();
        backBTN = new javax.swing.JButton();
        traditionalRBN = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(910, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ravie", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("S E L E C T");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 140, 40);

        jLabel4.setFont(new java.awt.Font("Ravie", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("YOUR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 50, 70, 25);

        jLabel6.setFont(new java.awt.Font("Ravie", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("p ri c e:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 210, 100, 25);

        jLabel5.setFont(new java.awt.Font("Ravie", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("w a y :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 80, 90, 25);

        chargesTF.setEditable(false);
        chargesTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(chargesTF);
        chargesTF.setBounds(150, 210, 90, 23);

        nextBTN.setBackground(new java.awt.Color(0, 0, 0));
        nextBTN.setFont(new java.awt.Font("Brush Script MT", 1, 14)); // NOI18N
        nextBTN.setText("N E X T > >");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });
        getContentPane().add(nextBTN);
        nextBTN.setBounds(90, 270, 120, 27);

        THEME.add(floralRBN);
        floralRBN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        floralRBN.setForeground(new java.awt.Color(0, 0, 255));
        floralRBN.setText("F L O R A L ");
        floralRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floralRBNActionPerformed(evt);
            }
        });
        getContentPane().add(floralRBN);
        floralRBN.setBounds(530, 150, 120, 25);

        THEME.add(simpleRBN);
        simpleRBN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        simpleRBN.setForeground(new java.awt.Color(0, 0, 255));
        simpleRBN.setText(" S I M P L E");
        simpleRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleRBNActionPerformed(evt);
            }
        });
        getContentPane().add(simpleRBN);
        simpleRBN.setBounds(320, 150, 130, 25);

        THEME.add(beachRBN);
        beachRBN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        beachRBN.setForeground(java.awt.Color.blue);
        beachRBN.setText("B E A C H");
        beachRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beachRBNActionPerformed(evt);
            }
        });
        getContentPane().add(beachRBN);
        beachRBN.setBounds(740, 150, 110, 25);

        THEME.add(royalRBN);
        royalRBN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        royalRBN.setForeground(new java.awt.Color(0, 0, 255));
        royalRBN.setText("R O Y A L");
        royalRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                royalRBNActionPerformed(evt);
            }
        });
        getContentPane().add(royalRBN);
        royalRBN.setBounds(330, 310, 100, 25);

        THEME.add(valentineRBN);
        valentineRBN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valentineRBN.setForeground(new java.awt.Color(0, 0, 255));
        valentineRBN.setText("V A L E N T I N E");
        valentineRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valentineRBNActionPerformed(evt);
            }
        });
        getContentPane().add(valentineRBN);
        valentineRBN.setBounds(520, 320, 150, 25);

        backBTN.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        backBTN.setText("<<B A CK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        getContentPane().add(backBTN);
        backBTN.setBounds(90, 320, 120, 27);

        THEME.add(traditionalRBN);
        traditionalRBN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        traditionalRBN.setForeground(new java.awt.Color(0, 0, 255));
        traditionalRBN.setText("T R A D I T I O N A L");
        traditionalRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traditionalRBNActionPerformed(evt);
            }
        });
        getContentPane().add(traditionalRBN);
        traditionalRBN.setBounds(700, 320, 190, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/christian_engagement.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(880, 371));
        jLabel2.setMinimumSize(new java.awt.Dimension(880, 371));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 370);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-917)/2, (screenSize.height-402)/2, 917, 402);
    }// </editor-fold>//GEN-END:initComponents

    private void simpleRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleRBNActionPerformed
        String theme = "simple";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                chargesTF.setText(rs.getInt("theme_charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_simpleRBNActionPerformed

    private void floralRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floralRBNActionPerformed
        String theme = "floral";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                chargesTF.setText(rs.getInt("theme_charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_floralRBNActionPerformed

    private void beachRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beachRBNActionPerformed
        String theme = "beach";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                chargesTF.setText(rs.getInt("theme_charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_beachRBNActionPerformed

    private void royalRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_royalRBNActionPerformed
        String theme = "royal";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                chargesTF.setText(rs.getInt("theme_charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_royalRBNActionPerformed

    private void valentineRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valentineRBNActionPerformed
        String theme = "valentine";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                chargesTF.setText(rs.getInt("theme_charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_valentineRBNActionPerformed

    private void traditionalRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traditionalRBNActionPerformed
        String theme = "traditional";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                chargesTF.setText(rs.getInt("theme_charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_traditionalRBNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        new religion().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        new Function_Hall().setVisible(true);
        dispose();
    }//GEN-LAST:event_nextBTNActionPerformed

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
            java.util.logging.Logger.getLogger(christian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(christian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(christian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(christian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new christian().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup THEME;
    private javax.swing.JButton backBTN;
    private javax.swing.JRadioButton beachRBN;
    private javax.swing.JTextField chargesTF;
    private javax.swing.JRadioButton floralRBN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton nextBTN;
    private javax.swing.JRadioButton royalRBN;
    private javax.swing.JRadioButton simpleRBN;
    private javax.swing.JRadioButton traditionalRBN;
    private javax.swing.JRadioButton valentineRBN;
    // End of variables declaration//GEN-END:variables
}