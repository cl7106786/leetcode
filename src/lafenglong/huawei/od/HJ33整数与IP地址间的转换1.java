package lafenglong.huawei.od;

import java.util.Scanner;

/**
 * Create by chenlong on 2023/9/21 10:04
 */
public class HJ33整数与IP地址间的转换1 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                String s = sc.next();
                if(s.contains(".")){
                    System.out.println(ip2num(s));
                }else{
                    System.out.println(num2ip(Long.parseLong(s)));
                }
            }
        }

        public static long ip2num(String ip){
            //192.168.1.125
            String[] iip = ip.split("\\.");
            System.out.println(iip);
            Long res = 0L;
            for(int i = 0; i < iip.length; i++) {
                res = res * 256 + Integer.parseInt(iip[i]) ;
            }
            return res;
        }

        public static String num2ip(long num){
            String[] arr = new String[4];
            for(int i = 3; i >= 0; i--) {
                arr[i] = String.valueOf(num % 256);
                num = num/ 256;
            }
            return String.join(".", arr);
        }


}
