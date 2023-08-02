import java.util.*;
public class ActivitySelection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        // end time basis sorted


        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lamda function  
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct =0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct =1;
        ans.add(activities[0][0]);         //ans.add(0);

        int lastEnd =activities[0][2];   //end[0]
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){              //start[i]
                ans.add(activities[i][0]);              //i
                maxAct++;
                lastEnd = activities[i][2] ;                     //end[i]
            } 
        }

        System.out.println("max activities = "+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
