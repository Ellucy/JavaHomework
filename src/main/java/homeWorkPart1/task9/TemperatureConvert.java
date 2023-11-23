package homeWorkPart1.task9;

public enum TemperatureConvert {

    C_F("Celsius", "Fahrenheit", new CelsiusToFahrenheitConverter()),
    C_K("Celsius", "Kelvin", new CelsiusToKelvinConverter()),
    K_C("Kelvin", "Celsius", new KelvinToCelsiusConverter()),
    F_C("Fahrenheit", "Celsius", new FahrenheitToCelsiusConverter()),
    F_K("Fahrenheit", "Kelvin", new FahrenheitToKelvinConverter()),
    K_F("Kelvin", "Fahrenheit", new KelvinToFahrenheitConverter());

    private String input;
    private String output;
    protected Converter converter;

    TemperatureConvert(String input, String output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }
}
