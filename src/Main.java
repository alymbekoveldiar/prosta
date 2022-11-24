import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Grupa grupa1 = new Grupa("Программное инеженерия" );
    Grupa grupa2 = new Grupa("Стомотолог");
    Student student = new Student("Азат", "Пазылов", "не класс командир", 3, grupa1);
    Student student1 = new Student("Эмиль", "Токоев", " класс командир", 5, grupa1);
    Student student3 = new Student("Андрей", "Канатбеков", "не класс командир", 4, grupa1);


    Aspirant aspirant = new Aspirant("Арген", "Эсенгулов", "не класс командир", 3.3, "бакалавр");
    Aspirant aspirant1 = new Aspirant("Руслан", "Эсеналиев", "класс комадир", 4.7, "кандидат наук");
    Aspirant aspirant2 = new Aspirant("Саша", "Василиев","не класс командир", 5, "магистр ");

    Student[] students = new Student[7];
    students[0]=student;
    students[1]=student1;
    students[2]=student3;
    students[3]=aspirant;
    students[4]=aspirant1;
    students[5]=aspirant2;
        for (int i = 0; i < students.length; i++) {
            students[i].getScholarship(students);
        }
    }
        }


