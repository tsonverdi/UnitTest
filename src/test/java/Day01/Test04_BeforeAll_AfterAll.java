package Day01;

import org.junit.jupiter.api.*;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll (TestInfo info){
        System.out.println(info.getDisplayName() + " calisti");
    }

    @AfterAll
    static void afterAll (TestInfo info2){
        System.out.println(info2.getDisplayName() + " calisti");
    }

    @Test
    void testArrays(){
        String str = "Unit test with Junit";

        String[] initialArray = str.split(" ");
        String[] expectedArray = {"Unit","test","with","Junit"};

//        Assertions.assertTrue(Arrays.equals(expectedArray,initialArray));
        Assertions.assertArrayEquals(expectedArray,initialArray,"Hata var usta");

    }

}
