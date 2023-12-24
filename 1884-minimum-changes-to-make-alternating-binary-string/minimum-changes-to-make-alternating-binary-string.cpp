class Solution {
public:
    int minOperations(std::string s) {
        int n = s.length();
        int count1 = 0, count2 = 0;

        // Count the number of operations needed for two alternating patterns:
        // Pattern 1: "010101..."
        // Pattern 2: "101010..."
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                // Count operations for pattern 1
                if (s[i] != '0') {
                    ++count1;
                }
                // Count operations for pattern 2
                if (s[i] != '1') {
                    ++count2;
                }
            } else {
                // Count operations for pattern 1
                if (s[i] != '1') {
                    ++count1;
                }
                // Count operations for pattern 2
                if (s[i] != '0') {
                    ++count2;
                }
            }
        }

        // Return the minimum operations needed among the two patterns
        return std::min(count1, count2);
    }
};