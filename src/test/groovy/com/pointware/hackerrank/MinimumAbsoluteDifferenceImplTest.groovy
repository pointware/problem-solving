package com.pointware.hackerrank

import spock.lang.Specification

class MinimumAbsoluteDifferenceImplTest extends Specification {
    def "MinimumAbsoluteDifference"() {
        expect:
        new MinimumAbsoluteDifferenceImpl().minimumAbsoluteDifference([3, -7, 0] as int[]) == 3
    }
}
