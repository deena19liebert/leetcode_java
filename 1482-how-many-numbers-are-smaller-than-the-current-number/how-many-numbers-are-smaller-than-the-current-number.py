class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        sorted_nums = sorted(nums)
        # use enumerate in python for (index, value) pair
        pos_map = {}
        for i, num in enumerate(sorted_nums):
            if num not in pos_map:
                pos_map[num] = i
        
        result = []
        for num in nums:
            result.append(pos_map[num])
        return result
        