public class Lg extends TV {

    private String screen;
    private int width;
    private int length;
    private EnumColor colorEnum1;

    public Lg(String model, String screen,  EnumColor colorEnum, int width, int length) {
        super(model);
        this.screen = screen;
        this.colorEnum1 = colorEnum;
        this.width = width;
        this.length = length;
    }

    public Lg(String model) {
        super(model);
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }


    @Override
    public void print() {
        System.out.println("\nmodel: " + getModel()+ "," + " color: " + colorEnum1 + ". " +
                getScreen() + "\n" + "Размер диагонали телевизора -> "
                + calculatePerimeter() + " см.\n" +
                "У LG cамый лучший экран из всех телевизоров!");
    }
    @Override
    public int calculatePerimeter() {
        return width + length;
    }

    @Override
    public String toString() {
        return "LG";
    }
}
