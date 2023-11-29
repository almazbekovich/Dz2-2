public class Transport implements Printable{
    private String color;
    private double volume;

    public Transport(String color, double volume) {
        this.color = color;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {

    }
    public String getInfo(){
        return "Color "+ color+ "\nVolume"+volume;
    }
}
