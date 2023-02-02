package Day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions2 {

    @Test
    void testToFindMinimum(){//Math.min();

//        assertTrue(11.5 == Math.min(11.5,14.4));
          assertFalse(11.5 != Math.min(11.5,14.5));
    }

    @Test
    void testArrays(){
        String str = "Test islemi cok kolay";

        String[] currentArray = str.split(" ");

        String[] expectedArray = {"Test","islemi","cok","kolay"};

        assertTrue(Arrays.equals(expectedArray,currentArray));
    }
}
