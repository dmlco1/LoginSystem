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
    JPasswordField passwordField = new JPasswordField("Password", 10);

    HashMap<Integer, String> userInfo;

    Login(HashMap<Integer, String> userLogin){
        // Copy of user data that can be accessible for other methods
        userInfo = userLogin;
        PrepareFrame(); // Create Frame
        frameComponents(); // Add text fields, labels and buttons
    }

    // Set the JFrame before adding components
    private void PrepareFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Always appear in the center of the screen
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // Add initial components to the Frame
    private void frameComponents(){
        loginButton.setBounds(100, 150, 100, 50);
        idField.setBounds(100, 50, 100, 30);
        frame.add(loginButton);
        frame.add(idField);
        frame.add(passwordField);
        // setBounds in passwordField needs to be after add method to work
        // No clue why this happens
        passwordField.setBounds(100, 100, 100, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}