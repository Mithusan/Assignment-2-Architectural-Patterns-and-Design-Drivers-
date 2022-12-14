import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Test implements ActionListener {
    Keyboard scanner = new Keyboard();
    int tshirtcount = 0;
    int hoodiecount = 0;
    int jeanscount = 0;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel hint = new JLabel(" the barcodes list    T-shirt : TSHIRT          Hoodie : HOODIE          jeans :JEANS");
    JLabel enternamehere = new JLabel("Enter Barcode Below");
    JLabel labelTshirt = new JLabel("T-shirt count is " + tshirtcount);
    JLabel labelHoodie = new JLabel("Hoodie count is " + hoodiecount);
    JLabel labelJeans = new JLabel("Jeans count is " + jeanscount);
    JLabel finalPrice = new JLabel("The Final Price is");
    JButton purchase = new JButton("Checkout");
    JLabel receipt = new JLabel("");
    JButton reset = new JButton("Reset shopping bag");
    JTextField ProductName = new JTextField("");
    JButton ProductAdd = new JButton("Add Product");
    JButton ProductRemove = new JButton("Remove Product");
    JLabel CurrentProduct = new JLabel("");

    public Test() {
        panel.setPreferredSize(new Dimension(800, 1000));
        panel.repaint();
        panel.revalidate();
        purchase.addActionListener(this);
        reset.addActionListener(this);
        ProductAdd.addActionListener(this);
        ProductRemove.addActionListener(this);
        scanner.GetProduct("Tshirt");
        scanner.GetProduct("Hoodie");
        scanner.GetProduct("Jeans");
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(hint);
        panel.add(enternamehere);
        panel.add(ProductName);
        panel.add(ProductAdd);
        panel.add(ProductRemove);
        panel.add(CurrentProduct);
        panel.add(labelTshirt);
        panel.add(labelHoodie);
        panel.add(labelJeans);
        panel.add(finalPrice);
        panel.add(purchase);
        panel.add(receipt);
        panel.add(reset);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(1500, 1500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Shopping cart");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new Test();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ProductAdd) {
            if (Objects.equals(ProductName.getText(), "TSHIRT")) {
                CurrentProduct.setText("Product Chosen is a T-shirt and the price is $" + scanner.GetProduct("Tshirt"));
                tshirtcount++;
                labelTshirt.setText("T-shirt count is " + tshirtcount);

            } else if (Objects.equals(ProductName.getText(), "HOODIE")) {
                CurrentProduct.setText("Product Chosen is a Hoodie and the price is $" + scanner.GetProduct("Hoodie"));
                hoodiecount++;
                labelHoodie.setText("Hoodie count is " + hoodiecount);


            } else if (Objects.equals(ProductName.getText(), "JEANS")) {
                CurrentProduct.setText("Product Chosen is a Jeans and the price is $" + scanner.GetProduct("Jeans"));
                jeanscount++;
                labelJeans.setText("Jeans count is " + jeanscount);


            } else {
                CurrentProduct.setText("Product is not available");

            }
        } else if (e.getSource() == ProductRemove) {

            if (e.getSource() == ProductRemove) {
                if (Objects.equals(ProductName.getText(), "TSHIRT")) {
                    CurrentProduct.setText("Product Chosen is a T-shirt and the price is $" + scanner.GetProduct("Tshirt"));
                    if(tshirtcount>0){tshirtcount--;}
                    else{tshirtcount=0;}
                    labelTshirt.setText("T-shirt count is " + tshirtcount);

                } else if (Objects.equals(ProductName.getText(), "HOODIE")) {
                    CurrentProduct.setText("Product Chosen is a Hoodie and the price is $" + scanner.GetProduct("Hoodie"));
                    if(hoodiecount>0){hoodiecount--;}
                    else{hoodiecount=0;}
                    labelHoodie.setText("Hoodie count is " + hoodiecount);


                } else if (Objects.equals(ProductName.getText(), "JEANS")) {
                    CurrentProduct.setText("Product Chosen is a Jeans and the price is $" + scanner.GetProduct("Jeans"));
                    if(jeanscount>0){jeanscount--;}
                    else{jeanscount=0;}
                    labelJeans.setText("Jeans count is " + jeanscount);


                } else {
                    CurrentProduct.setText("Product is not available");

                }
            }
        }

            String fcost = String.format("%.2f", ((tshirtcount * Float.parseFloat(scanner.GetProduct("Tshirt")))
                    + (hoodiecount * Float.parseFloat(scanner.GetProduct("Hoodie")))
                    + (jeanscount * Float.parseFloat(scanner.GetProduct("Jeans")))));
            if (e.getSource() == purchase) {
                receipt.setText("\n your receipt is as shown:\n " +
                        "   |Tshirts : amount:   " + tshirtcount + "      price: $" + (tshirtcount * Float.parseFloat(scanner.GetProduct("Tshirt"))) +
                        "   | Hoodies : amount:   " + hoodiecount + "      price: $" + (hoodiecount * Float.parseFloat(scanner.GetProduct("Hoodie"))) +
                        "   | Jeans: amount:   " + jeanscount + "        price: $" + (jeanscount * Float.parseFloat(scanner.GetProduct("Jeans"))) +
                        "   | The final cost is :  $" + fcost);


            }
            if (e.getSource() == reset) {

                tshirtcount = 0;
                labelTshirt.setText("T-shirt count is " + tshirtcount);
                hoodiecount = 0;
                labelHoodie.setText("Hoodie count is " + hoodiecount);
                jeanscount = 0;
                labelJeans.setText("Jeans count is " + jeanscount);
                finalPrice.setText("The Final Price is : 0");
            }

            finalPrice.setText("The Final Price is :" + fcost);


        }
    }

