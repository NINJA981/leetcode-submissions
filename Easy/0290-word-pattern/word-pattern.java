class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length() ) {
            return false;
        }
        HashMap < Character , String > map = new HashMap<> (); 
        HashMap < String , Character > map2 = new HashMap<> (); 

        for ( int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if ( map.containsKey(c) && !map.get(c).equals(word)){
                return false;
            }
            if ( map2.containsKey(word)&& map2.get(word ) != c){
                return false;
            }
            map.put(c , word );
            map2.put(word,c);

        }
        return true;
        
    }
}