import java.util.Random;

public class updatedBB84 {
    public final String fliter[] = {" || ", " -- ", " // ", " \\" + "\\ "};
    public int choice;
    public String base[] = new String[choice];
    public String base2[] = new String[choice];
    public int [] track = new int [4];
    public String num = "";
    public int count = 1;
    public int same = 0;//counts when there the same
    public String match = "";
    public String key = "";
    //contructor
    public updatedBB84 (int x){
        this.choice = x;
    }
    public String getphoton(String [] base){

        for (int i = 0; i < base.length; i++) {//start of loop
            base[i] = fliter[getRandomVaule()];
            System.out.print(i + 1 + ".");
            System.out.println(base[i]);
        }//end of loop
        return base[3];
    }

    public static int getRandomVaule(){
        Random random = new Random();
        int i = random.nextInt(4);
        return i;
    }




}
