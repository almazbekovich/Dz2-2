public class Auto extends Transport {
    private String name;

    public Auto(String color, double volume, String name) {
        super(color, volume);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(getInfo()+"\n Name "+ name);

    }

}

