package 随笔.并发编程实战.重入锁;

/**
 * @author zjg
 * <p> 2019/2/13 10:23 </p>
 * 线程安全的单例模式
 */
public class Singleton {


    public static void main(String[] args) {
        //枚举的单例
        System.out.println(SingletonFactory.singletonEnum.getInstace().hashCode());
    }

}

class SingletonClass {

    private static SingletonClass singletonClass = null;

    private SingletonClass () {}

    protected static SingletonClass getInstance () {
        synchronized (SingletonClass.class) {
            if (singletonClass == null) {
                singletonClass = new SingletonClass();
                return singletonClass;
            } else {
                return singletonClass;
            }
        }
    }

}

//枚举实现的单例
enum SingletonFactory {

    singletonEnum;

    private SingletonFactoryClass singletonFactoryClass;

    SingletonFactory () {
        singletonFactoryClass = new SingletonFactoryClass();
    }

    public SingletonFactoryClass getInstace () {
        return singletonFactoryClass;
    }

}
//需要实现单例的类
class SingletonFactoryClass {

    public SingletonFactoryClass(){}

}
