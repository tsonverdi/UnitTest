package Day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test00_TestingExceptions {
    //TestingExceptions bizim bekledigimiz exceptioni firlatma durumunu kontrol ediyoruz.


    @Test
    void testException(){
        String str = "Merhaba Junit";
        assertThrows(NullPointerException.class,()->{
            System.out.println("testException calisti.");
            str.length();
        });//Ikinci kisim Nullpointer olmali ki test gecsin.
    }
    @Test
    void testExceptionIki(){
        int sayi = 5;
        int sayi2 = 0;

        assertThrows(RuntimeException.class,()-> {System.out.println(sayi/sayi2);
        });
    }
    @Test
    void testExceptionUc(){
        int sayi = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class,()->divide(sayi,sayi2));
    }
    private int divide(int sayi1,int sayi2){
        return sayi1/sayi2;
    }
}
