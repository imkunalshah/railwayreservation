
import java.awt.Color;
import java.sql.* ;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Random;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on Apr 22, 2017, 10:48:12 PM
 */

/**
 *
 * @author Kunal Shah
 */
public class Main extends javax.swing.JFrame {

    /** Creates new form Main */
    public Main() {
        initComponents();
         getContentPane().setBackground(new Color(51,0,204));
        String contain="0123456789ABCDEFGHIJKLMONPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rnd= new Random();
        StringBuilder sb = new StringBuilder(8);
        for (int i=0;i<8;i++) {
            sb.append(contain.charAt(rnd.nextInt(contain.length())));}
        String random =sb.toString();
        Captcha_LB.setText(random);
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
        jLabel2 = new javax.swing.JLabel();
        UIDTF = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        showpass_cb = new javax.swing.JCheckBox();
        viewpass_lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        Captcha_LB = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        captcha_txt = new javax.swing.JTextField();
        forgotpass_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        captcha_btn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        captcha_lb = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER ID");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 110, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 150, 30));

        UIDTF.setFont(new java.awt.Font("Tahoma", 0, 24));
        UIDTF.setToolTipText("");
        getContentPane().add(UIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 145, 160, -1));

        password.setFont(new java.awt.Font("Tahoma", 0, 24));
        password.setToolTipText("");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 160, 30));

        btn_login.setFont(new java.awt.Font("Times New Roman", 1, 24));
        btn_login.setText("LOGIN");
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 3, true));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 110, 30));

        lb.setBackground(new java.awt.Color(51, 51, 51));
        lb.setFont(new java.awt.Font("Tahoma", 3, 24));
        lb.setForeground(new java.awt.Color(255, 255, 255));
        lb.setText("Don't Have Account ??? Sign Up...");
        lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        getContentPane().add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 420, -1));

        btn_signup.setFont(new java.awt.Font("Times New Roman", 1, 24));
        btn_signup.setText("SIGN UP");
        btn_signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 130, 30));

        showpass_cb.setFont(new java.awt.Font("Tahoma", 1, 14));
        showpass_cb.setText("Show Password");
        showpass_cb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        showpass_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpass_cbActionPerformed(evt);
            }
        });
        getContentPane().add(showpass_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 140, -1));

        viewpass_lb.setFont(new java.awt.Font("Times New Roman", 1, 14));
        viewpass_lb.setForeground(new java.awt.Color(255, 255, 255));
        viewpass_lb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(viewpass_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 160, 20));

        lb1.setFont(new java.awt.Font("Times New Roman", 3, 24));
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Captcha letters are case sensitive and to be entered as shown only ");
        lb1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 720, -1));

        Captcha_LB.setFont(new java.awt.Font("Tahoma", 1, 36));
        Captcha_LB.setForeground(new java.awt.Color(255, 255, 0));
        Captcha_LB.setText("FWGRES8A");
        Captcha_LB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(Captcha_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 260, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CAPTCHA");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 140, 30));

        captcha_txt.setFont(new java.awt.Font("Tahoma", 0, 24));
        getContentPane().add(captcha_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 160, 30));

        forgotpass_btn.setFont(new java.awt.Font("Times New Roman", 1, 24));
        forgotpass_btn.setText("Forgot Password");
        forgotpass_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 3, true));
        forgotpass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpass_btnActionPerformed(evt);
            }
        });
        getContentPane().add(forgotpass_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/partner.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1340, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/irctc.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 70, -1, -1));

        captcha_btn.setBackground(new java.awt.Color(255, 255, 255));
        captcha_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ref.jpg"))); // NOI18N
        captcha_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captcha_btnActionPerformed(evt);
            }
        });
        getContentPane().add(captcha_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 20, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konkanrailway.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1288, 70, 1130, 520));

        captcha_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/recaptcha-edited.jpg"))); // NOI18N
        getContentPane().add(captcha_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 100, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konkanrailway.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 520));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konkanrailway.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 1120, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

String  uid = UIDTF.getText();

String pass=password.getText();

String password=null;

String user=null;
       

try

{

    Class.forName("java.sql.DriverManager");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","admin");

Statement stmt=con.createStatement();

String q = "SELECT Password,U_Id from accounts where U_Id='"+uid+"';";

ResultSet rs = stmt.executeQuery(q);


if(rs.next())

{password = rs.getString(1);
user = rs.getString(2);}

if(pass.equals(password) && uid.equals(user)&& captcha_txt.getText().equals(Captcha_LB.getText()))
{JOptionPane.showMessageDialog(null, uid + " Logged in Sucessfully");
    this.setVisible(false);
 home b1 = new home();
home.TF_UID.setText(this.UIDTF.getText());
b1.setVisible(true);

}
else if (pass!=(password) || uid!=(user) || captcha_txt.getText()!=(Captcha_LB.getText()))
{
String contain="0123456789ABCDEFGHIJKLMONPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rnd= new Random();
        StringBuilder sb = new StringBuilder(8);
        for (int i=0;i<8;i++) {
            sb.append(contain.charAt(rnd.nextInt(contain.length())));}
        String random =sb.toString();
        Captcha_LB.setText(random);
        captcha_txt.setText("");
        JOptionPane.showMessageDialog(null,"Please Check Your User Id And Password Or CAPTCHA ");
}

}
 catch (Exception e)
         {JOptionPane.showMessageDialog(null,e.getMessage());}

// TODO add your handling code here:
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
       this.setVisible(false);
       new signup().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_signupActionPerformed

    private void showpass_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpass_cbActionPerformed
if(showpass_cb.isSelected()){
     String pass =new String(password.getPassword());
     viewpass_lb.setVisible(true);
     viewpass_lb.setText(pass);
}else {
viewpass_lb.setVisible(false);
} // TODO add your handling code here:
    }//GEN-LAST:event_showpass_cbActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
       // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyPressed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void forgotpass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpass_btnActionPerformed
new forgotpass().setVisible(true);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotpass_btnActionPerformed

    private void captcha_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captcha_btnActionPerformed
        String contain="0123456789ABCDEFGHIJKLMONPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rnd= new Random();
        StringBuilder sb = new StringBuilder(8);
        for (int i=0;i<8;i++) {
            sb.append(contain.charAt(rnd.nextInt(contain.length())));}
        String random =sb.toString();
        Captcha_LB.setText(random);// TODO add your handling code here:
}//GEN-LAST:event_captcha_btnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Captcha_LB;
    private javax.swing.JTextField UIDTF;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JButton captcha_btn;
    private javax.swing.JLabel captcha_lb;
    private javax.swing.JTextField captcha_txt;
    private javax.swing.JButton forgotpass_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showpass_cb;
    private javax.swing.JLabel viewpass_lb;
    // End of variables declaration//GEN-END:variables

   {

    }

}
