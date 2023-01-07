import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans = 0;
        int pw =1; //2^0=1

        while(number>0)
        {
            int unit_place= number%10;
            ans = ans +(unit_place*pw);
            number=number/10;
            pw=pw*2;
        }
        System.out.println(ans);
    }
}
