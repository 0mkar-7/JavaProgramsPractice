public class DuplicateString {
    public static void main(String[] args) {
        String[] strArray = {"Java" , "Python" , "Program" , "Java" , "Array" , "Program"};
        for(int i=0;i<strArray.length;i++){
            for(int j=i+1;j<strArray.length;j++){
                if(strArray[i].equals(strArray[j])){
                    System.out.println("Duplicate Elements :" + strArray[j]+"  ");
                }
            }
        }
    }
}
