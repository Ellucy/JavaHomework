package homeWorkPart1.task9;

public class CelsiusToFahrenheitConverter implements Converter {
    @Override
    public float convert(float tempIn) {
        return ((tempIn * 9 / 5) + 32);
    }
}
