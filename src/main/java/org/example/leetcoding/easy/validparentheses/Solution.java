package org.example.leetcoding.easy.validparentheses;

import java.util.*;

public class Solution {

    private Map<Character, Character> matchers;

    public Solution() {
        this.matchers = new HashMap<>();
        matchers.put('{', '}');
        matchers.put('[', ']');
        matchers.put('(', ')');
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (matchers.containsKey(ch)) {
                stack.addFirst(ch);
            } else {
                if (stack.isEmpty() || ch != matchers.get((stack.removeFirst()))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
