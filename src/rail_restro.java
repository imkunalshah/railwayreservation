
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * rail_restro.java
 *
 * Created on Jun 20, 2017, 9:02:01 PM
 */

/**
 *
 * @author Kunal Shah
 */
public class rail_restro extends javax.swing.JFrame {

    /** Creates new form rail_restro */
    public rail_restro() {
        initComponents();uid_LB.setVisible(false);jLabel4.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Des_LB = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        uid_LB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ecatering7.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 600, 1090, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ecatering4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 100));

        Des_LB.setFont(new java.awt.Font("Times New Roman", 1, 18));
        getContentPane().add(Des_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 570, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ecatering6.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 390, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ecatering6.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 400, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ecatering6.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "VEG DELUX THALI ( PANEER BUTTER MASALA (100G),MIX VEG CURRY(100G),DAL FRY (100G),BUTTER CHAPATI(3 PCS),JEERA RICE(200G),VEG RAITA(50G),SWEET(1 PC),PAPAD,SALAD,PICKLE )", "VEG STANDARD THALI ( PANEER BUTTER MASALA (100G),SEASONAL VEG(100G),DAL FRY/DAL TADKA (100G),CHAPATI (3 PCS),JEERA RICE(200G),SWEET, SALAD & PICKLE )", "JAIN DELUX THALI ( PANEER BUTTER MASALA(100G),MIX VEG CURRY(100G),DAL, BUTTER CHAPATI(3 PCS),JEERA RICE(200G),VEG RAITA(50G),SWEET(1 PC),PAPAD,SALAD,PICKLE )", "ROTI & SEASONAL VEG COMBO ( BUTTER ROTI(3 PCS) WITH SEASONAL VEG(125G) )", "PANEER KADHAI COMBO ( BUTTER ROTI(3 PCS) WITH PANEER KADHAI(125G) )", "VEG MANCHURIAN COMBO ( VEG MANCHURIAN(125G) SERVED WITH VEG FRIED RICE(150G) )", "PANEER CHILLY COMBO ( PANEER CHILLY (125)G SERVED WITH VEG HAKKA NOODLES )", "ALOO PARATHA COMBO ( ALOO PARATHA(2 PCS) WITH WITH CURD(60G) )", "CHHOLE BHATURE ", "PANEER BUTTER MASALA (250 gms)", "MATAR PANEER (250 gms)", "PANEER KADAHI (250 gms)", "SHAHI PANEER (250 gms)", "MIX VEG CURRY (250 gms)", "MALAI KOFTA (250 gms)", "ALOO DUM (250 gms)", "ALOO JEERA (250 gms)", "MUSHROOM MASALA (250 gms)", "DAL FRY / DAL TADKA (250 gms)", "VEG BIRYANI WITH RAITA (300 gms)", "VEG PULAO (300 gms)", "PLAIN RICE (300 gms)", "JEERA RICE (300 gms)", "CURD RICE (300 gms)", "PLAIN ROTI", "BUTTER ROTI", "PLAIN NAAN", "BUTTER NAAN", "LACHHA PARATHA", "VEG FRIED RICE (300 gms)", "VEG MANCHURIAN (250 gms) ", "VEG HAKKA NOODLES (250 gms)", "GULABJAMUN", "BUTTER MILK", "PLAIN CURD", "VEG RAITA", "FRENCH FRIES", "ROASTED PAPAD", "ONION SALAD", "GREEN SALAD", "MINERAL WATER (500 ml)", "MINERAL WATER (1 ltr)", "VEG MINI THALI (CHAPATI(3 PCS), SEASONAL VEG(100G),DAL FRY/DAL TADKA(100 G),PLAIN RICE(200 G),SALAD &PICKLE )", "VEG MAHARAJA THALI (PANEER KADHAI(100G),MIX VEG (100 G),DAL MAKHANI(100G),BUTTER CHAPATI(3 PCS),VEG PULAO(200G),VEG RAITA(50G),SWEET(1PC),PAPAD,SALAD,PICKLE )", " ", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 840, 300));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton2.setText("Calculate Total");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 100, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton3.setText("Pay");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 100, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton1.setText("Browse Other Vendors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 210, 50));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("[Ctrl+Click For Multiple Items]");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 190, 20));

        uid_LB.setText("jLabel3");
        jPanel1.add(uid_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Rs");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 20));

        jLabel4.setText("China Hut");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 840, 440));

        jButton4.setBackground(new java.awt.Color(51, 255, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton4.setText("Browse Other Stations");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 240, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new ecater().setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double total =0;
        String qty = null;
        String size;
        if(jList1.isSelectedIndex(0)==true){
            total+= 185.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG DELUX THALI");
        }
        if(jList1.isSelectedIndex(1)==true){
            total+= 165.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG STANDARD THALI");}
        if(jList1.isSelectedIndex(2)==true){
            total+=195.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"JAIN DELUX THALI");}
        if(jList1.isSelectedIndex(3)==true){
            total+=105.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"ROTI & SEASONAL VEG COMBO");}
        if(jList1.isSelectedIndex(4)==true){
            total+=125.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PANEER KADHAI COMBO ");}
        if(jList1.isSelectedIndex(5)==true){
            total+=130.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG MANCHURIAN COMBO");
        }
        if(jList1.isSelectedIndex(6)==true){
            total+=135.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PANEER CHILLY COMBO");}
        if(jList1.isSelectedIndex(7)==true){
            total+=100.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"ALOO PARATHA COMBO");}
        if(jList1.isSelectedIndex(8)==true){
            total+= 95.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"CHHOLE BHATURE");}
        if(jList1.isSelectedIndex(9)==true){
            total+=175.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PANEER BUTTER MASALA");}
        if(jList1.isSelectedIndex(10)==true){
            total+=145.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"MATAR PANEER");}
        if(jList1.isSelectedIndex(11)==true){
            total+=185.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PANEER KADAHI");}
        if(jList1.isSelectedIndex(12)==true){
            total+=165.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"SHAHI PANEER");}
        if(jList1.isSelectedIndex(13)==true){
            total+=135.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"MIX VEG CURRY");}
        if(jList1.isSelectedIndex(14)==true){
            total+=145.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"MALAI KOFTA");}
        if(jList1.isSelectedIndex(15)==true){
            total+=125.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"ALOO DUM");}
        if(jList1.isSelectedIndex(16)==true){
            total+=110.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"ALOO JEERA");}
        if(jList1.isSelectedIndex(17)==true){
            total+=165.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"MUSHROOM MASALA");}
        if(jList1.isSelectedIndex(18)==true){
            total+=95.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"DAL FRY / DAL TADKA");}
        if(jList1.isSelectedIndex(19)==true){
            total+=145.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG BIRYANI WITH RAITA");}
        if(jList1.isSelectedIndex(20)==true){
            total+=125.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG PULAO");}
             if(jList1.isSelectedIndex(21)==true){
            total+=85.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PLAIN RICE");}
             if(jList1.isSelectedIndex(22)==true){
            total+=95.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"JEERA RICE ");}
             if(jList1.isSelectedIndex(23)==true){
            total+=110.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"CURD RICE ");}
             if(jList1.isSelectedIndex(24)==true){
            total+=13.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PLAIN ROTI ");}
        if(jList1.isSelectedIndex(25)==true){
            total+=18.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"BUTTER ROTI");}
        if(jList1.isSelectedIndex(26)==true){
            total+=35.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PLAIN NAAN");}
         if(jList1.isSelectedIndex(27)==true){
            total+=40.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"BUTTER NAAN");}
         if(jList1.isSelectedIndex(28)==true){
            total+= 35.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"LACHHA PARATHA");}
         if(jList1.isSelectedIndex(29)==true){
            total+=135.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG FRIED RICE ");}
         if(jList1.isSelectedIndex(30)==true){
            total+=145.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG MANCHURIAN ");}
         if(jList1.isSelectedIndex(31)==true){
            total+=135.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG HAKKA NOODLES");}
         if(jList1.isSelectedIndex(32)==true){
            total+= 30.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"GULABJAMUN");}
        if(jList1.isSelectedIndex(33)==true){
            total+=  35.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"BUTTER MILK");}
        if(jList1.isSelectedIndex(34)==true){
            total+= 45.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"PLAIN CURD ");}
        if(jList1.isSelectedIndex(35)==true){
            total+= 65.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG RAITA");}
        if(jList1.isSelectedIndex(36)==true){
            total+=  70.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"FRENCH FRIES");}
        if(jList1.isSelectedIndex(37)==true){
            total+= 22.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"ROASTED PAPAD");}
        if(jList1.isSelectedIndex(38)==true){
            total+= 35.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"ONION SALAD");}
        if(jList1.isSelectedIndex(39)==true){
            total+=  65.0 ;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"GREEN SALAD ");}
        if(jList1.isSelectedIndex(40)==true){
            total+=  20.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"MINERAL WATER - 500 Ml");}
        if(jList1.isSelectedIndex(41)==true){
            total+= 30;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"MINERAL WATER - 1 Ltr.");}
        if(jList1.isSelectedIndex(42)==true){
            total+= 120.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG MINI THALI");}
        if(jList1.isSelectedIndex(43)==true){
            total+=  210.0;
            qty = JOptionPane.showInputDialog(this,"Select Quantity For" + " "+"VEG MAHARAJA THALI");}

        if(qty.equals("1"))
{jTextField1.setText(" " +total);}
 else if(qty.equals("2")){jTextField1.setText(" " +2*total);}
 else if(qty.equals("3"))
     {jTextField1.setText(" " +3*total);}
else if(qty.equals("4"))
     {jTextField1.setText(" " +4*total);}
else if(qty.equals("5"))
     {jTextField1.setText(" " +5*total);}
        else if(qty.equals(""))
     {}
 else{JOptionPane.showMessageDialog(this, "Maximum Quantity Per Item is 5");}
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String total=jTextField1.getText();
String uid=uid_LB.getText();
String restau=jLabel4.getText();
try{
    Class.forName("java.sql.DriverManager");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","admin");

String q = " Insert into ecatering (U_Id,Restaurant,Total) values (?,?,?)";
PreparedStatement stmt = con.prepareStatement(q);
if(total.equals(""))
{
stmt.setString(1, null);
 stmt.setString(2,null);
 stmt.setString(3,null);
 JOptionPane.showMessageDialog(null, "Error - Please check whether you have selected the meal or not !!");
}
 else{
 stmt.setString(1, uid);
 stmt.setString(2,restau);
 stmt.setString(3,total);
 JOptionPane.showMessageDialog(null, "Meal Booked Sucessfully");
 stmt.execute();
 stmt.close();
 this.setVisible(false);
      new ecater().setVisible(true);
 }
}
catch(Exception e)
{JOptionPane.showMessageDialog(null, e.getMessage());}
      // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rail_restro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Des_LB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JLabel uid_LB;
    // End of variables declaration//GEN-END:variables

}
