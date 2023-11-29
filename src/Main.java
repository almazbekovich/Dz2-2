import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        Printable print[] = {
                createObject("OneOjbject"),
                createObject("Twoobject"),
                createObject("ThreeObject")
        };
        for (Printable printable : print) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "OneOjbject":
                Auto auto = new Auto("Black", 2.6, "Auto");
                return auto;
            case "Twoobject":
                Train train = new Train("White", 44.5, "Train");
                return train;
            case "ThreeObject":
                Plane plane = new Plane("Orange", 100.4, "AIN222");
                return plane;
        }
        return null;
    }
}