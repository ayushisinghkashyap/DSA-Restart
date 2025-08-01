import java.util.*;

public class classTue {

    classTue(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        classTue sol = new classTue(name, age);
    }
}
