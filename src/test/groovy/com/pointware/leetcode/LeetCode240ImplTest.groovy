package com.pointware.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class LeetCode240ImplTest extends Specification {
    @Unroll
    def "SearchMatrix"() {
        setup:
        def input = [
                [1, 4, 7, 11, 15],
                [2, 5, 8, 12, 19],
                [3, 6, 9, 16, 22],
                [10, 13, 14, 17, 24],
                [18, 21, 23, 26, 30]
        ] as int[][]
        expect:
        new LeetCode240Impl().searchMatrix(input, input2) == expect
        new LeetCode240Impl2().searchMatrix(input, input2) == expect

        where:
        input2 | expect
        5      | true
        20     | false
        40  | false
    }

    def "SearchMatrix_empty"() {

        expect:
        new LeetCode240Impl().searchMatrix(input as int[][], input2) == expect
        new LeetCode240Impl2().searchMatrix(input as int[][], input2) == expect

        where:
        input           | input2 | expect
        [[1], [2], [4]] | 3      | false
        [[1], [2], [3]] | 3      | true
        [[-5]]          | -5     | true
        []              | 1      | false
    }
}

