class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs1 = s.toCharArray();
        char[] ct1 = t.toCharArray();

        Arrays.sort(cs1);
        Arrays.sort(ct1);

        return Arrays.equals(cs1, ct1);

    }
}
