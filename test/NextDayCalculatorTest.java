import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNexdayCalculator(){
        Date nowDate = new Date(1, 1, 2018);
        Date expected = new Date(2,1,2018);
        Date result = NextDayCalculator.nextDay(nowDate);
        assertEquals(expected.getDay(), result.getDay());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getYear(), result.getYear());
    }

    @Test
    void testNexdayCalculator1(){
        Date nowDate = new Date(31, 1, 2018);
        Date expected = new Date(1,2,2018);
        Date result = NextDayCalculator.nextDay(nowDate);
        assertEquals(expected.getDay(), result.getDay());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getYear(), result.getYear());
    }

    @Test
    void testNexdayCalculator2(){
        Date nowDate = new Date(30, 4, 2018);
        Date expected = new Date(1,5,2018);
        Date result = NextDayCalculator.nextDay(nowDate);
        assertEquals(expected.getDay(), result.getDay());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getYear(), result.getYear());
    }

    @Test
    void testNexdayCalculator3(){
        Date nowDate = new Date(28, 2, 2018);
        Date expected = new Date(1,3,2018);
        Date result = NextDayCalculator.nextDay(nowDate);
        assertEquals(expected.getDay(), result.getDay());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getYear(), result.getYear());
    }

    @Test
    void testNexdayCalculator4(){
        Date nowDate = new Date(29, 2, 2020);
        Date expected = new Date(1,3,2020);
        Date result = NextDayCalculator.nextDay(nowDate);
        assertEquals(expected.getDay(), result.getDay());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getYear(), result.getYear());
    }


    @Test
    void testNexdayCalculator5(){
        Date nowDate = new Date(31, 12, 2019);
        Date expected = new Date(1,1,2020);
        Date result = NextDayCalculator.nextDay(nowDate);
        assertEquals(expected.getDay(), result.getDay());
        assertEquals(expected.getMonth(), result.getMonth());
        assertEquals(expected.getYear(), result.getYear());
    }

    @Test
    void testLeapYear(){
        boolean expected = true;
        boolean result = NextDayCalculator.isLeapYear(2000);
        assertEquals(expected, result);
    }

    @Test
    void testLeapYear1(){
        boolean expected = false;
        boolean result = NextDayCalculator.isLeapYear(2100);
        assertEquals(expected, result);
    }

    @Test
    void testLeapYear2(){
        boolean expected = true;
        boolean result = NextDayCalculator.isLeapYear(2016);
        assertEquals(expected, result);
    }

    @Test
    void testLeapYear3(){
        boolean expected = false;
        boolean result = NextDayCalculator.isLeapYear(2018);
        assertEquals(expected, result);
    }
}