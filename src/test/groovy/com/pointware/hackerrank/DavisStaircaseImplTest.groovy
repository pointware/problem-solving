package com.pointware.hackerrank

import spock.lang.Specification

class DavisStaircaseImplTest extends Specification {
    def "StepPerms"() {
        expect:
        new DavisStaircaseImpl().stepPerms(n) == output
        where:
        n | output
        1 | 1
        3 | 4
        7 | 44
    }
}
