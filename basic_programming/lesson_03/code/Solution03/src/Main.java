
// 1. Метод вычисляющий площадь круга;
// 2. Метод вычисляющий площадь квадрата;
// 3. Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
// 4. Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю. Вычислите среднюю температуру за неделю и выведете ее на печать.
// 5. Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro. Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку. Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.
// 6. Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3? Покажите это на конкретных примерах.
// 7. Создайте три переменные num1, num2 и num3 типа double и присвойте им любые значения. Затем создайте переменную average и вычислите среднее значение этих трех чисел.
// 8. Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9. Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10. Получается, у вас будет среднее арифметическое этих чисел в одной переменной. Распечатайте её через println. Сколько программа отбросила в дробной части?


public class Main {
    public static void main(String[] args) {
        System.out.println("1. Метод вычисляющий площадь круга");
        calculateCircleArea(5);

        System.out.println("2. Метод вычисляющий площадь квадрата");
        calculateSquareArea(5.5);

        System.out.println("3. Метод вычисляющий площадь прямоугольника");
        calculateRectangleArea(3, 5);

        System.out.println("4. Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю. Вычислите среднюю температуру за неделю и выведете ее на печать.");
        calculateAverageTemperature(27, 28, 30, 25, 31, 30, 26);

        System.out.println("5. Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro. Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку. Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.");
        calculateTotalPriceWithDiscount(1000, 500);

        System.out.println("6. Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3? Покажите это на конкретных примерах.");
        calculateRemainder(10, 2);
        calculateRemainder(9, 2);
        calculateRemainder(8, 4);

        System.out.println("7. Создайте три переменные num1, num2 и num3 типа double и присвойте им любые значения. Затем создайте переменную average и вычислите среднее значение этих трех чисел.");
        average(2, 3, 4);

        System.out.println("8. Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9. Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10. Получается, у вас будет среднее арифметическое этих чисел в одной переменной. Распечатайте её через println. Сколько программа отбросила в дробной части?");
        averageFor10();
    }

    // 1. Метод вычисляющий площадь круга
    public static void calculateCircleArea(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Площадь круга = " + result + ", если радиус = " + radius);
    }

    // 2. Метод вычисляющий площадь квадрата
    public static void calculateSquareArea(double sideLength) {
        double result = sideLength * sideLength;
        System.out.println("Площадь квадрата = " + result + ", если стороны = " + sideLength);

    }

    // 3. Метод вычисляющий площадь прямоугольника
    public static void calculateRectangleArea(double width, double length) {
        double result = width * length;
        System.out.println("Площадь прямоугольника = " + result + ", если ширина = " + width + " а длина = " + length);
    }

    // 4. Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
    // Вычислите среднюю температуру за неделю и выведете ее на печать.
    public static void calculateAverageTemperature(double temperature1, double temperature2, double temperature3, double temperature4, double temperature5, double temperature6, double temperature7) {
        double sum = temperature1 + temperature2 + temperature3 + temperature4 + temperature5 + temperature6 + temperature7;
        double average = sum / 7;
        System.out.println("среднюю температуру за неделю " + average);
    }

    // 5. Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro. Если клиент покупает товары
    // вместе, то на них действует скидка 10% на всю покупку. Выведите на экран переменную, которая соответствует
    // стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.
    public static void calculateTotalPriceWithDiscount(int priceA, int priceB) {
        double discount = 0.1;

        double totalBeforeDiscount = priceA + priceB;
        double discountAmount = totalBeforeDiscount * discount;
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;

        System.out.println("Стоимость суммы A+B со скидкой: " + totalAfterDiscount);
        System.out.println("Сумма скидки: " + discountAmount);
    }

    // 6. Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3? Покажите это на конкретных примерах.
    public static void calculateRemainder(int dividend, int divisor) {
        int remainder = dividend % divisor;
        System.out.println("Остаток от деления " + dividend + " на " + divisor + " = " + remainder);
    }

    // 7. Создайте три переменные num1, num2 и num3 типа double и присвойте им любые значения. Затем создайте переменную average и вычислите среднее значение этих трех чисел.
    public static void average(int num1, int num2, int num3) {
        double average = (num1 + num2 + num3) / 3;

        System.out.println("Среднее значение: " + average);
    }

    // 8. Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9. Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10. Получается, у вас будет среднее арифметическое этих чисел в одной переменной. Распечатайте её через println. Сколько программа отбросила в дробной части?
    public static void averageFor10() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;
        double average = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;

        System.out.println("Среднее арифметическое: " + average);
    }
}
