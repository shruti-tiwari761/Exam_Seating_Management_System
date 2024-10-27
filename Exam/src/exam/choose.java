package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class choose extends JFrame {
ImageIcon img,iconimg;
    Image img1,imgScale1,iimg;
    JLabel l6;
private static final long serialVersionUID = 1L;
private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
choose frame = new choose();
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
public choose() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(-10, -10, 1630, 1000);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JPanel panel = new JPanel();
panel.setBounds(0, 0, 2000, 125);
panel.setBackground(new Color(0, 0, 255));
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel_5 = new JLabel("EXAM SEATING MANAGEMENT SYSTEM");
lblNewLabel_5.setForeground(new Color(255, 255, 255));
lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
lblNewLabel_5.setBounds(167, 31, 593, 58);
panel.add(lblNewLabel_5);

JLabel lblNewLabel = new JLabel("A complete solution to manage seating plan of exam");
lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
lblNewLabel.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
lblNewLabel.setBounds(166, 78, 539, 24);
panel.add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setBounds(35, 20, 146, 105);
iconimg=new ImageIcon("C:\\Users\\shrut\\Downloads\\Infinite effect.png");
iimg=iconimg.getImage();
        Image imgScale10 = iimg.getScaledInstance(lblNewLabel_1.getWidth(),lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon10=new ImageIcon(imgScale10);
lblNewLabel_1.setIcon(scaledIcon10);

panel.add(lblNewLabel_1);

JLabel l1 = new JLabel("CHOOSE YOUR ROLE");
l1.setBounds(237, 186, 646, 104);
l1.setFont(new Font("Wide Latin", Font.BOLD, 31));
l1.setForeground(UIManager.getColor("Button.highlight"));
contentPane.add(l1);

JLabel l2 = new JLabel("");
l2.setBackground(UIManager.getColor("Button.disabledShadow"));
l2.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
MainFrame.main(new String [] {});
}
});
l2.setBounds(253, 385, 166, 177);
l2.setIcon(new ImageIcon("C:\\Users\\shrut\\Downloads\\icons8-admin-ezgif.com-effects.gif"));
contentPane.add(l2);

JLabel l3 = new JLabel("ADMIN");

l3.setBounds(297, 580, 133, 41);
l3.setFont(new Font("Wide Latin", Font.BOLD, 15));
l3.setForeground(UIManager.getColor("Button.highlight"));
contentPane.add(l3);

JLabel l4 = new JLabel("");
l4.addMouseListener(new MouseAdapter() {

@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
MainFrame1.main(new String [] {});
}
});
l4.setBounds(697, 385, 166, 184);
l4.setIcon(new ImageIcon("C:\\Users\\shrut\\Downloads\\icons8-admin-ezgif.com-effects.gif"));
contentPane.add(l4);

JLabel l5 = new JLabel("USER");

l5.setBounds(743, 591, 150, 30);
l5.setFont(new Font("Wide Latin", Font.BOLD, 15));
l5.setForeground(UIManager.getColor("Button.highlight"));
contentPane.add(l5);

JLabel l6 = new JLabel();
img =new ImageIcon("C:\\Users\\shrut\\Downloads\\Untitled design.jpg");
img1 = img.getImage();
l6.setBounds(0, 125, 1700, 710);
Image imgScale1 = img1.getScaledInstance(l6.getWidth(),l6.getHeight(), Image.SCALE_SMOOTH);

ImageIcon scaledIcon1=new ImageIcon(imgScale1);
l6.setIcon(scaledIcon1);

contentPane.add(l6);
}
}
