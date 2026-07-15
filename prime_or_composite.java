import java .util.*;
public class prime_or_composite{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for ( int i=2;i<n;i++){
            if(n %i==0){
                flag = true;// true means composite
                break;
        
                }
                
            }
            if (flag == false )
             System.out.println("prime number");
             else 
              System.out.println("composite number");
        }

    }
