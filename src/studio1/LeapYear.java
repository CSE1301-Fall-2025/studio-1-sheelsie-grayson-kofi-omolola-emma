package studio1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        boolean isLeapyear = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
        System.out.println(year + " is a leap year: " + isLeapyear);
    }
}
