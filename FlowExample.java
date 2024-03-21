public class FlowExample {
    public static void main(String[] args) {
        int i , j=10;
        for(i=1,j=10; i<j; i++,j--){
            
            if(i==3){
                // j--;
                continue;
            }
            System.out.println(i+ " "+j);
            // j--;
            
        }
    }
}


// 1 10
// 2 9
// 4 7
// 5 6