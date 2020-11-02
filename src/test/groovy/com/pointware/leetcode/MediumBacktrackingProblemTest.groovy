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

    def "permute"() {
        expect:
        subject.permute(input as int[]) == output

        where:
        input     | output
        [1, 2, 3] | [
                [1, 2, 3],
                [1, 3, 2],
                [2, 1, 3],
                [2, 3, 1],
                [3, 1, 2],
                [3, 2, 1]
        ]
    }

    def "subset"() {
        expect:
        new HashSet<>(subject.subsets(nums as int[])) == new HashSet<>(output);

        where:
        nums      | output
        [1, 2, 3] | [
                [3],
                [1],
                [2],
                [1, 2, 3],
                [1, 3],
                [2, 3],
                [1, 2],
                []
        ]
    }
}
