public class Redmi extends Telephone{

    private String camera;

    public Redmi(String ram, String model, String camera) {
        super(ram, model);
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public void print() {
        System.out.println("\nmodel: " + getModel()+"," + " RAM: " + getRam()
                + "," + " camera: " + getCamera() + "."+
                "\nУ Redmi камера ничем не хуже от Samsung!");
    }

    @Override
    public String toString() {
        return "Redmi";
    }
}
