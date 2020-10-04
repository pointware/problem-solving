package com.pointware.leetcode

import spock.lang.Specification

class LeetCode139ImplTest extends Specification {
    def "WordBreak"() {
        expect:
        new LeetCode139Impl().wordBreak(s, wordDict) == output

        where:
        s               | wordDict                              | output
        "cars"          | ["car", "ca", "rs"]                   | true
        "1234"          | []                                    | false
        "leetcode"      | ["leet", "code"]                      | true
        "applepenapple" | ["apple", "pen"]                      | true
        "catsandog"     | ["cats", "dog", "sand", "and", "cat"] | false
    }
}
