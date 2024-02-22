import java.util.*;
public class CharacterDet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a Character");
        ch = sc.next().charAt(0);
        int val = ch;
    
        if(ch >=65 && ch<=90){
            System.out.println(ch+" is a UpperCase  Alphabet.");
        }
        else if(ch>=97 && ch<=122){
            System.out.println(ch + " is a Lowercase  Alphabet.");
        }
        else if(ch >=48 && ch<=57){
            System.out.println(ch + " is a Number .");
        }
        else{
            System.out.println(ch+" is a Special Character");
        }
        

    }
}
