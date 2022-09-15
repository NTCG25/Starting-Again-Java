public class PositiveNegativeZero {
    public static void main(String[] args) {
    checkNumber(0);
    }

    public static void checkNumber(int randomNum){

        if (randomNum > 0){
            System.out.println("Positive");

        } else if (randomNum < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Equal to Zero");
        }
    }
}