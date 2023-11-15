import java.util.Scanner;
public class omariClass {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);



System.out.println("Please enter a password:");
      String Password = scan.nextLine();
              boolean istrue = false;
int count = 0;
      do {
          System.out.println("Enter what you think:");
          String guessWord = scan.nextLine();

          if (Password.equals(guessWord)) {
              System.out.println("You guessed correctly");
              istrue = true;
          } else {

              System.out.print("Wrong try again! ");
              istrue = false;
              count++;

          }

          if(count == 3) {
              System.out.println("To many wrong try system turning off");
              istrue = true;
          }

      }while(!istrue);

    }//end of main


}//end of class