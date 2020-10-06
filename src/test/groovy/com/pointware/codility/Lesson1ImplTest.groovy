package com.pointware.codility

import spock.lang.Specification

class Lesson1ImplTest extends Specification {
    def "Binary"() {
        expect:
        new Lesson1Impl().binaryGap(input) == output

        where:
        input | output
        1     | 0
        529   | 4
        1041  | 5
        9     | 2
        20    | 1
        15    | 0
        32    | 0
    }
}
