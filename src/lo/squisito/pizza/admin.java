/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo.squisito.pizza;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Parth
 */
public class admin extends javax.swing.JFrame {
    String s1=null;
    String s2=null;
    String s3=null;
    String s4=null;
    String s5=null;
    String s6=null;
    String s7=null;
    /**
     * Creates new form admin
     */
    public admin() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        retrievebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        box2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        in = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        tf7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(735, 537));

        jPanel1.setBackground(new java.awt.Color(119, 160, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "E-mail", "First Name", "Last Name", "Phone no.", "Address Line 1", "Address Line 2", "Password"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 660, 190));

        retrievebtn.setText("Retrieve All");
        retrievebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievebtnActionPerformed(evt);
            }
        });
        jPanel1.add(retrievebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 46, 57));
        jLabel1.setText("Welcome to Staff Portal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\P.C. PAVAR\\Desktop\\IP Proj\\icons\\icons8-siren-50.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        jButton4.setText("Undo Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, -1));
        jPanel1.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 80, -1));
        jPanel1.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 70, -1));
        jPanel1.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 100, -1));
        jPanel1.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 110, -1));
        jPanel1.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 70, -1));

        jLabel3.setText("(Keep the entry selected while performing these functions)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        box1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "E-mail", "First Name", "Last Name", "Phone Number", "Address Line 1", "Address Line 2", "Password" }));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        jPanel1.add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Search for");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 70, 30));

        box2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=", "!=" }));
        jPanel1.add(box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jButton1.setText("Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 80, -1));

        jButton5.setText("Clear filter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jLabel6.setText("Customer Records");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Search in");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 30));
        jPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, -1));

        jButton6.setText("LogOut");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));
        jPanel1.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("For order details");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 100, 20));

        jButton8.setText("Click Here");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retrievebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievebtnActionPerformed
DefaultTableModel model = (DefaultTableModel) table.getModel();
model.setRowCount(0);
try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lo_squisito", "root", "tiger");
    Statement stmt=con.createStatement();
    String query="Select * from customer;";
    ResultSet rs=stmt.executeQuery(query);
    while (rs.next()) {
        String email=rs.getString("cemail");
        String name=rs.getString("cname");
        String lname=rs.getString("clastname");
        String phoneno=rs.getString("cphoneno");
        String al1=rs.getString("cAddressline1");
        String al2=rs.getString("cAddressline2");
        String pass=rs.getString("password");
        model.addRow(new Object[] {email, name, lname, phoneno, al1, al2, pass});
    }
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_retrievebtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
DefaultTableModel model = (DefaultTableModel) table.getModel();
int a=table.getSelectedRow();
String is=(String) model.getValueAt(a, 0);
try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lo_squisito", "root", "tiger");
    Statement stmt=con.createStatement();
    String query="delete from customer where cemail='" +is+ "';";
    int rs=stmt.executeUpdate(query);
    retrievebtn.doClick();
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Click on an entry to delete first");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
DefaultTableModel model = (DefaultTableModel) table.getModel();
int a=table.getSelectedRow();
try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lo_squisito", "root", "tiger");
    Statement stmt=con.createStatement();
    String query="insert into customer values ('" +s1+ "', '" +s2+ "', '" +s3+ "', " +s4+ ", '" +s5+ "', '" +s6+ "', '" +s7+ "');";
    int rs=stmt.executeUpdate(query);
    retrievebtn.doClick();
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, "failed");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
DefaultTableModel model = (DefaultTableModel) table.getModel();
int a=table.getSelectedRow();
String is=(String) model.getValueAt(a, 0);
try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lo_squisito", "root", "tiger");
    Statement stmt=con.createStatement();
    String query="Select * from customer where cemail='"+is+"';"; // single quotes save the day!
    ResultSet rs=stmt.executeQuery(query);
    while (rs.next()) {
        String email=rs.getString("cemail");
        String name=rs.getString("cname");
        String lname=rs.getString("clastname");
        String phoneno=rs.getString("cphoneno");
        String al1=rs.getString("cAddressline1");
        String al2=rs.getString("cAddressline2");
        String pass=rs.getString("password");
        tf1.setText(email);
        tf2.setText(name);
        tf3.setText(lname);
        tf4.setText(phoneno);
        tf5.setText(al1);
        tf6.setText(al2);
        tf7.setText(pass);
        s1=email; //this for undo button
        s2=name;
        s3=lname;
        s4=phoneno;
        s5=al1;
        s6=al2;
        s7=pass;
    }
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, "error");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
DefaultTableModel model = (DefaultTableModel) table.getModel();
int a=table.getSelectedRow();
String is=(String) model.getValueAt(a, 0);
try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lo_squisito", "root", "tiger");
    Statement stmt=con.createStatement();
    String query="update customer set cemail='" +tf1.getText()+ "', cname='" +tf2.getText()+ "', clastname='" +tf3.getText()+ "', cphoneno='" +tf4.getText()+ "', cAddressline1='" +tf5.getText()+ "', cAddressline2='" +tf6.getText()+ "', password='" +tf7.getText()+ "' where cemail='" +is+ "';";
    int rs=stmt.executeUpdate(query);
    retrievebtn.doClick();
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Click on an entry to update first");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        retrievebtn.doClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DefaultTableModel model = (DefaultTableModel) table.getModel();
model.setRowCount(0);
String cb1= (String) box1.getSelectedItem();
String cb2= (String) box2.getSelectedItem();
String k="";
switch (cb1) {
    case "E-mail": k="cemail"; break;
    case "First Name": k="cname"; break;
    case "Last Name": k="clastname"; break;
    case "Phone Number": k="cphoneno"; break;
    case "Address Line 1": k="cAddressline1"; break;
    case "Address Line 2": k="cAddressline2"; break;
    case "Password": k="password"; break;
}
try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lo_squisito", "root", "tiger");
    Statement stmt=con.createStatement();
    String query="select * from customer where " +k+cb2+ "'" +in.getText()+ "';";
    ResultSet rs=stmt.executeQuery(query);
    while (rs.next()) {
        String email=rs.getString("cemail");
        String name=rs.getString("cname");
        String lname=rs.getString("clastname");
        String phoneno=rs.getString("cphoneno");
        String al1=rs.getString("cAddressline1");
        String al2=rs.getString("cAddressline2");
        String pass=rs.getString("password");
        model.addRow(new Object[] {email, name, lname, phoneno, al1, al2, pass});
    }
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, "error");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
alt b=new alt();
b.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
tf1.setText("");
tf2.setText("");
tf3.setText("");
tf4.setText("");
tf5.setText("");
tf6.setText("");
tf7.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
order ob1=new order();
ob1.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box1;
    private javax.swing.JComboBox box2;
    private javax.swing.JTextField in;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton retrievebtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
}
