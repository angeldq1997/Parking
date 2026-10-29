import java.util.ArrayList;

public class ParkingCars {
    public static void main(String[] args) {
        Parking parking = new Parking(5);
        ArrayList<Car> cars = new ArrayList<>(){{
            add(new Car(parking, "9539 NXG"));
            add(new Car(parking, "1784 VSV"));
            add(new Car(parking, "1617 RCS"));
            add(new Car(parking, "0710 JWT"));
            add(new Car(parking, "7461 ZSW"));
            add(new Car(parking, "5460 DSH"));
            add(new Car(parking, "0717 LKG"));
            add(new Car(parking, "9360 RZC"));
            add(new Car(parking, "4790 TYY"));
            add(new Car(parking, "2572 JNH"));
        }};
        

    }
}
