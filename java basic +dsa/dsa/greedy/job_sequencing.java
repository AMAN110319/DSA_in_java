import java.util.*;
public class job_sequencing {

    // we will create a class for as obj
    static class Job{
        int deadline;
        int profit;
        int id;  // 0->A , 1->B , 2->C
        public Job(int i,int d, int p){
            id =i;
            profit =p;
            deadline =d;
        }
    }
    public static void main(String[] args) {
        int jobInfo [][]={{4,20},{1,10},{1,40},{1,30}};

        // ARRAY of jobs
        // Job jobs[] = new Job[jobInfo.length];
        ArrayList<Job> jobs = new ArrayList<Job>();
        for (int i = 0; i < jobInfo.length; i++){
            // jobs[i]=new Job(i, jobInfo[i][0], jobInfo[i][1]);
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        // sorting the objects ---> by lambda function

        Collections.sort(jobs,(obj1,obj2) -> obj2.profit -obj1.profit);// descending object order

        ArrayList<Integer> seq = new ArrayList<Integer>();
        int time =0;
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("the max jobs are:"+seq.size()+"\n and they are :");
        for(int i = 0; i < seq.size(); i++){
            System.out.println(seq.get(i));
        }
    }
}
