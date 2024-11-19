import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int[] numbers=new int[n];
        int[] indexes=new int[r];
        for(int i=0;i<n;i++){
            numbers[i]=scanner.nextInt();
        }
        Arrays.sort(numbers);
        int diff=0;
        int curr=0;

        for(int i=0;i<n-2;i++){
            if(numbers[i+2]-numbers[i]<diff){
                curr=i;
            }
        }
    }
}