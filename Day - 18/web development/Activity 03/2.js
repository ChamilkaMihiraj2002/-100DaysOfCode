const number_1 = 25;
const number_2 = 50;

function checkNumbers(num1, num2) {
    if (num1 === 50 || num2 === 50) {
        return true;
    } else if (num1 + num2 === 50) {
        return true;
    } else {
        return false;
    }
}

console.log(checkNumbers(number_1, number_2))