package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class signup extends JFrame {
ImageIcon unameimg,passimg,backimg;
Image unimg,pimg,bimg;

private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField name;
private JTextField lname,email,user;
private JTextField pass;
ImageIcon img, img2,signupimg,loginimg,iconimg;
Image img1, img3,signimg,logimg,iimg;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
signup frame = new signup();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public signup() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(-10, -5, 3000, 3000);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);
unameimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\image1.png");
unimg=unameimg.getImage();


JLabel passlbl = new JLabel("New label");
passimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\images.png");
pimg=passimg.getImage();

JLabel lblNewLabel_2 = new JLabel("First Name: ");
lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
lblNewLabel_2.setBounds(362, 330, 100, 20);
contentPane.add(lblNewLabel_2);

contentPane.add(passlbl);
JLabel lblNewLabel_3 = new JLabel("Last Name: ");
lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
lblNewLabel_3.setBounds(362, 390, 100, 20);
contentPane.add(lblNewLabel_3);
JSeparator separator = new JSeparator();
separator.setBounds(341, 280, 483, 2);
JLabel lblNewLabel_4 = new JLabel("Email: ");
lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
lblNewLabel_4.setBounds(362, 440, 100, 20);
contentPane.add(lblNewLabel_4);

contentPane.add(passlbl);
JLabel lblNewLabel_5 = new JLabel("User Name: ");
lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
lblNewLabel_5.setBounds(362, 490, 100, 20);
contentPane.add(lblNewLabel_5);
JLabel lblNewLabel_6 = new JLabel("Password : ");
lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
lblNewLabel_6.setBounds(362, 550, 100, 20);
contentPane.add(lblNewLabel_6);


separator.setBounds(341, 280, 483, 2);
//JSeparator separator = new JSeparator();
separator.setBounds(341, 280, 483, 2);
contentPane.add(separator);

JLabel lb = new JLabel("SIGNUP");
lb.setForeground(new Color(0, 0, 255));
lb.setFont(new Font("Informal Roman", Font.BOLD, 60));
lb.setBounds(487, 200, 223, 66);
contentPane.add(lb);

JButton signupbtn = new JButton("SUBMIT");
signupbtn.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

if(e.getSource()==signupbtn ) {

	String fname = name.getText();
	String Lname = lname.getText();
	String Email = email.getText();
String User = user.getText();
String Pass = pass.getText();





try

{

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");

PreparedStatement pstmt = con.prepareStatement("insert into signup(name,lname,email,user,Pass) values(?, ?, ?, ?, ?)");
pstmt.setString(1,fname);
pstmt.setString(2,Lname);
pstmt.setString(3,Email);
pstmt.setString(4,User);
pstmt.setString(5,Pass);



int i = pstmt.executeUpdate();

if(i != 0)
	
{
JOptionPane.showMessageDialog(signup.this, "Signup successfully !!!!!");
setVisible(false);
login.main(new String [] {});
}
else

JOptionPane.showMessageDialog(signup.this, "ERROR #####");

con.close();

//tf1.setText("");

//tf2.setText("");

//tf3.setText("");

//tf4.setText("");

//tf5.setText("");

//tf6.setText("");

}

catch(Exception ew)

{ System.out.println(ew.getMessage()); }

}

}



	}
);
signupbtn.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
signupbtn.setBounds(386, 604, 405, 54);
contentPane.add(signupbtn);

name = new JTextField();
name.setBounds(490, 320, 300, 40);
contentPane.add(name);
name.setColumns(10);
lname = new JTextField();
lname.setBounds(490,380, 300, 40);
contentPane.add(lname);
lname.setColumns(10);
email = new JTextField();
email.setBounds(490, 440, 300, 40);
contentPane.add(email);
email.setColumns(10);
user = new JTextField();
user.setBounds(490,490, 300, 40);
contentPane.add(user);
user.setColumns(10);
pass = new JTextField();
pass.setBounds(490, 550, 300, 40);
contentPane.add(pass);
pass.setColumns(10);



JLabel signlbl = new JLabel("");
signlbl.setIcon(new ImageIcon("C:\\Users\\shrut\\Downloads\\background.jpg"));
signlbl.setForeground(new Color(240, 255, 255));
signlbl.setBackground(new Color(0, 0, 0));
signlbl.setBounds(341, 208, 483, 483);
contentPane.add(signlbl);

JPanel panel = new JPanel();
panel.setBackground(new Color(0, 0, 255));
panel.setBounds(0, 0, 2000, 125);
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
	setVisible(false);
choose.main(new String[] {});
}
});
lblNewLabel_1.setBounds(1341, 10, 121, 105);
backimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\3683641.png");
bimg=backimg.getImage();
Image imgScale4 =bimg.getScaledInstance(lblNewLabel_1.getWidth(),lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon4=new ImageIcon(imgScale4);

lblNewLabel_1.setIcon(scaledIcon4);

panel.add(lblNewLabel_1);

JLabel background = new JLabel("");
background.setBounds(0, 125, 1700, 743);
img=new ImageIcon("C:\\Users\\shrut\\Downloads\\Untitled design.jpg");
img1=img.getImage();
Image imgScale = img1.getScaledInstance(background.getWidth(),background.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon=new ImageIcon(imgScale);
background.setIcon(scaledIcon);

contentPane.add(background);
JLabel lname = new JLabel("Last Name :");
lname.setFont(new Font("Wide Latin", Font.BOLD, 10));
lname.setHorizontalAlignment(SwingConstants.TRAILING);
lname.setBounds(396, 355, 45, 13);
contentPane.add(lname);
JLabel lblNewLabel_ = new JLabel("EXAM SEATING MANAGMENT SYSTEM");
lblNewLabel_.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel_.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
lblNewLabel_.setBounds(164, 34, 565, 50);
panel.add(lblNewLabel_);

JLabel lblNewLabel2 = new JLabel("A complete solution to manage seating plan of exam");
lblNewLabel2.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel2.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
lblNewLabel2.setBounds(164, 63, 608, 39);
panel.add(lblNewLabel2);

JLabel lblNewLabel3 = new JLabel("New label");
lblNewLabel3.setBounds(35, 0, 149, 130);
iconimg=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Infinite effect.png");
iimg=iconimg.getImage();
Image imgScale20 = iimg.getScaledInstance(lblNewLabel3.getWidth(),lblNewLabel3.getHeight(), Image.SCALE_SMOOTH);
   ImageIcon scaledIcon20=new ImageIcon(imgScale20);
lblNewLabel3.setIcon(scaledIcon20);

panel.add(lblNewLabel3);
}
}