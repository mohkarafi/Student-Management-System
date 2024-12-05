package studenetDataBase;

import java.util.Scanner;

public class Student {

    private String FirstName ;
    private String LastName ;
    private int  Gradeyear ;
    private String StudentId;
    private String courses = "" ;
    private int tuitionBalance = 0;
    private  static int CostOfcourse = 600;
    private static int id = 1000;

    // constructor to enter student's name and year

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student First Name");
        this.FirstName = sc.nextLine();
        System.out.println("Enter the Student Last Name");
        this.LastName = sc.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter the Student Class Level : ");
        this.Gradeyear = sc.nextInt();
        setStudentId();
    }


    // generate an id

    public void setStudentId() {
        id++ ;
        this.StudentId =  Gradeyear +  "" + id;
    }


    // Enroll in courses
public void Enroll(){
    do{
        System.out.print("Enter cours  to Enroll (Q to quit )");
        Scanner crs = new Scanner(System.in);
        String cours = crs.nextLine();
        if(!cours.equals("Q")){
            courses= courses +" \n" + cours;
            tuitionBalance = tuitionBalance +   CostOfcourse;
        }
        else{
            break;
        }

    } while (1!=0);
    }


    // view balance
    public void ViewBalance(){
        System.out.println("your balance is : " + tuitionBalance+" $");
    }
    // Pay tuition
    public void PayTuition(){
        ViewBalance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the payment amount  ");
        int paiment = sc.nextInt();
       tuitionBalance = tuitionBalance-paiment;
        System.out.println("Thank you for paying " + paiment + "$");
        ViewBalance();
    }
    // show status


    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\n' +
                ", LastName='" + LastName + '\n' +
                ", GradeLevel  =" + Gradeyear  + '\n' +
                ", courses : '" + courses + '\n' +
                ", Balance  =" + tuitionBalance + '$'+
                '}';
    }
    public String showinfo(){
      return toString();

    }
}
