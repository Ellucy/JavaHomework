package homeWorkPart1.task9;

public class FahrenheitToCelsiusConverter implements Converter {

    @Override
    public float convert(float tempIn) {
        return (tempIn - 32) * 5 / 9;
    }
}
