package question4;

public class AggregationDemo {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(
                "Nima",
                "Davarpanah",
                "3-2636"
        );

        Instructor instructor2 = new Instructor(
                "John",
                "Smith",
                "8-210"
        );

        Textbook textbook1 = new Textbook(
                "Clean Code",
                "Robert C. Martin",
                "Prentice Hall"
        );

        Textbook textbook2 = new Textbook(
                "Effective Java",
                "Joshua Bloch",
                "Addison-Wesley"
        );

        Course course = new Course(
                "CS 5800",
                instructor1,
                instructor2,
                textbook1,
                textbook2
        );

        course.print();
    }
}