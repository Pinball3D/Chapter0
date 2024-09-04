import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        JTextField name = new JTextField();
        name.setBounds(50,30,100, 30);
        app.add(name);
        JButton enter = new JButton("Enter");
        enter.setBounds(50,65,100, 30);
        app.add(enter);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello, "+ name.getText());
            }
        });
        app.setSize(200,150);
        app.setLayout(null);
        app.setVisible(true);
    }
}