class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        max_wealth = 0
        for customer in accounts:
            wealth = sum(customer)
            max_wealth = max(wealth, max_wealth)
        return max_wealth

        