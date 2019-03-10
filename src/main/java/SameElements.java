public class SameElements {

    public static boolean findSameElements(int[] ints) {
        int calc = 0;
        for (int i : ints) {
            calc++;
            if (checkSame(ints, i, calc)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSame(int[] ints, int num, int calc) {
        for (int i = calc; i < ints.length; i++) {
            if (ints[i] == num) {
                return true;
            }
        }
        return false;
    }
}
