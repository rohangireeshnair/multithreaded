/**
 * Created by user on 9/10/2017.
 */
public class Multicheck {
    public float multicheck() {
        long starttime = System.nanoTime();
        Threads obj1 = new Threads(1, (100000000000L)/4, "Thread1");
        Threads obj2 = new Threads((100000000000L/4), (100000000000L/2), "Thread2");
        Threads obj3 = new Threads((100000000000L/2), (3*100000000000L)/4, "Thread3");
        Threads obj4 = new Threads((3*100000000000L)/4,100000000000L , "Thread4");
        long endtime = System.nanoTime();
        float rettime =(endtime-starttime)/1000000;
        return rettime;
    }
}
