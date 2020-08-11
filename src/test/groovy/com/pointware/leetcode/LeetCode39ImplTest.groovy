package com.pointware.leetcode

import spock.lang.Specification

class LeetCode39ImplTest extends Specification {
    def "CombinationSum"() {
        expect:
        def result = new LeetCode39Impl().combinationSum(input1 as int[], input2);
        result.stream().allMatch({ o -> expect.contains(o) }) == true

        where:
        expect                            | input1       | input2
        [[7], [2, 2, 3]]                  | [2, 3, 6, 7] | 7
        [[2, 2, 2, 2], [2, 3, 3], [3, 5]] | [2, 3, 5]    | 8
        []  | [2] | 1
        [[2]] | [2] | 2
    }
}
