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
//method-2-Using stack
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class StockProblem {
    static ArrayList<Integer> calculate(int arr[],int n){
        Deque<Integer>s=new ArrayDeque<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i=0;i<n;i++){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();

            }
            if (s.isEmpty()){
                ans.add(i+1);
            }
            else {
                int top=s.peek();
                ans.add(i-top);
            }
            s.push(i);
        }
        return ans;
    }
    static void print(ArrayList<Integer>arr){
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+"");
        }
    }

    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;

        ArrayList<Integer> arr = calculate(price, n);
        print(arr);

    }
}
//...........................................................................................................................................................................
