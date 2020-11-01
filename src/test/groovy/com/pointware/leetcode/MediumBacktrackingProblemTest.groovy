package com.pointware.leetcode

import spock.lang.Specification

class MediumBacktrackingProblemTest extends Specification {
    def subject = new MediumBacktrackingProblem();

    def "LetterCombinations"() {
    }

    def "generateParenthesis"() {
        expect:
        subject.generateParenthesis(n) == output

        where:
        n | output
        3 | ["((()))", "(()())", "(())()", "()(())", "()()()"]
        1 | ["()"]
    }
}
