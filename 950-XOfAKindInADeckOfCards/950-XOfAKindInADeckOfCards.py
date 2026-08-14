# Last updated: 8/14/2026, 2:34:05 PM
from collections import Counter
from math import gcd

class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        counts = Counter(deck).values()

        g = 0
        for count in counts:
            g = gcd(g, count)

        return g >= 2