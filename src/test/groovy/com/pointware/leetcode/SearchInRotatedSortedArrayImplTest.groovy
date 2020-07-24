package com.pointware.leetcode

import spock.lang.Specification

class SearchInRotatedSortedArrayImplTest extends Specification {
    def subject = new SearchInRotatedSortedArrayImpl();

    def "Search"() {
        when:
        def result = subject.search(input1 as int[], input2)

        then:
        result == expect

        where:
        input1                | input2 | expect
        [4, 5, 6, 7, 0, 1, 2] | 3      | -1
        [4, 5, 6, 7, 0, 1, 2] | 0      | 4
        [0,1,2,3,4,5,6,7] | 0 | 0
    }
}
