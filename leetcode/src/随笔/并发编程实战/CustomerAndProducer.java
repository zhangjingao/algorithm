package 随笔.并发编程实战;

/**
 *
 * 生产者消费者
 * @author zjg
 * <p> 2019/3/16 22:27 </p>
 */
public class CustomerAndProducer {

    public static void main(String[] args) {
        Book books = Book.getInstance();
        Thread customer = new Customer(books);
        Thread producer = new Thread(new Producer(books));
        producer.start();
        customer.start();
    }

}

class Customer extends Thread {

    private Book book;

    protected Customer (Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (book.num > 1) {
                book.lessBook(1);
                System.out.println("消费了一本书，剩余" + book.num);
            } else {
                System.out.println("数量不足");
            }
        }
    }
}

class Producer implements Runnable {

    private Book book;

    protected Producer (Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            book.addBook(1);
            System.out.println("生产了一本书，剩余"+book.num);
        }
    }
}

class Book {

    private static Book book;

    protected int num;

    private Book (int num) {
        this.num = num;
    }

    protected void addBook (int n) {
        num = num + n;
    }

    protected void lessBook (int n) {
        num = num - n;
    }

    public static Book getInstance () {
        synchronized (Book.class) {
            if (book == null) {
                book = new Book(0);
            }
        }
        return book;
    }

}
