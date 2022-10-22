package transport;

public abstract class transport {
    protected String brand;
    protected String model;
    protected final int productionYear;
    protected final String productionCountry;
    protected String color;
    protected int maxSpeed;

    public transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.productionYear = productionYear;
    }
    //неизменяемые
    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }
    //изменяемые
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void refill();
}
