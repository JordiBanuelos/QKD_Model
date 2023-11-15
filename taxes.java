import java.util.Scanner;

public class taxes {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter hours: ");
        double hours = scan.nextDouble();

        System.out.println("enter percent: ");
        double taxes = scan.nextDouble();

        System.out.println("enter pay: ");
        double pay = scan.nextDouble();

        if (hours > 40) {
            overTimeCal(hours, taxes, pay);
        } else {
            double answer = (pay * hours);

            double taxTotal = answer * taxes;

            double finalPay = answer - taxTotal;
            System.out.println("money =" + finalPay);
        }
    }
  public static double overTimeCal(double x,double y,double z){
        //x = hours y = taxes z = pay
        double overTimeHours = x - 40;
        double overTimePay = (z/2)+z;//overtime formula
        double finalPay = overTimeHours*overTimePay;

                //System.out.println(finalPay);

        return (z);
    }
}


