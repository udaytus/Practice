package eighth;

public class FloydTriangle {

	static void floyd(int rows) {
		int value=1;
		System.out.println("Floyd's Triangle");
		for (int i = 1; i <=rows; i++)
		{
			for (int j = 1; j <= i; j++)
					{
				System.out.print(value+"\t");
			
			value++;
					}
			
		}
	}

}