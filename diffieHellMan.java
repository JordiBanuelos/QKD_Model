import java.util.Random;

public class diffieHellMan {
    public static void main(String[]arg){
        double generator = 7;////generator
        double prime = 11;//prime
        //Hey jordi in the future find out why these numbers above don't work

        //randomize the numbers picked
        Random random = new Random();
        double privB = random.nextInt((int)prime-1);
        double privA = random.nextInt((int)prime-1);//private prime number Alice
        //out printing what Alice and Bob got
        System.out.println("randomly picked by Alice: "+(int)privA);
        System.out.println("randomly picked by Bob: "+(int)privB + "\n");
        //calculations to find a number, which will be shared publicly
        double a = (Math.pow(generator,privB))%prime;
        double b = (Math.pow(generator,privA))%prime;
        //calculation to get to key
        double keyA = Math.pow(b,privB);
        keyA=keyA%prime;
        double keyB = Math.pow(a,privA);
        keyB=keyB%prime;
        System.out.println("Bobs key: "+ (int)keyB + " Alices key: "+ (int)keyA);
    }//end of main
}//end of class
