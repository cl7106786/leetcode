package lafenglong;

public class InsertSort {
    public static void main(String[] args) {
        int []sum = new int[]{ 3, 4, 1, 2 , 23};
        int[] ints = insertSort(sum);
        for(int i = 0; i < ints.length; i++)
        {
            System.out.println(ints[i]);
        }
        System.out.println(ints);
    }
    //插入排序

    public static int[] insertSort(int []a)
    {
        if(a == null || a.length == 1) return a;
        //核心思想，是先以第一个为顺序，前面的是有顺序的，后面的无序的，后面的依次和前面比较，插入到对应的位置
        //这里代表未排序的
        for(int i = 1; i < a.length; i++)
        {
            //这里代表已经排序的
            for(int j = i -1; j >= 0; j--)
            {
                //如果当前未排序的比排序的还要小就放到后面
                //让这个数，从前往后比较
                if(a[j + 1] < a[j])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        return a;

    }

}
