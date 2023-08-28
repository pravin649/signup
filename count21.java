class Count21 
{
	static int digit(int num)
	{
	int count=0;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int count = digit(123);
		System.out.println(count);
	}
}
