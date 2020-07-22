package com.pointware.leetcode

import com.pointware.Utils
import spock.lang.Specification
import spock.lang.Unroll

class SearchInsertPositionTest extends Specification {
    def subjects = [new SearchInsertPosition.Basic(),
                    new SearchInsertPosition.BSearch()]

    @Unroll
    def "test"() {
        when:
        def results = Utils.invokeTestMethods(subjects, { o -> o.searchInsert(input1 as int[], input2 as int) })

        then:
        Utils.checkAllMatch(results, { o -> o == expect })

        where:
        input1       | input2 | expect
        [1, 3, 5, 6] | 2      | 1
        [1, 3, 5, 6] | 5      | 2
        [1, 3, 5, 6] | 7      | 4
        [1, 3, 5, 6] | 0      | 0
        []           | 5      | 0
        [4]          | 5      | 1
        [7]          | 5      | 0
    }
}
