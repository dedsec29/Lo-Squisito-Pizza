/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo.squisito.pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Parth
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        in5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        in1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        in3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        in4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        in2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        in6 = new javax.swing.JTextField();
        pf3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("* fields are compulsory to fill");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 220, 40));
        jPanel1.add(in5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 110, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Password*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, 40));
        jPanel1.add(in1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 130, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 170, 40));
        jPanel1.add(in3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Phone No.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 170, 40));
        jPanel1.add(in4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("SIGN UP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 280, 40));
        jPanel1.add(in2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Address Line 1*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 255));
        jLabel9.setText("Address Line 2*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, 40));
        jPanel1.add(in6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 110, -1));

        pf3.setText("jPasswordField1");
        pf3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf3FocusGained(evt);
            }
        });
        jPanel1.add(pf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 110, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 140, 60));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("E-mail*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("First Name*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, 40));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\P.C. PAVAR\\Desktop\\IP Proj\\resized\\baked-beer-cheese-724216.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 726, 551));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pf3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf3FocusGained
pf3.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_pf3FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String mail=in1.getText();
String name=in2.getText();
String lastname=in3.getText();
String phone=in4.getText();
String add1=in5.getText();
String add2=in6.getText();
String pw=new String(pf3.getPassword());
String k1=""; String k2="";
if (lastname.equals(""))
    k1="null";
else
    k1="'"+lastname+"'";
if (phone.equals(""))
    k2="null";
else
    k2="'"+phone+"'";
int l=mail.length();
int f=0;
for (int i=0;i<l;i++) { 
    char c=mail.charAt(i);
    if (i==0) {
        if (c=='@')
          JOptionPane.showMessageDialog(null, "Please enter a valid e-mail id");
    }
    if (c=='@')
        f=f+1;
}
if (f!=1)
    JOptionPane.showMessageDialog(null, "Please enter a valid e-mail id");
else {
    if ((mail.equals("")) || (name.equals("")) || (add1.equals("")) || (add2.equals("")) || (pw.equals("")))
        JOptionPane.showMessageDialog(null, "Please fill all of the fields marked *");
    else {
     try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lo_squisito", "root", "tiger");
    Statement stmt=con.createStatement();
    String query="insert into customer values ('" +mail+ "', '" +name+ "', " +k1+ ", " +k2+ ", '" +add1+ "', '" +add2+ "', '" +pw+ "');";
    int rs=stmt.executeUpdate(query);
    JOptionPane.showMessageDialog(null, "Account created! Please login now with your details");
    alt b=new alt();
    b.setVisible(true);
    this.dispose();
     }
     catch (Exception e) {
         JOptionPane.showMessageDialog(null, "E-mail id is already registered or phone number entered is invalid");
     }
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int dialog_result= JOptionPane.showConfirmDialog(null, "Cancel and go to the main menu?");
        if (dialog_result==0) {
            alt b=new alt();
            b.setVisible(true);
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField in1;
    private javax.swing.JTextField in2;
    private javax.swing.JTextField in3;
    private javax.swing.JTextField in4;
    private javax.swing.JTextField in5;
    private javax.swing.JTextField in6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pf3;
    // End of variables declaration//GEN-END:variables
}
