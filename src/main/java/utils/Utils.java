package utils;

public class Utils {
    public static Double getRandomDouble(double min, double max){
        return  (( (max - min) * Math.random() ) + min);
    }

    public static int getRandomInt(int min, int max){
        return (int) (( (max - min) * Math.random() ) + min);
    }
}
