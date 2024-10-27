package exam;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Home1 extends JFrame {
ImageIcon img,img2,iconimg,quetsimg,searchimg,img21,b1img,img31,img34;
Image img1,img3,iimg,qimg,simg,img22,b11img,img32,img35;

private static final long serialVersionUID = 1L;
private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Home1 frame = new Home1();
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
public Home1() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(-10, -10, 1630, 1000);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblNewLabel_6 = new JLabel("New label");
lblNewLabel_6.setBounds(109, 300, 452, 476);
quetsimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\quest.jpg");
qimg=quetsimg.getImage();
Image imgScale20 =qimg.getScaledInstance(lblNewLabel_6 .getWidth(),lblNewLabel_6 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon20=new ImageIcon(imgScale20);

JLabel lblNewLabel_10 = new JLabel("New label");
lblNewLabel_10.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		setVisible(false);
		Registration.main(new String [] {});
	}
});
lblNewLabel_10.setBounds(1230, 568, 205, 136);
img31=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\3d push button ENTER stock illustration_ Illustration of cursor - 18508073.jpg");
img32=img31.getImage();
Image imgScale0=img32.getScaledInstance(lblNewLabel_10 .getWidth(),lblNewLabel_10 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon0=new ImageIcon(imgScale0);

JLabel lblNewLabel_13 = new JLabel("Student Register");
lblNewLabel_13.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
lblNewLabel_13.setBounds(1240, 683, 222, 63);
contentPane.add(lblNewLabel_13);

JLabel lblNewLabel_12 = new JLabel("Extract information");
lblNewLabel_12.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
lblNewLabel_12.setBounds(705, 691, 246, 46);
contentPane.add(lblNewLabel_12);

JLabel lblNewLabel_11 = new JLabel("Allocate Seat");
lblNewLabel_11.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
lblNewLabel_11.setBounds(1005, 459, 169, 46);
contentPane.add(lblNewLabel_11);
lblNewLabel_10.setIcon(scaledIcon0);

contentPane.add(lblNewLabel_10);

addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
});
JLabel lblNewLabel_9 = new JLabel("New label");
lblNewLabel_9.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		setVisible(false);
		Export.main(new String[] {});
	}
});
lblNewLabel_9.setBounds(724, 568, 205, 136);
b1img=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\3d push button ENTER stock illustration_ Illustration of cursor - 18508073.jpg");
b11img=b1img.getImage();
Image imgScale60=b11img.getScaledInstance(lblNewLabel_9 .getWidth(),lblNewLabel_9 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon60=new ImageIcon(imgScale60);
lblNewLabel_9.setIcon(scaledIcon60);

contentPane.add(lblNewLabel_9);

JLabel lblNewLabel_8 = new JLabel("New label");
lblNewLabel_8.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
SeatAllocation.main(new String[] {});
}
});
lblNewLabel_8.setBounds(981, 339, 205, 136);
img34=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\3d push button ENTER stock illustration_ Illustration of cursor - 18508073.jpg");
img35=img34.getImage();
Image imgScale6=img35.getScaledInstance(lblNewLabel_8 .getWidth(),lblNewLabel_8 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon6=new ImageIcon(imgScale6);

lblNewLabel_8.setIcon(scaledIcon6);

contentPane.add(lblNewLabel_8);

lblNewLabel_6.setIcon(scaledIcon20);

contentPane.add(lblNewLabel_6);

JLabel lblNewLabel_5 = new JLabel("WELCOME ADMINISTRATOR !!  ");
lblNewLabel_5.setForeground(new Color(0, 0, 0));
lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 25));
lblNewLabel_5.setBounds(555, 228, 425, 39);
contentPane.add(lblNewLabel_5);

JSeparator separator = new JSeparator();
separator.setBackground(UIManager.getColor("Button.focus"));
separator.setBounds(84, 277, 1404, 2);
contentPane.add(separator);

JLabel lblNewLabel_4 = new JLabel("New label");
lblNewLabel_4.setIcon(new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\background.jpg"));
lblNewLabel_4.setBounds(84, 216, 1404, 591);
contentPane.add(lblNewLabel_4);

JPanel panel = new JPanel();
panel.setBackground(new Color(0, 0, 255));
panel.setBounds(0, 0, 1630, 125);
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
choose.main(new String[] {});
}
});
lblNewLabel_1.setBounds(1386, 12, 124, 110);
img2=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\3683641.png");
img3=img2.getImage();
Image imgScale2 =img3.getScaledInstance(lblNewLabel_1 .getWidth(),lblNewLabel_1 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon2=new ImageIcon(imgScale2);
lblNewLabel_1.setIcon(scaledIcon2);

panel.add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("EXAM SEAT MANAGMENT SYSTEM");
lblNewLabel_2.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
lblNewLabel_2.setBounds(188, 21, 498, 63);
panel.add(lblNewLabel_2);

JLabel lblNewLabel = new JLabel("A complete solution to manage seating plan of exam");
lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
lblNewLabel.setBounds(188, 55, 508, 42);
panel.add(lblNewLabel);

JLabel lblNewLabel_3 = new JLabel("New label");
lblNewLabel_3.setBounds(22, -6, 187, 128);
iconimg=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Infinite effect.png");
iimg=iconimg.getImage();
Image imgScale30 =iimg.getScaledInstance(lblNewLabel_3 .getWidth(),lblNewLabel_3 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon30=new ImageIcon(imgScale30);
lblNewLabel_3.setIcon(scaledIcon30);

panel.add(lblNewLabel_3);

JLabel l1 = new JLabel("");
l1.setBounds(0, 125, 1630, 800);
img=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Untitled design1.jpg");
img1=img.getImage();
Image imgScale1 =img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon1=new ImageIcon(imgScale1);
l1.setIcon(scaledIcon1);

contentPane.add(l1);

JLabel lblNewLabel_7 = new JLabel("New label");
lblNewLabel_7.setBounds(109, 594, 452, 181);
contentPane.add(lblNewLabel_7);
}
}