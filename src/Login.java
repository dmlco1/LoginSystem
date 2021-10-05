import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;


// Login page
public class Login implements ActionListener{
    public final static int SCREEN_HEIGHT = 300;
    public final static int SCREEN_WIDTH = 300;

    // Create JFrame
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JTextField idField = new JTextField("ID");
    JPasswordField passwordField = new JPasswordField("Password", 10);

    HashMap<String, String> userInfo;

    Login(HashMap<String, String> userLogin){
        // Copy of user data that can be accessible for other methods
        userInfo = userLogin;
        PrepareFrame(); // Create Frame
        frameComponents(this); // Add text fields, labels and buttons
    }

    // Set the JFrame before adding components
    private void PrepareFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Always appear in the center of the screen
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void checkCredentials(){
        String userID = idField.getText();
        // Get password but it`s a char, so we need to convert to String
        String userPassword = String.valueOf(passwordField.getPassword());

        // Check if user ID is correct
        if (userInfo.containsKey(userID)){
            if (userInfo.get(userID).equals(userPassword)){
                System.out.println("Login successful");
            }
        }
    }

    // Add initial components to the Frame
    private void frameComponents(Login login){
        loginButton.setBounds(100, 150, 100, 50);
        idField.setBounds(100, 50, 100, 30);
        frame.add(loginButton);
        loginButton.addActionListener(login);
        frame.add(idField);
        frame.add(passwordField);
        // setBounds in passwordField needs to be after add method to work
        // No clue why this happens
        passwordField.setBounds(100, 100, 100, 30);
        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    //TODO: checkCredentials function here
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Do nothing
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Do nothing
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton){
            checkCredentials();
        }
    }
}