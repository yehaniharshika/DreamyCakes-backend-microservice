package lk.ijse.productservice.util;

import java.util.UUID;

public class AppUtil {
    public static String generateProductCode(){
        return "CAKE-" + UUID.randomUUID();
    }
}
