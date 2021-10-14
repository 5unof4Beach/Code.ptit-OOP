package codeptit;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DayUuThe {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            String a[] = s.split(" ");
            Vector<Integer> numbers = new Vector<>();
            for(int i = 0; i < a.length; i++)
            {
                numbers.add(Integer.parseInt(a[i]));
            }
            if(numbers.size()%2 == 0)
            {
                int odd = 0;
                int le = 0;
                for(int i = 0; i < numbers.size(); i++)
                {
                    if(numbers.get(i)%2 == 0)
                    {
                        le += 1;
                    }
                    else odd += 1;
                }
                if(le > odd)
                {
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            else
            {
                int odd = 0;
                int le = 0;
                for(int i = 0; i < numbers.size(); i++)
                {
                    if(numbers.get(i)%2 == 0)
                    {
                        le += 1;
                    }
                    else odd += 1;
                }
                if(le > odd)
                {
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }
    }
}
