/**
 * @param {number[]} nums
 * @return {number[]}
 */
var orArray = function(nums) {
	const result = [];

	for (let i = 0; i < nums.length - 1; ++i) {
		result.push(nums[i] | nums[i + 1]);
	}

	return result;
};

console.log(orArray([1, 3, 7, 15]))
console.log(orArray([8, 4, 2]))
console.log(orArray([5, 4, 9, 11]))
