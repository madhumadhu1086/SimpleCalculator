
public class Subtraction implements Operator {
	int a;
	int b;
	public int operation(int a, int b){
		this.a=a;
		this.b=b;
		int ans = a-b;
		return ans;	
}
}