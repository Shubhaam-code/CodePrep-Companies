class Solution:
    def minOperations(self, n: int) -> int:
        ans = 0
        while n > 0:
            # If the last two bits are '11', adding 1 is better
            if (n & 3) == 3:
                n += 1
                ans += 1
            # If the last bit is a single '1', subtracting 1 is better
            elif n & 1:
                n -= 1
                ans += 1
            # If the last bit is '0', just shift right to check the next bit
            else:
                n >>= 1
        return ans
