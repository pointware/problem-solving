package com.pointware.leetcode

import spock.lang.Specification

class LeetCode200ImplTest extends Specification {
    def "NumIslands"() {
        expect:
        new LeetCode200Impl().numIslands(input as char[][]) == output
        new LeetCode200ImplFloodFill().numIslands(input as char[][]) == output

        where:
        input             | output
        [
                ["1", "1", "1", "1", "0"],
                ["1", "1", "0", "1", "0"],
                ["1", "1", "0", "0", "0"],
                ["0", "0", "0", "0", "0"]
        ]                 | 1
        [
                ["1", "1", "0", "0", "0"],
                ["1", "1", "0", "0", "0"],
                ["0", "0", "1", "0", "0"],
                ["0", "0", "0", "1", "1"]
        ]                 | 3
        [["1", "1", "1"],
         ["0", "1", "0"],
         ["1", "1", "1"]] | 1 //
    }
}
