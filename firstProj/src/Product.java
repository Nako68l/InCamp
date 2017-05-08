import java.util.Random;

class Product {

    private int price;
    private boolean canDiscount = getDiscount();

    Product(/*String productName, int weight, */int price){
        this.price = price;
    }

    private int setValue() {
        Random random = new Random();
        return random.nextInt(45) + 5;
    }

    private int p = setValue();

    private int setDiscountPrice(int p) {
        int price = this.price;
        price = (price * (100 - p)) / 100;
        return price;
    }

    private boolean getDiscount() {
        Random random = new Random();
        return random.nextBoolean();
    }

    void output() {
        if (this.canDiscount)
            System.out.print(" You r lucky, today you get discount " + p +
                    "% and you needs pay " + setDiscountPrice(p) + " dollars instead of paying " +
                    this.price + " dollars. Have a nice day!");
        else
            System.out.print("You need pay " + this.price + ". Have a nice day!");
    }
/*
    public void successful_massage() {
        System.out.printf("Congratulations, product %s successfully added! Have a nice day!", this.productName);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
*/

}