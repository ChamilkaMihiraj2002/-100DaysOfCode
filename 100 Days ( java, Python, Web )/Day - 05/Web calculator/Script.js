let assign_number = "";
let number_1 = 0, number_2 = 0,auto_memory = 0,operator;

function assign (re_value) {
    assign_number = assign_number + re_value;
}

function btn_read (value) {
    assign(value);
    display(assign_number);
}

function btn_get (value) {
    switch (value) {
        case '1':
            btn_read('1');
            break;
        case '2':
            btn_read('2');
            break;
        case '3':
            btn_read('3');
            break;
        case '4':
            btn_read('4');
        case '5':
            btn_read('5');
            break;
        case '6':
            btn_read('6');
            break;
        case '7':
            btn_read('7');
            break;
        case '8':
            btn_read('8');
            break;
        case '9':
            btn_read('9');
            break;
        case '0':
            btn_read('0');
            break;
    }
}

function decimal () {
    let point = ".";
    assign(point);
    display(assign_number);
}

function calc (value) {
    number_1 = parseFloat(assign_number);
    assign_number = "";
    operator = value;
    display(operator);
}

function select_op (value) {
    switch (value) {
        case '+':
            calc("+");
            break;
        case '-':
            calc("-");
            break;
        case 'x':
            calc("x");
            break;
        case '/':
            calc("/");
            break;
    }
}

function precentage () {
    number_1 = parseFloat(assign_number);
    assign_number = "";
    operator = "%";
    answer = number_1 /100;
    auto_memory = answer;
    display(answer);
}

function cl_button () {
    number_1 = 0;
    number_2 = 0;
    assign_number = "";
    auto_memory = 0;
    display(0);
}

function addition(num1,num2) { return num1 + num2; }
function subtraction(num1,num2) { return num1 - num2; }
function Multiplication(num1,num2) { return num1 * num2;}
function Divison(num1,num2) {
    try {
        if (num2 === 0) {
            throw "Zero division";
        } else {
            return num1 / num2;
        }
    } catch (e) {
        alert(e);
        return 0;
    }
}



function selection (value_01,value_02,OP) {
    switch (OP) {
        case "+":
            return addition(value_01,value_02);
        case "-":
            return subtraction(value_01,value_02);
        case "x":
            return Multiplication(value_01,value_02);
        case "/":
            return Divison(value_01,value_02);
    }
}

function display (value) {
    let cal_dispaly = document.getElementById("dispaly");
    cal_dispaly.innerHTML = value;
}

function eq_button () {
    number_2 = parseFloat(assign_number);
    assign_number = "";
    let answer;

    if (auto_memory === 0) {
        answer = selection(number_1, number_2,operator);
    } else {
        answer = selection(auto_memory, number_2,operator);
    }
    auto_memory = parseFloat(answer);
    display(answer);
}