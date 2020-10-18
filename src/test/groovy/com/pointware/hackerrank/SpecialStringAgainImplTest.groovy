package com.pointware.hackerrank

import spock.lang.Specification

class SpecialStringAgainImplTest extends Specification {
    def "SubstrCount"() {
        expect:
        new SpecialStringAgainImpl().substrCount(n, s) == output

        where:
        n | s         | output
        7 | "abcbaba" | 10
        5 | "aabaa"   | 9
        4 | "aaaa"    | 10
        5 | "asasd"   | 7
    }
}
