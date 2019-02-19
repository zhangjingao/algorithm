package 随笔.reflax;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zjg
 * <p> 2018/11/1 15:02 </p>
 */
public class ReflaxDemo {


    public static void main(String[] args) throws InstantiationException {
        try {
            // 第一种方式
            Class clazz = Class.forName("随笔.reflax.AppTest");
            Object appTest =  clazz.newInstance();
            Method noParam = clazz.getMethod("noParam");
            noParam.invoke(appTest);
            Method intParam = clazz.getMethod("intParam",Integer.TYPE);
            intParam.invoke(appTest, 100);
            Method stringParam = clazz.getMethod("stringParam", String.class);
            stringParam.invoke(appTest, "string ");
            // 第二种方式
            System.out.println("第二种方式");
            Class clazzTwo = AppTest.class;
            Object objectTwo = clazzTwo.newInstance();
            Method noParamTwo = clazzTwo.getMethod("noParam");
            noParamTwo.invoke(objectTwo);
            //第三种方式
            System.out.println("第三种方式");
            AppTest appTestThree = new AppTest();


            Class classThree = appTestThree.getClass();
            Object objectThree = classThree.newInstance();
            Method methodThree = classThree.getMethod("noParam");
            methodThree.invoke(objectThree);

            Field[] field = classThree.getDeclaredFields();
            for (Field f:field) {

            }

        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
