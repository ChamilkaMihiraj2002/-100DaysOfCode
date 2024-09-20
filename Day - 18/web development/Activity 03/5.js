function concatenateWithoutFirstChar(str1, str2) {
    let string1 = str1.slice(1);
    let string2 = str2.slice(1);

    return string1 + str2
}

const string1 = "Hello";
const string2 = "World";

console.log(concatenateWithoutFirstChar(string1, string2));