package com.pointware.hackerrank

import spock.lang.Specification

class MinimumBribesImplTest extends Specification {
    def "MinimumBribes"() {
        expect:
        new MinimumBribesImpl().minimumBribes(input as int[]) == output

        where:
        input                    | output
        [1, 2, 5, 3, 7, 8, 6, 4] | 7
        [2, 1, 5, 3, 4]          | 3
        [2, 5, 1, 3, 4]          | -1
        [5, 1, 2, 3, 7, 8, 6, 4] | -1
    }
}
