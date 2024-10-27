package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Room1 extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField textField;
int capacity;
    ImageIcon img,unameimg,passimg,backimg,img10,img12,pass,back,iconimg,homeimg,buttonimg;

    Image img1,unimg,pimg,bimg,img11,img13,paimg,b,iimg,himg,baimg,img3;
	ImageIcon img2;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Room1 frame = new Room1();
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
public Room1() {
setTitle("Exam Seating arrangment System");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(-10, -10, 1630, 882);
contentPane = new JPanel();
contentPane.setBackground(new Color(128, 128, 128));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

     
       
       JPanel panel = new JPanel();
       panel.setBounds(375, 275, 518, 370);
       contentPane.add(panel);
       
       JLabel lblNewLabel_3 = new JLabel("New label");
       lblNewLabel_3.setBounds(38, 0, 143, 140);
       homeimg=new ImageIcon("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\shrut\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\images (2).png");
       himg=homeimg.getImage();
       Image imgScale4 = himg.getScaledInstance(lblNewLabel_3.getWidth(),lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon scaledIcon4=new ImageIcon(imgScale4);
       panel.setLayout(null);
       lblNewLabel_3.setIcon(scaledIcon4);
       
       panel.add(lblNewLabel_3);
       
       
       JLabel lblNewLabel = new JLabel("CAPACITY : ");
       lblNewLabel.setBounds(20, 190, 180, 30);
       lblNewLabel.setFont(new Font("Swis721 Cn BT", Font.BOLD, 26));
       lblNewLabel.setForeground(new Color(0, 0, 255));
       panel.add(lblNewLabel);
       
       textField = new JTextField();
       textField.setBounds(207, 184, 250, 40);
       panel.add(textField);
       textField.setColumns(10);
       buttonimg=new ImageIcon("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\shrut\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\button.png");
       bimg=buttonimg.getImage();
       
       
       JLabel lblNewLabel_4 = new JLabel("Enter the capacity ");
       lblNewLabel_4.setBounds(203, 35, 315, 77);
       lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
       panel.add(lblNewLabel_4);
       
       JButton btnNewButton = new JButton("SET CAPACITY");
       btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
       btnNewButton.addMouseListener(new MouseAdapter() {
       	@Override
       	public void mouseClicked(MouseEvent e) {
       		 capacity =Integer.parseInt(textField.getText());
       		try{
    			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "root");
           	    PreparedStatement ps=connection.prepareStatement("insert into capacitytable(capacity) values(?)");
    			ps.setInt(1,capacity);
    			int rowsInserted = ps.executeUpdate();
    	         if (rowsInserted > 0) {
    	             JOptionPane.showMessageDialog(null, "CAPACITY INSERTED SUCCESSFULLY!");
    	         } else {
    	             JOptionPane.showMessageDialog(null, "FAILED");
    	         }
    			connection.close();
    		}catch(Exception ee){System.out.println(ee);}
       	}
       });
       btnNewButton.setBounds(40, 260, 180, 50);
       panel.add(btnNewButton);
       
       JButton btnNewButton_2 = new JButton("Assign seat");
       btnNewButton_2.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
       btnNewButton_2.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		setVisible(false);
    		SeatAllocation.main(new String [] {});
       	}
       
       });
       btnNewButton_2.setBounds(240, 260, 180, 50);
       panel.add(btnNewButton_2);

JLabel r1l1 = new JLabel("Room 1");
r1l1.setForeground(new Color(255, 255, 255));
r1l1.setBounds(530, 164, 202, 73);
r1l1.setFont(new Font("Century Schoolbook", Font.BOLD, 50));
contentPane.add(r1l1);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(0, 0, 255));
panel_1.setBounds(0, 0, 3000, 125);
contentPane.add(panel_1);
panel_1.setLayout(null);
JLabel lblNewLabel_5 = new JLabel("New label");
lblNewLabel_5.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
choose.main(new String[] {});
}
});
lblNewLabel_5.setBounds(1349, 10, 129, 105);
backimg=new ImageIcon("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\shrut\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\3683641.png");
baimg=backimg.getImage();
Image imgScale5 = baimg.getScaledInstance(lblNewLabel_5.getWidth(),lblNewLabel_5.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon5=new ImageIcon(imgScale5);
lblNewLabel_5.setIcon(scaledIcon5);
panel_1.add(lblNewLabel_5);

JLabel l6 = new JLabel();
l6.setBounds(0, 125, 1700, 710);
img2=new ImageIcon("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\shrut\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\Untitled design.jpg");
img3=img2.getImage();

Image imgScale1 = img3.getScaledInstance(l6.getWidth(),l6.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon1=new ImageIcon(imgScale1);
l6.setIcon(scaledIcon1);

     
       contentPane.add(l6);
       JLabel lblNewLabel_10 = new JLabel("EXAM SEAT MANAGMENT SYSTEM");
       lblNewLabel_10.setForeground(UIManager.getColor("Button.highlight"));
       lblNewLabel_10.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
       lblNewLabel_10.setBounds(158, 31, 580, 47);
       panel_1.add(lblNewLabel_10);

       JLabel lblNewLabel_11 = new JLabel("A complete solution to manage seating plan of exam");
       lblNewLabel_11.setForeground(UIManager.getColor("Button.highlight"));
       lblNewLabel_11.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
       lblNewLabel_11.setBounds(158, 64, 580, 24);
       panel_1.add(lblNewLabel_11);

       JLabel lblNewLabel_12 = new JLabel("New label");
       lblNewLabel_12.setBounds(27, -10, 151, 141);
       iconimg=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\Infinite effect.png");
       iimg=iconimg.getImage();
       Image imgScale70 =iimg.getScaledInstance(lblNewLabel_12.getWidth(),lblNewLabel_12.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon scaledIcon70=new ImageIcon(imgScale70);
       lblNewLabel_12.setIcon(scaledIcon70);

       panel_1.add(lblNewLabel_12);
       
       
}
}

