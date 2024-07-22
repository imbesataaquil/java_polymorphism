package Polymorphism;

public class Student {
    String name;
    int age;
    String department;
   public Student(){
        this.name="unknown";
        this.age=20;
        this.department="unassigned";
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
        this.department="IT";
    }
    Student(String name,int age,String department){
       this.name=name;
       this.age=age;
       this.department=department;
    }
    void printDetails(){
        System.out.println("name ="+name);
        System.out.println("age ="+age);
        System.out.println("department ="+department);
   }
}
    class Main1 {
        public static void main(String[] args) {


            Student s1 = new Student();
            Student s2 = new Student(" khushi ", 20);
            Student s3 = new Student(" Imbesat ", 20, "BCA");
            s1.printDetails();
            s2.printDetails();
            s3.printDetails();
        }
    }
