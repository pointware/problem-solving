package com.pointware.basic

import spock.lang.Specification

class QuickSortTest extends Specification {
    def "Sort"() {
        expect:
        new QuickSort().sort(input as int[]) == expect as int[]

        where:
        input | expect
        [5,3,8,4,9,1,6,2,7] | [1,2,3,4,5,6,7,8,9]
        [1,10,5,8,7,6,4,3,2,9] | [1,2,3,4,5,6,7,8,9,10]
//        [2,5,4,3,1] | [1,2,3,4,5]
    }
}
