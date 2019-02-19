package code2019.code19_1_17_12;

/**
 * @author zjg
 * <p> 2019/1/17 21:35 </p>
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        int thousand = num /1000;//千位数
        int hundred = num / 100 % 10;//百位数
        int ten = num / 10 % 10;//十位数
        int one = num % 10;//个位数
        StringBuilder result = new StringBuilder();
        while (thousand-- > 0) {
            result.append('M');
        }

        result.append(swap(hundred, 'C','D','M'));
        result.append(swap(ten, 'X','L','C'));
        result.append(swap(one, 'I','V','X'));

        return result.toString();
    }

    public StringBuilder swap (int num , char a, char b, char c) {
        StringBuilder temp = new StringBuilder();
        switch (num) {
            case 4 : temp.append(a).append(b);break;
            case 5 : temp.append(b);break;
            case 9 : temp.append(a).append(c);break;
            default:if (num < 4 && num > 0) {
                while (num-- > 0) {
                    temp.append(a);
                }
            } else if (num >5) {
                temp.append(b);
                num -= 5;
                while (num-- > 0) {
                    temp.append(a);
                }
            }
        }
        return temp;
    }

    /**
     * 第一名解法
     static String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

     static int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


     public String intToRoman(int num) {
     StringBuilder sb = new StringBuilder();
     int i = 0;
     while (num > 0) {
     while (num >= value[i]) {
     num -= value[i];
     sb.append(str[i]);
     }
     i++;
     }
     return sb.toString();
     }
     */



    public static void main(String[] args) {
        System.out.println(
                new IntegerToRoman().intToRoman(400)
        );
    }

}
