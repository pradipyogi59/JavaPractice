package OOP.Composition;


import java.util.ArrayList;
import java.util.List;

class Student
{
    String name;
    int id ;
    String dept;

    Student(String name, int id, String dept)
    {

        this.name = name;
        this.id = id;
        this.dept = dept;

    }
}

class Department
{

    String name;
    private List<Student> students;
    Department(String name, List<Student> students)
    {

        this.name = name;
        this.students = students;

    }

    public List<Student> getStudents()
    {
        return students;
    }

    public List<Student> getME(){
        return students;
    }
}

class Institute{
    String instituteName;
    private List<Department> departments;
    int numberofStudent=0;

    public Institute(String instituteName,List<Department> depart){
        this.instituteName=instituteName;
        departments=depart;
    }

    public int me(){

        List<Student> std;
        for (Department d:departments)
        {
            std=d.getStudents();
            for (Student s:std)
            {
                numberofStudent++;
            }
        }
        return numberofStudent;
    }

}


public class Composition2 {


    public static void main(String args[]) {


        Student s1 = new Student("PRadip", 1, "it");
        Student s2 = new Student("Amit", 2, "Mech");
        Student s3 = new Student("Manoj", 3, "it");
        Student s4 = new Student("Dapo", 4, "Mech");

        List<Student> studentsIT = new ArrayList<>();
        studentsIT.add(s1);
        studentsIT.add(s3);

        List<Student>studentsMech=new ArrayList<>();
        studentsMech.add(s3);
        studentsMech.add(s4);


        Department it=new Department("IT",studentsIT);
        Department mech=new Department("Mech",studentsMech);


        List<Department> departments=new ArrayList<>();
        departments.add(it);
        departments.add(mech);

        // Institute ins=new Institute("dim",departments);

        //      System.out.println(ins.me());


    }


    //Has-a relationship also known as a Composition or Aggregation
    //There is no keyword for this most of time we use new keyword
    //Advantage is Reusability

}
