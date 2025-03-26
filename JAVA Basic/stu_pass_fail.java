import java.util.Scanner;

public class stu_pass_fail {
    public static int checkIfStudentPassOrFail(int marks[],int n){
        int summarks = 0;
        int total = n*100;
        
        for (int i = 0; i < n; i++) {
            //total = total+ 100;
            summarks = summarks + marks[i];
        }

        //total = total - 100;
        int percent = (summarks*100)/total;

        if(percent>=33){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Number of Subjects : ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        System.out.println("Enter marks of each subject(out of 100): ");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int result = checkIfStudentPassOrFail(marks, n);

        if(result == 1){
            System.out.println("Congratulations , You have pass the exam!!");
        }
        else{
            System.out.println("Failed but you have chance to grade up.");
        }

    }
}
