/*
A
BB
CCC
DDDD
EEEEE
*/
class Triangle_8{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print((char)(64+i));
			System.out.println();
		}
	}
}