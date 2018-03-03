
public class Loops {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		//============FOR LOOP===============
		
//		for(int i=0; i<10; i++){
//			
//			System.out.println("For Loop  "+i);
//		}
		
		
		//================While =================
//		int i =0;
//		
//		while(i<10){
//			i++;
//			
//			System.out.println("While Loop  "+i);
//		}
		
		// =============== do while loop================
//		int i= 0;
//		
//		do{
//			
//			System.out.println("inside door"+i);
//			i++;
//			System.out.println("\n");
//			
//		}while(i==10 );
		
		int [] numbers ={1,2,4,5,};
		
		for(int num :numbers){
			if(num ==2){
				break;
			}
			System.out.println("foreach loop  "+num);
		}
		
		double [] decimal={2.2,1.2,2.3,4.6};
		for(double dec: decimal){
			System.out.println("foreach loop "+dec);
		}
		
		String [] names= {"k","s","j","w"};
		
		for (String name : names){
			
			System.out.println("foreach loop   "+name);
		}
		
		
	}

}
