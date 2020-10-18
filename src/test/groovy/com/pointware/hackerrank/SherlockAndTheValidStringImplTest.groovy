package com.pointware.hackerrank

import spock.lang.Specification

class SherlockAndTheValidStringImplTest extends Specification {
    def "IsValid"() {
        expect:
        new SherlockAndTheValidStringImpl().isValid(s) == output

        where:
        s                   | output
        "aaaaabc"           | "NO"
        "s"                 | "YES"
        "aabbcd"            | "NO"
        "aaabbbcd"          | "NO"
        "aabbccddeefghi"    | "NO"
        "abcdefghhgfedecba" | "YES"
    }

    def "testMap"() {
        setup:
        expect:
        new SherlockAndTheValidStringImpl().testMap(map) == test

        where:
        map                  | test
        [1: 1, 11111: 9]     | true
        [11110: 1, 11111: 1] | true
        [11110: 7, 11111: 1] | true
        [111: 7, 10: 1]      | false
    }
}
