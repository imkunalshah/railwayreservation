import java.sql.* ;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/*
 * phone_update.java
 *
 * Created on May 17, 2017, 11:35:28 AM
 */

/**
 *
 * @author Kunal Shah
 */
public class phone_update extends javax.swing.JFrame {

    /** Creates new form phone_update */
    public phone_update() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update_btn = new javax.swing.JButton();
        cpn_txt = new javax.swing.JTextField();
        npn_txt = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPDATE PHONE NUMBER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Current Phone");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("New Phone");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 117, -1, -1));

        update_btn.setBackground(new java.awt.Color(0, 255, 51));
        update_btn.setFont(new java.awt.Font("Times New Roman", 1, 18));
        update_btn.setText("UPDATE");
        update_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        cpn_txt.setFont(new java.awt.Font("Times New Roman", 0, 14));
        cpn_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpn_txtActionPerformed(evt);
            }
        });
        jPanel1.add(cpn_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 64, 139, -1));

        npn_txt.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jPanel1.add(npn_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 114, 139, -1));

        back_btn.setBackground(new java.awt.Color(255, 0, 0));
        back_btn.setFont(new java.awt.Font("Times New Roman", 1, 18));
        back_btn.setText("Back");
        back_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 400, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cris.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 102, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 709, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2_edited.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sQ05dJt.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpn_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpn_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpn_txtActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
     String cph = cpn_txt.getText();
String nph =npn_txt.getText();
        try{
        Class.forName("java.sql.DriverManager");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","admin");
        Statement stmt = con.createStatement();
        String q ="Update accounts set Phone_No = '"+nph+"'  where Phone_No = '"+ cph +"';";
       stmt.executeUpdate(q);
JOptionPane.showMessageDialog(this,"Phone Number updated sucessfully");
    this.setVisible(false);
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(this, e.getMessage());
        }

    
    // TODO add your handling code here:
    }//GEN-LAST:event_update_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
}//GEN-LAST:event_back_btnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phone_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField cpn_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField npn_txt;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables

}