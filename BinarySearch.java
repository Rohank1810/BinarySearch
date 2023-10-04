import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beg, mid = 0, end;
        System.out.println("Enter the size of array::");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array::");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the elements to be search::");
        int item = sc.nextInt();

        beg = 0;
        end = n - 1;
        // algorithm
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (a[mid] == item) {
                System.out.println("Element" + " " + item + " " + "found at index" + " " + mid);
                break;
            } else if (a[mid] < item) {
                beg = mid + 1;
            } else if (a[mid] > item) {
                end = mid - 1;
            }
        }
        System.out.println(mid);
    }
}