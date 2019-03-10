import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DifferentCases {

    public static void printArrayList(ArrayList<ArrayList<Integer>> integers) {
        for (ArrayList al : integers) {
            System.out.println(al.toString());
        }
    }

    public static ArrayList<ArrayList<Integer>> creationCollectionWithAllCombinations(int[] ints) {
        int valueOFCombinations = numberOfCombinations(ints.length);
        ArrayList<Integer> integers = createArrayList(ints);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(integers);
        for (int i = 0; i < valueOFCombinations - 1; ) {
            ArrayList<Integer> version = shuffleCollection(integers);
            if (checkAllVersion(list, version)) {
                list.add(version);
                i++;
            }
        }
        sortList(list);
        return list;
    }

    public static void sortList(ArrayList<ArrayList<Integer>> list) {
        Comparator<ArrayList<Integer>> comparator = new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return compareTo(o1, o2);
            }
        };
        Collections.sort(list, comparator);
    }

    public static int compareTo(ArrayList<Integer> in1, ArrayList<Integer> in2) {
        for (int i = 0; i < in1.size(); i++) {
            if (in1.get(i) < in2.get(i)) {
                return -1;
            }
            if (in1.get(i) > in2.get(i)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean checkAllVersion(ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> list) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).equals(list)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> shuffleCollection(ArrayList<Integer> integers) {
        ArrayList<Integer> clone = new ArrayList<Integer>();
        clone.addAll(integers);
        Collections.shuffle(clone);
        return clone;
    }

    public static ArrayList<Integer> createArrayList(int[] ints) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i : ints) {
            integers.add(i);
        }
        return integers;
    }

    public static int numberOfCombinations(int numberOfElements) {
        return calculateFactorial(numberOfElements);
    }

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
