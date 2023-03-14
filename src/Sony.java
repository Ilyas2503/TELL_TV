public class Sony extends TV{
    private String memoryCard;
    private int width;
    private int length;
    private EnumColor enumColor2;

    public String getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(String memoryCard) {
        this.memoryCard = memoryCard;
    }

    public Sony(String model, String memoryCard, int width, int length, EnumColor enumColor2) {
        super(model);
        this.memoryCard = memoryCard;
        this.width = width;
        this.length = length;
        this.enumColor2 = enumColor2;
    }

    @Override
    public int calculatePerimeter() {
        return width + length;
    }

    @Override
    public void print() {
        System.out.println("\nmodel: " + getModel()+ "," + " color: " + enumColor2 + ". " + memoryCard+
                "\nРазмер диагонали телевизора -> " + calculatePerimeter() + " см."
                +"\n" + "Sony принимает карту памяти!");

    }
    @Override
    public String toString(){
        return "Sony";
    }
}
