
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Update.java
 *
 * Created on May 17, 2017, 11:01:00 AM
 */

/**
 *
 * @author Kunal Shah
 */
public class Update extends javax.swing.JFrame {

    /** Creates new form Update */
    public Update() {
        initComponents();uid_LB.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uid_LB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select What You Want To Update");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 540, 50));

        cb1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        cb1.setForeground(new java.awt.Color(0, 0, 153));
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select What You Want To Update", "First Name", "Last Name", "Email", "Phone", "Password" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/irctc.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/partner.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1350, 70));

        back_btn.setBackground(new java.awt.Color(255, 0, 0));
        back_btn.setFont(new java.awt.Font("Times New Roman", 1, 24));
        back_btn.setText("Back");
        back_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konkanrailway.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1140, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konkanrailway.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 1120, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konkanrailway.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 70, 160, 500));

        uid_LB.setText("jLabel7");
        getContentPane().add(uid_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
if (cb1.getSelectedIndex()==1)
{
if(JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Update" + " " +cb1.getSelectedItem(),"Confirm",JOptionPane.YES_NO_OPTION )==JOptionPane.YES_OPTION)
{ this.setVisible(true);
new firstname_update().setVisible(true);
    }
 else { this.setVisible(true);
new firstname_update().setVisible(false);
    }
}
 else if (cb1.getSelectedIndex()==2)
{
if(JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Update" + " " +cb1.getSelectedItem(),"Confirm",JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION)
{ this.setVisible(true);
new lastname_update().setVisible(true);
    }
 else
     { this.setVisible(true);
new lastname_update().setVisible(false);
    }
   }
else if (cb1.getSelectedIndex()==3)
{

if(JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Update" + " " +cb1.getSelectedItem(),"Confirm",JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION)
    {this.setVisible(true);
new email_update().setVisible(true);}
 else
     {this.setVisible(true);
new email_update().setVisible(false);}
}
else if (cb1.getSelectedIndex()==4)
{

if(JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Update" + " " +cb1.getSelectedItem(),"Confirm",JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION)
{
    this.setVisible(true);
new phone_update().setVisible(true);}
 else
     {
    this.setVisible(true);
new phone_update().setVisible(false);}
}
else if (cb1.getSelectedIndex()==5)
{

if(JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Update" + " " +cb1.getSelectedItem(),"Confirm",JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION)
{
    this.setVisible(true);
new pass_update().setVisible(true);}
 else {
    this.setVisible(true);
new pass_update().setVisible(false);}
}
 else
 {
    JOptionPane.showMessageDialog(this,"Please Select An Option " );
 } // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
home h =new home();
home.TF_UID.setText(this.uid_LB.getText());
h.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_back_btnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JComboBox cb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel uid_LB;
    // End of variables declaration//GEN-END:variables

}
