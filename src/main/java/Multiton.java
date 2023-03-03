import java.util.ArrayList;

public class Multiton {
    private static final ArrayList<Multiton> INSTANCES = new ArrayList<>();
    private static int counter = 0;
    private static int maxInstances = 5;

    private Multiton() {
    }

    public static void setMaxInstances(int num) {
        if (num <= 0){
            throw new IllegalArgumentException();
        }
        maxInstances = num;
    }

    public static Multiton getInstance() {
        if (counter < maxInstances) {
            INSTANCES.add(new Multiton());
        }
        return INSTANCES.get(counter++ % maxInstances);
    }
}