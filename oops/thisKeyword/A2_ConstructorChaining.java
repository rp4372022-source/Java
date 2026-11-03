package oops.thisKeyword;

class Student{
    private String name;
    private String major;

    public Student(){
        this("Unknown Student");
    }
    public Student(String name){
        this(name,"unknown major");
    }
    public Student(String name,String major){
        this.name = name;
        this.major = major;
    }
}

public class A2_ConstructorChaining {
    
}
