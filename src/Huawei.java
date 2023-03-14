public class Huawei extends Telephone{
    private String battery;

    public Huawei(String ram, String model, String battery) {
        super(ram, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public void print() {
        System.out.println("model: "+ getModel()+ "," + " RAM:" +
                " " +getRam()+ "," + " battery: "
                + getBattery() +"." + "\nУ Huawei батарейки надежные!");

    }

    @Override
    public String toString() {
        return "Huawei";
    }
}
