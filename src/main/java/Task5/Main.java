package Task5;

public class Main {

    public static void main(String[] args) {

        Divider divider = new Divider();

        try {
            double res1 = divider.divide(55, 5);
            System.out.println("Result 1: " + res1);

            double res2 = divider.divide(5, 0);
            System.out.println("Result 2: " + res2);
        } catch (CannotDivideBy0Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("The end");
        }
    }
}
