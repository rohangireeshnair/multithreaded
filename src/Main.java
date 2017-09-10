import static java.lang.Thread.sleep;

/**
 * Created by user on 9/10/2017.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Thread check efficiency program");
        System.out.println("Program will now start the check");
        try {
            sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Interrupted" +e);
        }
        System.out.println("Now checking single core efficiency");
        Singlecorecheck obj = new Singlecorecheck();
        float time1=obj.singlecorecheck();
        System.out.println("Now running the program on multicore");
        Multicheck obj1 = new Multicheck();
        float time2=obj1.multicheck();

        try {
            sleep(3000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Interrupted" +e);
        }
        System.out.println("Check completed");
       float eff= (((time1-time2)/time1))*100;
        System.out.println("Efficiency= " +eff+"%");


    }
}

