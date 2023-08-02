public class BinStrings {
    public static void main(String args[]){
        String str = "";
        binStrings(3, 0,str);
    }

    public static void binStrings(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // if(lastPlace == 0){
        //     binStrings(n-1, 0, str.append("0"));
            // StringBuilder use nahi kiya kyuki zero add kiya 
            //toh wo universal append kar dega fir zero ke baad 
            //one bhi append ho jayega 
        //     binStrings(n-1, 1, str.append("1"));
        // } else {
        //     binStrings(n-1, 0, str.append("0"));
        // }

        binStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
                binStrings(n-1, 1, str+"1");
            }
    }
}
