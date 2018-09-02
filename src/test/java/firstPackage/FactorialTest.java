package firstPackage;

import org.junit.jupiter.api.Assertions;
import com.first.lesson6.exe3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    @DisplayName("Тест факториала")
    public void factorialTest(){
    int result = exe3.factorial(6);
        Assertions.assertEquals(721, result, "Ошибка расчета");
    }
}
