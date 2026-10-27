import java.util.Random;

public class Car implements Runnable{
    private Parking parking;
    private String plate;
    private int timeOnParking;

    public Car(Parking parking, String plate) {
        this.parking = parking;
        this.plate = plate;
        this.timeOnParking = (int) (( 2 * Math.random() ) + 1);
    }

    @Override
    public void run() {
        System.out.println("Plate of car who wants to park: " + plate);

    }

    public Double getRandom(Double min, Double max){
        Double range = (max - min) + 1.0;
        return (range * Math.random()) + min;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}