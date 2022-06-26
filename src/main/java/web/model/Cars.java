package web.model;

public class Cars {
    private int id;
    private String manufacturer;
    private String model;
    private int years;

    public Cars() {
    }

    public Cars(int id, String manufacturer, String model, int years) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.years = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
