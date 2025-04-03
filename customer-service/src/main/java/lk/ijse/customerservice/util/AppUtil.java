package lk.ijse.customerservice.util;

import java.util.UUID;

public class AppUtil {
    public static String generateUserId(){
        return "USER-" + UUID.randomUUID();
    }
}
