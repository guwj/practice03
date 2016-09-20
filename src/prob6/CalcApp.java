package prob6;

import java.util.Scanner;

public class CalcApp {

	// 상속을 사용하여 코딩 간소화
	
	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String expression = scanner.nextLine();
			if ("quit".equals(expression) == true) {
				break;
			}

			// left value, operator, right value로 나눠서 진행
			String[] token = expression.split(" ");
			int lValue = Integer.parseInt(token[0]);
			String operator = token[1];
			int rValue = Integer.parseInt(token[2]);

			Arith arith = null;
			
			switch (operator) {
			case "+":
				arith = new Add();
				break;
			case "-":
				arith = new Sub();
				break;
			case "*":
				arith = new Mul();
				break;
			case "/":
				arith = new Div();
				break;
			}
			
			if(arith == null){
				System.out.println(">>알 수 없는 연산입니다");
				continue;
			}
			
			arith.setValue(lValue, rValue);
			int result = arith.calculate();
			System.out.println(">>" + result);
		}
		
		scanner.close();

	}
}
