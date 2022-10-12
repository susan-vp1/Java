class L 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i ++   +   i   +   i ++   +   i   +   i --   +    i   +
			//  0          1       1          2       2           1  = 7
			    i --   +   i   +   i --   +   i   +   i ++   +    i   +
			//  1          0       0          -1      -1          0  =  -1
			    i   +   i ++   +   i ++   +   i --   +   i --   +    i;
			//  0       0          1          2          1           0 = 4
		System.out.println(i); // 0
		System.out.println(j); // 10
	}
}
