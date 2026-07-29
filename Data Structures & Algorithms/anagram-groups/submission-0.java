class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = String.valueOf(charArray); // sorted
            System.out.println("sorted word: " + sortedS);

            map.putIfAbsent(sortedS, new ArrayList<>());

            // if char matches, group
            map.get(sortedS).add(s);
        }

        System.out.println(map.toString());
        System.out.println(map.values());

        return new ArrayList<>(map.values());
    }    
}
