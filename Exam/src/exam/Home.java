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

public class Home extends JFrame {
ImageIcon img,img2,iconimg,quetsimg,searchimg,img21;
Image img1,img3,iimg,qimg,simg,img22;

private static final long serialVersionUID = 1L;
private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Home frame = new Home();
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
public Home() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(-10, -10, 1630, 1000);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblNewLabel_6 = new JLabel("New label");
lblNewLabel_6.setBounds(109, 300, 452, 476);
quetsimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\quets.jpg");
qimg=quetsimg.getImage();
Image imgScale20 =qimg.getScaledInstance(lblNewLabel_6 .getWidth(),lblNewLabel_6 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon20=new ImageIcon(imgScale20);

JLabel lblNewLabel_8 = new JLabel("New label");
lblNewLabel_8.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
 SearchFrame.main(new String[] {});
}
});
lblNewLabel_8.setBounds(1065, 223, 72, 60);
searchimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\search.png");
simg=searchimg.getImage();
Image imgScale50 =simg.getScaledInstance(lblNewLabel_8 .getWidth(),lblNewLabel_8 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon50=new ImageIcon(imgScale50);

JLabel lblNewLabel_9 = new JLabel("New label");
lblNewLabel_9.setBounds(589, 300, 872, 476);
img21=new ImageIcon("C:\\Users\\shrut\\Downloads\\images (1).jpg");
img22=img21.getImage();
Image imgScale5=img22.getScaledInstance(lblNewLabel_9 .getWidth(),lblNewLabel_9 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon5=new ImageIcon(imgScale5);
lblNewLabel_9.setIcon(scaledIcon5);

contentPane.add(lblNewLabel_9);

JLabel lblNewLabel_7 = new JLabel(" Search your seat here.....");
lblNewLabel_7.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
lblNewLabel_7.setBounds(1140, 228, 348, 39);
contentPane.add(lblNewLabel_7);
lblNewLabel_8.setIcon(scaledIcon50);

contentPane.add(lblNewLabel_8);
lblNewLabel_6.setIcon(scaledIcon20);

contentPane.add(lblNewLabel_6);

JLabel lblNewLabel_5 = new JLabel("WELCOME STUDENTS  !!  ");
lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 25));
lblNewLabel_5.setBounds(570, 228, 348, 39);
contentPane.add(lblNewLabel_5);

JSeparator separator = new JSeparator();
separator.setBackground(UIManager.getColor("Button.focus"));
separator.setBounds(84, 277, 1404, 2);
contentPane.add(separator);

JLabel lblNewLabel_4 = new JLabel("New label");
lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\shrut\\Downloads\\background.jpg"));
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
lblNewLabel_1.setBounds(1357, 10, 124, 110);
img2=new ImageIcon("C:\\Users\\shrut\\Downloads\\3683641.png");
img3=img2.getImage();
Image imgScale2 =img3.getScaledInstance(lblNewLabel_1 .getWidth(),lblNewLabel_1 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon2=new ImageIcon(imgScale2);
lblNewLabel_1.setIcon(scaledIcon2);

panel.add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("EXAM SEATING MANAGMENT SYSTEM");
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
iconimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\Infinite effect.png");
iimg=iconimg.getImage();
Image imgScale30 =iimg.getScaledInstance(lblNewLabel_3 .getWidth(),lblNewLabel_3 .getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon30=new ImageIcon(imgScale30);
lblNewLabel_3.setIcon(scaledIcon30);

panel.add(lblNewLabel_3);

JLabel l1 = new JLabel("");
l1.setBounds(0, 125, 1630, 800);
img=new ImageIcon("C:\\Users\\shrut\\Downloads\\Untitled design1.jpg");
img1=img.getImage();
Image imgScale1 =img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon1=new ImageIcon(imgScale1);
l1.setIcon(scaledIcon1);

contentPane.add(l1);
}
}