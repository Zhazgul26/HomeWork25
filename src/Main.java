import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        HashMap<Car, CarDate> carHashMap = new HashMap<>();
        Car car1 = new Car(1, "Dfg123");
        Car car2 = new Car(3, "kg 777");
        Car car3 = new Car(2, "kg 1332");

        CarDate carDate1 = new CarDate(2018, 1500000, "Roewe Marvel X", "black");
        CarDate carDate2 = new CarDate(2013, 2200000, "Rolls-Royce Chost Extended", "pink");
        CarDate carDate3 = new CarDate(2019, 1420000, "Tesla Performance", "white");

        carHashMap.put(car1,carDate1);
        carHashMap.put(car2,carDate2);
        carHashMap.put(car3,carDate3);

        for (Map.Entry cars : carHashMap.entrySet()){
            System.out.println(cars.getKey() + " " + cars.getValue());
        }

    }
}


