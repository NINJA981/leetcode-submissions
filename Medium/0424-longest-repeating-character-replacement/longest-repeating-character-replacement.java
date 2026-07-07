class Solution {
    public int characterReplacement(String s, int k) {
HashMap<Character, Integer> map = new HashMap<>();

int left = 0;
int maxFreq = 0;
int maxLength = 0;
int window = 0;

for (int right = 0; right < s.length(); right++) {

    char c = s.charAt(right);

    map.put(c,map.getOrDefault(c,0)+1);

    maxFreq = (Math.max(map.getOrDefault(c,0),maxFreq));
    

    while ((right - left + 1) - maxFreq > k) {

        char leftChar = s.charAt(left);

        map.put(leftChar, map.get(leftChar) - 1);

        left++;
    }
    window=right-left+1;
    maxLength=Math.max(maxLength,window);

    
}

return maxLength;
        
    }
}