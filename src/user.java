import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class user implements Runnable {
    private int id;
    private int num_elements;
    public static Buffer buf;
    private semaphore semaphore = new semaphore(2);



    public user(int i, int el, Buffer b)                        //User arguments: User ID, number of elements to add, and buffer
    {
        id = i;
        num_elements = el;
        buf = b;
    }

    //ADD elements to the list ,critical section
    public void add_elements() throws InterruptedException {
        semaphore.acquire();
        int num=num_elements;
        int n=0;
            while (num_elements > 0) {
                //Add element to buffer, element value iterates from 0, 1, 2 .... num_elements
                buf.add(new Integer(n));
                System.out.println(Thread.currentThread().getName() + "\t" + "Adds element \t " + buf.GetNumber());
                buf.increment();
                num_elements--;
                n++;
            }
            num_elements = num;
            semaphore.release();
    }

    @Override
    public void run() {
        try {
            add_elements();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}