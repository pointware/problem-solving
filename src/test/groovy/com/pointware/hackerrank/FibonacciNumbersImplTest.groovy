package com.pointware.hackerrank

import spock.lang.Specification

class FibonacciNumbersImplTest extends Specification {
    def "Fibonacci"() {
        expect:
        new FibonacciNumbersImpl().fibonacci(n) == output

        where:
        n | output
        5 | 5
    }
}
