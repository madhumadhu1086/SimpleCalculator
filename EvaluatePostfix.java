import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class EvaluatePostfix extends ExpressionToPostfix{

	List<Object> postfixExpression = new LinkedList<Object>(); 
	Addition addtn= new Addition();
	Subtraction sub = new Subtraction();
	Multiplication mul = new Multiplication();
	Division div = new Division();
	int ans;
	int evaluatePostfix1(String s){
		
		postfixExpression = expressionToPostfix1(s);
		evaluatePostfix2();
		return ans;
	}
	
	void evaluatePostfix2() { //method to evaluate the postfix expression
		Stack<Integer> numbers = new Stack<Integer>();
		int a = 0, b = 0;
		for (Object s : postfixExpression) {
			if(s instanceof Character){
				char c = (Character) s;
				b = numbers.pop();
				a = numbers.pop();
				int stud=0;
				switch (c) {
					case '+': 
						stud=addtn.operation(a,b);
						numbers.push(stud); break;
					case '-': 
						stud = sub.operation(a, b);
						numbers.push(stud); break;
					case '*': 
						stud = mul.operation(a, b);
						numbers.push(stud); break;
					case '/': 
						stud = div.operation(a, b);
						numbers.push(stud); 
				}
			}else { 
				numbers.push((Integer)s);
			}
		}
		 ans= numbers.pop();
		
	}

	
}
