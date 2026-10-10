package Arrays;

public class MaxSubArray {
public static void main(String[] args) {

    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    int maxsum = 0;
    int sum = 0;

    for (int i = 0; i < a.length; i++) {

        if (sum < 0) {
            sum = a[i];
        } else {
            sum = sum + a[i];
        }

        maxsum = Math.max(maxsum, sum);
    }

    System.out.println(maxsum);
}
}
