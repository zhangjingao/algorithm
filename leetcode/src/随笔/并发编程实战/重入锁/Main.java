package 随笔.并发编程实战.重入锁;

/**
 * @author zjg
 * <p> 2019/2/13 9:38 </p>
 */
public class Main {

    public static void main(String[] args) {
//        Father father = new Father();
//        father.Service();
//
//        Children children = new Children();
//        children.Service();

        Father father = new Children();
        father.Service();
    }

}

class Father {

    protected synchronized void Service () {
        System.out.println("father中的service方法被执行");
    }

}

class Children extends Father {

    @Override
    protected synchronized void Service() {
        System.out.println("children 中service方法被执行");
        doSomething();
        super.Service();
    }

    protected synchronized void doSomething () {
        System.out.println("doSomething");
    }

}
