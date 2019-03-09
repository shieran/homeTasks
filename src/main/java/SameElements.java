public class SameElements {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 5, 123, 12, 534, 456724, 45724, 2342};
        System.out.println(findSameElements(ints));
    }


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
