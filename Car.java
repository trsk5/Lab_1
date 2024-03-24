public class Car {
    private int horsepower;
    private int engineVolume;
    private String brand;
    private String model;
    private String color;
    private int year;
    private boolean automaticTransmission;

    public Car(int horsepower, int engineVolume, String brand, String model, String color, int year, boolean automaticTransmission) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.automaticTransmission = automaticTransmission;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public static void main(String[] args) {
        Car car1 = new Car(150, 2000, "Toyota", "Camry", "Black", 2018, true);
        Car car2 = new Car(120, 1800, "Honda", "Civic", "White", 2019, true);
        Car car3 = new Car(200, 2500, "BMW", "X5", "Silver", 2020, true);
        Car car4 = new Car(180, 2200, "Audi", "A4", "Blue", 2017, true);
        Car car5 = new Car(250, 3000, "Mercedes", "E-Class", "Grey", 2021, true);
        Car car6 = new Car(170, 2100, "Ford", "Focus", "Red", 2016, false);
        Car car7 = new Car(190, 2300, "Volkswagen", "Passat", "Green", 2015, false);
        Car car8 = new Car(220, 2700, "Volvo", "XC60", "Brown", 2022, true);
        Car car9 = new Car(140, 1900, "Chevrolet", "Cruze", "Yellow", 2014, false);
        Car car10 = new Car(160, 2100, "Hyundai", "Elantra", "Orange", 2013, false);

        int totalEngineVolume = car1.getEngineVolume() + car2.getEngineVolume() + car3.getEngineVolume() + car4.getEngineVolume() +
                car5.getEngineVolume() + car6.getEngineVolume() + car7.getEngineVolume() + car8.getEngineVolume() +
                car9.getEngineVolume() + car10.getEngineVolume();
        System.out.println("Загальний об'єм двигунів: " + totalEngineVolume);

        int totalHorsepower = car1.getHorsepower() + car2.getHorsepower() + car3.getHorsepower() + car4.getHorsepower() +
                car5.getHorsepower() + car6.getHorsepower() + car7.getHorsepower() + car8.getHorsepower() +
                car9.getHorsepower() + car10.getHorsepower();
        System.out.println("Загальна потужність: " + totalHorsepower);
    }
}
