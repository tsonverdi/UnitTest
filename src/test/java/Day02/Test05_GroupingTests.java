package Day02;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class Test05_GroupingTests {
    //Amac:ayni sinifta birbirleriyle iliskili testleri gruplamak icin kullanilir.
    @Nested
    class testMultiply{
        @ParameterizedTest
        @CsvSource(value = {"-12,-4,3","-12,4,-3","12,-4,-3"})
        void testMultiplyWithNoneZero(int rs,int num1, int num2){
            assertEquals(rs,Math.multiplyExact(num1,num2));
        }
        @ParameterizedTest
        @CsvSource(value = {"0,-4,0","0,5,0","0,4,0"})
        void testMultiplyWithZero(int rs,int num1, int num2){
            assertEquals(rs,Math.multiplyExact(num1,num2));
        }
    }
    @Nested
    class testAdd{
        @ParameterizedTest
        @CsvSource(value = {"-1,-4,3","1,4,-3","-7,-4,-3"})
        void testAddWithNoneZero(int rs,int num1, int num2){
            assertEquals(rs,Math.addExact(num1,num2));
        }
        @ParameterizedTest
        @CsvSource(value = {"3,0,3","5,5,0","-3,0,-3"})
        void testAddWithZero(int rs,int num1, int num2){
            assertEquals(rs,Math.addExact(num1,num2));
        }


    }
}
