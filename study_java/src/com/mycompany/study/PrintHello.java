package com.mycompany.study;


public class PrintHello {
	
	
	static class Printer {
		
		void printer() {
			System.out.println("hello");
		}
		
		void printer2 (int a, int b) {
			System.out.println("매게변수는 :" + a + b );
		}
		
		void printer3 (int a, int b) {
			System.out.println("매게변수의합 a + b는" + (a+b) + " 입니다"  );
		}
		
		public String genderfinder (String a) {
			if(a == "male") {
				return "male";
			}else {
				return "women";
			}
		}
	}
	

	public static void main (String[] args) {
		
		
		Printer sts = new Printer();
		sts.printer();
		sts.printer2(2, 3);
		sts.printer3(6, 3);
		
		
		String email = "ghkdtjsdi@naver.com";
		System.out.println(email);
		
		String pw = "seon1011901;";
		System.out.println(pw);
		
		int tel = 1031744295;
		System.out.println(tel);
		
		String address = "서울특별시 용산구 이태원1동";
		System.out.println(address);
		
		String male = "male";
		System.out.println(male);
		
		String female = "female";
		System.out.println(female);
		
		sts.genderfinder(male);
		
		System.out.println();
	}
}
