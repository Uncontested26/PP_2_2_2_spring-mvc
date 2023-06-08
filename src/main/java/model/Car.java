package model;

public class Car {

    private String model;
    private String color;
    private String series;

    public Car(String model, String color, String series) {
        this.model = model;
        this.color = color;
        this.series = series;
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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }


}

