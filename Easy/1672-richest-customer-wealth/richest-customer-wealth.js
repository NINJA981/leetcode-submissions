/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let maxWealth = 0;

    for (let i = 0; i < accounts.length; i++) {
        let currentSum = 0;

        for (let j = 0; j < accounts[i].length; j++) {
            currentSum += accounts[i][j];
        }

        maxWealth = Math.max(maxWealth, currentSum);
    }

    return maxWealth;
};
