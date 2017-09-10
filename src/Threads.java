import java.lang.Thread;
/**
 * Created by user on 9/10/2017.
 */
public class Threads implements Runnable{
    long start, end;
    String threadname;
    Threads(long start, long end, String threadname)

    {
        this.start = start;
        this.end = end;

        Thread t;
        t = new Thread(this, threadname);
        t.start();
    }

        public void run()

        {
            long count=0;
          for(long i=start; i<end; i++)
          {
              for (long j=2;j<(i/2); j++)
              {
                  if(i%j==0);
                  count++;
              }
          }

        }



}
