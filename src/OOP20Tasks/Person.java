package OOP20Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person { // Задание 1

    public String name;
    public int age;
    public Gender gender;


    public void increaseAge(int value) {
        age += value;
    }

    public void changeName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

enum Gender {
    MALE, FEMALE
}

class Worker extends Person { // Задание 2
    public int salary;
}

class Manager extends Worker {
    public List<Worker> employee = new ArrayList<>();
}


interface Animal { //Задание 3
    void makeSound();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Собака: гав-гав");
    }
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Кошка: мяу-мяу");
    }
}

class Cow implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Корова: му-му");
    }
}


abstract class Transport { //Задание 4
   abstract void move();
}

class Car extends Transport {

    @Override
    void move() {
        System.out.println("Машина едит");
    }
}

class Bike extends Transport {

    @Override
    void move() {
        System.out.println("Велосипед едит");
    }
}

class Book { // Задание 5
    public String title;
    public String author;
    public Integer year;

}

class Library {
    List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book findByAuthor(String author) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).author.equals(author)) {
                return bookList.get(i);
            }
        }
        return null;
    }

    public Book findByYearOfPublication(int year) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).year.equals(year)) {
                return bookList.get(i);
            }
        }
        return null;
    }
}

class BankAccount { // Задание 6

    private Integer accountNumber;
    private Double balance;

    public void increaseBalance(Double value) {
        balance += value;
    }

    public void removeBalance(double value) {
        balance -= value;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }
}


class Counter { // Задание 7

    public static int objectValue = 0;

    public Counter() {
        objectValue++;
    }

}

abstract class Shape { // Задание 8

    abstract double getArea();

}

class Circle extends Shape {

    public double P;
    public double R;

    @Override
    public double getArea() {
        return P * Math.pow(R, 2);
    }
}

class Rectangle extends Shape {

    public int a;
    public int b;

    @Override
    double getArea() {
        return a * b;
    }
}


class AnimalСlass { // Задание 9

    public void move() {
        System.out.println("Животное двигается");
    }

}

class Fish extends AnimalСlass {

    @Override
    public void move() {
        System.out.println("рыба плавает");
    }

}

class Bird extends AnimalСlass {

    @Override
    public void move() {
        System.out.println("птица летает");
    }

}

class DogClass extends AnimalСlass {

    @Override
    public void move() {
        System.out.println("собака бегает");
    }

}

class Student { // Задание 10

    public String name;
    public String group;
    public Integer grade;

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getGrade() {
        return grade;
    }


}

class University {

    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudent(Student student) {
        studentList.remove(student);
    }

    public void sortByName() {
        studentList.sort(Comparator.comparing(Student::getName));
    }

    public List<Student> filterByGrade(double minGrade) {
        return studentList.stream()
                .filter(student -> student.getGrade() >= minGrade)
                .collect(Collectors.toList());
    }

}

class Product { // Задание 11

    public String name;
    public String price;
    public String quantity;

    public String getName() {
        return name;
    }
}

class Store {
    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    public Product findProductByName(String productName) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}


interface PaymentSystem { //Задание 12
    void pay();
    void refund();
}

class CreditCard implements PaymentSystem {

    @Override
    public void pay() {
        System.out.println("Оплата с помощью кредитной карты");
    }

    @Override
    public void refund() {
        System.out.println("Возврат денег через кредитную карту");
    }
}

class PayPal implements PaymentSystem {

    @Override
    public void pay() {
        System.out.println("Оплата с помощью PayPal");
    }

    @Override
    public void refund() {
        System.out.println("Возврат денег через PayPay");
    }
}

class UniqueID { // Задание 13

    private static int counter = 0;

    public static int generateID() {
        return counter++;
    }

}

class Point { //Задание 14

    public int x;
    public int y;

}

class RectangleClass extends Point{

    public int findSquare() {
        return x * y;
    }

}

class ComplexNumber { // Задание 15
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);

    }

    public ComplexNumber subtract(ComplexNumber other) {

        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {

        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }


    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }


}

class Matrix { //Задание 16
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }


    public Matrix add(Matrix other) throws Exception {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new Exception();
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) throws Exception {
        if (this.cols != other.rows) {
           throw new Exception();
        }

        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
}

class Weapon { // Задание 17
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return name + " (Damage: " + damage + ")";
    }
}

class Enemy {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Player player) {
        System.out.println(name + " атакует " + player.getName() + " и наносит " + damage + " урона.");
        player.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " получает " + damage + " урона. Здоровье: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return name + " (Health: " + health + ", Damage: " + damage + ")";
    }
}

class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void attack(Enemy enemy) {
        int damage = weapon.getDamage();
        System.out.println(name + " атакует " + enemy.getName() + " с помощью " + weapon.getName() + " и наносит " + damage + " урона.");
        enemy.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " получает " + damage + " урона. Здоровье: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return name + " (Health: " + health + ", Weapon: " + weapon + ")";
    }
}

class Order { // Задание 18
    private static int orderCounter = 1;
    private int orderId;
    private List<ProductClass> products;

    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(ProductClass product) {
        products.add(product);
    }

    public double getTotalCost() {
        return products.stream().mapToDouble(ProductClass::getPrice).sum();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Products:\n");
        for (ProductClass product : products) {
            sb.append("- ").append(product).append("\n");
        }
        sb.append("Total Cost: $").append(getTotalCost()).append("\n");
        return sb.toString();
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(name).append("\n");
        sb.append("Orders:\n");
        for (Order order : orders) {
            sb.append(order).append("\n");
        }
        return sb.toString();
    }
}

class ProductClass {
    private String name;
    private double price;

    public ProductClass(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Price: $" + price + ")";
    }
}

class Device { // Задание 19
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println(brand + " устройство включено.");
    }

    public void turnOff() {
        System.out.println(brand + " устройство выключено.");
    }

    @Override
    public String toString() {
        return "Device{brand='" + brand + "'}";
    }
}

class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println(brand + " смартфон делает фото.");
    }

    @Override
    public String toString() {
        return "Smartphone{brand='" + brand + "'}";
    }
}

class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void openLid() {
        System.out.println(brand + " ноутбук открывает крышку.");
    }

    public void closeLid() {
        System.out.println(brand + " ноутбук закрывает крышку.");
    }

    @Override
    public String toString() {
        return "Laptop{brand='" + brand + "'}";
    }
}


class PlayerClass { // Задание 20
    private String name;
    private char symbol;

    public PlayerClass(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name + " (" + symbol + ")";
    }
}

class Game {
    private char[][] board;
    private PlayerClass player1;
    private PlayerClass player2;
    private PlayerClass currentPlayer;

    public Game(PlayerClass player1, PlayerClass player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin() {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return true;
        }
        return false;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась!");
        while (true) {
            printBoard();
            System.out.println(currentPlayer.getName() + ", ваш ход. Введите строку и столбец (от 1 до 3):");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
                System.out.println("Неверный ход. Попробуйте снова.");
                continue;
            }

            board[row][col] = currentPlayer.getSymbol();

            if (checkWin()) {
                printBoard();
                System.out.println(currentPlayer.getName() + " победил!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("Ничья!");
                break;
            }

            switchPlayer();
        }
        scanner.close();
    }
}


