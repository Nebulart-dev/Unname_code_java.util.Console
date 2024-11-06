//Dev. artem.kasapov (@Nebulart-dev) - Java//

//Месяц и количество дней
import java.util.Scanner; //нужен для ввода данных в консоле

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число месяца: ");
        int month = in.nextInt();
        switch (month) {
            case 1:
                System.out.println("Январь: 31 день ");
                break;
            case 2:
                System.out.println("Февраль: 28 дней ");
                break;
            case 3:
                System.out.println("Март: 31 день ");
                break;
            case 4:
                System.out.println("Апрель: 30 день ");
                break;
            case 5:
                System.out.println("Май: 31 день ");
                break;
            case 6:
                System.out.println("Июнь: 30 дней ");
                break;
            case 7:
                System.out.println("Июль: 31 дней ");
                break;
            case 8:
                System.out.println("Август: 31 день ");
                break;
            case 9:
                System.out.println("Сентябрь: 30 дней");
                break;
            case 10:
                System.out.println("Октябрь: 31 день");
                break;
            case 11:
                System.out.println("Ноябрь: 30 дней");
                break;
            case 12:
                System.out.println("Декабрь: 31 день");
                break;
            default:
                System.out.println("Неизвестное число -> " + month);
        }
    }
}

//Перевод чисел в слова (без ввода в консоли)
/*
public class Main {
    public static void main(String[] args) {
        int num = 4;
        switch (num) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            case 6:
                System.out.println("Шесть");
                break;
            case 7:
                System.out.println("Семь");
                break;
            case 8:
                System.out.println("Восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
            default:
                System.out.println("Ошибка!");
        }
    }
}

 */

//Определение части суток
/*
import java.util.Scanner; //нужен для считывания данных с консоли

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Время: ");
        int month = in.nextInt();

        if (month >= 0 && month <= 5) {
            System.out.print("Ночь");
        } else if (month >= 6 && month <= 11) {
            System.out.print("Утро");
        } else if (month >= 12 && month <= 17) {
            System.out.print("День");
        } else if (month >= 18 && month <= 23) {
            System.out.print("Вечер");
        } else {
            System.out.println("Некорректное число -> " + month);
        }
    }
}
*/

//Определение типа фигуры по числу
/*
import java.util.Scanner; //нужен для считывания данных с консоли

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 3 до 6: ");
        int shapeNumber = in.nextInt();

        if (shapeNumber < 3 || shapeNumber > 6) {
            System.out.println("> Недопустимое число");
        } else {
            switch (shapeNumber) {
                case 3:
                    System.out.println("> Треугольник");
                    break;
                case 4:
                    System.out.println("> Четырёхугольник");
                    break;
                case 5:
                    System.out.println("> Пятиугольник");
                    break;
                case 6:
                    System.out.println("> Шестиугольник");
                    break;
                default:
                    System.out.println("> Ошибка ввода");
            }
        }
    }
}

 */
