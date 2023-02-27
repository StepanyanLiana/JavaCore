package classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date date = new Date();
       // System.out.println(date);
       //String dateStr = sdf.format(date);
        //System.out.println(dateStr);
        System.out.println("please input date(15/02/2023)");
        Scanner scanner = new Scanner(System.in);
        String myDateStr = scanner.nextLine();
        Date parse = sdf.parse(myDateStr);
        String dateStr = sdf.format(parse);
       System.out.println(dateStr);
    }
}

