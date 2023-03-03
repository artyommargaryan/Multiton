import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMultiton {
    @Test
    public void testMultitonByDefaultMaxInstance() {
        Multiton[] multitons = new Multiton[10];

        for (int i = 0; i < multitons.length; i++) {
            multitons[i] = Multiton.getInstance();
        }

        for (int i = 0; i < multitons.length / 2; i++) {
            assertSame(multitons[i], multitons[i + multitons.length / 2]);
        }
    }

    @Test
    public void testMultitonByGivenMaxInstance() {
        int max = 6;
        Multiton.setMaxInstances(max);
        Multiton[] multitons = new Multiton[12];
        for (int i = 0; i < multitons.length; i++) {
            multitons[i] = Multiton.getInstance();
        }

        for (int i = 0; i < multitons.length / 2; i++) {
            assertSame(multitons[i], multitons[i + multitons.length / 2]);
        }
    }
}
