package com.pointware.leetcode;

public class LeetCode55Impl implements com.pointware.leetcode.problem.LeetCode55 {
    private boolean bruteForce(int[] nums, int present){
        if(present >= nums.length-1) return true;
        if(nums[present] == 0) return false;
        for(int i=nums[present]; i > 0; i--){
            // 분명 여기가 제일 오래 걸리는 구간.
            if(bruteForce(nums, present+i)){
                return true;
            }
        }
        return false;
    }

    private boolean range(int[] nums){
        // start 0
        int maxRange = -1;
        for(int index = 0; index < nums.length; index++){
            maxRange = Math.max(maxRange, index + nums[index]);
            if(maxRange <= index && index != nums.length-1){
                return false;
            }
            if(maxRange >= nums.length -1){
                return true;
            }
        }
        return true;
    }

    public boolean canJump(int[] nums) {
        // nums.length >= 1 , 3* 10000
        // nums[i][j] = 100000
        // 인덱스에서의 값은 현재 위치에서 최대 점프 길이를 나타낸다.
        // 마지막 인덱스에 도달할 수 있는지 판단해라.


        //각 인덱스에서 갈 수 있는 길이는 3 2 1 이런식임.
        // brute force
//        return bruteForce(nums, 0);
        return range(nums);
    }
}
