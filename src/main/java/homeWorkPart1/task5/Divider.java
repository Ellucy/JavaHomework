package homeWorkPart1.task5;

public class Divider {
    public double divide(int a, int b) throws CannotDivideBy0Exception {
        if(b == 0) {
            throw new CannotDivideBy0Exception("You cannot divide with 0");
        }
        return (double) a/b;
    }
}
