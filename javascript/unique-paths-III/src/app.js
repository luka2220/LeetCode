let count = 0;
let m = 0;
let n = 0;
let targetLength = 0;


/**
 * @param {number[][]} grid
 * @return {number}
 */
var uniquePathsIII = function(grid) {
	let startI, startJ = 0;
	m = grid.length;
	n = grid[0].length;
	count = 0;
	targetLength = 0;

	for (let i = 0; i < m; i++) {
		for (let j = 0; j < n; j++) {
			if (grid[i][j] === 1) {
				startI = i;
				startJ = j;
			}
			if (grid[i][j] === -1) {
				targetLength++
			}
		}
	}

	dfs(startI, startJ, grid, 1, "");
	return count;
};

function dfs(i, j, grid, prev, paths) {
	if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] === -1) {
		return
	}

	if (grid[i][j] == 2) {
		if (prev == targetLength) {
			count++;
		}
		return;
	}

	grid[i][j] = -1;
	prev++;
	dfs(i + 1, j, grid, prev)
	dfs(i - 1, j, grid, prev)
	dfs(i, j + 1, grid, prev)
	dfs(i, j - 1, grid, prev)
	grid[i][j] = 0;
}



console.log(uniquePathsIII([[1, 0, 0, 0], [0, 0, 0, 0], [0, 0, 2, -1]]))
console.log(uniquePathsIII([[1, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 2]]))
console.log(uniquePathsIII([[0, 1], [2, 0]]))
