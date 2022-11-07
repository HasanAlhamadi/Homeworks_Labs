import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Viewer extends Controller{
//    private Controller controller;
    private Scanner input;
    private int id;
    private String name;
    private double price;
    private Vector<Integer>allOrder;
    private Vector<Integer>allAmount;
    public Viewer() throws FileNotFoundException {
//        controller=new Controller();
        super();
        input=new Scanner(System.in);
        id=0;
        name=null;
        price=0.0;
        allOrder=new Vector<>();
        allAmount=new Vector<>();
    }

    public boolean start() throws IOException {
        int choice;
        System.out.println("_______________________________________");
        System.out.println("------WELCOME to RESTAURANT SYSTEM-----");
        System.out.println("_______________________________________");
        System.out.println("To add new meals to the menu press 1.");
        System.out.println("To edit the the current menu press 2.");
        System.out.println("To remove a meal from the menu press 3.");
        System.out.println("To start the program and order press 4.");
        System.out.println("To exit from the program press 0");
        System.out.print("Please choose: ");
        choice= input.nextInt();
        switch (choice){
            case 1: add(); break;
            case 2: edit(); break;
            case 3: remove(); break;
            case 4: order(); break;
            case 0: return true;
        }
        return false;
    }

    public void viewMenu(){
        System.out.println("ID   MEAL    PRICE");
        System.out.println("------------------");
        for (int i = 0; i < allMeals.size(); i++) {
            System.out.print(allMeals.get(i).toString());
//            System.out.println(controller.getAllMeals().get(i).getId()+ "\t"+
//                                controller.getAllMeals().get(i).getName()+ "\t"+
//                                 controller.getAllMeals().get(i).getPrice());
        }
    }

    public void add() throws IOException {
        System.out.println("To add a meal please enter:");
        System.out.print("Name:  ");
        name = input.next();
        System.out.print("Price:  ");
        price = input.nextDouble();
        if (checkDuplication(name, price))
            System.out.println("This meal already exists.");
        else {
            add(name, price);
            save();
            System.out.println("Meal added successfully.");
        }
    }

    public void edit() throws IOException {
        viewMenu();
        System.out.print("Please enter the ID of the meal you want to edit: ");
        id= input.nextInt();
        if (search(id)){
            System.out.print("Enter the new name:  ");
            name= input.next();
            System.out.print("Enter the new price:  ");
            price= input.nextInt();
            edit(name,price);
            save();
            System.out.println("Meal edited successfully.");
        }
        else {
            System.out.println("Sorry the ID you entered doesn't exist.");
        }
    }

    public void remove() {
        viewMenu();
        System.out.print("Please enter the ID of the meal you want to delete: ");
        id= input.nextInt();
        if (search(id)){
            super.remove();
            try {
                save();
            } catch (IOException e) {
                System.out.println("Error during writing to file.");
            }
            System.out.println("Meal removed successfully.");
        }
        else {
            System.out.println("Sorry the ID you entered doesn't exist.");
        }
    }

    public void order(){
        viewMenu();
        System.out.println("///////////  Enter the orders and amount of the order////////////" +
                        "\n/////////// Enter 0 for an order to confirm ///////////");
        allOrder=new Vector<>();
        allAmount=new Vector<>();
        int order;
        int amount;
        while (true){
            System.out.print("Order:  ");
            order= input.nextInt();
            if (order==0)
                break;
            else if (order>=1 && order<=allMeals.size()) {
                System.out.print("Amount:  ");
                amount= input.nextInt();
                if (amount==0)
                    continue;
                allOrder.add(order-1);
                allAmount.add(amount);
            }
            else
                System.out.println("Meal doesn't exist. Try again");

        }
        if (!allOrder.isEmpty()){
            calculation(allOrder,allAmount);
            printReceipt();
        }
        else
            System.out.println("You didn't order anything.");

    }

    public void printReceipt(){
        double pay;
        System.out.println("Your total  is "+getTotalSum());
        System.out.print("Enter the paid money: ");
        pay=input.nextDouble();
        if (pay>= getTotalSum()){
            double change;
            change=pay - getTotalSum();
            System.out.println("Meal\t| Amount\t| Price");
            System.out.println("_______________________________");
            for (int i = 0; i <allOrder.size() ; i++) {
                System.out.println(allMeals.get(allOrder.get(i)).getName()+ "\t" +
                               allAmount.get(i)+ "\t"+
                                getAllTotal().get(i)
                                );
            }
            System.out.println("Total price = "+ getTotalSum() +"____________________" +
                    "Change = "+change);
            System.out.println("______________________________");
        }
        else {
            int choice;
            System.out.println("The money is not enough.");
            System.out.println("1.Order again.");
            System.out.println("2.Give more money.");
            System.out.print("Please choose:  ");
            choice= input.nextInt();
            switch (choice){
                case 1: break;
                case 2: printReceipt();
            }
        }
    }
}
