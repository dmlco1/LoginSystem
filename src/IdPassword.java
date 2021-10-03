import java.util.HashMap;
import java.util.HashMap;

// Hashmap of every ID and Password
public class IdPassword {
    HashMap<Integer, String> loginInfo = new HashMap<>();

    IdPassword(){
        loginInfo.put(112, "login");
        loginInfo.put(555, "soup");
        loginInfo.put(164, "java");
    }
    protected HashMap getInfo(){
            return loginInfo;
        }
}

