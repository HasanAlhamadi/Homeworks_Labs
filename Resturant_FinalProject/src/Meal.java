import java.util.Objects;

public class Meal {
    private int id;
    private String name;
    private double price;

    public Meal() {
        this.id = 0;
        this.name = null;
        this.price = 0.0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  id +"\t"+ name + "\t"+price +"\n";
    }
}
