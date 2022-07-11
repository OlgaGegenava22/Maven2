import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(300);

        Assertions.assertEquals(expected, actual);
    }
}
