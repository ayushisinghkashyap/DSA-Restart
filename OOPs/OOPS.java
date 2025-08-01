import java.sql.Struct;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created pen object p1
        Pen p2 = new Pen();
        p1.setcolor("Blue");
        p1.setTip(6);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        System.out.println(p2.color);


        Student st1 = new Student();
        Student st2 = new Student();
        st1.age = 15;
        System.out.println("Student1 age : "+st1.age);
        st1.calculatePercentage(89,56 ,78 );
        System.out.println(st1.percentage);

        st1.setName("Aditya");
        st2.setName("Abhi");
        String frd = st1.name + " and " + st2.name + " are friends.";
        System.out.println(frd);
    }
}

class Pen{
    String color;
    int tip;

    void setcolor(String newColor){
        color = newColor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy,int math,int chem){
        percentage = (phy + chem + math)/3;
    }

    void setName(String std_name){
        name = std_name ;
    }
}
