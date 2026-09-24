// ======================================================
// TOPIC: BASIC JAVA PROGRAM - HELLO WORLD
// ======================================================

class diya {
    public static void main(String s[]) {
        System.out.println("hello diya");
    }
}


// ======================================================
// TOPIC: COMMAND LINE ARGUMENTS - ADDITION OF TWO NUMBERS
// ======================================================

class input {
    public static void main(String args[]) {
        int a, b, c;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        c = a + b;

        System.out.println("sum of two numbers is " + c);
    }
}


// ======================================================
// TOPIC: COMMAND LINE ARGUMENTS - AREA AND CIRCUMFERENCE OF CIRCLE
// ======================================================

class Circle {
    public static void main(String args[]) {
        double r = Double.parseDouble(args[0]);

        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}


// ======================================================
// TOPIC: CONDITIONAL STATEMENT - CHECK EVEN OR ODD
// ======================================================

class input {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}


// ======================================================
// TOPIC: SCANNER INPUT - ADDITION OF TWO NUMBERS
// ======================================================

import java.util.Scanner;

class input2 {
    public static void main(String s[]) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a and b");

        a = sc.nextInt();
        b = sc.nextInt();

        c = a + b;

        System.out.println("sum of two numbers is = " + c);
    }
}


// ======================================================
// TOPIC: SCANNER INPUT - STUDENT DETAILS
// ======================================================

import java.util.Scanner;

class input3 {
    public static void main(String s[]) {
        String Name;
        int RollNo;
        double Marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name of the student");
        Name = sc.next();

        System.out.println("enter the roll number");
        RollNo = sc.nextInt();

        System.out.println("enter the marks");
        Marks = sc.nextDouble();

        System.out.println("product of the student is " + Marks);
    }
}


// ======================================================
// TOPIC: MATH CLASS - SQUARE ROOT
// ======================================================

import java.util.Scanner;

class input4 {
    public static void main(String s[]) {
        int a;
        double sq;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");

        a = sc.nextInt();

        sq = Math.sqrt(a);

        System.out.println("square root of the number is " + sq);
    }
}


// ======================================================
// TOPIC: MATHEMATICAL FORMULA - VOLUME AND SURFACE AREA
// OF RIGHT CIRCULAR CONE
// ======================================================

import java.util.Scanner;

class input5 {
    public static void main(String s[]) {
        double r, h, l, volume, surface_area;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of radius");
        r = sc.nextDouble();

        System.out.println("enter the value of height");
        h = sc.nextDouble();

        l = Math.sqrt((r * r) + (h * h));

        volume = (3.14 * r * r * h) / 3;

        surface_area = (3.14 * r * r) + (3.14 * r * l);

        System.out.println(
            "volume of right circular cone is " + volume
        );

        System.out.println(
            "surface area of right circular cone is " + surface_area
        );
    }
}


// ======================================================
// TOPIC: WHILE LOOP - PALINDROME NUMBER
// ======================================================

import java.util.*;

class palindrome {
    public static void main(String s[]) {

        int num, temp, reversed = 0, rem;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");

        num = sc.nextInt();

        temp = num;

        while (num != 0) {
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }

        if (temp == reversed)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}


// ======================================================
// TOPIC: WHILE LOOP + DIGIT EXTRACTION
// SUM OF EVEN AND ODD DIGITS + SPECIAL NUMBER
// ======================================================

import java.util.*;

public class input {
    public static void main(String arg[]) {

        int num, sumO = 0, sumE = 0, rem, dif;

        Scanner get = new Scanner(System.in);

        System.out.println("Enter your value: ");

        num = get.nextInt();

        while (num > 0) {

            rem = num % 10;

            if (rem % 2 == 0) {
                sumE += rem;
            }
            else {
                sumO += rem;
            }

            num = num / 10;
        }

        System.out.println("Sum of even: " + sumE);
        System.out.println("Sum of Odd: " + sumO);

        dif = sumE - sumO;

        System.out.println(
            "Difference of sum of even and sum of odd num: " + dif
        );

        if (dif == 0) {
            System.out.println("Special no");
        }
        else {
            System.out.println("Not Special number");
        }
    }
}


// ======================================================
// TOPIC: WHILE LOOP - ARMSTRONG NUMBER
// ======================================================

import java.util.*;

class armstrong {
    public static void main(String arg[]) {

        int num, temp, rem, sum = 0;

        Scanner get = new Scanner(System.in);

        System.out.println("Enter your value: ");

        num = get.nextInt();

        temp = num;

        while (num > 0) {

            rem = num % 10;

            sum += rem * rem * rem;

            num = num / 10;
        }

        if (sum == temp) {
            System.out.println(
                temp + " is an Armstrong number"
            );
        }
        else {
            System.out.println(
                temp + " is not an Armstrong number"
            );
        }
    }
}


// ======================================================
// TOPIC: CONSTRUCTOR - DEFAULT CONSTRUCTOR
// ======================================================

class cons {

