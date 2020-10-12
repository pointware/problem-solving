package com.pointware

import java.util.function.Function
import java.util.function.Predicate

class Utils {
    static def invokeTestMethods(List arr, Function func) {
        return arr.stream().map(func).collect()
    }

    static def checkAllMatch(Collection arr, Predicate func) {
        return arr.stream().allMatch(func)
    }

    static def listAllMatch(Collection expect, Collection result){
        expect.sort();
        result.sort();
        return expect == result;
    }
}
