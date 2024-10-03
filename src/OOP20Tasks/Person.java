package OOP20Tasks;

import java.util.ArrayList;
import java.util.List;

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

class BankAccount {
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


