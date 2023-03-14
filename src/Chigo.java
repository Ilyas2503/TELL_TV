public class Chigo extends TV {

    private String sound;
    private EnumColor colorEnum;

    private int width;
    private int height;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public Chigo(String model, String sound, EnumColor colorEnum, int width, int height) {
        super(model);
        this.sound = sound;
        this.colorEnum = colorEnum;
        this.width = width;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("\n" + "Model: " + getModel() + "," + " Color: " + colorEnum +
                ". " + getSound() + " \n" + "Размер диагонали телевизора -> "
                + calculatePerimeter() + " см." +
                "\nУ Chigo cамое лучшее качество звука из всех телевизоров!");
    }


    public int calculatePerimeter() {
        return width + height;
    }

    @Override
    public String toString() {
        return "Chigo";
    }
}