import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test implements ActionListener {
    Keyboard scanner= new Keyboard();
    int tshirtcount=0;
    int hoodiecount=0;
    int jeanscount=0;
    JFrame frame =new JFrame();
    JPanel panel= new JPanel();
    JButton addTshirt=new JButton(" Add a T shirt");
    JButton removeTshirt=new JButton(" Remove a T shirt");
    JLabel labelTshirt=new JLabel("T-shirt count is "+ tshirtcount);
    JButton addHoodie=new JButton(" Add a Hoodie");
    JButton removeHoodie=new JButton(" Remove a Hoodie");
    JLabel labelHoodie=new JLabel("Hoodie count is "+ hoodiecount);
    JButton addJeans=new JButton(" Add a Jeans");
    JButton removeJeans=new JButton(" Remove a Jeans");
    JLabel labelJeans=new JLabel("Jeans count is "+ jeanscount);
    JLabel finalPrice=new JLabel("The Final Price is");
    JButton purchase=new JButton("Checkout");
    JLabel receipt= new JLabel("");
    JButton reset=new JButton("Reset shopping bag");

    public Test(){
        panel.setPreferredSize(new Dimension(800, 1000));
        panel.repaint();
        panel.revalidate();
        addTshirt.addActionListener(this);
        removeTshirt.addActionListener(this);
        addHoodie.addActionListener(this);
        removeHoodie.addActionListener(this);
        addJeans.addActionListener(this);
        removeJeans.addActionListener(this);
        purchase.addActionListener(this);
        reset.addActionListener(this);
        scanner.GetProduct("Tshirt");
        scanner.GetProduct("Hoodie");
        scanner.GetProduct("Jeans");
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(addTshirt);
        panel.add(removeTshirt);
        panel.add(labelTshirt);
        panel.add(addHoodie);
        panel.add(removeHoodie);
        panel.add(labelHoodie);
        panel.add(addJeans);
        panel.add(removeJeans);
        panel.add(labelJeans);
        panel.add(finalPrice);
        panel.add(purchase);
        panel.add(receipt);
        panel.add(reset);

        frame.add(panel,BorderLayout.CENTER);
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Shopping cart");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){

        new Test() ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==addTshirt)
        {
            tshirtcount++;
            labelTshirt.setText("T-shirt count is "+ tshirtcount);
        }
        else if (e.getSource()==removeTshirt)
        {
            if(tshirtcount!=0){
                tshirtcount--;

            }
            else{
                tshirtcount=0;
            }
            labelTshirt.setText("T-shirt count is "+ tshirtcount);
        }
        else if (e.getSource()==addHoodie)
        {
            hoodiecount++;
            labelHoodie.setText("Hoodie count is "+ hoodiecount);
        }
        else if (e.getSource()==removeHoodie)
        {
            if(hoodiecount!=0){
                hoodiecount--;
            }
            else{
                hoodiecount=0;
            }
            labelHoodie.setText("Hoodie count is "+ hoodiecount);
        }
        else if (e.getSource()==addJeans)
        {
            jeanscount++;
            labelJeans.setText("Jeans count is "+ jeanscount);

        }
        else if (e.getSource()==removeJeans)
        {
            if(jeanscount!=0){
                jeanscount--;
            }
            else{
                jeanscount=0;
            }
            labelJeans.setText("Jeans count is "+ jeanscount);
        }

        String fcost=String.format("%.2f",((tshirtcount*Float.parseFloat(scanner.GetProduct("Tshirt")))
                +(hoodiecount*Float.parseFloat(scanner.GetProduct("Hoodie")))
                +(jeanscount*Float.parseFloat(scanner.GetProduct("Jeans")))));
         if (e.getSource()==purchase){
             receipt.setText("\n your receipt is as shown:\n " +
                     "   |Tshirts : amount:   "+tshirtcount+"      price: $" +(tshirtcount*Float.parseFloat(scanner.GetProduct("Tshirt")))+
                     "   | Hoodies : amount:   "+hoodiecount+"      price: $"+(hoodiecount*Float.parseFloat(scanner.GetProduct("Hoodie")))+
                     "   | Jeans: amount:   "+jeanscount+"        price: $"+(jeanscount*Float.parseFloat(scanner.GetProduct("Jeans")))+
                     "   | The final cost is :  $"+fcost);


        }
         if(e.getSource()==reset){

             tshirtcount=0;
             labelTshirt.setText("T-shirt count is "+ tshirtcount);
             hoodiecount=0;
             labelHoodie.setText("Hoodie count is "+ hoodiecount);
             jeanscount=0;
             labelJeans.setText("Jeans count is "+ jeanscount);
             finalPrice.setText("The Final Price is : 0");
         }

        finalPrice.setText("The Final Price is :"+fcost);


    }
}
