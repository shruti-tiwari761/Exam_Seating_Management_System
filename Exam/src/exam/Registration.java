package exam;



import java.awt.EventQueue;



import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JTabbedPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;

import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.SystemColor;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;



public class Registration extends JFrame {



private static final long serialVersionUID = 1L;

private JPanel contentPane;

private JTextField tf1;

private JTextField tf2;

private JTextField tf4;

private JTextField tf5;

private JTextField tf6;

private JTextField tf3;


ImageIcon img,unameimg,passimg,backimg,img10,img12,pass,back,iconimg;

Image img1,unimg,pimg,bimg,img11,img13,paimg,b,iimg;

/**

* Launch the application.

*/

public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

Registration frame = new Registration();

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

public Registration() {
setTitle("Exam Seating arrangment System");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(-10, -5, 3000, 3000);

contentPane = new JPanel();
contentPane.setBackground(new Color(192, 192, 192));

contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));



setContentPane(contentPane);

contentPane.setLayout(null);

JLabel background = new JLabel("");
background.setBounds(0, 125, 1700, 743);

img=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Untitled design.jpg");

img1=img.getImage();

Image imgScale = img1.getScaledInstance(background.getWidth(),background.getHeight(), Image.SCALE_SMOOTH);

ImageIcon scaledIcon=new ImageIcon(imgScale);



JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setBackground(Color.LIGHT_GRAY);

tabbedPane.setBounds(255, 191, 800, 500);

contentPane.add(tabbedPane);
JPanel rp2 = new JPanel();
rp2.setBackground(Color.LIGHT_GRAY);
tabbedPane.addTab("ROOMS", null, rp2, null);
rp2.setLayout(null);
JLabel rlabel = new JLabel(" ROOMS  AVAILABLE HERE:");
rlabel.setForeground(new Color(0, 0, 255));
rlabel.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 22));
rlabel.setBounds(100, 40, 600, 89);
rp2.add(rlabel);
JSeparator separator = new JSeparator();
separator.setBackground(Color.BLACK);
separator.setBounds(10, 118, 951, 11);
rp2.add(separator);
JButton btnNewButton = new JButton("ROOM 1");
btnNewButton.setForeground(new Color(0, 0, 0));
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		new Room1().setVisible(true);
	}
});
btnNewButton.setBackground(new Color(255, 255, 255));
btnNewButton.setFont(new Font("Wide Latin", Font.BOLD, 22));
btnNewButton.setBounds(20, 218, 216, 92);
rp2.add(btnNewButton);
JButton btnNewButton_2 = new JButton("ROOM 2");
btnNewButton_2.setForeground(new Color(0, 0, 0));
btnNewButton_2.setFont(new Font("Wide Latin", Font.BOLD, 22));
btnNewButton_2.setBackground(new Color(255, 255, 255));
btnNewButton_2.setBounds(280, 220, 207, 89);
rp2.add(btnNewButton_2);
JButton btnNewButton_3 = new JButton("ROOM 3");
btnNewButton_3.setForeground(new Color(0, 0, 0));
btnNewButton_3.setBackground(new Color(255, 255, 255));
btnNewButton_3.setFont(new Font("Wide Latin", Font.BOLD, 22));
btnNewButton_3.setBounds(550, 220, 207, 89);
rp2.add(btnNewButton_3);



JPanel rp1 = new JPanel();

rp1.setBackground(Color.LIGHT_GRAY);

tabbedPane.addTab("Registration ", null, rp1, null);

rp1.setToolTipText("");
rp1.setLayout(null);



JLabel lb2 = new JLabel("NAME :");
lb2.setBounds(150, 30, 70, 49);
lb2.setForeground(Color.BLACK);

lb2.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));

rp1.add(lb2);



tf1 = new JTextField();
tf1.setBounds(350, 30, 301, 36);

rp1.add(tf1);

tf1.setColumns(10);



JLabel lb3 = new JLabel("ENROLLMENT NUMBER :");
lb3.setBounds(150, 70, 207, 58);
lb3.setForeground(Color.BLACK);

lb3.setFont(new Font("Swis721 Cn BT", Font.BOLD, 18));

rp1.add(lb3);



tf2 = new JTextField();
tf2.setBounds(350, 80, 301, 43);

rp1.add(tf2);

tf2.setColumns(10);



JLabel lb4 = new JLabel("FATHER'S NAME :");
lb4.setBounds(150, 190, 173, 36);
lb4.setForeground(Color.BLACK);

lb4.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));

rp1.add(lb4);



tf4 = new JTextField();
tf4.setBounds(350, 200, 298, 36);

rp1.add(tf4);

tf4.setColumns(10);



