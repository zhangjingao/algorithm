package 随笔.并发编程实战;

/**
 *
 * 实现读写锁
 * @author zjg
 * <p> 2019/3/16 22:28 </p>
 */
public class ReadWriteSyn {



}



class book {

    volatile int read = 0;
    volatile int write = 0;

    protected void viewBook () {
        if (write > 0) {
            System.out.println("不可以看书，有人正在修改");
        } else {
            read = read + 1;
            System.out.println("可以看书,读书的人: "+ read);
        }
    }

    protected void releaceRead () {
        read = read - 1;
        System.out.println("释放一本读的书");
    }

    protected boolean updateBook () {
        if (write == 0 && read == 0) {
            write = write + 1;
            System.out.println("可以修改书");
            return true;
        }
        return false;
    }

    protected void releace () {
        write = write - 1;
        System.out.println("释放一本修改书");
    }

}