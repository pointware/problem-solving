package com.pointware.hackerrank

import spock.lang.Specification

class SherlockAndAnagramsImplTest extends Specification {
    def subject = new SherlockAndAnagramsImpl()

    def "sherlockAndAnagrams"() {
        expect:
        subject.sherlockAndAnagrams(s) == output
        where:
        s            | output
        "abba"       | 4
        "abcd"       | 0
        "ifailuhkqq" | 3
        "kkkk"       | 10
    }
}
