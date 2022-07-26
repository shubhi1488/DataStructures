//method-1:simple approach using two loops having time complexity : O(n^2) and space complexity:O(1)
public class NGE {
    static void print(int arr[],int n){
        int next,i,j;
        for (i=0;i<n;i++){
            next=-1;
            for (j=i+1;j<n;j++){
                if (arr[i]<arr[j]){
                    next=arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+"--- "+next);
        }
    }

    public static void main(String[] args) {
        int arr[]={13,7,6,12};
        int n=arr.length;
        print(arr,n);
    }
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//method-2:using stack
