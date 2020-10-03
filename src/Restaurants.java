import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
public class Restaurants {
private JFrame frame;
private JTextField jtxtVegBurger;
private JTextField jtxtChickenBurger;
private JTextField jtxtPizza;
private JTextField jtxtQty;
private JTextField jtxtReceipts;
private JTextField txtNameQty;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTextField textField_9;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Restaurants window = new Restaurants();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the application.
*/
public Restaurants() {
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds( 0, 5, 1538, 860);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JPanel panel = new JPanel();
panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel.setBounds(24, 88, 528, 339);
frame.getContentPane().add(panel);
panel.setLayout(null);
JLabel lblVegBurger = new JLabel("Veg Burger");
lblVegBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblVegBurger.setBounds(26, 28, 134, 29);
panel.add(lblVegBurger);
JLabel lblChickenBurger = new JLabel("Chicken Burger");
lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblChickenBurger.setBounds(26, 86, 174, 29);
panel.add(lblChickenBurger);
JLabel lblPizza = new JLabel("Pizza");
lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblPizza.setBounds(26, 144, 134, 29);
panel.add(lblPizza);
JLabel lblDrink = new JLabel("Drink");
lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblDrink.setBounds(26, 217, 134, 29);
panel.add(lblDrink);
jtxtVegBurger = new JTextField();
jtxtVegBurger.setHorizontalAlignment(SwingConstants.CENTER);
jtxtVegBurger.setBounds(244, 27, 232, 30);
panel.add(jtxtVegBurger);
jtxtVegBurger.setColumns(10);
jtxtChickenBurger = new JTextField();
jtxtChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
jtxtChickenBurger.setColumns(10);
jtxtChickenBurger.setBounds(244, 85, 232, 30);
panel.add(jtxtChickenBurger);
jtxtPizza = new JTextField();
jtxtPizza.setHorizontalAlignment(SwingConstants.CENTER);
jtxtPizza.setColumns(10);
jtxtPizza.setBounds(244, 141, 232, 32);
panel.add(jtxtPizza);
JLabel lblQty = new JLabel("Qty");
lblQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblQty.setBounds(244, 217, 134, 29);
panel.add(lblQty);
JComboBox jcmbDrink = new JComboBox();
jcmbDrink.setFont(new Font("Tahoma", Font.PLAIN, 17));
jcmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Orange Juice", "Cola", "Coke", "Coffee", "Tea", "Ice Tea","Green Tea"}));
jcmbDrink.setBounds(26, 256, 130, 29);
panel.add(jcmbDrink);
JCheckBox jCDelivery = new JCheckBox("Home Delivery");
jCDelivery.setFont(new Font("Tahoma", Font.PLAIN, 17));
jCDelivery.setBounds(26, 299, 138, 21);
panel.add(jCDelivery);
JCheckBox jCTax = new JCheckBox("Tax");
jCTax.setFont(new Font("Tahoma", Font.PLAIN, 17));
jCTax.setBounds(244, 302, 93, 21);
panel.add(jCTax);
JSeparator separator = new JSeparator();
separator.setBounds(415, 204, -381, 2);
panel.add(separator);
JSeparator separator_1 = new JSeparator();
separator_1.setBounds(230, 216, -89, -10);
panel.add(separator_1);
JSeparator separator_2 = new JSeparator();
separator_2.setBounds(21, 204, 472, 3);
panel.add(separator_2);
jtxtQty = new JTextField();
jtxtQty.setBounds(244, 256, 232, 32);
panel.add(jtxtQty);
jtxtQty.setHorizontalAlignment(SwingConstants.CENTER);
jtxtQty.setColumns(10);
JPanel panel_1 = new JPanel();
panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_1.setBounds(616, 88, 417, 339);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);
JComboBox jcmbCurrency = new JComboBox();
jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "Cash", "Credit Card", "Debit Card", "UPI", "Other"}));
jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 18));
jcmbCurrency.setBounds(79, 178, 257, 48);
panel_1.add(jcmbCurrency);
JLabel lblPaymentMethod = new JLabel("Select Payment Method");
lblPaymentMethod.setFont(new Font("Tahoma", Font.PLAIN, 25));
lblPaymentMethod.setBounds(68, 67, 291, 40);
panel_1.add(lblPaymentMethod);
JLabel label = new JLabel("");
label.setHorizontalAlignment(SwingConstants.RIGHT);
label.setFont(new Font("Tahoma", Font.PLAIN, 24));
label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
label.setBounds(55, 59, 300, 48);
panel_1.add(label);
JPanel panel_2 = new JPanel();
panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_2.setBounds(24, 479, 528, 250);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);
JLabel lblCostOfMeal = new JLabel("Cost of Meal");
lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblCostOfMeal.setBounds(30, 42, 134, 29);
panel_2.add(lblCostOfMeal);
JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblCostOfDrinks.setBounds(32, 104, 170, 29);
panel_2.add(lblCostOfDrinks);
JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
lblCostOfDelivery.setBounds(33, 170, 182, 29);
panel_2.add(lblCostOfDelivery);
JLabel jlblCostOfMeal = new JLabel("");
jlblCostOfMeal.setHorizontalAlignment(SwingConstants.CENTER);
jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
jlblCostOfMeal.setBounds(259, 42, 210, 29);
jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
panel_2.add(jlblCostOfMeal);
JLabel jlblCostOfDrinks = new JLabel("");
jlblCostOfDrinks.setHorizontalAlignment(SwingConstants.CENTER);
jlblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
jlblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
jlblCostOfDrinks.setBounds(259, 104, 210, 29);
panel_2.add(jlblCostOfDrinks);
JLabel jlblCostOfDelivery = new JLabel("");
jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.CENTER);
jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
jlblCostOfDelivery.setBounds(259, 170, 210, 29);
panel_2.add(jlblCostOfDelivery);
JPanel panel_4 = new JPanel();
panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_4.setBounds(1079, 88, 417, 640);
frame.getContentPane().add(panel_4);
panel_4.setLayout(null);
JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
tabbedPane_1.setBounds(10, 43, 397, 587);
panel_4.add(tabbedPane_1);
JPanel panel_6 = new JPanel();
tabbedPane_1.addTab("Receipt", null, panel_6, null);
tabbedPane_1.setBackgroundAt(0, Color.WHITE);
jtxtReceipts = new JTextField();
jtxtReceipts.setBounds(10, 10, 372, 54);
jtxtReceipts.setBorder(null);
jtxtReceipts.setHorizontalAlignment(SwingConstants.CENTER);
jtxtReceipts.setText("RECEIPT");
jtxtReceipts.setFont(new Font("Tahoma", Font.BOLD, 30));
jtxtReceipts.setColumns(10);
txtNameQty = new JTextField();
txtNameQty.setBounds(10, 63, 372, 47);
txtNameQty.setText("   Item :	     (Qty)	                      Price");
txtNameQty.setFont(new Font("Tahoma", Font.PLAIN, 14));
txtNameQty.setBorder(null);
txtNameQty.setColumns(10);
textField_1 = new JTextField();
textField_1.setBounds(10, 109, 372, 47);
textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_1.setBorder(null);
textField_1.setColumns(10);
textField_2 = new JTextField();
textField_2.setBounds(10, 151, 372, 47);
textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_2.setBorder(null);
textField_2.setColumns(10);
textField_3 = new JTextField();
textField_3.setBounds(10, 195, 372, 47);
textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_3.setBorder(null);
textField_3.setColumns(10);
textField_4 = new JTextField();
textField_4.setBounds(10, 240, 372, 47);
textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_4.setBorder(null);
textField_4.setColumns(10);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBounds(10, 572, 372, 54);
lblNewLabel.setBackground(SystemColor.text);
textField_5 = new JTextField();
textField_5.setBounds(10, 283, 372, 54);
textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_5.setColumns(10);
textField_5.setBorder(null);
panel_6.setLayout(null);
panel_6.add(textField_3);
panel_6.add(textField_1);
panel_6.add(txtNameQty);
panel_6.add(textField_2);
panel_6.add(textField_4);
panel_6.add(jtxtReceipts);
panel_6.add(lblNewLabel);
panel_6.add(textField_5);
textField_6 = new JTextField();
textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_6.setColumns(10);
textField_6.setBorder(null);
textField_6.setBounds(10, 336, 372, 54);
panel_6.add(textField_6);
textField_7 = new JTextField();
textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_7.setColumns(10);
textField_7.setBorder(null);
textField_7.setBounds(10, 389, 372, 54);
panel_6.add(textField_7);
textField_8 = new JTextField();
textField_8.setFont(new Font("Tahoma", Font.BOLD, 18));
textField_8.setColumns(10);
textField_8.setBorder(null);
textField_8.setBounds(10, 443, 372, 54);
panel_6.add(textField_8);
textField_9 = new JTextField();
textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
textField_9.setColumns(10);
textField_9.setBorder(null);
textField_9.setBounds(10, 496, 372, 54);
panel_6.add(textField_9);
JPanel panel_5 = new JPanel();
panel_5.setBounds(10, 38, 57, -16);
panel_4.add(panel_5);
JLabel lblLoanManagementSysytem = new JLabel("Restaurant Billing System");
lblLoanManagementSysytem.setFont(new Font("Tahoma", Font.BOLD, 50));
lblLoanManagementSysytem.setBounds(27, 10, 842, 68);
frame.getContentPane().add(lblLoanManagementSysytem);
JPanel panel_8 = new JPanel();
panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_8.setBounds(27, 749, 1469, 64);
frame.getContentPane().add(panel_8);
panel_8.setLayout(null);
JButton jbtnExit = new JButton("Exit");
jbtnExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
//---------------------------------------
JPanel panel_3 = new JPanel();
panel_3.setBounds(616, 479, 417, 250);
frame.getContentPane().add(panel_3);
panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_3.setLayout(null);
JLabel jlblTax = new JLabel("");
jlblTax.setBounds(161, 37, 210, 29);
panel_3.add(jlblTax);
jlblTax.setHorizontalAlignment(SwingConstants.CENTER);
jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
JLabel jlblsubTotal = new JLabel("");
jlblsubTotal.setBounds(161, 103, 210, 29);
panel_3.add(jlblsubTotal);
jlblsubTotal.setHorizontalAlignment(SwingConstants.CENTER);
jlblsubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
jlblsubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
JLabel jlblTotal = new JLabel("");
jlblTotal.setBounds(161, 166, 210, 29);
panel_3.add(jlblTotal);
jlblTotal.setHorizontalAlignment(SwingConstants.CENTER);
jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
JLabel lblTax = new JLabel("Tax");
lblTax.setBounds(32, 37, 134, 29);
panel_3.add(lblTax);
lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
JLabel lblSubTotal = new JLabel("Sub Total");
lblSubTotal.setBounds(32, 103, 134, 29);
panel_3.add(lblSubTotal);
lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
JLabel lblTotal = new JLabel("Total");
lblTotal.setBounds(32, 166, 134, 29);
panel_3.add(lblTotal);
lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
//------------------------------
jbtnExit.setFont(new Font("Tahoma", Font.PLAIN, 23));
jbtnExit.setBounds(949, 22, 128, 32);
panel_8.add(jbtnExit);
JButton jBtnReset = new JButton("Reset");
jBtnReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
jlblCostOfDelivery.setText(null);
jlblsubTotal.setText(null);
jlblTotal.setText(null);
jlblTax.setText(null);
jlblCostOfDelivery.setText(null);
jlblCostOfDrinks.setText(null);
jlblCostOfMeal.setText(null);
jlblsubTotal.setText(null);
jlblTax.setText(null);
jlblTotal.setText(null);
jtxtVegBurger.setText(null);
jtxtChickenBurger.setText(null);
jtxtPizza.setText(null);
jtxtQty.setText(null);
jcmbDrink.setSelectedItem("Select a Drink");
jcmbCurrency.setSelectedItem("Choose One...");
jCDelivery.setSelected(false);
jCTax.setSelected(false);
textField_1.setText(null);
textField_2.setText(null);
textField_3.setText(null);
textField_4.setText(null);
textField_5.setText(null);
textField_6.setText(null);
textField_7.setText(null);
textField_8.setText(null);
textField_9.setText(null);
}
});
jBtnReset.setFont(new Font("Tahoma", Font.PLAIN, 23));
jBtnReset.setBounds(672, 22, 128, 32);
panel_8.add(jBtnReset);
JButton jbtnTotal = new JButton("Total");
jbtnTotal.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double VegBurger =
Double.parseDouble(jtxtVegBurger.getText());
double iVegBurger = 50;
double Burger;
Burger = (VegBurger * iVegBurger);
String pMeal = String.format("%.2f", Burger);
jlblCostOfMeal.setText(pMeal);
double ChickenBurger =
Double.parseDouble(jtxtChickenBurger.getText());
double iChickenBurger = 70;
double BurgerMeal;
BurgerMeal = (ChickenBurger * iChickenBurger);
double Pizza = Double.parseDouble(jtxtPizza.getText());
double PizzaPrice = 150;
double PizzaMeal;
PizzaMeal = (Pizza * PizzaPrice);
String cheese = String.format("%.2f", PizzaMeal +
BurgerMeal + Burger);
jlblCostOfMeal.setText(cheese);

