import java.util.*;

public class Area {   // class name
    public static int returnArea(int length, int width) {   //// creating a method
        int areaFormula = length * width;
        // return value
        return areaFormula;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tryAgain;
        int l;
        int w;
        int count=0;
        do {
            System.out.print("Enter Length: ");
            l = input.nextInt();  /// user input for length
            System.out.print("Enter Width: ");
            w = input.nextInt();  /// user input for width
            // create an object of Main
            Area obj = new Area();
            // calling method
            int result = obj.returnArea(l, w);
            System.out.println("The area is: " + result);
            System.out.print("Would you like to find the area of another rectangle?");
            input.nextLine();
            tryAgain = input.nextLine();
            count++;
        }
        while (tryAgain.equalsIgnoreCase("Yes"));

        if (tryAgain.equalsIgnoreCase("No")) {
            System.out.println("Thank you for creating " +count+" Areas with our program!");
        }






    }
}

















