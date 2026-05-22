class Solution(object):
    def runningSum(self, nums):
        n = len(nums)
        result = [0] * n
        sum = 0
        for i in range(n):
            sum += nums[i]
            result[i] = sum
        return result
        
        