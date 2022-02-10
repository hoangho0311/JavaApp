/*
 * Created by JFormDesigner on Wed Jan 19 21:59:53 ICT 2022
 */

package KTCK;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.plaf.*;

/**
 * @author unknown
 */
public class LoginForm extends JFrame {
    public LoginForm() {
        initComponents();
    }

    public MenuForm menu;
    private Statement statement;
    private Connection connection;
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
                }
            }
            if(kt){
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
        // Generated using JFormDesigner Evaluation license - 21IT348 Hồ Việt Hoàng
        logo = new JPanel();
        label2 = new JLabel();
        login = new JPanel();
        user = new JFormattedTextField();
        pass = new JPasswordField();
        dangnhap = new JButton();
        dangky = new JButton();
        label1 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/MN2/img/2037099 (1).png")).getImage());
        setTitle("INTETNET ");
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== logo ========
        {
            logo.setBackground(new Color(255, 102, 102));
            logo.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,logo. getBorder
            ( )) ); logo. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
            logo.setLayout(null);

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/MN2/img/2037099 (1).png")));
            logo.add(label2);
            label2.setBounds(35, 50, 255, 275);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < logo.getComponentCount(); i++) {
                    Rectangle bounds = logo.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = logo.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                logo.setMinimumSize(preferredSize);
                logo.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(logo);
        logo.setBounds(0, 0, 340, 430);

        //======== login ========
        {
            login.setBackground(new Color(238, 238, 238));
            login.setLayout(null);

            //---- user ----
            user.setText("USERNAME");
            user.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            user.setBackground(Color.white);
            login.add(user);
            user.setBounds(55, 125, 280, 45);

            //---- pass ----
            pass.setText("PASSWORD");
            pass.setBackground(Color.white);
            pass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            login.add(pass);
            pass.setBounds(55, 190, 280, 45);

            //---- dangnhap ----
            dangnhap.setText("LOGIN");
            dangnhap.setBackground(new Color(238, 238, 238));
            dangnhap.setForeground(Color.black);
            dangnhap.setFont(dangnhap.getFont().deriveFont(dangnhap.getFont().getSize() + 4f));
            dangnhap.addActionListener(e -> {
			dangnhap(e);
			dangnhap(e);
			dangnhap(e);
			dangnhap(e);
			dangnhap(e);
		});
            login.add(dangnhap);
            dangnhap.setBounds(55, 275, 115, 40);

            //---- dangky ----
            dangky.setText("CANCEL");
            dangky.setBackground(new Color(238, 238, 238));
            dangky.setForeground(Color.black);
            dangky.addActionListener(e -> EXIT(e));
            login.add(dangky);
            dangky.setBounds(210, 275, 105, 40);

            //---- label1 ----
            label1.setText("LOGIN");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 28));
            login.add(label1);
            label1.setBounds(60, 45, 160, 65);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < login.getComponentCount(); i++) {
                    Rectangle bounds = login.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = login.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                login.setMinimumSize(preferredSize);
                login.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(login);
        login.setBounds(340, 0, 430, 430);

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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 21IT348 Hồ Việt Hoàng
    private JPanel logo;
    private JLabel label2;
    private JPanel login;
    private JFormattedTextField user;
    private JPasswordField pass;
    private JButton dangnhap;
    private JButton dangky;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
