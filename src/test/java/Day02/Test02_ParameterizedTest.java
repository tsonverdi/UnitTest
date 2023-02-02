package Day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_ParameterizedTest {

    @Test
    void testLength(){

        assertTrue("Mirac".length()>0);
        assertTrue("Osman".length()>0);
        assertTrue("Seyma".length()>0);
        assertTrue("Tarik".length()>0);
    }

    //Daha dynamic ve kullanisli olan parametreli test methodumuzu yaziyoruz.
    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Osman","Seyma","tarik","Omer"})
    void testLengthTwo(String str){
        assertTrue(str.length()>0);
    }

    @Test
    void testUpperCase(){
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        Assertions.assertEquals("MERHABA",str1.toUpperCase());
        Assertions.assertEquals("JAVA",str2.toUpperCase());
        Assertions.assertEquals("TEST",str3.toUpperCase());
    }
    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA, Merhaba",
            "JAVA, Java",
            "TEST, Test"
    })
    void testUpperCaseTwo(String str1,String str2){
        assertEquals(str1,str2.toUpperCase());
    }

    //3.Ornek
    @ParameterizedTest
    @CsvSource(value =
            {
                    "true,java,a",
                    "true,junit,u",
                    "false,hello,a"
            })
    void testContains(boolean m,String str1, char c){
        assertEquals(m,str1.contains(String.valueOf(c)));
    }
}
