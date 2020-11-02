package com.pointware.leetcode

import spock.lang.Specification

class MediumSortingAndSearchingTest extends Specification {
    def subject = new MediumSortingAndSearching();

    def "sortColors"() {
        expect:
        def newArr = (nums as int[]).clone();
        subject.sortColors(newArr)
        newArr == output as int[]

        where:
        nums               | output
        [1, 1, 2, 2]       | [1, 1, 2, 2]
        [0, 0, 1, 1]       | [0, 0, 1, 1]
        [2, 2, 1, 1]       | [1, 1, 2, 2]
        [2, 0, 2, 1, 1, 0] | [0, 0, 1, 1, 2, 2]
        [2, 0, 1]          | [0, 1, 2]
        [0]                | [0]
        [1]                | [1]
        [2, 2, 1, 1, 0, 0] | [0, 0, 1, 1, 2, 2]
        [0, 0, 1, 1, 2, 2] | [0, 0, 1, 1, 2, 2]
    }
}
