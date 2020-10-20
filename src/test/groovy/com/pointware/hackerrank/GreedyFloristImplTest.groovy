package com.pointware.hackerrank

import spock.lang.Specification

class GreedyFloristImplTest extends Specification {
    def "GetMinimumCost"() {
        expect:
        new GreedyFloristImpl().getMinimumCost(k, c as int[]) == output

        where:
        k | c               | output
        1 | [2]             | 2
        1 | [2, 5, 6]       | 22
        3 | [2, 5, 6]       | 13
        2 | [2, 5, 6]       | 15
        3 | [1, 3, 5, 7, 9] | 29

    }
}
