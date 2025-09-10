import java.util.*;
public  class sample {

    //Formula of permutation nPr = n!/(n-r)!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = fact(n) / fact(n - r);
        System.out.println(ans);
       
    }
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}