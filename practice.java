
import java.util.LinkedList;
import javax.swing.*;
import java.awt.*;
// Main class
class LinkedListExample {

    public static void main(String[] args) {

        System.out.println("===== LINKEDLIST =====");
        LinkedList<String> names = new LinkedList<>();
        names.add("Diya");
        names.add("Rahul");
        names.add("Priya");
        System.out.println("Names: " + names);
        names.addFirst("Aman");
        names.addLast("Neha");
        System.out.println("After Adding: " + names);
        System.out.println("First Name: " + names.getFirst());
        System.out.println("Last Name: " + names.getLast());
        names.removeFirst();
        names.removeLast();
        System.out.println("After Removing: " + names);
        System.out.println("Size: " + names.size());

        System.out.println("\n===== CONSTRUCTOR =====");
        ConstructorStudent s1 = new ConstructorStudent("Diya", 20);
        s1.display();

        System.out.println("\n===== THIS KEYWORD =====");
        ThisStudent s2 = new ThisStudent("Diya", 20);
        s2.display();

        System.out.println("\n===== STATIC KEYWORD =====");
        CollegeStudent s3 = new CollegeStudent("Diya");
        CollegeStudent s4 = new CollegeStudent("Rahul");
        s3.display();
        s4.display();

        System.out.println("\n===== FINAL KEYWORD =====");
        MarksLimit marks = new MarksLimit();
        marks.display();

        System.out.println("\n===== CONSTRUCTOR OVERLOADING =====");
        OverloadedStudent s5 = new OverloadedStudent();
        OverloadedStudent s6 = new OverloadedStudent("Diya");
        OverloadedStudent s7 = new OverloadedStudent("Rahul", 21);
        s5.display();
        s6.display();
        s7.display();

        System.out.println("\n===== INHERITANCE =====");
        DogBasic d1 = new DogBasic();
        d1.eat();
        d1.bark();

        System.out.println("\n===== MULTILEVEL INHERITANCE =====");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\n===== HIERARCHICAL INHERITANCE =====");
        DogHierarchy d2 = new DogHierarchy();
        d2.eat();
        d2.bark();

        CatHierarchy c = new CatHierarchy();
        c.eat();
        c.meow();

        System.out.println("\n===== MULTIPLE INHERITANCE USING INTERFACES =====");
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();

        System.out.println("\n===== RUNTIME POLYMORPHISM =====");
        AnimalPoly animal;
        animal = new DogPoly();
        animal.sound();
        animal = new CatPoly();
        animal.sound();

        System.out.println("\n===== SUPER KEYWORD =====");
        DogSuper d3 = new DogSuper();
        d3.display();
    }
}

// Constructor
class ConstructorStudent {
    String name;
    int age;

