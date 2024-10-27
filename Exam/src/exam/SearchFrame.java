package exam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class SearchFrame extends JFrame {
    private JTextField enrollField;
    private JButton searchButton;
    private JTextArea resultTextArea;
    private JLabel lblNewLabel;
    
    ImageIcon img,unameimg,passimg,backimg,img10,img12,pass,back,iconimg;

    Image img1,unimg,pimg,bimg,img11,img13,paimg,b,iimg;

    public SearchFrame() {
        super("Search Record");
        getContentPane().setBackground(new Color(192, 192, 192));
        setBounds(0,0,3000,3000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        JLabel background = new JLabel("");
        background.setBounds(0, 125, 1700, 743);

        JLabel background1 = new JLabel("");

		background1.setBounds(0, 125, 1700, 743);

		img=new ImageIcon("C:\\Users\\shrut\\Downloads\\Untitled design1.jpg");

		img1=img.getImage();

		Image imgScale = img1.getScaledInstance(background1.getWidth(),background1.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon scaledIcon=new ImageIcon(imgScale);
		                
		                JButton btnNewButton = new JButton("RESET");
		                btnNewButton.addActionListener(new ActionListener() {
		                	public void actionPerformed(ActionEvent e) {
		                		
		                	}
		                });
		                
		                JButton btnNewButton_1 = new JButton("BACK TO HOME");
		                btnNewButton_1.addActionListener(new ActionListener() {
		                	public void actionPerformed(ActionEvent e) {
		                		setVisible(false);
		                		Home.main(new String [] {});
		                	}
		                });
		                
		                lblNewLabel = new JLabel("SEARCH PANEL");
		                lblNewLabel.setBackground(new Color(255, 255, 255));
		                lblNewLabel.setForeground(new Color(255, 255, 255));
		                lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 22));
		                lblNewLabel.setBounds(550, 105, 379, 79);
		                getContentPane().add(lblNewLabel);
		                btnNewButton_1.setFont(new Font("Swis721 Cn BT", Font.BOLD, 18));
		                btnNewButton_1.setForeground(new Color(0, 0, 0));
		                btnNewButton_1.setBounds(400, 550, 250, 50);
		                getContentPane().add(btnNewButton_1);
		                btnNewButton.setFont(new Font("Swis721 Cn BT", Font.BOLD, 22));
		                btnNewButton.setBounds(555, 447, 136, 47);
		                getContentPane().add(btnNewButton);
		                
		                JSeparator separator_2 = new JSeparator();
		                separator_2.setOrientation(SwingConstants.VERTICAL);
		                separator_2.setBounds(250, 186, 2, 554);
		                getContentPane().add(separator_2);
		                
		                JSeparator separator_1 = new JSeparator();
		                separator_1.setBounds(250, 735, 1000, 2);
		                getContentPane().add(separator_1);
		                
		                JSeparator separator = new JSeparator();
		                separator.setForeground(UIManager.getColor("ComboBox.background"));
		                separator.setBounds(250, 186, 1000, 2);
		                getContentPane().add(separator);
		                
		                
		                JLabel lblNewLabel_1 = new JLabel("ENROLLMENT NUMBER :");
		                lblNewLabel_1.setForeground(new Color(255, 255, 255));
		                lblNewLabel_1.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));
		                lblNewLabel_1.setBounds(308, 338, 223, 47);
		                getContentPane().add(lblNewLabel_1);
		                resultTextArea = new JTextArea(10, 10);
		                resultTextArea.setBounds(800, 186, 450, 554);
		                getContentPane().add(resultTextArea);
		                resultTextArea.setFont(new Font("Swis721 Cn BT", Font.BOLD, 22));
		        
		                enrollField = new JTextField(10);
		                enrollField.setBounds(541, 342, 223, 47);
		                getContentPane().add(enrollField);
		
		
		
		        JScrollPane scrollPane = new JScrollPane();
		        scrollPane.setBounds(800, 186, 450, 554);
		        getContentPane().add(scrollPane);
		        JPanel panel = new JPanel();
                panel.setBackground(new Color(0, 0, 255));
                panel.setBounds(0, 0, 3000, 125);
                getContentPane().add(panel);
		        panel.setLayout(null);
		        JLabel lblNewLabel_10 = new JLabel("EXAM SEAT MANAGMENT SYSTEM");
                lblNewLabel_10.setForeground(UIManager.getColor("Button.highlight"));
                lblNewLabel_10.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
                lblNewLabel_10.setBounds(220, 30, 498, 32);
                panel.add(lblNewLabel_10);

                JLabel lblNewLabel_11 = new JLabel("A complete solution to manage seating plan of exam");
                lblNewLabel_11.setForeground(UIManager.getColor("Button.highlight"));
                lblNewLabel_11.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
                lblNewLabel_11.setBounds(220, 63, 480, 25);
                panel.add(lblNewLabel_11);

                JLabel lblNewLabel_12 = new JLabel("New label");
                lblNewLabel_12.setBounds(40, 0, 200, 141);
                iconimg=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\Infinite effect.png");
                iimg=iconimg.getImage();
                Image imgScale70 =iimg.getScaledInstance(lblNewLabel_12.getWidth(),lblNewLabel_12.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon70=new ImageIcon(imgScale70);
                lblNewLabel_12.setIcon(scaledIcon70);

                panel.add(lblNewLabel_12);
		searchButton = new JButton("SEARCH");
		searchButton.setFont(new Font("Swis721 Cn BT", Font.BOLD, 19));
		searchButton.setBounds(340, 446, 136, 47);
		getContentPane().add(searchButton);
		
		        searchButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                searchRecord();
		            }
		        });

		background1.setIcon(scaledIcon);

		

		getContentPane().add(background1);
                
                

        setVisible(true);
    }

    private void searchRecord() {
        String enroll = enrollField.getText();
        String query = "SELECT s.name, s.branch, r.room, s.sm, s.FatherName " +
                       "FROM profile s " +
                       "JOIN seat r ON s.enroll = r.enroll " +
                       "WHERE s.enroll = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first?user=root&password=root");
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, enroll);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Display results in the TextArea
                    resultTextArea.setText(
                    		"Student Information :     "+"\n"+
                        "Name: " + resultSet.getString("name") + "\n" +
                        "Branch: " + resultSet.getString("branch") + "\n" +
                        "Room Number: " + resultSet.getString("room") + "\n" +
                        "Semester: " + resultSet.getString("sm") + "\n" +
                        "Father's Name: " + resultSet.getString("FatherName")
                    );
                } else {
                    resultTextArea.setText("Record not found");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            resultTextArea.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ensure MySQL JDBC driver is in the classpath
        new SearchFrame();
    }
}
