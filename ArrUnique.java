public class ArrUnique {
    public static void main(String[] args) {
        int[] arr = {14, 13, 1, 13, 3, 14, 1, 7,3};

        int unique = findUnique(arr);
        System.out.println("Unique number: " + unique);
    }

    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation
        }
        return unique;
    }
}