JLabel lblNewLabel_3 = new JLabel("BRANCH :");
lblNewLabel_3.setBounds(150, 240, 145, 33);
lblNewLabel_3.setForeground(Color.BLACK);

lblNewLabel_3.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));

rp1.add(lblNewLabel_3);



JLabel lblNewLabel_4 = new JLabel("SEMESTER :");
lblNewLabel_4.setBounds(150, 310, 130, 25);
lblNewLabel_4.setForeground(Color.BLACK);

lblNewLabel_4.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));

rp1.add(lblNewLabel_4);



tf5 = new JTextField();
tf5.setBounds(350, 250, 301, 36);

rp1.add(tf5);

tf5.setColumns(10);



tf6 = new JTextField();
tf6.setBounds(350, 310, 298, 41);

rp1.add(tf6);

tf6.setColumns(10);



JLabel lblNewLabel_5 = new JLabel("GENDER :");
lblNewLabel_5.setBounds(150, 150, 145, 25);
lblNewLabel_5.setForeground(Color.BLACK);

lblNewLabel_5.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));

rp1.add(lblNewLabel_5);
JLabel lblNewLabel_9 = new JLabel("New label");
lblNewLabel_9.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
choose.main(new String[] {});
}
});

JButton r1 = new JButton("REGISTER");
r1.setBounds(200, 400, 107, 41);
r1.setForeground(new Color(0, 0, 0));

r1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if(e.getSource()==r1) {

String name = tf1.getText();

String enroll = tf2.getText();

String gender= tf3.getText();

String FatherName=tf4.getText();

String branch =tf5.getText();

int sm = Integer.parseInt(tf6.getText());

try

{

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");

PreparedStatement pstmt = con.prepareStatement("insert into profile(name,enroll,gender,FatherName,branch,sm) values(?, ?, ?, ?, ?, ?)");

pstmt.setString(1,name);

pstmt.setString(2,enroll);

pstmt.setString(3,gender);

pstmt.setString(4,FatherName);

pstmt.setString(5,branch);

pstmt.setInt(6, sm);

int i = pstmt.executeUpdate();

if(i != 0)

JOptionPane.showMessageDialog(Registration.this, "1 Record INSERTED successfully !!!!!");

else

JOptionPane.showMessageDialog(Registration.this, "ERROR #####");

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





});

r1.setBackground(new Color(255, 255, 255));

r1.setFont(new Font("Swis721 Cn BT", Font.BOLD, 17));

rp1.add(r1);



JButton btnNewButton_1 = new JButton("RESET");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
	}
});
btnNewButton_1.setBounds(400, 400, 109, 41);
btnNewButton_1.setForeground(new Color(0, 0, 0));

btnNewButton_1.setFont(new Font("Swis721 Cn BT", Font.BOLD, 17));

btnNewButton_1.setBackground(new Color(255, 255, 255));

rp1.add(btnNewButton_1);



tf3 = new JTextField();
tf3.setBounds(350, 150, 301, 36);

rp1.add(tf3);

tf3.setColumns(10);

background.setIcon(scaledIcon);



contentPane.add(background);
JPanel panel = new JPanel();
panel.setBackground(new Color(0, 0, 255));
panel.setBounds(0, 0, 3000, 125);
contentPane.add(panel);
panel.setLayout(null);
lblNewLabel_9.setBounds(1402, 5, 120, 110);
back=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\3683641.png");
b=back.getImage();
Image imgScale7 = b.getScaledInstance(lblNewLabel_9.getWidth(),lblNewLabel_9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7=new ImageIcon(imgScale7);
lblNewLabel_9.setIcon(scaledIcon7);

panel.add(lblNewLabel_9);

JLabel lblNewLabel_10 = new JLabel("EXAM SEAT MANAGMENT SYSTEM");
lblNewLabel_10.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel_10.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
lblNewLabel_10.setBounds(158, 31, 580, 47);
panel.add(lblNewLabel_10);

JLabel lblNewLabel_11 = new JLabel("A complete solution to manage seating plan of exam");
lblNewLabel_11.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel_11.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
lblNewLabel_11.setBounds(158, 64, 580, 24);
panel.add(lblNewLabel_11);

JLabel lblNewLabel_12 = new JLabel("New label");
lblNewLabel_12.setBounds(27, -10, 151, 141);
iconimg=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\Infinite effect.png");
iimg=iconimg.getImage();
Image imgScale70 =iimg.getScaledInstance(lblNewLabel_12.getWidth(),lblNewLabel_12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon70=new ImageIcon(imgScale70);
lblNewLabel_12.setIcon(scaledIcon70);

panel.add(lblNewLabel_12);




}
}

