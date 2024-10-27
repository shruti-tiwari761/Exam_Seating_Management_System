package exam;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class MainFrame extends JFrame {

    ImageIcon img, img2,signupimg,loginimg,iconimg;
    Image img1, img3,signimg,logimg,iimg;
private static final long serialVersionUID = 1L;
private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
MainFrame frame = new MainFrame();
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
public MainFrame() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(-10, -10, 1630, 1000);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel signuplbl = new JLabel("New label");
signuplbl.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
signup.main(new String [] {});
}
});
signuplbl.setBounds(264, 336, 149, 116);
signupimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\signup (1).png");
signimg=signupimg.getImage();
Image imgScale3 = signimg.getScaledInstance(signuplbl.getWidth(),signuplbl.getHeight(), Image.SCALE_SMOOTH);
   ImageIcon scaledIcon3=new ImageIcon(imgScale3);

JLabel loginlbl = new JLabel();
loginlbl.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
login.main(new String [] {});
}
});
loginimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\login (1).png");
logimg=loginimg.getImage();
Image imgScale4 = logimg.getScaledInstance(signuplbl.getWidth(),signuplbl.getHeight(), Image.SCALE_SMOOTH);
   ImageIcon scaledIcon4=new ImageIcon(imgScale4);

JLabel loglbl = new JLabel("LOGIN HERE");
loglbl.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
login.main(new String [] {});
}
});

JSeparator separator = new JSeparator();
separator.setBackground(UIManager.getColor("Button.focus"));
separator.setBounds(184, 297, 760, 13);
contentPane.add(separator);

JLabel l3 = new JLabel("WELCOME   ADMINISTRATOR  !!");
l3.setBounds(322, 218, 532, 57);
contentPane.add(l3);
l3.setForeground(new Color(0, 0, 0));
l3.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
loglbl.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
loglbl.setForeground(new Color(0, 0, 0));
loglbl.setBounds(657, 449, 250, 43);
contentPane.add(loglbl);


JLabel signlbl = new JLabel("SIGNUP HERE");
signlbl.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
signup.main(new String [] {});
}
});
signlbl.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
signlbl.setForeground(new Color(0, 0, 0));
signlbl.setBounds(232, 449, 266, 43);
contentPane.add(signlbl);
loginlbl.setIcon(scaledIcon4);
loginlbl.setForeground(UIManager.getColor("Button.highlight"));
loginlbl.setBounds(695, 320, 159, 154);
contentPane.add(loginlbl);

signuplbl.setIcon(scaledIcon3);
signuplbl.setForeground(new Color(255, 255, 255));

contentPane.add(signuplbl);


JPanel panel = new JPanel();
panel.setBackground(new Color(0, 0, 255));
panel.setBounds(0, 0, 2000, 125);
contentPane.add(panel);
panel.setLayout(null);

JLabel l2 = new JLabel();
l2.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
choose.main(new String [] {});
}
});
img2 =new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\3683641.png");
l2.setBounds(1354, 10, 128, 103);
img3=img2.getImage();
   Image imgScale2 = img3.getScaledInstance(l2.getWidth(),l2.getHeight(), Image.SCALE_SMOOTH);
   ImageIcon scaledIcon2=new ImageIcon(imgScale2);
   l2.setIcon(scaledIcon2);
panel.add(l2);

JLabel lblNewLabel_1 = new JLabel("EXAM SEATING MANAGMENT SYSTEM");
lblNewLabel_1.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
lblNewLabel_1.setBounds(164, 34, 565, 50);
panel.add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("A complete solution to manage seating plan of exam");
lblNewLabel_2.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
lblNewLabel_2.setBounds(164, 63, 608, 39);
panel.add(lblNewLabel_2);

JLabel lblNewLabel_3 = new JLabel("New label");
lblNewLabel_3.setBounds(35, 0, 149, 130);
iconimg=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Infinite effect.png");
iimg=iconimg.getImage();
Image imgScale20 = iimg.getScaledInstance(lblNewLabel_3.getWidth(),lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
   ImageIcon scaledIcon20=new ImageIcon(imgScale20);
lblNewLabel_3.setIcon(scaledIcon20);

panel.add(lblNewLabel_3);

JLabel l1 = new JLabel();
l1.setFont(new Font("Century Schoolbook", Font.BOLD, 50));
l1.setForeground(UIManager.getColor("Button.disabledShadow"));
img =new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Untitled design.jpg");
l1.setBounds(0, 125, 1700, 710);
img1=img.getImage();
Image imgScale1 = img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon1=new ImageIcon(imgScale1);

JLabel lblNewLabel = new JLabel("New label");
lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\background.jpg"));
lblNewLabel.setBounds(184, 200, 760, 345);
contentPane.add(lblNewLabel);

l1.setIcon(scaledIcon1);

contentPane.add(l1);

}
}
