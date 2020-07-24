package com.pointware.leetcode

import spock.lang.Specification

class GenerateParenthesesImplTest extends Specification {
    def subject = new GenerateParenthesesImpl();

    def "GenerateParenthesis"() {
        when:
        def result = subject.generateParenthesis(input)

        then:
        expect == result

        where:
        input | expect
        3     | [
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"]
    }
}
