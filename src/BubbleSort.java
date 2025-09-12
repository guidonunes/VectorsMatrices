public class BubbleSort {
    public static void main(String[] args) {
        int[] vector = {64, 34, 25, 12, 22, 11, 90};

        boolean swapValues;

        do {
            swapValues = false;
            for(int i = 1; i < vector.length; i++) {
                if (vector[i - 1] > vector[i]) {
                   int temp = vector[i - 1];
                   vector[i - 1] = vector[i];
                   vector[i] = temp;
                   swapValues = true;
                }
            }
        } while (swapValues);

        System.out.print("Ordered vector: ");
        for (int i : vector) {
            System.out.print(i + " ");
        }
    }
}
