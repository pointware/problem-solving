package com.pointware.hackerrank

import spock.lang.Specification

class LuckBalanceImplTest extends Specification {
    def "LuckBalance"() {
        expect:
        new LuckBalanceImpl().luckBalance(3, [
                [5, 1],
                [2, 1],
                [1, 1],
                [8, 1],
                [10, 0],
                [5, 0]
        ] as int[][]) == 29
    }
}
