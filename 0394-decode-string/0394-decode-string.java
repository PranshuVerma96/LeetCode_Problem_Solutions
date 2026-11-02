class Solution {
    public String decodeString(String s) {
        // is question ko solve kar be ke liye hume 2 stack ki jaurat hogi 
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        int number = 0;
        StringBuilder curr = new StringBuilder();

        for (char ch : s.toCharArray()) {
            // case 1 number tiyar karo 
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            // case 2 opening bracket bala case 
            else if (ch == '[') {
                countStack.push(number);
                stringStack.push(curr);
                // new values se inltilse kar ferse 
                number = 0;
                curr = new StringBuilder();

            }
            // case 3 
            else if (ch == ']') {
                int repeatCount = countStack.pop();

                // find previous string
                StringBuilder prev = stringStack.pop();

                // ab hum prev me repeatcount times curr ko append karne bale he 
                for (int i = 1; i <= repeatCount; i++) {
                    prev.append(curr);
                }
                // sabse important line
                curr = prev;

            }
            // case 4 ch == alpabe string ho skta he 
            else {
                curr.append(ch);

            }

        }
        return curr.toString();

    }
}