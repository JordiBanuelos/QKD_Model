import java.util.Scanner;
public class Soical {
    public static void main(String args [] )
    {

        boolean isTrue = true;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please enter social security number:");
            String number = scan.nextLine();
            if (number.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
                System.out.println("Code works");
                isTrue = true;
            } else {
                System.out.println("try again");
                count++;
                isTrue = false;
            }
            if (count == 3) {
                System.out.println("To many wrong trys \nSyetem off");
                isTrue = true;
            }
        }while(!isTrue);


    }

}
