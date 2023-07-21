package pa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

class A1 extends JFrame implements ActionListener {
       Container c;
       JButton  btnTime;
      

       A1() {
                   
              c = getContentPane();
              c.setLayout(null);

              
              btnTime = new JButton("Show Time");
              btnTime.setBounds(100, 150, 300, 50);
              

              Font f = new Font("Impact", Font.BOLD + Font.ITALIC, 50);
              btnTime.setFont(f);

              
              c.add(btnTime);
              

              
              btnTime.addActionListener(this);

              setSize(500, 500);
              setLocation(200, 100);
              setTitle("Clock");
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setVisible(true);
              getContentPane().setBackground(Color.PINK);
              setIconImage(new ImageIcon("image.png").getImage());
              setResizable(false);
}

       public void actionPerformed(ActionEvent ae) {
                        if (ae.getSource() == btnTime) {
                            
                        Date d = new Date();
                        DateFormat df = DateFormat.getTimeInstance(DateFormat.FULL, new Locale("en", "IN"));
                        String ds = df.format(d);
                        JOptionPane.showMessageDialog(c, ds);
                       
    }

 }
}

class A1Test {
public static void main(String args[]) {
           A1 a = new A1();
}
}
