package com.control_statment;

public class Loop {

	public static void main(String[] args) {
		//ptint_to_100 ();
		//print_100_to_1 ();
		print_sum_100_to_1 ();
;		
	}
		public static void ptint_to_100 () {
			for (int i =1 ; i<=100 ; i++) {
				System.out.print(i + ",");
				
			}
		}
			public static void print_100_to_1() {
				for (int i =100; i>=1; i--) {
					System.out.print(i + "*");
					
				}
				
			}
			public static void print_sum_100_to_1 () {
				int sum =0;
				for (int i =100; i>=1 ;i--) {
					System.out.print(i+" ");
					sum = sum+i;
					System.out.println(sum);
					
				}
				
			}
			
			
			
		}




