public abstract class TV implements Printable {

    private String model;

    public TV(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract int calculatePerimeter();

}

