import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public class GUI_viewer {
    private Controller controller;
    private int id;
    private String name;
    private double price;
    private JPanel MainPanel;
    private JButton addMealButton;
    private JButton deleteMealButton;
    private JButton editMealButton;
    private JButton orderButton;
    private JPanel Buttons;
    private JPanel allCards;
    private JPanel addMealPanel;
    private JPanel deleteMealPanel;
    private JPanel editMealPanel;
    private JPanel orderPanel;
    private JTextField addMealField;
    private JTextField addPriceField;
    private JButton addConfirmButton;
    private JTextArea deleteMenuTextArea;
    private JTextField deleteIdField;
    private JButton deleteConfirmButton;
    private JTextArea editMenuTextArea;
    private JTextField editIdfield;
    private JLabel Meal;
    private JTextField editNamefield;
    private JTextField editPriceField;
    private JButton editConfirmButton;
    private JTextArea orderMenuTextArea;
    private JTextField orderIdField;
    private JButton orderButton1;
    private JButton orderConfirmButton;
    private JLabel Price;
    private JLabel IdForOrder;
    private JLabel IdForDelete;
    private JLabel mealForAdd;
    private JLabel priceForAdd;
    private JLabel IdForEdit;
    private JTextField AmountOrderField;
    private JLabel AmountForOrder;
    private JTextArea ReceiptTextArea;
    private JButton cancelOrderButton;
    private Vector<Integer> allOrder;
    private Vector<Integer>allAmount;
    public GUI_viewer() throws FileNotFoundException {
        controller=new Controller();
        id=0;
        name=null;
        price=0.0;

        addMealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allCards.removeAll();
                allCards.add(addMealPanel);
                allCards.repaint();
                allCards.revalidate();
            }
        });
        deleteMealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allCards.removeAll();
                allCards.add(deleteMealPanel);
                allCards.repaint();
                allCards.revalidate();

                String menu="ID\tMEAL\tPRICE\n" +
                            "***********************************************\n";
                for (int i = 0; i < controller.getAllMeals().size(); i++) {
                    menu=menu+controller.getAllMeals().get(i).toString();
                }
                deleteMenuTextArea.setText(menu);
            }
        });
        editMealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allCards.removeAll();
                allCards.add(editMealPanel);
                allCards.repaint();
                allCards.revalidate();

                String menu="ID\tMEAL\tPRICE\n" +
                        "***********************************************\n";
                for (int i = 0; i < controller.getAllMeals().size(); i++) {
                    menu=menu+controller.getAllMeals().get(i).toString();
                }
                editMenuTextArea.setText(menu);
            }
        });
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allCards.removeAll();
                allCards.add(orderPanel);
                allCards.repaint();
                allCards.revalidate();

                allOrder=new Vector<>();
                allAmount=new Vector<>();
                String menu="ID\tMEAL\tPRICE\n" +
                        "***********************************************\n";
                for (int i = 0; i < controller.getAllMeals().size(); i++) {
                    menu=menu+controller.getAllMeals().get(i).toString();
                }
                orderMenuTextArea.setText(menu);
            }

        });

        addConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = addMealField.getText();
                price = Double.parseDouble(addPriceField.getText());
                if (controller.checkDuplication(name, price))
                    JOptionPane.showMessageDialog(null, "This meal already exists.");
                else {
                    controller.add(name, price);
                    try {
                        controller.save();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "error during writing to the file");
                    }
                    JOptionPane.showMessageDialog(null, "Meal added successfully.");
                }
            }
        });

        deleteConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id=Integer.parseInt(deleteIdField.getText());
                if (controller.search(id)){
                    controller.remove();
                    try {
                        controller.save();
                        JOptionPane.showMessageDialog(null,"Meal removed successfully.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,"error during writing to the file");
                    }
                }
                else {
                   JOptionPane.showMessageDialog(null,"Sorry the ID you entered doesn't exist.");
                }
            }
        });

        editConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               id=Integer.parseInt(editIdfield.getText());
                if (controller.search(id)){
                    name=editNamefield.getText();
                    price=Double.parseDouble(editPriceField.getText());
                    controller.edit(name,price);
                    try {
                        controller.save();
                        JOptionPane.showMessageDialog(null,"Meal edited successfully.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,"error during writing to the file");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Sorry the ID you entered doesn't exist.");
                }
            }
        });

        orderButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int order=Integer.parseInt(orderIdField.getText());
                int amount;

                if (order>=1 && order<=controller.getAllMeals().size()) {
                    amount=Integer.parseInt(AmountOrderField.getText());
                    if (amount!=0) {
                        allOrder.add(order - 1);
                        allAmount.add(amount);
                    }
                }
                else
                    JOptionPane.showMessageDialog(null,"Meal doesn't exists.");
            }
        });
        orderConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!allOrder.isEmpty()){
                    controller.calculation(allOrder,allAmount);
                    Receipt();
                }
                else
                    JOptionPane.showMessageDialog(null,"Nothing is ordered.");
            }
        });
        cancelOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allAmount=new Vector<>();
                allOrder=new Vector<>();
            }
        });
    }
    public void Receipt(){
        double pay=Double.parseDouble(JOptionPane.showInputDialog("Total = "+controller.getTotalSum()+"\n"
                                                        +"Please enter the paid money:"));

        if (pay>= controller.getTotalSum()) {
            double change;
            change = pay - controller.getTotalSum();

            String recepit = "Meal\t| Amount\t| Price\n" +
                    "_________________________________________\n";
            for (int i = 0; i < allOrder.size(); i++) {
                recepit = recepit + controller.getAllMeals().get(allOrder.get(i)).getName() + "\t" +
                        allAmount.get(i) + "\t" +
                        controller.getAllTotal().get(i) + "\n";
            }
            recepit += "---------------------------------------\n";
            recepit += "Total price = " + controller.getTotalSum() + "_____________________________" +
                    "Change = " + change + "\n" +
                    "_______________________________________________________";
            ReceiptTextArea.setText(recepit);
            allOrder=new Vector<>();
            allAmount=new Vector<>();
        }
        else {
           JOptionPane.showMessageDialog(null,"Paid Money is NOT enough.");
            }
        }



    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new JFrame("GUI_viewer");
        frame.setContentPane(new GUI_viewer().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setSize(900,500);
        frame.setVisible(true);
    }

}
