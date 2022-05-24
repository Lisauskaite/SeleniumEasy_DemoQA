import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Demo {

    @Test
    public void testIfNumber4IsEven() {

        //duomenys
        int input = 4;
        int actualRemainder;
        int expectedRemainder = 0;

        //testo veiksmai
        actualRemainder = input % 2;

        //palyginimas
        Assert.assertEquals(actualRemainder, expectedRemainder);

    }

    @Test
    public void testIfTimeNowIs19Hours() {

        //duomenys
        int expectedHour = 19;
        LocalDateTime actualDateTime = LocalDateTime.now();

        //veiksmai
        int actualHour = actualDateTime.getHour();

        //palyginimas
        Assert.assertEquals(actualHour, expectedHour, "Expected: " + expectedHour + " , actual: " + actualHour);
        //Assert.assertEquals(actualHour, expectedHour);
    }

    @Test
    public void arDalijasi995Is3() {
        int dalinys = 995;
        int daliklis = 3;
        int expectedResult = 0;
        int actualResult;

        actualResult = dalinys % daliklis;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void arSiandienTreciadienis() {
        LocalDateTime actualDateTime = LocalDateTime.now();
        String actualDay = String.valueOf(actualDateTime.getDayOfWeek());
        DayOfWeek expectedDay = DayOfWeek.WEDNESDAY;

        Assert.assertEquals(actualDay, expectedDay);
    }

    @Test
    public void palaukia5Sekundes() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
    }

    @Test
    public void arBus4LyginiaiSkaiciai() {
        int actualEvenNumberCounter = 0;
        int expectedEvenNumberCount = 4;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                actualEvenNumberCounter++;
            }
        }
            Assert.assertEquals(actualEvenNumberCounter, expectedEvenNumberCount);
        }
    }
