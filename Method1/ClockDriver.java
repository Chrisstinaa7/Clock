
/**
 * Write a description of class ClockDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ClockDriver{
    public static void main (String arg[]){

        ClockDisplay myClock=new ClockDisplay();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours: ");
        int hours=sc.nextInt();
        System.out.println("Enter the minutes: ");
        int minutes=sc.nextInt();
        System.out.println("Enter the seconds: ");
        int seconds=sc.nextInt();
        myClock.setTime(hours,minutes,seconds);
        System.out.println(myClock.getDisplay());
        
        
        for(int h=0; h<61; h++){
        myClock.clockTick();
        System.out.println(myClock.getDisplay());
    }
        
    }

}