package com.pointware.leetcode

import com.pointware.Utils
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
        def results = Utils.invokeTestMethods(basicLetterCombinations, { o -> o.letterCombinations(input) });

        then:
        Utils.checkAllMatch(results, { o -> o == expect })

        where:
        input | expect
        "23"  | ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
        "2" | ["a","b","c"]
        "" | []
    }
}
