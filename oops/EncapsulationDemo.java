package oops;

class Student{
    private String name;
    private int id;
    private String year;

    Student(String name,int id,String year){
        this.name = name;
        this.id = id;
        this.year = year;
    }

    String getStudentDetails(){
        return "name : "+name+", id : "+id+", year : "+year;
    }

    void setStudentDetails(String name,int id,String year){
        this.name = name;
        this.id = id;
        this.year = year;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rutik", 101, "3rd");
        Student s2 = new Student("Apurv", 102, "3rd");
        Student s3 = new Student("Tanmay", 103, "3rd");
        Student s4 = new Student("Manas", 104, "3rd");

        System.out.println(s1.getStudentDetails()
            +"\n"+s2.getStudentDetails()
            +"\n"+s3.getStudentDetails()
            +"\n"+s4.getStudentDetails()
        );
    }
}

/* 
Encapsulation in Java is the OOP (Object-Oriented Programming) 
mechanism of bundling data (variables) and the methods that 
operate on that data into a single unit (a class), while 
restricting direct external access to the object's internal 
state. It is often referred to as data hiding.
*/