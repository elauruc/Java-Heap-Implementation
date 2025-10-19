public class Test {
    public static void main(String[] args) {
        Integer[] A = {14, 20, 2, 15, 10, 21};

        MaxHeapInterface<Integer> maxHeap = new MaxHeap<>();
        for (int i = 0; i < A.length; i++) {
            maxHeap.add(A[i]);
        }

        if (maxHeap.isEmpty())
            System.out.println("The heap is empty - INCORRECT");
        else
            System.out.println("The heap is not empty; it contains " +
                    maxHeap.getSize() + " entries.");

        System.out.println("The largest entry is " + maxHeap.getMax());

        System.out.println("\n\nRemoving entries in descending order:");
        while (!maxHeap.isEmpty())
            System.out.println("Removing " + maxHeap.removeMax());
    }
}
