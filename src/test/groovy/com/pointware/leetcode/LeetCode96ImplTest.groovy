package com.pointware.leetcode

import spock.lang.Specification

class LeetCode96ImplTest extends Specification {
    def "NumTrees"() {
        expect:
        new LeetCode96Impl().numTrees(input) == output
        where:
        input | output
        3     | 5
    }
}
