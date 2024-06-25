import java.util.Scanner;

class Student{
    
    int sid[] = new int[10];
    String sname[]= new String[10];
    String city[]= new String[10];
    String mob[]= new String[10];
    int i=0;
    Scanner sc = new Scanner(System.in);

    public void addStudent()
    {
        System.out.println("Enter Student id : ");
        sid[i] = sc.nextInt();
        System.out.println("Enter Student Name : ");
        sname[i] = sc.next();
        System.out.println("Enter Student City : ");
        city[i] = sc.next();
        System.out.println("Enter Student Phone Number  : ");
        mob[i] = sc.next();
        i++;

    }
    
    public void updateStudent()
    {
        
        System.out.print("Enter the Student id: ");
        int id = sc.nextInt();
        for(int j=0;j<i;j++){
            if(id==sid[j]){
                System.out.println("Student Id: "+sid[j]);
                System.out.println("1.Student Name: "+sname[j]);
                System.out.println("2.Student City: "+city[j]);
                System.out.println("3.Student Mobile :"+mob[j]);
                System.out.println("Enter a choice : ");
                int  choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter new Student name: ");
                        String newName = sc.next();
                        sname[j]=newName;
                        System.out.println("Record Updated..... ");
                        break;
                    case 2:
                        System.out.println("Enter new Student City: ");
                        String newCity = sc.next();
                        city[j] = newCity;
                        System.out.println("Record Updated.... ");
                        break;
                    case 3:
                        System.out.println("Enter new Student mobile number: ");
                        String newMob = sc.next();
                        mob[j] = newMob;
                        System.out.println("Record Updated ");
                        break;
                    default:
                        System.out.println("Enter Valid choice");
                        
                }
            }
        }
        

    }

    public void deleteStudent()
    {
        
        System.out.println("Enter Student id: ");
        int id = sc.nextInt();
        for(int j=0;j<i;j++){
            if(id==sid[j]){
                for(int k=j;k<i;k++){
                    sid[k]=sid[k+1];
                    sname[k]=sname[k+1];
                    city[k]=city[k+1];
                    mob[k]=mob[k+1];
                }
                i--;
            }
        }
        
    }

    public void showStudent()
    {
        System.out.println("sid\tsname\tcity\tMobile");
        for(int j=0;j<i;j++){
            System.out.println(sid[j]+"\t"+sname[j]+"\t"+city[j]+"\t"+mob[j]);
        }
    }
}

public class ArraysCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while(true){
            System.out.println("Select Options:");
            System.out.println("1.Add Student");
            System.out.println("2.Update Student");
            System.out.println("3.Delete Student");
            System.out.println("4.Show Student");
            System.out.println("5.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    s.addStudent();
                    break;
                case 2:
                    s.updateStudent();
                    break;
                case 3:
                    s.deleteStudent();
                    break;
                case 4:
                    s.showStudent();
                    break;
                case 5 :
                    System.exit(0);
            
                default:
                    System.out.println("Enter Valid Option");
                    break;
            }
            
        }
        
    }
}
