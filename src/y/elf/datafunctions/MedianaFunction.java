package y.elf.datafunctions;

import java.util.Arrays;

public class MedianaFunction extends DataFunction {
	public static String NAME = "MEDIAN";
	
	@Override
	public String getName() {
		return NAME;
	}
	
	@Override
	public int function(int[] values) {
		Arrays.sort(values);

		if (values.length == 0)
			return 0;
		else if (values.length % 2 == 0)
			return (int)Math.round(((double)values[values.length/2] + (double)values[values.length/2 - 1])/2);
		else
		    return values[values.length/2];
	}
}
