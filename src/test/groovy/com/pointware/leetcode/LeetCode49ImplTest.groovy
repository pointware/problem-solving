package com.pointware.leetcode

import spock.lang.Specification

class LeetCode49ImplTest extends Specification {
    def "GroupAnagrams"() {
        when:
        def expect = new LeetCode49Impl().groupAnagrams(input as String[])

        then:
        def listSet = output.stream().map({ o -> new HashSet<>(o) }).collect()
        expect.stream().allMatch(
                { it -> listSet.contains(new HashSet<>(it)) }
        )

        where:
        input                                      | output
        [""]                                       | [[""]]
        ["a"]                                      | [["a"]]
        ["eat", "tea", "tan", "ate", "nat", "bat"] | [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
    }
}
