/*
 * Created by JFormDesigner on Sun Jan 30 20:24:01 ICT 2022
 */

package KTCK;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

/**
 * @author 21IT348 Hồ Việt Hoàng
 */
public class loadingScreen extends JFrame {
    public loadingScreen() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    Connection connection;
    Statement statement;
    String quyen;
    private void dangnhap(ActionEvent e) {
        boolean kt = false;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/internetmanager","hoang","1234");
            statement = connection.createStatement();
            ResultSet rst = statement.executeQuery("SELECT * FROM login ");
            while (rst.next()){
                if(rst.getString(1).equals(user.getText()) && rst.getString(2).equals(String.valueOf(pass.getPassword()))){
                    quyen = rst.getString(4);
                    kt = true;
                    break;
                }else error.setText("Incorrect username or password.");
            }
            if(kt){
                new MenuForm(quyen);
                setVisible(false);
            }else System.out.println("hao");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    private void EXIT(ActionEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hoang
        panel1 = new JPanel();
        error = new JLabel();
        button1 = new JButton();
        pass = new JPasswordField();
        button2 = new JButton();
        user = new JTextField();
        numberload = new JLabel();
        loadingValue = new JLabel();
        progressBar1 = new JProgressBar();
        label3 = new JLabel();
        label2 = new JLabel();
        picture = new JLabel();

        //======== this ========
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/MN2/img/2037099.png")).getImage());
        setTitle("INTERNET");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
            panel1.setLayout(null);

            //---- error ----
            error.setFont(error.getFont().deriveFont(error.getFont().getStyle() | Font.BOLD, error.getFont().getSize() + 8f));
            error.setForeground(new Color(238, 8, 8));
            panel1.add(error);
            error.setBounds(480, 350, 410, 25);

            //---- button1 ----
            button1.setText("LOGIN");
            button1.setBackground(Color.white);
            button1.addActionListener(e -> dangnhap(e));
            panel1.add(button1);
            button1.setBounds(510, 385, 145, 40);

            //---- pass ----
            pass.setBackground(Color.white);
            pass.setText("PASSWORD");
            pass.setFont(pass.getFont().deriveFont(pass.getFont().getSize() + 6f));
            panel1.add(pass);
            pass.setBounds(475, 285, 425, 60);

            //---- button2 ----
            button2.setText("CANCEL");
            button2.setBackground(Color.white);
            button2.addActionListener(e -> {
			dangnhap(e);
			EXIT(e);
		});
            panel1.add(button2);
            button2.setBounds(720, 385, 140, 40);

            //---- user ----
            user.setBackground(Color.white);
            user.setText("USERNAME");
            user.setFont(user.getFont().deriveFont(user.getFont().getSize() + 6f));
            panel1.add(user);
            user.setBounds(475, 210, 425, 55);

            //---- numberload ----
            numberload.setText("0%");
            numberload.setForeground(Color.white);
            numberload.setFont(new Font("Roboto Light", Font.PLAIN, 17));
            numberload.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(numberload);
            numberload.setBounds(1275, 630, 70, 21);

            //---- loadingValue ----
            loadingValue.setText("Loading.....");
            loadingValue.setForeground(Color.white);
            loadingValue.setFont(new Font("Roboto Light", Font.PLAIN, 17));
            panel1.add(loadingValue);
            loadingValue.setBounds(5, 630, 215, loadingValue.getPreferredSize().height);
            panel1.add(progressBar1);
            progressBar1.setBounds(0, 655, 1350, 14);

            //---- label3 ----
            label3.setText("INTERNET BANKING");
            label3.setIcon(null);
            label3.setForeground(Color.white);
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 48));
            panel1.add(label3);
            label3.setBounds(430, 110, 510, 50);

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/KTCK/img/4898890.png")));
            label2.setFont(new Font("Segoe UI", Font.PLAIN, 48));
            label2.setVisible(false);
            panel1.add(label2);
            label2.setBounds(430, -20, 735, 585);

            //---- picture ----
            picture.setIcon(new ImageIcon(getClass().getResource("/MN2/img/479190-cool-color-backgrounds-1920x1200-hd-for-mobile.jpg")));
            panel1.add(picture);
            picture.setBounds(0, 0, 1350, 670);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 1350, 670);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public static void main(String[] args) {
        loadingScreen sp = new loadingScreen();
        sp.setVisible(true);
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(70);
                sp.numberload.setText(i+"%");
                if(i==10){
                    sp.loadingValue.setText("Turning on Modules...");
                }
                if(i==20){
                    sp.loadingValue.setText("Loading Modules...");
                }
                if(i==50){
                    sp.loadingValue.setText("Connecting to Database...");
                }
                if(i==70){
                    sp.loadingValue.setText("Connection Succesful !");
                }
                if(i==80){
                    sp.loadingValue.setText("Lauching Application...");
                }
                if(i==98){
                    sp.loadingValue.setText("Done !");
                }
                if(i==100){

                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hoang
    private JPanel panel1;
    private JLabel error;
    private JButton button1;
    private JPasswordField pass;
    private JButton button2;
    private JTextField user;
    private JLabel numberload;
    private JLabel loadingValue;
    private JProgressBar progressBar1;
    private JLabel label3;
    private JLabel label2;
    private JLabel picture;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
