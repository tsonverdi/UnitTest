package Day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_RepeatTestMultipleTimes {

    @RepeatedTest(5)
    void testSubString(){
        assertEquals("Java","Java cok guzel".substring(0,4));
        System.out.println("Calisti");
    }
    @RepeatedTest(3)
    @Disabled
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
    }

    Random random = new Random();

    @RepeatedTest(5)
    void testMathAddExact(){
        int sayi =random.nextInt(30);
        int sayi2 = random.nextInt(30);
        assertEquals(sayi+sayi2,Math.addExact(sayi2,sayi));

        System.out.println("sayi = " + sayi + " \nsayi2 = " + sayi2 + "\nsayi + sayi2 = " +(sayi+ sayi2));
    }

}
