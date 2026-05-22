class Solution(object):
    def findNumbers(self, nums):
        n = len(nums)
        count = 0
        for num in nums:
            digit = 0
            while(num > 0):
                num /= 10
                digit+=1
            if(digit % 2 == 0):
                count+=1
        return count

        