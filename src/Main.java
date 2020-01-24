import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
	    Scanner input2=new Scanner(System.in);
	    System.out.println("Welcome to University Management System\n");
	    System.out.println("Please select an option to proceed,");
	    System.out.println("press [1] Register as a Student");
        System.out.println("press [2] Register as a Lecturer");
        int choice = input.nextInt();
        Student s1 = new Student();
        Lecturer l1 =new Lecturer();
        String [] num;
        String name;
        String courseNo;
        int age;
        switch(choice){
            case 1:
                System.out.println("...\nStudent Registration\nPlease submit the following information");
                System.out.println("Name :");
                name=input2.nextLine();
                System.out.println("Age :");
                age=input.nextInt();
                System.out.println("Enter the number of course modules you are going to register");
                int n=input.nextInt();
                String [] crs=new String[n];
                System.out.println("Select the course number from the following list");
                System.out.println("[1] SENG 11111 - Introducttion to Programming");
                System.out.println("[2] SENG 11112 - Fundamentals of Engineering");
                System.out.println(("[3] SENG 11113 - Data Structures and Algorithms"));
                courseNo=input2.nextLine();
                num = courseNo.split(",");
                for (int i=0;i<num.length;i++) {
                    if (num[i].equals("1")) {
                        crs[i] = "SENG 11111 - Introduction to programming";

                    } else if (num[i].equals("2")) {
                        crs[i] = "SENG 11112 - Fundamentals of Engineering";
                    } else if (num[i].equals("3"))
                        crs[i] = "SENG 11113 - Data Structures and Algorithms";
                    else
                        System.out.println("Not a valid input");
                }

                s1=new Student(name,age,crs);
                break;
            case 2:
                System.out.println("...\nLecture Registration \nPlease submit the following information");
                System.out.println("Name :");
                name=input2.nextLine();
                System.out.println("Age :");
                age=input.nextInt();
                System.out.println("Enter the number of course modules you are going to register");
                int n1=input.nextInt();
                String [] crs2=new String[n1];
                System.out.println("Select the course number from the following list ");
                System.out.println("[1] SENG 11111 - Introducttion to Programming");
                System.out.println("[2] SENG 11112 - Fundamentals of Engineering");
                System.out.println(("[3] SENG 11113 - Data Structures and Algorithms"));
                courseNo=input2.nextLine();
                num = courseNo.split(",");
                for (int i=0;i<num.length;i++) {
                    if (num[i].equals("1")) {
                        crs2[i] = "SENG 11111 - Introduction to programming";

                    }
                    else if (num[i].equals("2")) {
                        crs2[i] = "SENG 11112 - Fundamentals of Engineering";
                    }
                    else if (num[i].equals("3")){
                        crs2[i] = "SENG 11113 - Data Structures and Algorithms";
                    }
                    else{
                        System.out.println("Not a valid input");
                    }
                    //System.out.println(num[i]);
                }
                l1=new Lecturer(name,age,crs2);
                break;
            default:
                System.out.println("fuck you");
                break;
    }

    //l1.getCourse();
    }
}
