public class VehicleData {
    private int YearOfIssue;
    private String model;
    private double price;
    private String colour;

    public VehicleData(int yearOfIssue, String model, double price, String colour) {
        YearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        YearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "VehicleData:" +
                "YearOfIssue=" + YearOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
