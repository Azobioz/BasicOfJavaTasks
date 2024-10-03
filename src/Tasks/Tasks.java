package Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Tasks {

    public static void main(String[] args) {

    }

    public static int findMax(int a, int b) { //Задание 1
        if (a > b) {
            return a;
        }
        else if (a < b) {
            return b;
        }
        throw new ArithmeticException();
    }

    public static double divideTwoValues(int a, int b) { // Задание 2
        if (b == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        else {
            return a / b;
        }
    }

    public static int convertToNumber(String line) { // Задание 3
        try {
            int integer = Integer.parseInt(line);
            return integer;
        }
        catch (NumberFormatException exe) {
            throw new NumberFormatException();
        }
    }

    public static void ageReview(int age) { // Задание 4
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException();
        }
    }

    public static double numberRoot(double number) { // Задание 5
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(number);
    }

    public static int factorial(int a) { // Задание 6
       int result = 1;
       for (int i = 1; i <= a; i++) {
           result *= i;
       }
       return result;
    }

    public boolean isArrayHaveZero(int[] array) throws Exception { // Задание 7
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                throw new Exception();
            }
        }
        return false;
    }

    public double exponentiation(int a, int b) throws Exception { // Задание 8
        double result = Math.pow(a, b);
        if (result < 0) {
            throw new Exception();
        }
        return result;
    }



    public static String truncateString(String inputString, int maxLength) throws IllegalArgumentException { //Задание 9
        if (maxLength > inputString.length()) {
            throw new IllegalArgumentException();
        }
        return inputString.substring(0, maxLength);
    }

    public int findElement(int[] array, int number) throws Exception { // Задание 10
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return number;
            }
        }
        throw new Exception();
    }

    public String parseToBinary(int a) throws Exception { // Задание 11
        if (a < 0) {
            throw new Exception();
        }
        return Integer.toBinaryString(a);
    }

    public double isFirstCanDivideToSecond(double a, double b) { // Задание 12
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public void getElement(int[] array, int index) { // Задание 13
        if (index >= array.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                System.out.println("Элемент " + i + " равен " + array[i]);
            }
        }
    }

    class WeakPasswordException extends Exception { // Для 14 задания

        public WeakPasswordException(String message) {
            super(message);
        }
    }

    public boolean checkPassword(String password) throws WeakPasswordException { // Задание 14
        if (password.length() < 8) {
            throw new WeakPasswordException("Плохой пароль");
        }
        return true;
    }

    public static boolean isValidDate(String dateStr) throws DateTimeParseException { // Задание 15

        try {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(dateStr, dateFormatter);
            return true;
        }
        catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты", dateStr, e.getErrorIndex(), e);
        }
    }

    public String combineTwoString(String str1, String str2) { // Задание 16
        if (str1 == null || str2 == null) {
            throw new NullPointerException();
        }
        return str1 + str2;
    }

    public int getModule(double a, double b) throws Exception { // Задание 17
        if (b == 0) {
            throw new Exception();
        }
        return (int) (a % b);
    }

    public double squareRoot(int a) throws Exception { //Задание 18
        if (a < 0) {
            throw new Exception();
        }
        return Math.pow(a, 2);
    }

    public double celsiusToFahrenheit(double celsius) throws IllegalArgumentException { // Задание 19
        if (celsius < -273.15) {
            throw new IllegalArgumentException();
        }
        return celsius * 9 / 5 + 32;
    }

    public boolean checkString(String str) throws Exception { //Задание 20
        if (str == null || str.equals("")) {
            throw new Exception();
        }
        return true;
    }







}