//Delivery---------------------------
double iDelivery;
if(jCDelivery.isSelected())
{
iDelivery = 10;
String pDelivery = String.format("%.2f", iDelivery);
jlblCostOfDelivery.setText(pDelivery);
}
else
{
iDelivery = 10;
jlblCostOfDelivery.setText("0");
}
//Drinks---------------------------------
double Drinks =Double.parseDouble(jtxtQty.getText());
double Tea=20*Drinks;
double Ice_Tea=20*Drinks;
double Coffee=20*Drinks;
double Cola=20*Drinks;
double Coke=20*Drinks;
double Orange_Juice=20*Drinks;
double Green_Tea=20*Drinks;
double Apple_Juice=20*Drinks;
if(jcmbDrink.getSelectedItem().equals("Apple Juice"))
{
String cApple_Juice=String.format("%.2f",
Apple_Juice);
jlblCostOfDrinks.setText(cApple_Juice);
}
if(jcmbDrink.getSelectedItem().equals("Tea"))
{
String cTea=String.format("%.2f", Tea);
jlblCostOfDrinks.setText(cTea);
}
if(jcmbDrink.getSelectedItem().equals("Ice Tea"))
{
String cIce_Tea=String.format("%.2f", Ice_Tea);
jlblCostOfDrinks.setText(cIce_Tea);
}
if(jcmbDrink.getSelectedItem().equals("Coke"))
{
String cCoke=String.format("%.2f", Coke);
jlblCostOfDrinks.setText(cCoke);
}
if(jcmbDrink.getSelectedItem().equals("Cola"))
{
String cCola=String.format("%.2f", Cola);
jlblCostOfDrinks.setText(cCola);
}
if(jcmbDrink.getSelectedItem().equals("Orange Juice"))
{
String cOrange_Juice=String.format("%.2f",
Orange_Juice);
jlblCostOfDrinks.setText(cOrange_Juice);
}
if(jcmbDrink.getSelectedItem().equals("Coffee"))
{
String cCoffee=String.format("%.2f", Coffee);
jlblCostOfDrinks.setText(cCoffee);
}
if(jcmbDrink.getSelectedItem().equals("Green Tea"))
{
String cGreen_Tea=String.format("%.2f", Green_Tea);
jlblCostOfDrinks.setText(cGreen_Tea);
}
if(jcmbDrink.getSelectedItem().equals("Select a Drink"))
{
jlblCostOfDrinks.setText("0");
}
//Tax Rate--------------------
double
cTotal1=Double.parseDouble(jlblCostOfDrinks.getText());
double
cTotal2=Double.parseDouble(jlblCostOfMeal.getText());
double
cTotal3=Double.parseDouble(jlblCostOfDelivery.getText());
double AllTotal= cTotal1+cTotal2+cTotal3;
double rate = 0;
 if(jCTax.isSelected())
 {
 rate = 0.01;
 }
 double iTax = AllTotal*rate;
 String iTotal=String.format("%.2f", iTax);
 jlblTax.setText(iTotal);

 //TOTAL-----------------------
 double SubTotal= AllTotal;
 String iSubTotal=String.format("Rs. %.2f", SubTotal);
 jlblsubTotal.setText(iSubTotal);

 double Totals = SubTotal + iTax;
 String iTotals=String.format("Rs. %.2f", Totals);
 jlblTotal.setText(iTotals);
}
});
jbtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 23));
jbtnTotal.setBounds(192, 22, 119, 32);
panel_8.add(jbtnTotal);
JButton jbtnReceipt = new JButton("Receipt");
jbtnReceipt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double Qty1=Double.parseDouble(jtxtVegBurger.getText());
double
Qty2=Double.parseDouble(jtxtChickenBurger.getText());
double Qty3=Double.parseDouble(jtxtPizza.getText());
double Qty4=Double.parseDouble(jtxtQty.getText());
double Qty5 = ((Qty1*50)+(Qty2*70)+(Qty3*150)+(Qty4*20)+10);
double Qty6 = (Qty5*0.01);
double Qty7 = Qty5+Qty6;
textField_1.setText("  Veg Burger : ("+Qty1+")	 Rs. "+Qty1*50);
textField_2.setText("  Chicken Burger : ("+Qty2+")	 Rs. "+Qty2*70);
textField_3.setText("  Pizza : ("+Qty3+")	                     Rs. "+Qty3*150);
textField_4.setText("  Drink : ("+Qty4+")	                     Rs. "+Qty4*20);
textField_6.setText("  Cost : Rs. "+Qty5);
textField_7.setText("  Tax(1%) = Rs. "+Qty6);
textField_8.setText("  Grand Total : Rs. "+Qty7);
textField_9.setText("	----Thank You----");
}
});
jbtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 23));
jbtnReceipt.setBounds(419, 22, 128, 32);
panel_8.add(jbtnReceipt);
}
}