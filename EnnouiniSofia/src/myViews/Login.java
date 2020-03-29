package myViews;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
	
	
    Connection cnx = null;
    ResultSet Rs = null;
    PreparedStatement Ps = null;

    public Login() {
        initComponents();
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        p = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Password : ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 170, 130, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("BANQUE ANNECIENNE INTRANET");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 40, 420, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("Username : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 130, 20);

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser);
        txtuser.setBounds(160, 110, 170, 30);

        p.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(p);
        p.setBounds(180, 190, 150, 0);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); 
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Close");
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 240, 120, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); 
        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 240, 110, 50);

        txtpass.setText("jPasswordField1");
        jPanel1.add(txtpass);
        txtpass.setBounds(160, 170, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 460);

        pack();
    }                       

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        try 
        {

            
 String Sql = "Select * from tablelogin WHERE username ='" +txtuser.getText()
         +"'and password='"+txtpass.getText()+"'";
        Ps = cnx.prepareStatement(Sql);
        Rs = Ps.executeQuery();
        if (Rs.next()){
            JOptionPane.showMessageDialog(null, "Correct");
            PagePrincipale s = new PagePrincipale();
            s.setVisible(true);
            
            }else {
            JOptionPane.showMessageDialog(null, "Invalid username or password" );
            p.setText ("Invalid username or password"); 
        }        
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    
    }                                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) { 
        cnx = Connect.ConnectDB(); 
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

                 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
               
}
