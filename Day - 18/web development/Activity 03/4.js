const numbers = [10, 70, 30];

function getLargest(numlist) {
    let max = 0;
    for (let i = 0; i < numlist.length; i++) {
        if (numlist[i] >= max) {
            max = numlist[i];
        }
    }
    return max;
}

console.log("The largest number is : " + getLargest(numbers));