    ConstructorStudent(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// This keyword
class ThisStudent {
    String name;
    int age;

    ThisStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Static keyword
class CollegeStudent {
    static String college = "IGNOU";
    String name;

    CollegeStudent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

// Final keyword
class MarksLimit {
    final int MAX_MARKS = 100;

    void display() {
        System.out.println("Maximum Marks: " + MAX_MARKS);
    }
}

// Constructor overloading
class OverloadedStudent {
    String name;
    int age;

    OverloadedStudent() {
        name = "Unknown";
        age = 0;
    }

    OverloadedStudent(String name) {
        this.name = name;
        age = 18;
    }

    OverloadedStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-----------");
    }
}

// Inheritance
class AnimalBasic {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogBasic extends AnimalBasic {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel inheritance
class AnimalMulti {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogMulti extends AnimalMulti {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends DogMulti {
    void weep() {
        System.out.println("Puppy is crying");
    }
}

// Hierarchical inheritance
class AnimalHierarchy {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogHierarchy extends AnimalHierarchy {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class CatHierarchy extends AnimalHierarchy {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Multiple inheritance using interfaces
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void playMusic() {
        System.out.println("Music is playing");
    }
}

// Runtime polymorphism
class AnimalPoly {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogPoly extends AnimalPoly {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatPoly extends AnimalPoly {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Super keyword
class AnimalSuper {
    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogSuper extends AnimalSuper {
    String name = "Dog";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
        super.sound();
    }
}


class SwingExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField();

        JLabel courseLabel = new JLabel("Select Course:");
        String[] courses = {"BCA", "MCA", "B.Tech", "BBA"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        JButton submitButton = new JButton("Submit");

        JLabel resultLabel = new JLabel("Enter your details");

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String course = (String) courseBox.getSelectedItem();

            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    frame, "Please enter your name!"
                );
            } else {
                resultLabel.setText("Registered: " + name);
                JOptionPane.showMessageDialog(
                    frame,
                    "Name: " + name + "\nCourse: " + course
                );
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseBox);
        frame.add(submitButton);
        frame.add(resultLabel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

// Topic: JOptionPane

class JOptionPaneExample {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(
            null, "Enter your name:"
        );

        if (name != null && !name.trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                null, "Welcome, " + name + "!"
            );

            int choice = JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                    null, "You selected Yes!"
                );
            } else {
                JOptionPane.showMessageDialog(
                    null, "You selected No or closed the box."
                );
            }
        }
    }
}


class RadioButtonExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Radio Button Example");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your gender:");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        JButton button = new JButton("Submit");

        button.addActionListener(e -> {
            if (male.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Selected: Male");
            } else if (female.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Selected: Female");
            } else if (other.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Selected: Other");
            } else {
                JOptionPane.showMessageDialog(frame, "Please select an option!");
            }
        });

        frame.add(label);
        frame.add(male);
        frame.add(female);
        frame.add(other);
        frame.add(button);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

// Topic: JCheckBox

class CheckBoxExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hobbies Selection");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your hobbies:");

        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox music = new JCheckBox("Listening to Music");
        JCheckBox sports = new JCheckBox("Playing Sports");
        JCheckBox coding = new JCheckBox("Coding");

        JButton submit = new JButton("Submit");

        submit.addActionListener(e -> {

            String hobbies = "";

            if (reading.isSelected()) {
                hobbies += "Reading\n";
            }

            if (music.isSelected()) {
                hobbies += "Listening to Music\n";
            }

            if (sports.isSelected()) {
                hobbies += "Playing Sports\n";
            }

            if (coding.isSelected()) {
                hobbies += "Coding\n";
            }

            if (hobbies.isEmpty()) {
                hobbies = "No hobby selected.";
            }

            JOptionPane.showMessageDialog(frame, hobbies);
        });

        frame.add(label);
        frame.add(reading);
        frame.add(music);
        frame.add(sports);
        frame.add(coding);
        frame.add(submit);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

// Topic: JComboBox

class ComboBoxExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Course Selection");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your course:");

        String[] courses = {
            "BCA",
            "MCA",
            "B.Tech",
            "BBA",
            "M.Tech"
        };

        JComboBox<String> courseBox =
                new JComboBox<>(courses);

        JButton button = new JButton("Submit");

        button.addActionListener(e -> {
            String course =
                    (String) courseBox.getSelectedItem();

            JOptionPane.showMessageDialog(
                    frame,
                    "Your selected course is: " + course
            );
        });

        frame.add(label);
        frame.add(courseBox);
        frame.add(button);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

// Topic: JTextArea

class TextAreaExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Feedback Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your feedback:");

        JTextArea feedbackArea = new JTextArea(6, 25);
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(feedbackArea);

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
            String feedback = feedbackArea.getText();

            if (feedback.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    frame, "Please enter your feedback!"
                );
            } else {
                JOptionPane.showMessageDialog(
                    frame, "Your Feedback:\n" + feedback
                );
            }
        });

        frame.add(label);
        frame.add(scrollPane);
        frame.add(submitButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

