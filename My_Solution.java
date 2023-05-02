package misc;

import java.util.ArrayList;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
		System.out.println(swap_pairs(29));
	 
	}
	
	private static String swap_pairs(int x){
		
		String bits = Integer.toBinaryString(x);
		
		StringBuilder bits_app = new StringBuilder();
		
		int len = bits.length();
		int num_swaps = len/2;
		
		int j = len-1;
		for(int i = 1;i <= num_swaps;i++){
			
			
			String curr = bits.substring(j-1,j);
			j --;
			String next = bits.substring(j-1,j);
			j--;
			
			//swapping the order
			bits_app.append(curr);
			bits_app.append(next);
		}
		if(len % 2 != 0) {
			bits_app.append(bits.substring(0,1));
		}
		return bits_app.reverse().toString();
		
		
	}	
		
	
	}
	
	
