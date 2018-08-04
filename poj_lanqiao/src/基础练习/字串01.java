package 基础练习;

/**
 * @author zjg
 * @date 2018/3/23 11:18
 * @Description
 */
public class 字串01 {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int a=0;a<2;a++) {
            stringBuffer.append(a);
            for (int b = 0; b < 2; b++) {
                stringBuffer.append(b);
                for (int c = 0; c < 2; c++) {
                    stringBuffer.append(c);
                    for (int d = 0; d < 2; d++) {
                        stringBuffer.append(d);
                        for (int e = 0; e < 2; e++) {
                            stringBuffer.append(e);
                            System.out.println(stringBuffer);
                            stringBuffer.deleteCharAt(4);
                        }
                        stringBuffer.deleteCharAt(3);
                    }
                    stringBuffer.deleteCharAt(2);
                }
                stringBuffer.deleteCharAt(1);
            }
            stringBuffer.deleteCharAt(0);
        }
    }
}
