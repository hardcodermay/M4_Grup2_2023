package JavaCode;

import java.io.*;
import java.util.Random;

public class HexExtension {

    private String USER_NAME;

    public String userGenerator() {
        Random numerX = new Random();
        int low = 100;
        int high = 65535;
        int randomInt = numerX.nextInt(high-low) + low;
        String HexUserExtension = Integer.toHexString(randomInt);
        USER_NAME = "m4_grupo2"+HexUserExtension;
        return USER_NAME;
    }

}
