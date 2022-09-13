public class Main
{
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
	public static void main(String[] args) {
		int n=5;
		int a=fact(n);
		System.out.println(a);
	}
}
