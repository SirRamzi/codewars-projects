/*
Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
This image will illustrate things more clearly:


NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.

NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
 */

import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int n = array.length - 1;
        int i = 0;
        int j = 0;
        if (array[0].length == 0) {
            return array[0];
        }
        resultList.add(array[i][j]);
        for (int k = 0; k < array.length / 2; k++) {
            for (int topH = 0; topH < n; topH++) resultList.add(array[i][++j]);
            for (int rightV = 0; rightV < n; rightV++) resultList.add(array[++i][j]);
            for (int botH = 0; botH < n; botH++) resultList.add(array[i][--j]);
            for (int leftV = 0; leftV < n - 1; leftV++) resultList.add(array[--i][j]);
            n -= 2;
            if (n >= 0) resultList.add(array[i][++j]);
        }
        System.out.println("Test: " + resultList.toString());
        return resultList.stream().mapToInt(resultElem -> resultElem).toArray();
   } 
}