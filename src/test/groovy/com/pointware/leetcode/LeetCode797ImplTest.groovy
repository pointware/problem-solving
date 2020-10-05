package com.pointware.leetcode

import spock.lang.Specification

class LeetCode797ImplTest extends Specification {
    def "AllPathsSourceTarget"() {
        expect:
        new LeetCode797Impl().allPathsSourceTarget(input as int[][]) == output

        where:
        input                                | output
        [[4, 3, 1], [3, 2, 4], [], [4], []]  | [[0, 4], [0, 3, 4], [0, 1, 3, 4], [0, 1, 4]]
        [[4, 3, 1], [3, 2, 4], [3], [4], []] | [[0, 4], [0, 3, 4], [0, 1, 3, 4], [0, 1, 2, 3, 4], [0, 1, 4]]
        [[1, 2], [3], [3], []]               | [[0, 1, 3], [0, 2, 3]]
        [[1, 2, 3], [2], [3], []]            | [[0, 1, 2, 3], [0, 2, 3], [0, 3]]
        [[1, 3], [2], [3], []]               | [[0, 1, 2, 3], [0, 3]]
    }
}
