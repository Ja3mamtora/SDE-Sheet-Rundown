import java.util.*;
public class NMeetingsInOneRoom {
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
         PriorityQueue<int[] >pq=new PriorityQueue<>(Comparator.comparingInt((p)->p[1]));
        for(int i=0;i<n;i++){
           pq.add(new int[]{start[i],end[i]});
        }
        int cnt=0,freeTime=0;
        while(!pq.isEmpty()){
            int[] meet=pq.poll();
            int s=meet[0],e=meet[1];
            if(freeTime==0){
                freeTime=e;
                cnt++;
            }else if(s>freeTime){
                freeTime=e;
                cnt++;
            }else continue;
        }
        return cnt;
    }
}