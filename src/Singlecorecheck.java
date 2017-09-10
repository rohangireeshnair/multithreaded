/**
 * Created by user on 9/10/2017.
 */
public class Singlecorecheck {
    long starttime, endtime;
    long count;

    public float singlecorecheck()
    {
    starttime=System.nanoTime();

    for(long  i=1; i<10000000000L; i++)
        {
        for(long j=1; j<i/2; i++)
            {
            if((i%j)==0)
                count++;
                break;
            }
        }
    endtime=System.nanoTime();
    float timetaken=(endtime-starttime)/1000000;
    return timetaken;
    }
}
