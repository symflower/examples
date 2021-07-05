public class Sort {
    public static boolean IsSorted(int[] a) {
        int i = 0;
        while (i < a.length - 1 && a[i] <= a[i + 1]) {
            i++;
        }

        return i == a.length - 1;
    }
}

