class Stack {
	constructor() {
		this.items = []
	}

	push(item) {
		this.items.push(item)
	}

	pop() {
		if (this.items.length === 0) {
			return null;
		}

		return this.items.pop()
	}

	peek() {
		return this.items[this.items.length - 1];
	}

	isEmpty() {
		return this.items.length === 0;
	}
}

/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
	const open = ['(', '{', '[']
	const closed = [')', '}', ']']

	const stack = new Stack();

	for (let i = 0; i <= s.length; ++i) {
		if (open.includes(s[i])) {
			stack.push(s[i])
		} else if (closed.includes(s[i])) {
			const item = stack.pop();
			const index = closed.indexOf(s[i]);

			if (item !== open[index] || item === null) {
				return false;
			}
		}
	}

	return stack.isEmpty()
};

console.log(isValid("()"))
console.log(isValid("()[]{}"))
console.log(isValid("(]"))
console.log(isValid("("))



