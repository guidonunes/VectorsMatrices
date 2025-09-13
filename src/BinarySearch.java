public class BinarySearch {
    public static void main(String[] args) {
        int[] orderedVector = {11,22,33,44,55,66,77,88,99};
        int searchedNumber = 55;
        int start = 0;
        int end = orderedVector.length - 1;
        int foundAtIndex = -1;

        while(start <= end) {
            int mean = start + (end - start)/2;

            if(orderedVector[mean] == searchedNumber) {
                foundAtIndex = mean;
                break;
            } else if (orderedVector[mean] < searchedNumber) {
                start = mean + 1;
            } else {
                end = mean - 1;
            }

        }

        if(foundAtIndex != -1) {
            System.out.println("Number found at index: " + foundAtIndex);
        } else {
            System.out.println("Number not found");
        }

    }
}
