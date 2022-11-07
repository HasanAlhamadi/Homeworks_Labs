import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Controller {
    protected Vector<Meal> allMeals;
    private int mid;
    private Meal oneMeal;
    private Vector<Double>allTotal;
    private double totalSum;
    public Controller() throws FileNotFoundException {
        allMeals=new Vector<>();
        mid=0;
        allTotal=new Vector<>();
        totalSum=0.0;

        File fileMenu=new File("menu");
        Scanner readFile=new Scanner(fileMenu);

        while (readFile.hasNext()){
            oneMeal=new Meal();
            oneMeal.setId(readFile.nextInt());
            oneMeal.setName(readFile.next());
            oneMeal.setPrice(readFile.nextDouble());
            allMeals.add(oneMeal);
        }
        readFile.close();
    }


    public Vector<Meal> getAllMeals() {
        return allMeals;
    }

    public Vector<Double> getAllTotal() {
        return allTotal;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public boolean search(int id){
        int firstIndex=0;
        int lastIndex=allMeals.size()-1;
        while (firstIndex<=lastIndex){
            mid=(firstIndex+lastIndex)/2;
            if (id==allMeals.get(mid).getId()){
                return true;
            }
            else if (id < allMeals.get(mid).getId()) {
                lastIndex--;
            }
            else {
                firstIndex++;
            }
        }
        return false;
    }

    public void add(String name,double price){
        oneMeal=new Meal();
        oneMeal.setId(allMeals.size()+1);
        oneMeal.setName(name);
        oneMeal.setPrice(price);
        allMeals.add(oneMeal);
    }

    public boolean checkDuplication(String name,double price){
        for (int i = 0; i < allMeals.size() ; i++) {
            if (allMeals.get(i).getName().toUpperCase().equals( name.toUpperCase() ) && allMeals.get(i).getPrice() ==price)
                return true;
        }
        return false;
    }

    public void edit(String name,double price){
        allMeals.get(mid).setName(name);
        allMeals.get(mid).setPrice(price);
    }

    public void remove(){
        allMeals.remove(mid);
        int x=1;
        for (int i = 0; i < allMeals.size() ; i++) {
            allMeals.get(i).setId(x);
            x++;
        }
    }

    public void calculation(Vector<Integer>allOrder,Vector<Integer>allAmount){
        double total;
        allTotal=new Vector<>();
        totalSum=0.0;
        for (int i = 0; i <allOrder.size() ; i++) {
            total=allMeals.get(allOrder.get(i)).getPrice() * allAmount.get(i);
            allTotal.add(total);
            totalSum+=allTotal.get(i);
        }
    }

    public void save() throws IOException {
        FileWriter writer=new FileWriter("menu");
        for (int i = 0; i < allMeals.size(); i++) {
            writer.write(allMeals.get(i).getId()+ "\t"+
                        allMeals.get(i).getName()+ "\t"+
                        allMeals.get(i).getPrice());
            if(!(i== allMeals.size()-1))
                writer.write("\n");
        }
        writer.close();
    }
}
