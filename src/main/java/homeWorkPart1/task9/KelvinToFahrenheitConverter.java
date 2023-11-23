package homeWorkPart1.task9;

public class KelvinToFahrenheitConverter implements Converter {
    @Override
    public float convert(float tempIn) {
        return (tempIn - 273.15f) * 9 / 5 + 32;
    }
}
