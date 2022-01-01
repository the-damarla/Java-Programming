package OOPStuff;
import java.sql.SQLOutput;
import java.util.*;

public class IntroToOop {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.Num + " " + s.marks + " " + s.name);
        s.name = "Vijay Sai Nag";
        s.Num = 302;
        s.marks = 89.1f;
        System.out.println(s.Num + " " + s.marks + " " + s.name);
        s.PrintGivenData();
        Student s1 = new Student("kolla",91.2f,304);
        s1.PrintGivenData();
        s1.ChnageName("Harsha Vardhan Sai");
        s1.PrintGivenData();
        Student s2 = new Student();
        s2.PrintGivenData();
        s2.ChnageName("Nag");
        s2.PrintGivenData();
    }
}

class Student
{
    static int NumOfObs = 0;
    int Num;
    String name;
    float marks;
    void PrintGivenData()
    {
        System.out.println("name : " + this.name + " Number : " + this.Num + " Marks : " + this.marks + " Objects Created : " + Student.NumOfObs);
    }
    void ChnageName(String name)
    {
        this.name = name;
    }
    Student()
    {
        Student.NumOfObs += 1;
    }
    Student(String name, float marks, int num)
    {
        this.name = name;
        this.marks = marks;
        this.Num = num;
        Student.NumOfObs += 1;
    }
}
