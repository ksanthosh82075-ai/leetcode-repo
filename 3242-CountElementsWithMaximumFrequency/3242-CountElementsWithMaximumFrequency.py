# Last updated: 8/14/2026, 2:32:47 PM
class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        max_freq = max(freq.values())

        ans = 0
        for value in freq.values():
            if value == max_freq:
                ans += value

        return ans