public class Car {
    private String brand;
    private int year;
    private String color;

    public Car () {
        brand = "Unknown";
        year = 2000;
        color = "White";

        }

    public String getBrand() {
        return brand;

    }
    public void setBrand(String brand) {
        this.brand = brand;

    }
    public int getYear() {
      return year;

    }

    public void setYear(int year){
        this.year = year;

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
