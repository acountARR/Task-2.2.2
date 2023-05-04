package web.model;

public class Car {

    private String model;
    private int series;
    private String prefix;

    public Car(String model, int series, String prefix) {
        this.model = model;
        this.series = series;
        this.prefix = prefix;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}
