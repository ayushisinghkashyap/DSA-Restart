import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        int r = sc.nextInt();

        double area = 3.14* r*r;
        //Rounds the area to specific decimal places
        String roundarea = String.format("%.2f",area);
        //round up to the nearest float number
        double roundarea2 = Math.ceil(area);
        //rounds the number down to the nearest integer(float)
        double roundarea3 = Math.floor(area);
        //rounds the number(float) to the nearest long(integer)
        long roundarea4 = Math.round(area);


        System.out.println("Area of Circle: "+area); // auctual area of the circle

        System.out.println("Area with 2 decimal places : "+roundarea);
        System.out.println("area in nearest integer(float): "+roundarea2);
        System.out.println("area in down to the nearest integer(float): "+roundarea3);
        System.out.println("Area rounded to the nearest long(integer): "+roundarea4);
    }
}
