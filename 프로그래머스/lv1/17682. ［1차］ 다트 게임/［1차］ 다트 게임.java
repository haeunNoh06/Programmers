class Solution {
    public int solution(String d) {
        int[] s = new int[3];
        int i = -1;
        int n = 0;

        for (char c : d.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + Character.getNumericValue(c);
            } else {
                if (Character.isAlphabetic(c)) {
                    int p = (int) Math.pow(n, getExp(c));
                    i++;
                    s[i] = p;
                } else if (c == '*') {
                    s[i] *= 2;
                    if (i > 0) {
                        s[i - 1] *= 2;
                    }
                } else if (c == '#') {
                    s[i] *= -1;
                }
                n = 0;
            }
        }

        int t = 0;
        for (int x : s) {
            t += x;
        }

        return t;
    }

    private int getExp(char b) {
        if (b == 'S') {
            return 1;
        } else if (b == 'D') {
            return 2;
        } else {
            return 3;
        }
    }
}