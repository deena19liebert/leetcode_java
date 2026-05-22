class Solution(object):
    def getConcatenation(self, nums):
        n = len(nums)
        result = [0] * (2 * n)
        for i in range(n):
            result[i] = nums[i]

        for i in range(n):
            result[i + n] = nums[i]
        return result

        