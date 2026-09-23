package oops;

class Student {
    public int rollno = 1;
    {
        System.out.println("RollNo: " + rollno);
    }
    public String name = "Ashu";
    {
        System.out.println("NAME: " + name);
    }
}

class Exam extends Student {
    public String sub1 = "PHYS";
    {
        System.out.println("SUBJECT 1: " + sub1);
    }
    public String sub2 = "CHEM";
    {
        System.out.println("SUBJECT 2: " + sub2);
    }
    public String sub3 = "MATH";
    {
        System.out.println("SUBJECT 3: " + sub3);
    }
    
    public int score(int p, int c, int m) {
        return p + c + m;
    }
    
    public void show() {
        System.out.println("Student Marks");
    }
}


class Sem extends Exam {
    public String sem = "5th";
    public String year = "3rd";
    {
        System.out.println("SEM : " + sem + "YEAR : " + year);
    }
}

public class MultiLevelInheitanceDemo {
    public static void main(String[] args) {
        Sem sm= new Sem();
        sm.show();
        int totalScore = sm.score(85, 90, 88);
        System.out.println("Total Score: " + totalScore);
    }
}
