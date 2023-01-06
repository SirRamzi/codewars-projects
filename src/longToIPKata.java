public class longToIPKata {
	public static String longToIP(long ip) {
		String ipBinary = String.format("%32s", Long.toBinaryString(ip)).replace(" ", "0");
		System.out.println(ipBinary);
		String[] ipBinaryArray = new String[4];
		for (int i = 0; i < ipBinaryArray.length; i++) {
			ipBinaryArray[i] = Integer.toString(Integer.parseInt(ipBinary.substring(8 * i, 8 * i + 8), 2));
		}
		return String.join(".", ipBinaryArray); // do it!
	}
}
