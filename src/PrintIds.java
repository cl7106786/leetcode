public class PrintIds {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String str = "1900000";
        for(int  i = 1; i < 200; i++) {
            String tmp = "";
            if(i < 10) {
                tmp = str + "00" + i;
            } else if (i < 100) {
                tmp = str + "0" + i;
            } else {
                tmp = str + i;
            }
            sb.append(tmp).append(",");
        }
        System.out.println(sb.toString());
    }
}
