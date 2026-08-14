# Last updated: 8/14/2026, 2:35:31 PM
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        mp = {0: -1}
        count = 0
        ans = 0

        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                count -= 1

            if count in mp:
                ans = max(ans, i - mp[count])
            else:
                mp[count] = i

        return ans