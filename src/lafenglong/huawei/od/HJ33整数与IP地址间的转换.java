package lafenglong.huawei.od;

import java.util.Scanner;

/**
 * Create by chenlong on 2023/9/21 10:04
 */
public class HJ33整数与IP地址间的转换 {

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
            String[] iip = ip.split("\\.");
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<4; i++){
                int num = Integer.parseInt(iip[i]);  // 拆分
                String num2 = Integer.toBinaryString(num);  //转换为二进制
                while(num2.length()<8){
                    num2 = "0" + num2;  // 拼接
                }
                sb.append(num2);
            }
            return Long.parseLong(sb.toString(), 2);  // 转化为10进制
        }

        public static String num2ip(long num){
            String num2 = Long.toBinaryString(num);  //转换为2进制
            while(num2.length()<32){
                num2 = "0" + num2;
            }
            String[] ans = new String[4];
            for(int i=0; i<4; i++){
                String s = num2.substring(8*i, 8*i+8);  //拆分
                s = Integer.toString(Integer.parseInt(s, 2));  //转化为10进制
                ans[i] = s;
            }
            return String.join(".", ans);  //拼接
        }


}