    int a, b, c;

    cons() {
        a = 7;
        b = 9;
    }

    void display() {
        System.out.println("a=" + a + "\nb=" + b);
    }
}

class Testcons {

    public static void main(String s[]) {

        cons co = new cons();

        co.display();
    }
}


// ======================================================
// TOPIC: CONSTRUCTOR - PARAMETERIZED CONSTRUCTOR
// ======================================================

import java.util.Scanner;

class cons1 {

    int a, b;

    cons1(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println("a=" + a + "\nb=" + b);
    }
}

class Testcons1 {

    public static void main(String s[]) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a and b");

        a = sc.nextInt();
        b = sc.nextInt();

        cons1 co = new cons1(a, b);

        co.display();
    }
}


// ======================================================
// TOPIC: CONSTRUCTOR - PARAMETERIZED CONSTRUCTOR
// USING THIS KEYWORD
// ======================================================

import java.util.Scanner;

class cons2 {

    int a, b;

    cons2(int x, int y) {
        this.a = x;
        this.b = y;
    }

    void display() {
        System.out.println("a=" + a + "\nb=" + b);
    }
}

class Testcons2 {

    public static void main(String s[]) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a and b");

        a = sc.nextInt();
        b = sc.nextInt();

        cons2 co = new cons2(a, b);

        co.display();
    }
}


// ======================================================
// TOPIC: INHERITANCE - SINGLE INHERITANCE
// ======================================================

class animal {

    void Speak() {
        System.out.println("Animal Speak");
    }
}

class Dog extends animal {

    void dogSpeak() {
        System.out.println("Dog barks");
    }
}

class TestInherit {

    public static void main(String s[]) {

        Dog d = new Dog();

        d.Speak();
        d.dogSpeak();
    }
}


// ======================================================
// TOPIC: INHERITANCE - MULTILEVEL INHERITANCE
// ======================================================

class animal {

    void Speak() {
        System.out.println("Animal Speak");
    }
}

class Dog extends animal {

    void dogSpeak() {
        System.out.println("Dog barks");
    }
}

class BabyDog extends Dog {

    void babyDogSpeak() {
        System.out.println("Baby Dog barks");
    }
}

class TestInherit {

    public static void main(String s[]) {

        BabyDog bd = new BabyDog();

        bd.Speak();
        bd.dogSpeak();
        bd.babyDogSpeak();
    }
}


// ======================================================
// TOPIC: INHERITANCE - HIERARCHICAL INHERITANCE
// ======================================================

class electronics {

    void display() {
        System.out.println("Electronic Device display");
    }
}

class watch extends electronics {

    void watchdisplay() {
        System.out.println("Watch displays time");
    }
}

class mobile extends electronics {

    void mobiledisplay() {
        System.out.println("Mobile displays information");
    }
}

class TestInherit {

    public static void main(String s[]) {

        electronics e = new electronics();
        e.display();

        watch w = new watch();
        w.watchdisplay();

        mobile m = new mobile();
        m.mobiledisplay();
    }
}

// Topic: Prime Number

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}