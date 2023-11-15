public class Clothing {
    public String type;
    public String size;
    public double price;


    public Clothing() {
        this.type = "T-Shirt";
        this.size = "Medium";
        this.price = 29.9;
    }
    public Clothing(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void details() {

        System.out.println("Item : " + type );
        System.out.println("Size : " + size);
        System.out.println("Price : $" + price);
        System.out.println(" ");
    }

        public void increasePrice(){//start

        this.price = price + 5;
    }//end of increasePrice

        public void increasePrice(double x) {//start of method
        this.price = price + x;
        }//end of method


}//end of class
