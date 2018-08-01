
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Circle circle = new Circle(); //Creates instance of circle 
        double radius; // intial radius 

        Scanner s = new Scanner(System.in); // new instance of scanner 
        System.out.print("Enter radius of circle:");
        radius = s.nextDouble(); // assigns user input to radius 

        // check if the user radius if not less than or equal to zero 
        if (!(radius <= 0)) {
            // sets radius 
            circle.setRadius(radius);
            //getArea calculates Area from set Radius and returns Area as double.
            System.out.println("Area of circle is:" + circle.getArea());

        } else {
            // send a error if less than or equal to zero 
            System.err.println("Radius of circle is less than or equal to 0: " + radius);
        }

    }
}
