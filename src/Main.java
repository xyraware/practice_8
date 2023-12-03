import java.util.Random;
public class Main {
    public static void main(String[] args){
        System.out.println("Практика 8.\n Задания по этой теме выполняются следующим образом: каждый учащийся " +
                "\nвыполняет от 3 до 5 задач, начиная с номера варианта задания, который соотвествует номеру учащегося" +
                "\nв журнале группы. Румянцева Елизавета Ивановна-23 вариант, 23-17=6, следовательно, будут выполнятся 6," +
                "\n7 и 8 задача");
        System.out.println("Задача 6. Задание проверка числа на простоту" +
                "\nДано натуральное число n>1. Проверьте, является ли оно простым. программа должна вывести слово YES," +
                "\nесли число простое и NO, если число составное. Алгоритм должен иметь сложность O(logn)" +
                "\nЗамечание: нужно сделать еще один параметр рекурси: делитель числа, и именно по этому параметру и делать" +
                "\nрекурсию");
        Number ex6=new Number();
        Random rand=new Random();
        ex6.setDandN(rand.nextInt(500-2+1),rand.nextInt(500-2+1));
        System.out.println("Простое ли число  "+ex6+"?");
        ex6.putOut(ex6.calculation());
        System.out.println("7. Разложение на множители" +
                "\nДано натуральное число n>1. Выделите множители этого числа в порядке не убывания с учетом кратности." +
                "\nАлгоритм должен иметь сложность O(logn)\n Разложение на множиетелей:");
        ex6.Multiplizers();
        System.out.println("8. Палиндром" +
                "\nДано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово" +
                "\nпалиндромом. Введите YES или NO" +
                "\nПри решении этой задачи нельзя пользоваться циклами");
        Palindrom palindrom1=new Palindrom();
        Palindrom palindrom2=new Palindrom();
        Palindrom palindrom3=new Palindrom();
        Palindrom palindrom4=new Palindrom();
        palindrom1.setPal("9748228479");
        palindrom2.setPal("civic");
        palindrom3.setPal("eye");
        palindrom4.setPal("Door");
        palindrom1.check();
        palindrom2.check();
        palindrom3.check();
        palindrom4.check();
    }
}
