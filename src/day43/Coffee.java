package day43;

public class Coffee {

    private String type;
    private int caffeineLevel;
    private double price;


    public Coffee() {


        //print("no arg constructor")
    }

    public Coffee(String type, int caffeineLevel) {


        this.type = type;
        this.caffeineLevel = caffeineLevel;
    }


    public Coffee(String type, int caffeineLevel, double price) {

        this.type = type;
        this.caffeineLevel = caffeineLevel;

        if (price > 0) {

            this.price = price;


        } else {

            this.price = 1;

        }


        this.price = price;


    }


    public String getType() {


        return type;

    }

    public void setType(String type) {

        this.type = type;


    }

    public int getCaffeineLevel() {


        return caffeineLevel;

    }

    public void setCaffeineLevel(int caffeineLevel) {

        this.caffeineLevel = caffeineLevel;

    }


    public double getPrice() {


        return price;

    }


    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;

        } else {

        }
        this.price = 1;
    }


    public String toString() {


        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';


    }
}
