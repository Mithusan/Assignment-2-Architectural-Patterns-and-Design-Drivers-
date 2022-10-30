import java.util.Scanner;

public class Keyboard {

    public String GetProduct(String productName){
        CashRegister register=new CashRegister();
        return register.SearchProduct(productName);
    }

}
