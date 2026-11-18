/**
 * @param {string} s
 * @return {number}
 */
var minChanges = function (s) {
    let n = s.length;
    let count = 0;
    for (let i = 1; i < n; i += 2) {
        if (s.charAt(i) != s.charAt(i - 1)) {
            count++;
        }
    }
    return count;
};