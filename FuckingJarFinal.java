//Coded by Anuwat Khongchuai A.K.A un4ckn0wl3z.
public class FuckingJarFinal {
	public static void main(String[] args) {
		
		String[] base_alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","O","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] stored = new String[10];
		String[] stored_fixed_value = new String[10];
		String base_alpha_for_compare = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] fixxed = new String[10];
		int[] list_cout = new int[10];
		
		String[] LAST_A = new String[10];
		int[] LAST_N = new int[10];
		
		
		for(int i=0;i<10;i++){
			double r = Math.random() * 10;
			int rand = (int) r;
			stored[i] = base_alpha[rand];
			
		}
		for(int j=0;j<stored.length;j++){
			if(j==0){
				System.out.print(stored[j]);	
			}else{
				 System.out.print("-"+stored[j]);
			}
		
		}
		System.out.println();
		for(int x=0;x<base_alpha.length;x++){
			int count = 0;
			for(int y=0;y<stored.length;y++){
				if(base_alpha[x] == stored[y]){
					fixxed[x] = stored[y];
					System.out.print(stored[y]);
					count++;
					list_cout[x] = count;
				}
				
			}
				
		}
		System.out.println();
		int flag=0;
		for(int t=0;t<fixxed.length;t++){
			if(fixxed[t]!=null && list_cout[t]!=0 && list_cout[t]>1){
				LAST_A[flag] = fixxed[t];
				LAST_N[flag] = list_cout[t];
				//System.out.print(fixxed[t]+"=");
				//System.out.print(list_cout[t]);
				//System.out.println("----"+t);
				flag++;
			}
			
		}
		//System.out.println("Flag = "+flag);
		
		for(int o=0;o<flag;o++){
			if(o==flag-1){
				System.out.print(LAST_A[o]+"=");
				System.out.print(LAST_N[o]);
				System.out.println();
			}

		}
	}
}
