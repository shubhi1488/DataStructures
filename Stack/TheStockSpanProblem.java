//method-1:Time complexity:O(n^2)
import java.util.Arrays;

public class SpanValue {
    static void calculate(int price[],int n,int s[]){
        s[0] = 1;

        // Calculate span value of remaining days by linearly checking
        // previous days
        for (int i = 1; i < n; i++) {
            s[i] = 1; // Initialize span value

            // Traverse left while the next element on left is smaller
            // than price[i]
            for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
                s[i]++;
        }
    }
    static void print(int arr[]){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculate(price, n, S);

        // print the calculated span values
        print(S);
    }
}
//............................................................................................................................................................................
//method-2-
