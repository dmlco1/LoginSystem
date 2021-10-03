import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;




// Login page
public class Login implements ActionListener {
    public final static int SCREEN_HEIGHT = 300;
    public final static int SCREEN_WIDTH = 300;

    // Create JFrame
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JTextField idField = new JTextField("ID");
    JPasswordField passwordField = new JPasswordField("Password");

    HashMap<Integer, String> userInfo;

    Login(HashMap<Integer, String> userLogin){
        // Copy of user data that can be accessible for other methods
        userInfo = userLogin;

        // JFrame attributes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setResizable(false);
        frame.setVisible(true);
        loginButton.setBounds(100, 150, 100, 50);
        idField.setBounds(100, 50, 100, 30);
        passwordField.setBounds(100, 100, 100, 30);
        frame.add(loginButton);
        frame.add(idField);
        frame.add(passwordField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}