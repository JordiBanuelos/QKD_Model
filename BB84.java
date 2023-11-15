import java.util.Random;
public class BB84 {
    public static void main(String []args) {
        final String fliter[] = {" || ", " -- ", " // ", " \\" + "\\ "};//polarized photons states
        int choice = 10;//amount of polarized photons being sent
        String base[] = new String[choice];//Alices photons
        String base2[] = new String[choice];//Bobs photons
        String nbrOfMatches = "";//String that stores the number of matches per round
        String num = "";//String that stores
        int count = 1;
        int count2 = 0; //added comment
        int same = 0;//counts when there the same
        String match = "";
        String key = "";
        //int num1 = 0;
        System.out.println("Hello welcome to the BB84 quantum key exchange simulation");
        while (count != 10 + 1) {//loop to do the experiment multiple times
            System.out.println("Alices:");        //for alice
            for (int i = 0; i < base.length; i++) {//start of loop
            base[i] = fliter[getRandomVaule()];
            System.out.print(i + 1 + ".");
            System.out.println(base[i]);
                }//end of loop
                 System.out.println(" ");
            System.out.println("Bob:");
              //for bob
              for (int i = 0; i < base.length; i++) {//start of loop
            base2[i] = fliter[getRandomVaule()];
            System.out.print(i + 1 + "." + base2[i] + "\n");
                 }//end of loop
                   for (int i = 0; i < base.length; i++) {//start of loop
                         if (base[i].equals(base2[i])) {
                              same++;
                              match = (match + "On round: " + count + " match was: " + base[i] + " " + base2[i] + "on postion: " + (i + 1) + "\n");
                               key = (key + base[i]);
                               count2++;
                         }
                        if (i == base.length - 1) {
                             nbrOfMatches = (nbrOfMatches + "Round " + count + " Has " + count2 + " key size " + " \n");
                             count2 = 0;
                        }
                   }//end of loop
             System.out.println("round: " + count + "\n -------------- ");
                   count++;
            }//end while loop
    System.out.println(match);
    System.out.println(nbrOfMatches);
    System.out.println("Average key size: " + same/choice);
    }//end of main
    public static int getRandomVaule(){
        Random random = new Random();
        int i = random.nextInt(4);
       return i;
    }
}
