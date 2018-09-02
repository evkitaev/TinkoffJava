package firstPackage;


import com.first.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrintTest {
    @Test
    @DisplayName("Проверка суммы")
    public void firstTest(){
         int result = Main.summ(10,12);
        Assertions.assertEquals(22,result,"Результат отличен от ожидаемого");
    }
    @Test
    @DisplayName("Проверка вывода")
    public void printTest(){
        Main.print = "Congrats!!"; //не пойму корректный синтаксис, чтобы тест отработал если эту строку закомментить
        Main.print("Congrats!");
        Assertions.assertEquals ("Congrats!",Main.print, "Вывод некорректен!");
    }


}
