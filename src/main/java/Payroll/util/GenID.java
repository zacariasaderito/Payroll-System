package Payroll.util;

import java.util.UUID;

public class GenID {

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

}
