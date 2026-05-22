class Solution(object):
    def findNumbers(self, nums):
        count = 0
        for num in nums:
            digit = len(str(num))
            if digit % 2 == 0:
                count+=1
        return count

        