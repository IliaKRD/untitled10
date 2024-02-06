import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Product> toys = new HashMap<>();
        toys.put("Moskvich", new Product("Car"));
        toys.put("Barby", new Product("Kykla"));
        toys.put("Poprigun", new Product("Myach"));

        Main main = new Main();
        main.EntrySet(toys);
        main.KeySet(toys);
        main.Values(toys);

    }
    private void EntrySet(HashMap<String, Product> toys)
    {
        for (Map.Entry entry : toys.entrySet()) {
            System.out.println(entry);
        }
    }
    private void KeySet(HashMap<String, Product> toys)
    {
        Set<String> keys = toys.keySet();
        System.out.println("Ключи: " + keys);
    }
    private void Values(HashMap<String, Product> toys)
    {
        ArrayList<Product> values = new ArrayList<>(toys.values());
        System.out.println("Значения: " + values);
    }
}