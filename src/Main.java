import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();





        int[] numbers=new int[n];
        int x=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numbers[i]=scanner.nextInt();
        }
        Arrays.sort(numbers);
        int result=0;
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=numbers[i];
            if(curr>=x) {
                curr = 0;
                result++;
            }
        }
        System.out.println(result);
    }
}