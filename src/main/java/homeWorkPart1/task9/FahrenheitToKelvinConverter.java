package homeWorkPart1.task9;

public class FahrenheitToKelvinConverter implements Converter {
    @Override
    public float convert(float tempIn) {
        return (tempIn - 32) * 5 / 9 + 273.15f;
    }
}
