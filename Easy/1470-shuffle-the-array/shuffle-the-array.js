/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    var start=0
    var stop=n
    var arr=[]
    while(start<n){
        arr.push(nums[start])
        arr.push(nums[stop])
        start+=1
        stop+=1
    
    }
    return arr
};