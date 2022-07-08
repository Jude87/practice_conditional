package practice.conditional;

import java.util.Scanner;

public class ConditionalPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
	
		if((num1 % 2 == 0) && (num2 % 2 == 0)) {
			System.out.println("두 수 모두 짝수이다.");
		} else if((num1 % 2 == 0) || (num2 % 2 == 0)) {
			System.out.println("하나는 홀수이고 하나는 짝수이다.");
		} else {
			System.out.println("두 수 모두 홀수이다.");
		}
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산 기호 입력 : ");
		char op = sc.next().charAt(0);
		
//		if(op == '+') {
//			System.out.println("수행 결과 : " + num1 + "+" + num2 + "=" + (num1+num2));
//		} else if(op == '-') {
//			System.out.println("수행 결과 : " + num1 + "-" + num2 + "=" + (num1-num2));
//		} else if(op == '*') {
//			System.out.println("수행 결과 : " + num1 + "*" + num2 + "=" + (num1*num2));
//		} else if(op == '/') {
//			System.out.println("수행 결과 : " + num1 + "/" + num2 + "=" + (num1/num2));
//		} else {
//			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
//		}

		int result = 0;
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num2 != 0) {
			result = num1 / num2;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		case '%':
			result = num1 % num2;
			break;
		default :
			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.println("수행 결과 : " + num1 + " " + op + " " + num2 + " = " + result);
	}

}

