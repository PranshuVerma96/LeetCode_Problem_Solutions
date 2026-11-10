import java.util.*;

class BrowserHistory {

    Deque<String> currentHistory;
    Deque<String> forwardHistory;

    // Constructor
    public BrowserHistory(String homepage) {
        currentHistory = new ArrayDeque<>();
        forwardHistory = new ArrayDeque<>();

        // Initially insert homepage
        currentHistory.push(homepage);
    }

    // Visit a new URL
    public void visit(String url) {

        currentHistory.push(url);

        // Clear forward history
        forwardHistory.clear();
    }

    // Go back
    public String back(int steps) {

        while (steps > 0 && currentHistory.size() > 1) {

            String backTab = currentHistory.pop();

            forwardHistory.push(backTab);

            steps--;
        }

        return currentHistory.peek();
    }

    // Go forward
    public String forward(int steps) {

        while (steps > 0 && !forwardHistory.isEmpty()) {

            String forwardTab = forwardHistory.pop();

            currentHistory.push(forwardTab);

            steps--;
        }

        return currentHistory.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna