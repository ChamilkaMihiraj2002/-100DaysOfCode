function getValue(id) {
    let value = parseFloat(document.getElementById(id).value);
    return value;
}

function display(resualt) {
    document.getElementById('answer').innerText = resualt;
}

function multiply() {
    let num1 = getValue('num1');
    let num2 = getValue('num2');
    display(num1 * num2);
}

function divide() {
    let num1 = getValue('num1');
    let num2 = getValue('num2');

    if (num2 !== 0) {
        const resualt = num1 / num2;
        display(resualt);
    } else {
        display('Cannot divide by zero');
    }
}