package labs.task5.decorator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();
        long P = sc.nextLong();

        long[] A = new long[(int) N];
        long[] B = new long[(int) M];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextLong();
        }


        // Arrays.sort(B);
        //Arrays.sort(A);
        long sum=0;
        for(int i = 0;i < N;i++){
            for(int j = 0;j < M;j++){
                long temp = A[i] + B[j];
                if(temp > P){
                    sum += P;
                }else{
                    sum += temp;
                }
            }
            System.out.println(sum);

        }
    }
    static long binary(long[] arr, long key) {
        assert
        int low = 0;
        int high = arr.length-1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key){
                high=mid-1;
            } else {
                return arr[mid];
            }
        }

        return 1;
    }
}
