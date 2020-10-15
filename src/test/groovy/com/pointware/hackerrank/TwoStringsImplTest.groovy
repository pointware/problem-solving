package com.pointware.hackerrank

import spock.lang.Specification

class TwoStringsImplTest extends Specification {
    def "TwoStrings"() {
        expect:
        new TwoStringsImpl().twoStrings(s1, s2) == output

        where:
        s1 | s2 | output
        "hello" | "world" | "YES"
        "hi" | "world" | "NO"
    }
}
