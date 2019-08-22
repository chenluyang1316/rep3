package page.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemTest {
    public static void main(String[] args) {
       // System.out.println(System.currentTimeMillis());

        long timeMillis = System.currentTimeMillis();
        Date date = new Date();
        System.out.println( date.getTime());

        System.out.println(new Date(1566348414405L));


    }
}
