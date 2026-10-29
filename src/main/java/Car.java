import utils.Utils;

public class Car implements Runnable{
    private Parking parking;
    private String plate;
    private double timeOnParking;

    public Car(Parking parking, String plate) {
        this.parking = parking;
        this.plate = plate;
        this.timeOnParking = Utils.getRandomDouble(1.0, 2.0);
    }

    @Override
    public void run() {
        System.out.println("Plate of car who wants to park: " + plate);
        if (parking.getFreeParkingPlace(this.plate) == -1 ){

        }
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "plate='" + plate + '\'' +
                ", timeOnParking=" + timeOnParking +
                '}';
    }
}