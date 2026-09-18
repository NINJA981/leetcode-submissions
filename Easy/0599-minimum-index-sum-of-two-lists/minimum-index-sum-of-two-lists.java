class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int low = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            String word = list2[i];

            if (map1.containsKey(word)) {
                int sum = i + map1.get(word);

                if (sum < low) {
                    low = sum;
                    result.clear();
                    result.add(word);
                } else if (sum == low) {
                    result.add(word);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}