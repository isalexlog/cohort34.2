/**
 * @author Andrej Reutow
 * created on 20.09.2023
 */

// Программа должна подсчитать, сколько раз каждое число встречается в массиве и вывести результат в консоль.
public class Task3 {

//    public static void main(String[] args) {
//        int[] source = {1, 2, 3, 1, 1, 4};
//        int length = source.length;
//
//        for (int outerLoopIndex = 0; outerLoopIndex < length; outerLoopIndex++) {
//            int currentNumber = source[outerLoopIndex];
//            int repeatCounter = 1;
//
//            for (int innerLoopIndex = 0; innerLoopIndex < length; innerLoopIndex++) {
//                if (innerLoopIndex != outerLoopIndex && source[innerLoopIndex] == currentNumber) {
//                    repeatCounter++;
//                }
//            }
//
//            System.out.println("Число " + currentNumber + " повторяется: " + repeatCounter + " раз");
//        }
//    }

//    public static void main(String[] args) {
//        int[] source = {1, 2, 3, 1, 1, 4};
//        int[] repeats = new int[source.length];
//        int length = source.length;
//
//        for (int outerLoopIndex = 0; outerLoopIndex < length; outerLoopIndex++) {
//            int currentNumber = source[outerLoopIndex];
//            repeats[outerLoopIndex] = currentNumber;
//            int repeatCounter = 1;
//
//            if (!isElementExistByValue(repeats, currentNumber)) {
//                for (int innerLoopIndex = 0; innerLoopIndex < length; innerLoopIndex++) {
//                    if (innerLoopIndex != outerLoopIndex && source[innerLoopIndex] == currentNumber) {
//                        repeatCounter++;
//                    }
//                }
//                System.out.println("Число " + currentNumber + " повторяется: " + repeatCounter + " раз");
//
//            }
//        }
//    }

    public static void main(String[] args) {
        double result = calculateHourlyConsumption(0.15, 2);
        System.out.println("Анна тратит энергию холодильника всместе с кондиционером в час " + result + " КВт.");
        result = calculateMonthlyCost(2.15, 24, 31);
        System.out.println("А в месяц выходит у нее " + result + " КВт.");
        result = moneyForEnergyMonth(1599.6,0.15);
        System.out.println("У Анны выходит в месяц за электричество " + result + " евро за КВт.");
    }

    public static double calculateHourlyConsumption(double a, int b) {
        double result = a + b;
        return result;
    }

    public static double calculateMonthlyCost(double hour, int day, int month) {
        double result = hour * day * month;
        return result;
    }

    public static double moneyForEnergyMonth(double v, double m) {
        double result = v * m;
        return result;
    }

