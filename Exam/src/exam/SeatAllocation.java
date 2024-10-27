package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;



import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextArea;
import javax.swing.UIManager;

public class SeatAllocation extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;
static JTextField textField;
int enrollmentCount = 0; 
PreparedStatement capacity;
PreparedStatement count ;
ImageIcon img,unameimg,passimg,backimg,img10,img12,pass,back,iconimg;

    Image img1,unimg,pimg,bimg,img11,img13,paimg,b,iimg;
	
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
SeatAllocation frame = new SeatAllocation();
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
public SeatAllocation() {
setTitle("Exam Seating arrangment System");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(-10, -10, 1630,800);
contentPane = new JPanel();
contentPane.setBackground(new Color(128, 0, 0));
contentPane.setBorder(null);

setContentPane(contentPane);
contentPane.setLayout(null);
JLabel background = new JLabel("");
        background.setBounds(0, 125, 1700, 743);

        JLabel l6 = new JLabel();
        img =new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\Untitled design.jpg");
        img1 = img.getImage();
        l6.setBounds(0, 125, 1700, 710);

        Image imgScale1 = img1.getScaledInstance(l6.getWidth(),l6.getHeight(), Image.SCALE_SMOOTH);

        ImageIcon scaledIcon1=new ImageIcon(imgScale1);
       
        JLabel lblNewLabel_4 = new JLabel("New label");
        lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String enroll = textField.getText();
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "root");
                    
                    // Fetch capacity from database
                    PreparedStatement capacityStmt = con.prepareStatement("SELECT capacity FROM capacitytable");
                    ResultSet capacityResult = capacityStmt.executeQuery();
                    int capacity = 0;
                    if (capacityResult.next()) {
                        capacity = capacityResult.getInt("capacity");
                    }
                    
                    // Count allocated seats
                    PreparedStatement countStmt = con.prepareStatement("SELECT COUNT(*) FROM seat");
                    ResultSet countResult = countStmt.executeQuery();
                    int count = 0;
                    if (countResult.next()) {
                        count = countResult.getInt(1);
                    }

                    // Check if capacity is greater than count
                    if (capacity > count) {
                        PreparedStatement checkStmt = con.prepareStatement("SELECT * FROM seat WHERE enroll = ?");
                        checkStmt.setString(1, enroll);
                        ResultSet rs = checkStmt.executeQuery();
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(SeatAllocation.this, "Seat has already been allocated to '" + enroll + "'");
                        } else {
                            PreparedStatement insertStmt = con.prepareStatement("INSERT INTO seat(enroll) VALUES(?)");
                            insertStmt.setString(1, enroll);
                            int i = insertStmt.executeUpdate();
                            if (i != 0) {
                                enrollmentCount++;
                                JOptionPane.showMessageDialog(SeatAllocation.this, "Seat allocated successfully!");
                            } else {
                                JOptionPane.showMessageDialog(SeatAllocation.this, "Error occurred while allocating seat!");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(SeatAllocation.this, "Seat Full");
                    }
                } catch (Exception ew) {
                    System.out.println(ew.getMessage());
                }
            }
        });
        lblNewLabel_4.setBounds(717, 470, 172, 131);
        img12=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\button.png");
        img13=img12.getImage();
        Image imgScale13 = img13.getScaledInstance(lblNewLabel_4.getWidth(),lblNewLabel_4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon13=new ImageIcon(imgScale13);
       
        JLabel lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setBounds(168, 331, 306, 291);
        pass=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\evaluation-1516644.jpg");
        paimg=pass.getImage();
        Image imgScale8 = paimg.getScaledInstance(lblNewLabel_5.getWidth(),lblNewLabel_5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8=new ImageIcon(imgScale8);
       
        JLabel lblNewLabel_8 = new JLabel("Seat");
        lblNewLabel_8.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
        lblNewLabel_8.setBounds(769, 531, 107, 36);
        contentPane.add(lblNewLabel_8);
       
        JLabel lblNewLabel_7 = new JLabel("Allocate ");
        lblNewLabel_7.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
        lblNewLabel_7.setBounds(739, 508, 157, 27);
        contentPane.add(lblNewLabel_7);
       
        JLabel lblNewLabel_6 = new JLabel("BACK");
        lblNewLabel_6.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
        		Home1.main(new String[] {});
        	}
        });
        lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
        lblNewLabel_6.setBounds(576, 508, 96, 49);
        contentPane.add(lblNewLabel_6);
        lblNewLabel_5.setIcon(scaledIcon8);
       
        contentPane.add(lblNewLabel_5);
       
        JSeparator separator = new JSeparator();
        separator.setBounds(118, 318, 806, 8);
        contentPane.add(separator);

        lblNewLabel_4.setIcon(scaledIcon13);
        contentPane.add(lblNewLabel_4);
       
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        Home1.main(new String[] {});
        }
        });
        lblNewLabel_3.setBounds(539, 470, 172, 131);
        img10=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\button.png");
        img11=img10.getImage();
        Image imgScale10 = img11.getScaledInstance(lblNewLabel_3.getWidth(),lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon10=new ImageIcon(imgScale10);
       
        lblNewLabel_3.setIcon(scaledIcon10);
       
        contentPane.add(lblNewLabel_3);
       
        JLabel lblNewLabel_1 = new JLabel("SEAT ALLOCATION PANEL ");
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(250, 259, 544, 49);
        lblNewLabel_1.setFont(new Font("Wide Latin", Font.BOLD, 20));
        contentPane.add(lblNewLabel_1);
       
        textField = new JTextField();
        textField.setBounds(508, 398, 403, 36);
        contentPane.add(textField);
        textField.setColumns(10);
        JLabel lblNewLabel = new JLabel("ENROLLMENT NUMBER  :");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBounds(508, 346, 282, 42);
        lblNewLabel.setFont(new Font("Swis721 Cn BT", Font.BOLD, 22));
        contentPane.add(lblNewLabel);
       
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setIcon(new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\background.jpg"));
        lblNewLabel_2.setBackground(new Color(192, 192, 192));
        lblNewLabel_2.setBounds(118, 243, 806, 390);
        contentPane.add(lblNewLabel_2);
        l6.setIcon(new ImageIcon(imgScale1));

        contentPane.add(l6);

JPanel panel = new JPanel();
panel.setBackground(new Color(0, 0, 255));
panel.setBounds(0, 0, 3000, 125);
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel_9 = new JLabel("New label");
lblNewLabel_9.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
setVisible(false);
choose.main(new String[] {});
}
});
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




	
	// TODO Auto-generated method stub
	
}


