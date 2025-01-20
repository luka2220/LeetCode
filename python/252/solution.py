from typing import List


class Solution:
    def canAttendMeetings(self, intervals: List[List[int]]) -> bool:
        # brute force solution

        for i in range(len(intervals)):
            for j in range(i + 1, len(intervals)):
                if (
                    intervals[i][0] >= intervals[j][0]
                    and intervals[i][0] < intervals[j][1]
                    or intervals[j][0] >= intervals[i][0]
                    and intervals[j][0] < intervals[i][1]
                ):
                    return False

        return True


if __name__ == "__main__":
    tc1 = [[0, 30], [5, 10], [15, 20]]
    tc2 = [[0, 30], [5, 10], [15, 20]]
    sol = Solution()
    print(sol.canAttendMeetings(tc1))
    print(sol.canAttendMeetings(tc2))
