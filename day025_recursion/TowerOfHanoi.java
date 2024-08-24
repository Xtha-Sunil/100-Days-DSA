//Time Complixity : O(2^n)

public class TowerOfHanoi {
				static int c=1;
				public static void TOH(int n, String src, String helper, String des)
				{
					if (n == 1) {
			System.out.printf("%d. Move ring from %s to %s. \n",c++, src, des);
			return;
		}
					
					TOH(n-1, src, des, helper);
					System.out.printf("%d. Move ring from %s to %s. \n",c++, src, des);
					TOH(n-1, helper, src, des);
	}


	public static void main(String[] args) {
		TOH(5, "A", "B", "C");
	}

}