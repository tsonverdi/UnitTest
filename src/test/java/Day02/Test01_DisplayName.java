package Day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test01_DisplayName {
    @Test
    @DisplayName("test_parseInt_If_it_is_throwing_fo_non_digit_value")
    void testException(){
        String str = "What";
        Assertions.assertThrows(NumberFormatException.class, ()-> Integer.parseInt(str));
    }
}
