package com.pointware.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class FindKthLargestTest extends Specification {
    @Unroll
    def "FindKthLargest"() {
        expect:
        new FindKthLargest().findKthLargest(nums as int[], k) == output

        where:
        nums               | k | output
        [1, 1, 1, 2]       | 4 | 1
        [1, 1, 1, 2]       | 1 | 2
        [2, 2, 2, 1]       | 1 | 2
        [4, 3, 1, 2]       | 3 | 2
        [3, 2, 1, 5, 6, 4] | 1 | 6
        [3, 2]             | 1 | 3
        [99, 99]           | 2 | 99
        [99, 99]           | 1 | 99
        [2, 3]             | 1 | 3
        [2, 3]             | 2 | 2
        [3, 2, 1, 5, 6, 4] | 2 | 5
        [3, 2, 1, 5, 6, 4] | 3 | 4
        [3, 2, 1, 5, 6, 4] | 4 | 3
        [3, 2, 1, 5, 6, 4] | 5 | 2

    }
}
