class S 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = ++ i    +     i     +     ++ i;
		//       1            1             2
		System.out.println(i); // 2
		System.out.println(j); // 4
	}
}
