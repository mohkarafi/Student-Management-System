package studenetDataBase;

import java.util.Scanner;

public class studentDataBase {
    public static void main(String[] args) {


        //Ask how many students we want to add
        System.out.println("Enter number of new students to enroll ");
        Scanner sc = new Scanner(System.in);
        int NombreOfStudent = sc.nextInt();
        Student [] student = new Student[NombreOfStudent];

        // create n the number of new students
        for(int i = 0 ; i< NombreOfStudent ; i++){
            student[i] = new Student();
            student[i].Enroll();
            student[i].PayTuition();
            System.out.println( student[0].showinfo());

        }


    }
}
