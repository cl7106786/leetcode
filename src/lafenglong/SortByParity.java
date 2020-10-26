package lafenglong;

public class SortByParity {
    public static void main(String[] args) {
        int []A = new int[]{0 , 2};
        int[] ints = sortArrayByParity(A);

    }
    public static int[] sortArrayByParity(int[] A) {
        if(A == null || A.length == 1) return A;

        int i = 0;
        int j = A.length - 1;
        //偶数排在前面，奇数排在后面
        while(i < j)
        {
            //如果前面的是奇数，后面的是偶数，则交换
            if(A[i] % 2 != 0 && A[j] % 2 == 0)
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            //前面的是奇数，后面的也是奇数，则，后面的往前
            if(A[i] % 2 != 0 && A[j] % 2 != 0)
            {
                j--;
            }
            //前面的是偶数，后面的也是偶数，则前面的往后
            if(A[i] % 2 == 0 && A[j] % 2 != 0)
            {
                i++;
            }
            //前面的是偶数，后面的也是极数，则前面的往后
            if(A[i] % 2 == 0 && A[j] % 2 != 0)
            {
                i++;
                j--;
            }
        }
        return A;
    }
}
