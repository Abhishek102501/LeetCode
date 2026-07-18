class Solution {
    public String getPermutation(int n, int k) {

        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
        }

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        k--; // Convert to 0-based indexing

        StringBuilder ans = new StringBuilder();

        while (true) {

            int index = k / fact;
            ans.append(numbers.get(index));
            numbers.remove(index);

            if (numbers.isEmpty())
                break;

            k %= fact;
            fact /= numbers.size();
        }

        return ans.toString();
    }
}