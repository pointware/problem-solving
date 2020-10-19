package com.pointware.hackerrank

import spock.lang.Specification

class FraudulentActivityNotificationsImplTest extends Specification {

    def "activityNotifications"() {
        expect:
        new FraudulentActivityNotificationsImpl().activityNotifications(exp as int[], d) == output

        where:
        exp                         | d | output
        [1]                         | 1 | 0
        [1, 2, 3, 4, 4]             | 4 | 0
        [2, 3, 4, 2, 3, 6, 8, 4, 5] | 5 | 2
    }
}
