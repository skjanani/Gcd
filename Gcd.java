package janani;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0,n1,n2,i;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n1=ja.nextInt();
n2=ja.nextInt();
for(i=1;i<n1 && i<n2;++i){
	if(n1%i==0 && n2%i==0){
		n=i;
	}
}
System.out.println(n);
	}

}
