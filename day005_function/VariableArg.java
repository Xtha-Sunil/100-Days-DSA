import java.util.Arrays;

public class VariableArg {
	public static void main(String[] args) {
		int a=20, b = 40;
		varArgs(a,b,4,80,81,12);
	}
	// variable arg should always be placed at end
	static void varArgs(int a, int b, int ...c){
		System.out.println(Arrays.toString(c));
	}
}