package homeWorkPart1.task9;

public class CelsiusToKelvinConverter implements Converter {
    @Override
    public float convert(float tempIn) {
        return tempIn + 273.15f;
    }
}
