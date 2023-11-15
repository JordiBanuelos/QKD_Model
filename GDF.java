import java.awt.*;

public class GDF {
    public static void main(String [] arg){
        int a = 123;
        int b = 36;
        int temp1 = 1;
        int temp2 = 1;
        int answer = 1;
        boolean istrue = true;
        if(a>b) {
            while (istrue) {
                temp1 = a / b;
                temp2 = a % b;
                //answer = b / temp2;

                if (a % b == 0) {
                    System.out.println(answer);
                    istrue = false;
                }
                a = b;
                b = temp2;
                temp1 = answer;
                temp2 = temp1;
            }
        }
        }//end of main
    }//end of class

