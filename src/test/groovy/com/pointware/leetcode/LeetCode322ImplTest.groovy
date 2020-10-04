package com.pointware.leetcode

import spock.lang.Specification

class LeetCode322ImplTest extends Specification {
    def "CoinChange"() {
        expect:
        new LeetCode322Impl().coinChange(coins as int[], amount) == output
        new LeetCode322Improve().coinChange(coins as int[], amount) == output

        where:
        coins               | amount | output
        [2, 5, 10, 1]       | 27     | 4
        [186, 419, 83, 408] | 6249   | 20
        [2]                 | 3      | -1
        [1, 2, 5]           | 11     | 3
        [2]                 | 1      | -1
        [1]                 | 0      | 0
        [1]                 | 1      | 1
        [1]                 | 2      | 2

    }
}
