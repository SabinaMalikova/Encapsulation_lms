import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private LocalDate releaseDate;
    private String color;

    public Car(){
    }
    public Car(String brand, String model, LocalDate releaseDate, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return  model;
    }



    public void setColor(String color){
        this.color = color;
    }
    public String getColor (){
        return color;
    }

    @Override
    public String toString() {
        return "brand: " + brand + "\n" +
                "model: " + model + "\n" +
                "Цвет: " + color;
    }


}
