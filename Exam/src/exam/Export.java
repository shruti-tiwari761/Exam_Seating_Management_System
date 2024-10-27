package exam;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class Export extends JFrame {
    private JTable table;
    ImageIcon img,unameimg,passimg,backimg,img10,img12,pass,back,iconimg;

    Image img1,unimg,pimg,bimg,img11,img13,paimg,b,iimg;

    public Export() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(-10, -5, 3000, 3000);
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        setTitle("Database JTable Example");
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 0, 255));
        panel_1.setBounds(0, 0, 6000, 125);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        JLabel lblNewLabel_9 = 
        		new JLabel("New label");
        lblNewLabel_9.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        setVisible(false);
        Home1.main(new String[] {});
        }
        });
        lblNewLabel_9.setBounds(1402, 5, 120, 110);
        back=new ImageIcon("C:\\\\\\\\Users\\\\\\\\shrut\\\\\\\\Downloads\\\\\\\\3683641.png");
        b=back.getImage();
        Image imgScale7 = b.getScaledInstance(lblNewLabel_9.getWidth(),lblNewLabel_9.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon7=new ImageIcon(imgScale7);
        lblNewLabel_9.setIcon(scaledIcon7);

        panel_1.add(lblNewLabel_9);

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
        // Fetch data from the database and populate the table
        try {
        	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first?user=root&password=root");
             Statement statement = connection.createStatement();
             // Modified SQL query to order by the last 4 characters of enrollment
             String query = "SELECT s.name, s.enroll, s.FatherName, s.branch, s.sm ,r.room " +
                            "FROM first.profile s " +
                            "INNER JOIN first.seat r ON s.enroll = r.enroll " +
                            "ORDER BY RIGHT(s.enroll, 4)";
             ResultSet resultSet = statement.executeQuery(query);

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
            }

            Object[][] data = new Object[100][columnCount];
            int row = 0;
            while (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    data[row][i] = resultSet.getObject(i + 1);
                }
                row++;
            }

            Object[][] trimmedData = new Object[row][columnCount];
            System.arraycopy(data, 0, trimmedData, 0, row);

            JPanel panel = new JPanel();
            panel.setBounds(0, 126, 3000, 3000);
            panel.setBackground(new Color(0, 0, 0));
            contentPane.add(panel);
            panel.setLayout(null);

            table = new JTable();
            table.setForeground(new Color(255, 255, 255));
            table.setBackground(new Color(0, 0, 0));
            table.setBounds(200, 0, 1500, 700);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(10, 78, 1500, 400);
            panel.add(scrollPane);
            scrollPane.setForeground(new Color(0, 0, 0));
            scrollPane.setBackground(new Color(0, 0, 0));

            table.setModel(new DefaultTableModel(trimmedData, columnNames));
            
            JLabel lblNewLabel = new JLabel("ROOM 1 LIST ");
            lblNewLabel.setBounds(673, 22, 342, 23);
            panel.add(lblNewLabel);
            lblNewLabel.setForeground(new Color(255, 255, 255));
            lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 22));

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Export::new);
    }
}
