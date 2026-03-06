public class Car2 {
    private String brand;
    private String model;
    private int year;

    public Car2() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }
    public Car2(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }
    public Car2(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getModel() {
        return model;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

