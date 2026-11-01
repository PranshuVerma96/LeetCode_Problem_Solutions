class Solution {
    public String simplifyPath(String path) {
        // for slove this question we need stack 
        Deque<String> st = new ArrayDeque<>();

        String[] parts = path.split("/");
        // string ko split kar ne ke baad jitne par ate he us per traveel karo 
        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                // ignore
                continue;
            } else if (part.equals("..") && st.isEmpty()) {
                // kush mat karo ignore karo 
                continue;
            } else if (part.equals("..") && !st.isEmpty()) {
                // to pop karba dege 
                st.pop();
            } else {
                // file name 
                st.push(part);
            }

        }

        if (st.isEmpty()) {
            // ika matlab main root directory per hu return root directory
            return "/";
        } else {
            // agar stack empty nahi he answer build kar lo string builder me 
            StringBuilder str = new StringBuilder();

            while (!st.isEmpty()) {
                // ab append karo stack ka peek element

                // if app peek element append kar te the character vo reverse hoge 

                // uske baad ek slas ho na chiye
                str.append("/");
                // to remove Last method use karo 
                str.append(st.removeLast());

        
            }
            // ab return kar do 
            return str.toString();
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna