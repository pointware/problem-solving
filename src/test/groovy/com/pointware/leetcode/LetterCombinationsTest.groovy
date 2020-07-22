package com.pointware.leetcode

import com.pointware.leetcode.lettercombinations.LetterCombinationsImpl
import spock.lang.Specification
import spock.lang.Unroll

class LetterCombinationsTest extends Specification {
    def basicLetterCombinations = [
            new LetterCombinationsImpl.Basic(),
            new LetterCombinationsImpl.Other()
    ]

    @Unroll
    def "LetterCombinations"() {
        when:
        def result = basicLetterCombinations.stream()
                .map({ o -> o.letterCombinations(input) })
                .collect()

        then:
        result.stream().allMatch({ o -> o == expect })

        where:
        input | expect
        "23"  | ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
        "2" | ["a","b","c"]
        "" | []
    }
}
