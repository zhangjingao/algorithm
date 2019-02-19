package code2018.code18_7_10;

/**
 * @author zjg
 * @date 2018/7/10 21:26
 * @Description
 */
public class DecodeString {

    static StringBuilder result = new StringBuilder();

    public String decodeString(String s) {
        int length = s.length();
        int index = 0;
        //循环数目
        int num = 0;
        //循环串
        String tmpStr = "";
        while (index < length) {
            num = Integer.parseInt(s.substring(index,index+1));
            index = s.indexOf(']',index+1);
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
