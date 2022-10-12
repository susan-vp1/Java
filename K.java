class K 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i --    +     i --     +     i --     +   i;
		//      5             4              3            2
		System.out.println(i); // 2
		System.out.println(j); // 14
	}
}
