#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    static int singleNumber(vector<int>& nums) {
	int result = 0;

	for (const auto& n : nums) {
	    result ^= n;
	}

	return result;
    }
};

int main() {
    vector<int> nums = {4,1,2,1,2};
    vector<int> nums2 = {2,2,1};

    Solution solution;

    cout << solution.singleNumber(nums) << endl;
    cout << solution.singleNumber(nums2) << endl;
}
