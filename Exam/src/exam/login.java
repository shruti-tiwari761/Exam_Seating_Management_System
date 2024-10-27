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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class login extends JFrame {

	ImageIcon img,unameimg,passimg,backimg;

	Image img1,unimg,pimg,bimg;
	ImageIcon img2,signupimg,loginimg,iconimg;
    Image  img3,signimg,logimg,iimg;



	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField uname;

	private JTextField pass;



	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					login frame = new login();

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

	public login() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(-10, -5, 3000, 3000);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));



		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel unamelbl = new JLabel("New label");

		unamelbl.setBounds(386, 401, 68, 55);

		unameimg=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\image1.png");

		unimg=unameimg.getImage();

		Image imgScale1 =unimg.getScaledInstance(unamelbl.getWidth(),unamelbl.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon scaledIcon1=new ImageIcon(imgScale1);

		

		JLabel passlbl = new JLabel("New label");

		passimg=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\images.png");

		pimg=passimg.getImage();

		Image imgScale2 =pimg.getScaledInstance(unamelbl.getWidth(),unamelbl.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon scaledIcon2=new ImageIcon(imgScale2);

		passlbl.setIcon(scaledIcon2);

		passlbl.setBounds(386, 499, 68, 54);

		contentPane.add(passlbl);

		unamelbl.setIcon(scaledIcon1);

		

		contentPane.add(unamelbl);

		

		JSeparator separator = new JSeparator();

		separator.setBounds(341, 347, 483, 2);

		contentPane.add(separator);

		

		JLabel lb = new JLabel("LOGIN");

		lb.setForeground(new Color(0, 0, 255));

		lb.setFont(new Font("Informal Roman", Font.BOLD, 60));

		lb.setBounds(487, 242, 223, 66);

		contentPane.add(lb);

		

		JButton signupbtn = new JButton("LOGIN");
		signupbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==signupbtn ) {
					String user = uname.getText();      
				       String Pass = pass.getText();        
				        try {
				        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
				        PreparedStatement st=connection.prepareStatement("Select user,Pass from signup where user=? and pass=?");
				       
				        st.setString(1,user);
				        st.setString(2,Pass);
				        ResultSet rs=st.executeQuery();
				        if(rs.next()) {
				        	   JOptionPane.showMessageDialog(null, "Login Succesfull.");
				        	setVisible(false);
				        Home1.main(new String[]{});
				               }  
				               else{  
				                  // System.out.println("Please enter valid username and password");
				                         JOptionPane.showMessageDialog(null, "Please enter valid username and password.");
				               }  
				              //  }
				        }
				        catch(SQLException sql) {
				        sql.printStackTrace();
				        }
					}
				
					}});
		
		signupbtn.setFont(new Font("Century Schoolbook", Font.BOLD, 35));

		signupbtn.setBounds(386, 604, 405, 54);

		contentPane.add(signupbtn);

		

		pass = new JTextField();

		pass.setBounds(456, 499, 335, 54);

		contentPane.add(pass);

		pass.setColumns(10);

		

		uname = new JTextField();

		uname.setBounds(451, 402, 340, 54);

		contentPane.add(uname);

		uname.setColumns(10);

		

		JLabel signlbl = new JLabel("");

		signlbl.setIcon(new ImageIcon("C:\\Users\\shrut\\Downloads\\background.jpg"));

		signlbl.setForeground(new Color(240, 255, 255));

		signlbl.setBackground(new Color(192, 192, 192));

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

		backimg=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\3683641.png");

		bimg=backimg.getImage();

		Image imgScale4 =bimg.getScaledInstance(lblNewLabel_1.getWidth(),lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon scaledIcon4=new ImageIcon(imgScale4);



		lblNewLabel_1.setIcon(scaledIcon4);

		

		panel.add(lblNewLabel_1);

		

		JLabel background = new JLabel("");

		background.setBounds(0, 125, 1700, 743);

		img=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Untitled design.jpg");

		img1=img.getImage();

		Image imgScale = img1.getScaledInstance(background.getWidth(),background.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon scaledIcon=new ImageIcon(imgScale);

		background.setIcon(scaledIcon);

		

		contentPane.add(background);
		JLabel lb1 = new JLabel("EXAM SEATING MANAGMENT SYSTEM");
		lb1.setForeground(UIManager.getColor("Button.highlight"));
		lb1.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		lb1.setBounds(164, 34, 565, 50);
		panel.add(lb1);

		JLabel lb2 = new JLabel("A complete solution to manage seating plan of exam");
		lb2.setForeground(UIManager.getColor("Button.highlight"));
		lb2.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lb2.setBounds(164, 63, 608, 39);
		panel.add(lb2);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(35, 0, 149, 130);
		iconimg=new ImageIcon("C:\\\\Users\\\\shrut\\\\Downloads\\\\Infinite effect.png");
		iimg=iconimg.getImage();
		Image imgScale20 = iimg.getScaledInstance(lblNewLabel_3.getWidth(),lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
		   ImageIcon scaledIcon20=new ImageIcon(imgScale20);
		lblNewLabel_3.setIcon(scaledIcon20);

		panel.add(lblNewLabel_3);

	}

}