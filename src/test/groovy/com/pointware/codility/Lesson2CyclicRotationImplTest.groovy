package com.pointware.codility

import spock.lang.Specification

class Lesson2CyclicRotationImplTest extends Specification {
    def "Solution"() {
        expect:
//        new Lesson2CyclicRotationImpl().solution(A as int[], k) == output as int[]
        new Lesson2CyclicRotationReverseImpl().solution(A as int[], k) == output as int[]

        where:
        A                  | k | output
        [1, 2, 3, 4, 5, 6] | 2 | [5, 6, 1, 2, 3, 4]
        [1, 2, 3, 4, 5, 6] | 3 | [4, 5, 6, 1, 2, 3]
        [1, 2, 3, 4, 5, 6] | 4 | [3, 4, 5, 6, 1, 2]

        []                 | 2 | []
        [1, 2]             | 1 | [2, 1]
        [1, 2, 3, 4, 5]    | 1 | [5, 1, 2, 3, 4]
        [1, 2, 3, 4, 5]    | 2 | [4, 5, 1, 2, 3]
        [1, 2, 3, 4, 5]    | 3 | [3, 4, 5, 1, 2]
        [1, 2, 3, 4, 5]    | 4 | [2, 3, 4, 5, 1]
        [1, 2, 3, 4, 5]    | 5 | [1, 2, 3, 4, 5]

        [1, 2, 3, 4, 5, 6] | 1 | [6, 1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5, 6] | 5 | [2, 3, 4, 5, 6, 1]
        [1, 2, 3, 4, 5, 6] | 6 | [1, 2, 3, 4, 5, 6]

    }
}

