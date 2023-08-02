public class menu {

    public static void LinearSearch(String menu[],String key){
        int flag =0;
        int i;
        for(i=0;i<=menu.length;i++){
            if(key.equals(menu[i])){
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("word found at position " + i);
        }
        else {
            System.out.println("word not found");
        }
    }
    
    public static void main(String[] args) {

        String menu[]={"DOSA","SAMOSA","SANDWICH","CHICKEN ROLL","PATTICE"};
        String key = "SANDWICH";
        LinearSearch( menu,key);
    }
    
}
