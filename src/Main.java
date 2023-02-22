import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car, VehicleData> map = new HashMap<>();

        map.put(new Car(122, 4565),
                new VehicleData(2020, "Lexus", 23486, "White"));
        map.put(new Car(123, 2206),
                new VehicleData(2021, "Mercedez Benz", 15987, "Grey"));


        for (Map.Entry<Car, VehicleData> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }

    }
}