import java.util.Scanner;
public class oddInt {

    public static void main(String[] args)

    {
        int i,n,sum=0;

        System.out.print("Input number of terms is: ");
        {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println ("The odd numbers are :");
            for(i=1;i<=n;i++)

            {
                System.out.println (2*i-1);
                sum+=2*i-1;
            }
            System.out.println ("The Sum of odd  NUmber upto " +n+" terms is: " +sum);

        }
    }
}
