package com.pointware.hackerrank

import spock.lang.Specification

class MakingAnagramsImplTest extends Specification {
    def "MakeAnagram"() {
        expect:
        new MakingAnagramsImpl().makeAnagram(a, b) == output

        where:
        a     | b     | output
        "cde" | "abc" | 4
    }
}
