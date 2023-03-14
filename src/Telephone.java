public abstract class Telephone implements Printable {
    private String ram;
    private String model;

    public Telephone(String ram, String model) {
        this.ram = ram;
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
