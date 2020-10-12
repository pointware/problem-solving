package com.pointware.leetcode

import com.pointware.Utils
import spock.lang.Specification

class LeetCode40ImplTest extends Specification {
    def "CombinationSum2"() {
        expect:
        def result = new LeetCode40Impl().combinationSum2(candidates as int[], target)

        Utils.listAllMatch(expect, result);

        where:
        candidates               | target | expect
        [2, 5, 2, 1, 2]          | 5      | [[1, 2, 2], [5]]
        [10, 1, 2, 7, 6, 1, 5]   | 8      | [[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]
        []                       | 1      | []
        [10]                     | 8      | []
        [1, 1, 1, 1, 1, 1, 1, 1] | 4      | [[1, 1, 1, 1]]
        [1, 1, 1, 1, 1, 1, 1, 1] | 1      | [[1]]
        [2, 5, 2, 1, 2]          | 5      | [[1, 2, 2], [5]]
    }
}
