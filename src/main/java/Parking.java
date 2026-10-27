public class Parking {
    private final int numberParkingPlaces;
    private final String[] placesOccupied;

    public Parking(int numberParkingPlaces) {
        this.numberParkingPlaces = numberParkingPlaces;
        this.placesOccupied = new String[numberParkingPlaces];
    }

    public int getFreeParkingPlace(String plate){
        for (int i = 0; i < placesOccupied.length; i++) {
            if (placesOccupied[i] == null){
                placesOccupied[i] = plate;
                return i;
            }
        }
        return -1;
    }

    public void out(int parkingPlace){
        placesOccupied[parkingPlace-1] = null;
    }
}