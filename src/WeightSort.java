import java.util.ArrayList;
import java.util.Arrays;

public class WeightSort {
	public static String orderWeight(String strng) {
		String[] weithArray = strng.split("[\s]+");
		Arrays.sort(weithArray);
		ArrayList<String> oldWeithSort = new ArrayList<String>();
		ArrayList<Integer> newWeithSort = new ArrayList<Integer>();
		int currentNewWeith;
		int insertIndex;
		for (int i = 0; i < weithArray.length; i++) {
			currentNewWeith = 0;
			for (int j = 0; j < weithArray[i].length(); j++) {
				currentNewWeith += Integer.parseInt(Character.toString(weithArray[i].charAt(j)));
			}
			insertIndex = newWeithSort.size();
			for (int j = 0; j < newWeithSort.size(); j++) {
				if (newWeithSort.get(j) > currentNewWeith) {
					insertIndex = j;
					break;
				}
			}
			newWeithSort.add(insertIndex, currentNewWeith);
			oldWeithSort.add(insertIndex, weithArray[i]);
		}
		return String.join(" ", oldWeithSort);
	}
}