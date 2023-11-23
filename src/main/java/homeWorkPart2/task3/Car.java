package homeWorkPart2.task3;

public class Car {

    private String make;
    private String type;
    private Engine engine;

    public Car(String make, String type) {
        this.make = make;
        this.type = type;
        this.engine = new Engine();
        this.engine.setEngineType();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine.getEngineType() +
                '}';
    }

    //nested class
    public class Engine {
        private String engineType;

        public String getEngineType() {
            return engineType;
        }

        private void setEngineType() {
            switch (type) {
                case "Economy":
                    engineType = "Diesel";
                    break;
                case "Luxury":
                    engineType = "Electric";
                    break;
                default:
                    engineType = "Petrol";
            }
        }
    }
}
