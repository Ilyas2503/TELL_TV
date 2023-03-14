public class Samsung extends Telephone{
    private String built_inMemory;

    public Samsung(String ram, String model, String built_inMemory) {
        super(ram, model);
        this.built_inMemory = built_inMemory;
    }

    public String getBuilt_inMemory() {
        return built_inMemory;
    }

    public void setBuilt_inMemory(String built_inMemory) {
        this.built_inMemory = built_inMemory;
    }

    @Override
    public void print() {
        System.out.println("\nmodel: " + getModel()+", " + "RAM: " + getRam()+
                "," + " built-in memory: "+ getBuilt_inMemory()+
                ". " + "\nУ Samsung есть высокие встроенные памяти!");

    }

    @Override
    public String toString(){
        return "Samsung";
    }

}
