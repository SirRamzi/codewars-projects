import java.util.stream.Stream;

public class CountIPAddresses {

	public static long ipsBetween(String start, String end) {
		String[][] ips = new String[2][];
		ips[0] = start.split("\\.");
		ips[1] = end.split("\\.");
		int[] ipStart = Stream.of(ips[0]).mapToInt(Integer :: parseInt).toArray();
		int[] ipEnd = Stream.of(ips[1]).mapToInt(Integer :: parseInt).toArray();
		long ipStartSum = 0;
		long ipEndSum = 0;
		for (int i = 0; i < ipStart.length; i++) {
			ipStartSum += ipStart[i] * Math.pow(256, 3 - i);
			ipEndSum += ipEnd[i] * Math.pow(256, 3 - i);
		}
		return ipEndSum - ipStartSum;
	}
}
