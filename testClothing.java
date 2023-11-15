public class testClothing {
    public static void main(String[]args){
        Clothing c1 = new Clothing();
        c1.details();

        c1.increasePrice();
        c1.details();

        c1.increasePrice(7);
        c1.details();
        Clothing c4 = new Clothing("Jeans","Small",31.2);

        c4.details();
        c4.increasePrice(10);
        c4.details();

        c4.increasePrice(4);
        c4.details();


    }

}
