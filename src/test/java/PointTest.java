import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.xaabibas.web3.Attempt;
import ru.xaabibas.web3.Checker;
import ru.xaabibas.web3.Point;


public class PointTest extends Assert {
    private Checker checker;

    @Before
    public void setUp() {
        checker = new Checker();
    }

    @Test
    public void assertFirstQuarter() {
        Point point1 = new Point(1, 1, 1.4);
        Attempt attempt1 = new Attempt();
        attempt1.setPoint(point1);
        assertFalse(checker.check(attempt1));

        Point point2 = new Point(1, 1, 1.5);
        Attempt attempt2 = new Attempt();
        attempt1.setPoint(point2);
        assertTrue(checker.check(attempt2));

        Point point3 = new Point(1, 1, -1);
        Attempt attempt3 = new Attempt();
        attempt3.setPoint(point3);
        assertTrue(checker.check(attempt3));

        Point point4 = new Point(1, 2, -1);
        Attempt attempt4 = new Attempt();
        attempt4.setPoint(point4);
        assertFalse(checker.check(attempt4));
    }

    @Test
    public void assertSecondQuarter() {
        Point point1 = new Point(-1, 1, 1);
        Attempt attempt1 = new Attempt();
        attempt1.setPoint(point1);
        assertFalse(checker.check(attempt1));

        Point point2 = new Point(-1, 1, -1);
        Attempt attempt2 = new Attempt();
        attempt2.setPoint(point2);
        assertFalse(checker.check(attempt2));

        Point point3 = new Point(-1, 1, -4);
        Attempt attempt3 = new Attempt();
        attempt3.setPoint(point3);
        assertTrue(checker.check(attempt3));
    }

    @Test
    public void assertThirdQuarter() {
        Point point1 = new Point(-1, -2, 1);
        Attempt attempt1 = new Attempt();
        attempt1.setPoint(point1);
        assertFalse(checker.check(attempt1));

        Point point2 = new Point(-1, -1, 1);
        Attempt attempt2 = new Attempt();
        attempt1.setPoint(point2);
        assertTrue(checker.check(attempt2));

        Point point3 = new Point(-1, -1, -1);
        Attempt attempt3 = new Attempt();
        attempt3.setPoint(point3);
        assertFalse(checker.check(attempt3));

        Point point4 = new Point(-1, -1, -1.5);
        Attempt attempt4 = new Attempt();
        attempt4.setPoint(point4);
        assertTrue(checker.check(attempt4));
    }

    @Test
    public void assertForthQuarter() {
        Point point1 = new Point(1, -2, 1);
        Attempt attempt1 = new Attempt();
        attempt1.setPoint(point1);
        assertFalse(checker.check(attempt1));

        Point point2 = new Point(1, -1, 2);
        Attempt attempt2 = new Attempt();
        attempt1.setPoint(point2);
        assertTrue(checker.check(attempt2));

        Point point3 = new Point(1, -1, -1.32);
        Attempt attempt3 = new Attempt();
        attempt3.setPoint(point3);
        assertFalse(checker.check(attempt3));
    }

    @Test
    public void assertZeroR() {
        Point point1 = new Point(1, -2, 0);
        Attempt attempt1 = new Attempt();
        attempt1.setPoint(point1);
        assertFalse(checker.check(attempt1));

        Point point2 = new Point(0, 0, 0);
        Attempt attempt2 = new Attempt();
        attempt1.setPoint(point2);
        assertTrue(checker.check(attempt2));
    }
}
