public class SpeedConverterRunner {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(100);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(15);
    }
}
