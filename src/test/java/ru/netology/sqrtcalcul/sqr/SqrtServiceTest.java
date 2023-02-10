package ru.netology.sqrtcalcul.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/values.csv")
    public void testSqrtService(int expected, int lowerValue, int upperValue) {

        SqrtService service = new SqrtService();

        int actual = service.calcCount(lowerValue,upperValue);

        Assertions.assertEquals(expected, actual);

    }

}