    public static boolean isElementExistByValue(int[] source, int element) {
        boolean isExist = false;
        for (int i = 1; i < source.length; i++) {
            if (source[i] == element) {
                isExist = true;
            }
        }
        return isExist;
    }


//    public static void main(String[] args) {
//        // Создание и заполнение массива случайными числами
//        int[] array = {1, 2, 3, 1, 1, 4};
//        int arrayLength = array.length;  // Пример длины массива
//
//        // Подсчет частоты каждого числа в массиве
//        for (int i = 0; i < arrayLength; i++) {
//            int count = 0;
//            boolean alreadyCounted = false;
//
//            int currentNumber = array[i]; // значение текущего элемента внешнего цикла
//
//            for (int j = 0; j < i; j++) {
//                // currentNumber - значение текущего элемента внешнего цикла
//                // если currentNumber повторяется, значит мы уже посчитали количесвто его повторений ранее
//                // записываем в alreadyCounted значение true, что бы не считать еще раз и не выводить результат в коносль
//                /*
//                Пример:
//                Есть масив {127, 221, 127, 87}
//                    Первая итерация внешнего цикла: i = 0; currentNumber = 127 (array[i]) (array[0]) (127)
//                        заходим с этими значениями в этот цикл.
//                        этот цикл выполняется пока значение j меньше значения i (из внешнего цикла).
//                            Первая итерация: j = 0, i = 0
//                                при первой итерации в этом цикле ни чего не происходит, т.к. j < i (0 < 0) - false (ноль меньше 0 ? - нет, не запускаем цикл. Но еще должны выполнить весь код внешнего цикла!)
//
//                    Вторая итерация внешнего цикла: i = 1; currentNumber = 221 (array[i]) (array[1]) (221)
//                        заходим с этими значениями в этот цикл.
//                        этот цикл выполняется пока значение j меньше значения i (из внешнего цикла).
//                            Первая итерация: j = 0, i = 1
//                                цикл запускается, т.к. j < i (0 < 1) - true (ноль меньше 1 ? - да, запускаем цикл!)
//                                выполням проверку:
//                                if (currentNumber == array[j]) -> (221 == array[j]) -> (221 == array[0]) -> (221 == 127) -> (false) -> (221 равен 127 ?, нет, блок кода if не выполняется)
//                            Вторая итерация: j = 1, i = 1
//                                выход из цикл, т.к. j < i (1 < 1) - false (1 меньше 1 ? - нет, не продожаем цикл, выходим из этого цикла!)
//
//                    Третья итерация внешнего цикла: i = 2; currentNumber = 127 (array[i]) (array[2]) (127). !Внимательно следим за внутреним циклом!
//                        заходим с этими значениями в этот цикл.
//                        этот цикл выполняется пока значение j меньше значения i (из внешнего цикла).
//                            Первая итерация: j = 0, i = 2
//                                цикл запускается, т.к. j < i (0 < 2) - true (ноль меньше 2 ? - да, запускаем цикл!)
//                                выполням проверку:
//                                if (currentNumber == array[j]) -> (127 == array[j]) -> (127 == array[0]) -> (127 == 127) -> (true) -> (127 равен 127 ?, да, блок кода if теперь выполняется)
//                                    внутри if:
//                                    устанавливаем значение переменной alreadyCounted -> true.
//                                    Что бы дальше наш код не считал количесвто повторений для текущего значения (127), т.к. количесвто повоторений уже было посчитано при первой встречи с этим значением.
//                                    В нашем случае в самой первой итерации внешнего цикла
//                            Вторая итерация: j = 1, i = 2 (следющие итерации без полезны, но пока мы не умеем выходить из циклов, по этому двигаемся упорно дальше, пока условие в цикле true)
//                                j < i (1 < 2) - true (1 меньше 2 ? - да, продожаем цикл!)
//                                выполням проверку:
//                                if (currentNumber == array[j]) -> (127 == array[j]) -> (127 == array[1]) -> (127 == 221) -> (false) -> (127 равен 221 ?, нет, блок кода if не выполняется)
//                            Третья итерация: j = 2, i = 2 (следубщие итерации без полезны, но пока мы не умеем выходить из циклов, по этому двигаемся до конца массива)
//                                выход из цикл, т.к. j < i (2 < 2) - false (2 меньше 2 ? - нет, выходим из внутренего цикла!)
//
//                    4 итерация внешнего цикла: i = 3; currentNumber = 87 (array[i]) (array[3]) (87).
//                        заходим с этими значениями в этот цикл.
//                        этот цикл выполняется пока значение j меньше значения i (из внешнего цикла).
//                            Первая итерация: j = 0, i = 3
//                                цикл запускается, т.к. j < i (0 < 3) - true (ноль меньше 3 ? - да, запускаем цикл!)
//                                выполням проверку:
//                                if (currentNumber == array[j]) -> (87 == array[j]) -> (87 == array[0]) -> (87 == 127) -> (false) -> (87 равен 127 ?, нет, блок кода if не выполняется)
//                            Вторая итерация: j = 1, i = 3 (следющие итерации без полезны, но пока мы не умеем выходить из циклов, по этому двигаемся упорно дальше, пока условие в цикле true)
//                                j < i (1 < 3) - true (1 меньше 3 ? - да, продожаем!)
//                                выполням проверку:
//                                if (currentNumber == array[j]) -> (87 == array[j]) -> (87 == array[1]) -> (87 == 221) -> (false) -> (87 равен 221 ?, нет, блок кода if не выполняется)
//                            Третья итерация j = 2, i = 3
//                                j < i (2 < 3) - true (2 меньше 3 ? - да, продожаем!)
//                                if (currentNumber == array[j]) -> (87 == 127) - false
//                            4 итерация j = 3, i = 3
//                                j < i (3 < 3) - true (3 меньше 3 ? - нет, выходим из внутренего цикла!)
//
//            Тут не описан дальшейшее выполнение кода после этого цикла!!! только важные моменты которые относятся к этому циклу!
//                 */
//                if (currentNumber == array[j]) {
//                    alreadyCounted = true;
//                }
//            }
//
//            if (!alreadyCounted) {
//                for (int j = 0; j < arrayLength; j++) {
//                    if (currentNumber == array[j]) {
//                        count++;
//                    }
//                }
//                // Вывод результата
//                System.out.println("Число " + currentNumber + " встречается в массиве " + count + " раз.");
//            }
//        }
//    }
}
