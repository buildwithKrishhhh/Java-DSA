import java.util.Scanner;
public class midalign_stars{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a String
        System.out.print("Enter the number of lines : ");
        int n = scanner.nextInt(); 

        for(int i = 0 ; i<n; i ++){
        for(int j = 0; j<n-i-1; j++){
            System.out.print(" ");
        }
        for(int j = 0; j<2*i+1; j++){
            System.out.print("*");
        }
         for(int j = 0; j<n-i-1; j++){
            System.out.print(" ");
        }
          System.out.println();

        }
    }
}