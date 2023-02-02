package Day02;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class Test04_PerformansTest {
    @Test
    void testPrintPerformance(){
        assertTimeout(Duration.ofSeconds(2),()-> IntStream.rangeClosed(1,300000).forEach(System.out::println));
    }
    @Test
    void testPerformans(){
        assertTimeout(Duration.ofMillis(2),()->IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
    }

}
