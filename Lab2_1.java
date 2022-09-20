import java.util.Scanner;
public class Lab2_1 {
    //import main method
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);   //construct for scanner
        System.out.print("Enter the x-coordinate of point 1: ");
        double x1 = input.nextDouble();    //scan from keyboard number variable
        System.out.print("Enter the y-coordinate of point 1: ");
        double y1 = input.nextDouble();  //scan from the keyboard number variable
        System.out.print("Enter z-coordinate of point 1: ");
        double z1 = input.nextDouble();  //scan from the keyboard number variable

        System.out.print("Enter the x-coordinate of point 2: ");
        double x2 = input.nextDouble();    //scan from keyboard number variable
        System.out.print("Enter the y-coordinate of point 2: ");
        double y2 = input.nextDouble();  //scan from the keyboard number variable
        System.out.print("Enter z-coordinate of point 2: ");
        double z2 = input.nextDouble();  //scan from the keyboard number variable

        double distanceBetweenP1AndP2 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2)); //initialize the distance between two points
        System.out.println("The distance between point 1 and point 2 is: " + distanceBetweenP1AndP2);

        double floor = Math.floor(distanceBetweenP1AndP2);
        int fl = (int) floor;
        System.out.println("The integer part of the distance between point 1 and point 2 is: " + fl);

        double ceil = distanceBetweenP1AndP2 - 11;
        System.out.println("The fraction part of the distance between point 1 and point 2 is: " + ceil);

    }
}
