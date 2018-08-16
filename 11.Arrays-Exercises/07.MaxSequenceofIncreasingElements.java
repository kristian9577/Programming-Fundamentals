import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofIncreasingElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums =
                Arrays.stream(scan.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int l = nums.length;

        MaxIncSequence(nums, l);
    }

    static void MaxIncSequence(int[] numbers, int l) {
        int cntCurrSeq = 0;
        int startCurrSeq = 0;
        int cntMaxSeq = 0;
        int startMaxSeq = 0;

        for (int i = 1; i < l; i++) {
            if (numbers[i] - numbers[i - 1] >= 1) {
                cntCurrSeq++;
                startCurrSeq = i - cntCurrSeq;

                if (cntCurrSeq > cntMaxSeq) {
                    cntMaxSeq = cntCurrSeq;
                    startMaxSeq = startCurrSeq;
                }
            } else {
                cntCurrSeq = 0;
            }
        }
        for (int iWrite = startMaxSeq; iWrite <= (startMaxSeq + cntMaxSeq); iWrite++) {
            System.out.print(numbers[iWrite] + " ");
        }
        System.out.println();
        ;
    }
}
