class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> pairs = new HashMap<>();

        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (pairs.containsKey(c)) {

                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.peek() != pairs.get(c)) {
                    return false;
                }

                stack.pop();

            } else {

                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}