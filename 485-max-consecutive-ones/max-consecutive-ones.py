class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        n = len(nums)
        count = 0
        maxCount = 0
        for i in range(n):
            if nums[i] == 1:
                count+=1
                maxCount = max(count, maxCount)
            else:
                count = 0
        return maxCount
        