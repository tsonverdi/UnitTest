package Day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){}
    @Test
    void testLength(){ //String.length methodu test ediliyor.

        String kelime = "Merhaba Dunya";

        int anlikDeger = kelime.length();

        int beklenenDeger = 13;

        assertEquals(beklenenDeger,anlikDeger);
    }
    @Test
    public void testUpperCase(){ //String.toUpperCase()

        String hasanAnlik = "HasaN".toUpperCase();

        String hasanBeklenen = "HASAN";

//        assertEquals(hasanBeklenen,hasanAnlik);

        //Hata aninda kullaniciya mesaj gondermek istersek

        assertEquals(hasanBeklenen,hasanAnlik,"Method dogru duzgun calismadi");

    }

    @Test
    void testToplama(){//Math.addExact()
        int num1 = 10;
        int num2 = 12;

        int anlikDeger = Math.addExact(num1,num2);
        int expectedValue = 22;

        assertEquals(expectedValue,anlikDeger,"Toplam methodunda sikinti var");
    }

    @Test
    void testContains(){//String.contains()
        assertEquals(false,"Mirac".contains("z"));
    }

}


