package lafenglong.huawei.od;

import java.util.Scanner;

public class Test2 {

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            int count = 0;
            int staff = scanner.nextInt();
            String programming_energy = scanner.nextLine();
            int requirement = scanner.nextInt();
            String []splits = programming_energy.split(" ");
            if(splits.length != staff)
            {
                return;
            }
            for(int i = 0; i < staff; i++)
            {
                for(int j = i + 1; j < staff; j++)
                {
                    int sum = Integer.parseInt(splits[i]) + Integer.parseInt(splits[j]);
                    if(sum == requirement)
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
