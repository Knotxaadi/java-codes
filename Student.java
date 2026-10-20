
class Student{
    int id;
    String name;

    Student() {
        id = 1;
        name = "Shashank";
    }

    Student(int i,String names){
        id = i;
        name = names;
    }

    void display(){
        System.out.println("Student Id:"+ id);
        System.out.println("Student name:"+name);
    }

     public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(2,"Shashank");

        System.out.println("Default Constructor:");
        s1.display();
        
        System.out.println("Parameterized Constructor:");
        s2.display();
    }
}
