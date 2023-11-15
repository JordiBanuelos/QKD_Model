import java.util.Scanner;
public class Working {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number that you want to divid:");
        float nbr1 = scan.nextFloat();
        System.out.println("Please enter the second number that you want to divid:");
        float nbr2 = scan.nextFloat();

        float anr = (nbr1/nbr2);
        System.out.println("This is the answer to " + nbr1 + " /" + nbr2 + " = " + anr);
    }

}
