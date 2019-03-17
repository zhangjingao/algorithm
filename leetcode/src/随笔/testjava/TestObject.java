package 随笔.testjava;

/**
 * @author zjg
 * <p> 2019/3/5 10:06 </p>
 */
public class TestObject {

    /*
        在java传值中，如果是原始类型（boolean,char,byte,short,int,long,float,double）,
        函数传参是传递的是值，这样一来，在函数里怎么做都不会影响原先的变量。
        除了这些，其余传的是地址，那么是地址的话，你在函数里面可以修改变量的值，
        但是一旦修改了地址，就和原先的变量没关系了，原先的变量就访问不到修改的内容了。
        其中String，Integer特殊，因为两者是不可变类，每一个修改值都是一个新的变量。
     */

    public static void main(String[] args) {
        int in = -1;
        int is = Math.abs(in);
        
        String a = "A";
        String b = "B";
        testString(a,b);
        System.out.println(a+" "+b);

        StringBuffer sbA = new StringBuffer("A");
        StringBuffer sbB = new StringBuffer("B");
        testStringBuffer(sbA,sbB);
        System.out.println(sbA+" "+sbB);

        int aInt = 1;
        int bInt = 2;
        testInt(aInt, bInt);
        System.out.println(aInt+" "+bInt);

        Integer integerA = new Integer(1);
        Integer integerB = new Integer(2);
        testInteger(integerA, integerB);
        System.out.println(integerA+" "+integerB);
    }

    private static void testInteger(Integer integerA, Integer integerB) {
        integerA += 1;
        integerB = integerA;
    }

    private static void testInt(int aInt, int bInt) {
        aInt += 1;
        bInt = aInt;
    }

    private static void testString (String aa, String bb) {
        aa += "AA";
        bb = "BB";
    }

    private static void testStringBuffer (StringBuffer aa, StringBuffer bb) {
        aa.append(bb);
        bb = aa;
//        bb.append(aa);
    }


}