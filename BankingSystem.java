import java.util.Scanner;
class BankingSystem{

Scanner sc=new Scanner(System.in);
String name;
double id;    
int cd;
public void inputDelta(){
    BankingSystem ob=new BankingSystem();
System.out.println("Enter Your Name :-");
System.out.println("                   ");
name=sc.nextLine();
System.out.println("Enter Your One Time ID ?");
id=Math.random()*3000;
cd=(int)id;
System.out.println(cd);
}
    
    
    
    public void main(){
         BankingSystem ob=new BankingSystem();
        ob.inputDelta();

}



}
