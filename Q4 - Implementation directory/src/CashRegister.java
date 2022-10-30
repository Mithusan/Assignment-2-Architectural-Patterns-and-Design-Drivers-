public class CashRegister {

public String SearchProduct(String productName){
    Database productDatabase=new Database();
    Display screen=new Display();
    return screen.PrintPrice(productDatabase.GetPrice(productName));
}
}
