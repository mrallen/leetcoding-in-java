package org.example.leetcoding.easy.mergetwolists;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;

import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    void test_1() {
        ListNode l1 = createListFromArray(new int[]{1, 2, 4});
        ListNode l2 = createListFromArray(new int[]{1, 3, 4});

        ListNode expected = createListFromArray(new int[]{1, 1, 2, 3, 4, 4});

        ListNode actual = objectUnderTest.mergeTwoListsRecursive(l1, l2);

        assertThat(actual, Matchers.samePropertyValuesAs(expected));

    }

    @Test
    void test_2() {
        ListNode l1 = createListFromArray(new int[]{1, 2, 4});
        ListNode l2 = createListFromArray(new int[]{1, 3, 4});

        ListNode expected = createListFromArray(new int[]{1, 1, 2, 3, 4, 4});

        ListNode actual = objectUnderTest.mergeTwoListsIterative(l1, l2);

        assertThat(actual, Matchers.samePropertyValuesAs(expected));

    }

    private ListNode createListFromArray(int[] input) {
        ListNode result = null;
        for (int i = input.length - 1; i >= 0; i--) {
            result = new ListNode(input[i], result);
        }
        return result;
    }
}