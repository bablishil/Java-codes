import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		int num, b = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("enter the last limit-:");
		num = input.nextInt();
		System.out.println("the prime number are-:");
		for(int i=2; i<=num; i++){
			CheckPrime(i);
/*for(int j=1; j<=i; j++){
				if(i%j == 0){
				//  b++;
				}
		    }/*if(b==2){	 System.out.println(i);
			}*/
		}
		
	}
static void CheckPrime(int num){
				//int num = num;
				int b=0;
				for(int i=2; i<num; i++){
					if(num%i == 0){
						b++;
					}
				}
				if(num>1){
					if(b==0){
						System.out.println(num);
					}
				}
			}
}