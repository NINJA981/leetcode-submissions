class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        char[] arr = s2.toCharArray();

        int start = 0;

        for (int end = 0; end < s2.length(); end++) {

            map2.put(arr[end], map2.getOrDefault(arr[end], 0) + 1);

            if (end - start + 1 > s1.length()) {

                map2.put(arr[start], map2.get(arr[start]) - 1);

                if (map2.get(arr[start]) == 0) {
                    map2.remove(arr[start]);
                }

                start++;
            }

            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}