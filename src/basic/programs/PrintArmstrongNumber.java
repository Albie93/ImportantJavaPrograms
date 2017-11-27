package basic.programs;

public class PrintArmstrongNumber {
  
	public static void main(String[] args) {
	
		int n,a,b,c,sum=0;
		System.out.println("Printing Armstrong number");
		
		for(int i=0;i<=1000;i++){
			
			n=i;
			while(n>0){
				b = n%10;
				sum = sum+(b*b*b);
				n = n/10;
			}
			if(sum ==i){
				
				System.out.println(i+" ");
			}
			sum=0;
			
			
		}
		
		
	}
	
}
