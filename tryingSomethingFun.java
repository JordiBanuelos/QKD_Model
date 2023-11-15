import java.util.Scanner;
public class tryingSomethingFun {

    public static void main(String[] args) {
       /*
                    .Split() Code
       Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter a text:");
        String text = Scan.nextLine();
        String[] array = text.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            }
*/       Scanner Scan = new Scanner(System.in);

        int o = 5;
        o =-o;
        System.out.println(o);

        int j = -1;
        j =+j;
        System.out.println(j);
int size = 1;
        int k = -1;
        k =--k;
        System.out.println(k);
        //write a program that stores string into an array of string that the user inputed and let the user keep writing until they say no
        System.out.println("write words");
        String words [] = new String[size];
        String word;
        boolean isOn = true;
        do{
            int i = 0;
        words [i] = Scan.nextLine();
        System.out.println(words[i]);
        size++;
        System.out.println(size);
        i++;
            }while(!isOn);
        }

    }
