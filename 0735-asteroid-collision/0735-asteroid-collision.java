class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        // first you have to traverse the asteroids array
        // mujhe stack ki need padegi

        Deque<Integer> st = new ArrayDeque<>();

        for (int ast : asteroids) {

            if (ast >= 0) {
                st.push(ast);
            }
            else {

                // asteroid ki value negative hai
                // directly insert in stack, no need to check

                if (st.isEmpty()) {
                    st.push(ast);
                }
                else if (!st.isEmpty() && st.peek() < 0) {
                    st.push(ast);
                }
                else {

                    // first entity positive hai and second entity negative hai
                    // collision hoga

                    // destroyed wala flag shows whether ast is alive or destroyed

                    boolean destroyed = false;

                    while (!st.isEmpty() && ast < 0 && st.peek() > 0) {

                        if (st.peek() < -ast) {

                            // stack wala asteroid explode ho jayega
                            st.pop();
                            continue;
                        }
                        else if (st.peek() > -ast) {

                            // current ast destroyed
                            destroyed = true;
                            break;
                        }
                        else {

                            // st.peek() == -ast
                            // dono asteroids destroy ho jayenge

                            st.pop();
                            destroyed = true;
                            break;
                        }
                    }

                    if (destroyed == false) {
                        st.push(ast);
                    }
                }
            }
        }

        // mere stack ke andar answer hai

        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna