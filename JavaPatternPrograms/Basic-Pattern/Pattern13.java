/*
edcba
edcba
edcba
edcba
edcba
*/
class Pattern13{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--)
				System.out.print((char)(96+j));
			System.out.println();
		}
	}
}