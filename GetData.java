import java.util.Scanner;
public class GetData {

    public static void main(String [] arg){
      Scanner scan = new Scanner(System.in);
      System.out.println("Hello welcome to encryption standards!\nType a word that you would like to encrypt:");
      String plaintext = scan.nextLine();
      char array[] = plaintext.toCharArray();
      //int binary[] = new int[array.length];
      System.out.println(array);
for(int i =0;i<array.length;i++){//start of loop
    //System.out.println((int)array[i]);
    System.out.println(Integer.toBinaryString(array[i]));


}//end of loop



    }//end of main
}//end of class
