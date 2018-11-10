package 随笔;

/**
 * @author zjg
 * <p> 2018/11/2 16:00 </p>
 */
public class ClassLoaderDemo {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderDemo.class.getClassLoader();
        if (classLoader != null) {
            System.out.println(classLoader);
            System.out.println(classLoader.getClass().getSuperclass().getName());
            classLoader = classLoader.getParent();
        }
        System.out.println(classLoader);
        System.out.println(String.class.getClassLoader());


    }

}
