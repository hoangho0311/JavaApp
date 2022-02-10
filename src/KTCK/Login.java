/*
 * Created by JFormDesigner on Tue Feb 08 10:59:37 ICT 2022
 */

package KTCK;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 21IT348 Hồ Việt Hoàng
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
    private void button1(ActionEvent e) {
  }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 21IT348 Hồ Việt Hoàng
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("text");
        button1.addActionListener(e -> button1(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(340, 240), button1.getPreferredSize()));

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
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
