import java.util.*;

public class listCount {

    public static void main(String[] args) throws InterruptedException {
        int num_users = 10;
        int elements = 10;
        int bufferSize = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of users:");            //Specify number of users
        num_users = scanner.nextInt();
        System.out.println("Enter number of elements per user:");        //Specify number of elements submitted per user
        elements = scanner.nextInt();
        Buffer b;
        b = new Buffer(bufferSize);//Create buffer
        user user = new user(1, elements, b);
        Thread threads[] = new Thread[num_users];
        for (int i = 0; i < num_users; i++) {
            int a = i + 1;
            threads[i] = new Thread(user, "user " + a);
            threads[i].start();
        }
        for (int i = 0; i < num_users; i++) {
            threads[i].join();
        }
        b.finalSummation();
    }

}

