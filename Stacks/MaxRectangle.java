import java.util.*;
//O(n)
public class MaxRectangle { 
    public static void main(String args[]){
        int heights[] ={2,1,5,6,2,3};
        int arr[] ={2,4};
        System.out.println(maxArea(arr));

    }
    //O(n)
    public static int maxArea(int heights[]){ 
        int height;
        int width; 
        int maxArea = Integer.MIN_VALUE;
        int nsl[] = nextSmallerLeft(heights);
        int nsr[] = nextSmallerRight(heights);

        for (int i = 0; i<heights.length; i++){
            width = nsr[i]-nsl[i]-1;
            height = heights[i];
            int area = width*height;
            maxArea = Math.max(area,maxArea);
        }

        return maxArea;
    }

    //O(n)
    public static int[] nextSmallerLeft(int heights[]){
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        return nsl;
    }

    //O(n)
    public static int[] nextSmallerRight(int heights[]){
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;        //not -1 
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        return nsr;
        
    }
}
