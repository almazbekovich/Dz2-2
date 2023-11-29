public class Plane extends Transport{
    private String name;

    public Plane(String color, double volume, String name) {
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
