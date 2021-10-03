public class Main {
    public static void main(String[] args) {
        IdPassword loginInformation = new IdPassword();

        Login loginPage = new Login(loginInformation.loginInfo);
    }
}
