import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        // Create a HashSet to store the numbers
        HashSet<Integer> set = new HashSet<>();
        int longestSequence = 0;

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate over the array and find the longest consecutive sequence
        for (int num : nums) {
            // Check if the current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                // Increment the current number until it is not present in the set
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }

                // Update the longest sequence if necessary
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};
        int longestSequence = longestConsecutive(nums);
        System.out.println("The length of the longest consecutive sequence is: " + longestSequence);
    }
}
