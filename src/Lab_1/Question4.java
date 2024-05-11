import java.util.Scanner;
public class Question4 {
    private int n;
    public Question4() {
    }
    public Question4(int n) {
        this.n = n;
    }

    public int SumAllEvenN() {
        int []a = new int[n];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array: ");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 ==0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
