import java.util.*;
public class JobSequencing {

    public static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            this.id = i;
            this.deadline = d;
            this.profit=p;
        }
    }

    public static void main(String args[]){
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();  //array banaya jobs naam ka usme Job class ke objects dale


        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        //sorting
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);     //ascending order on basis of profit

        ArrayList<Integer> ans = new ArrayList<>();

        int profit =0;
        int time =0;
        for(int i=0;i<jobsInfo.length;i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                time++;
                ans.add(curr.id);
                profit += curr.profit;
            }
        }
        System.out.println("profit " + profit);
        System.out.println(ans);
        System.out.println("maximum jobs " +  ans.size());
        

    }
}
