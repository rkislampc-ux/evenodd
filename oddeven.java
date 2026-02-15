import java.util.Scanner;

public class oddeven{

    public static void main (String argsString[]){
        Scanner userinput =new Scanner (System.in);
        System .out.println("Enter a num :");
        int num =userinput.nextInt();

        if (num %2 ==0)
        System.out.println(num +"is even");
        else 
        System.out.println(num +"is odd");
        userinput.close();
    }
}

