package homeWorkPart1.task9;

public class Main {

    public static void main(String[] args) {

        float temp = 37.6f;

        float celsiusToFahrenheit = TemperatureConvert.C_F.converter.convert(temp);
        System.out.println(celsiusToFahrenheit);

        float celsiusToKelvin = TemperatureConvert.C_K.converter.convert(temp);
        System.out.println(celsiusToKelvin);

        float fahrenheitToCelsius = TemperatureConvert.F_C.converter.convert(temp);
        System.out.println(fahrenheitToCelsius);
    }
}
