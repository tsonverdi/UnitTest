package Day01;

import org.junit.jupiter.api.*;

import java.util.Arrays;

public class Test03_BeforeEach_AfterEach {

    //Ilk degerleri oncesinde ve sonrasinda verebilmek

    String str; //Str stringi uzerinden direk setleme isi

    @BeforeEach
    void beforeEach(){
        str = "Junit5 ile test";
        System.out.println("beforeEach() calisti");
    }//Her test methodundan once calisacak

    @AfterEach
    void afterEach(){
        str = null;
        System.out.println("afterEach calisti");
    }

    @Test
    void testArrays(TestInfo info){
        String [] anlikDizi = str.split(" ");
        String [] beklenenDizi = {"Junit5","ile","test"};

        System.out.println(info.getDisplayName() + " calisti");

        Assertions.assertTrue(Arrays.equals(anlikDizi,beklenenDizi));
    }

    @Test
    void testStringLength(TestInfo info){
        int anlikDeger = str.length();

        int beklenenDeger = 15;

        Assertions.assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName());

    }

}
