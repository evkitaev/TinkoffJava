package com.first.lesson6;
/*При помощи цикла for вывести в консоль нечетные числа от 1 до 99.
Завершить вывод при 10 нечетных числах. Не выводить числа кратные 9. (Использовать операторы break/continue)*/
public class exe4 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i=i+2) {
              if (i == 10) break;
              if (i%9==0) continue; //я правильно понял, что continue пропускает указанное условие и не выводит его на печать?
            System.out.println(i);
        }
    }
}