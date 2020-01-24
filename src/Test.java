import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String [] num=line.split(",");
        String [] crs=new String[3];
        for (int i=0;i<num.length;i++){
                if (num[i] == "1") {
                   crs[i] = "SENG 11111 - Introduction to programming";

                }
                else if (num[i] == "2") {
                    crs[i] = "SENG 11112 - Fundamentals of Engineering";
                }
                else if (num[i] == "3"){
                    crs[i] = "SENG 11113 - Data Structures and Algorithms";
                }
                else{
                    System.out.println("Not a valid input");
                }
        }


    }
}