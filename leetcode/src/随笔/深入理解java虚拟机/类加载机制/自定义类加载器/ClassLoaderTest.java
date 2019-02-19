package 随笔.深入理解java虚拟机.类加载机制.自定义类加载器;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zjg
 * <p> 2019/1/28 10:16 </p>
 *
 * 自定义类加载器，判断不同加载器下加载的同一个类不一样
 * 第42行代码判断是否属于所属类型，判断为false，
 * 因为一个是自定义类加载器加载，另一个是系统应用程序加载器加载
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("随笔.深入理解java虚拟机.类加载机制.ClassLoaderTest");
        System.out.println(inputStream);

        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String classFilePath = name.substring(name.lastIndexOf(".")+1)+".class";
                System.out.println(classFilePath);
                InputStream inputStream = getClass().getResourceAsStream(classFilePath);
                byte[] bytes = null;
                try {
                    bytes = new byte[inputStream.available()];
                    inputStream.read(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return defineClass(name,bytes,0,bytes.length);
//                return super.loadClass(name);
            }
        };
        System.out.println("随笔.深入理解java虚拟机.类加载机制.ClassLoaderTest");
        try {
            Object object = classLoader.loadClass("随笔.深入理解java虚拟机.类加载机制.自定义类加载器.ClassLoaderTest");
            System.out.println(object instanceof ClassLoaderTest);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
