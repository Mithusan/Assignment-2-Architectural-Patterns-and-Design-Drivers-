import java.util.HashMap;

public class Database {

    public String GetPrice(String input){
        HashMap<String, String> file = new HashMap<String, String>();

        file.put("Tshirt", "29.99");
        file.put("Hoodie","59.99");
        file.put("Jeans","39.99");
        for(String i : file.keySet()) {
            if (input == i) {
                return file.get(input);
            }
        }
        return "product not available";
    }
}
