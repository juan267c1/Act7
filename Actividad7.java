
package actividadesjava;

import java.util.Scanner;


public class Actividad7 {
    
   public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int prime;
System.out.println("Hasta que numero primo desea recorrer ? : ");
prime = sc.nextInt();
if(prime>0){
    int i =2;
    while(i<=prime){
        int count = 2;
        boolean itsPrime = true;
        while(itsPrime && count < i){
            if(i%count == 0){
                itsPrime= false;
            }
            else{
                count++;
            }
        }
        if(itsPrime){
            System.out.println(i);
        }
        i++;
    }
}
int init=0;
int num=1;
int zero;
int limit;
System.out.println("Hasta que numero desea hacer la serie de fibonacci: ");
limit=sc.nextInt();
System.out.println(init);
System.out.println(num);

while(num + init <= limit){
    zero=init;
    init=num;
    num=zero+init;
    System.out.println(num);
}



}
} 

