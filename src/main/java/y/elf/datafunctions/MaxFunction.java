
package y.elf.datafunctions;

public class MaxFunction extends DataFunction {
	public static String KEY = "DataFunctionMax";
	
	@Override
	public String getKey() {
		return KEY;
	}
	
	@Override
	public double function(int[] data) {
		int m = data[0];
		
		for (int i=1; i<data.length; i++)
			if (data[i] > m)
				m = data[i];
		
		return (double)m;
	}
}
