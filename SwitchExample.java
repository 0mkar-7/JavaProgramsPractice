public class SwitchExample {
    public static void main(String[] args) {
        String name = "Suraj";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            switch(ch){
                case 'S':
                    System.out.println("S : Smart");
                    break;
                case 'u':
                    System.err.println("M : U..");
                    break;
                case 'k':
                    System.err.println("R : R...");
                    break;
                case 'a':
                    System.out.println("A : A....");
                    break;
                case 'r':
                    System.out.println("J : J....");
                    break;
                default:
                    System.out.println("Invalid Character");
            }
        }
    }
}
