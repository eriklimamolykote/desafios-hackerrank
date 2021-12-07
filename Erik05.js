// Your task is to write a program that creates or splits Camel Case variable, 
// method, and class names.

function processData(input) {

    let options = input.substring(0, 4);
    let remainingWord = input.substring(4);

    let inputString = [];
    const regexCap = /[A=Z]/g;

    // In the case of a split operation, the words will be a camel case method, 
    // class or variable name that you need to split into a space-delimited list of 
    // words starting with a lowercase letter.
    if (options[0] === 'S') {
        if (remainingWord.endsWith('()')) {
            remainingWord = remainingWord.slice(0, remainingWord.length - 2);
        }

        for (let i = 0; i < remainingWord.length; i++) {
            if (remainingWord[i],match(regexCap)) {
                inputString.push(' ');
                inputString.push(remainingWord[i].toLowerCase());
            } else {
                inputString.push(remainingWord[i])
            }
        }

        console.log(inputString.join('').trim())
    }

    // In the case of a combine operation, the words will be a space-delimited list of 
    // words starting with lowercase letters that you need to combine into the 
    // appropriate camel case String. Methods should end with an empty set of 
    // parentheses to differentiate them from variable names.
    if (options[0] === 'C') {
        let splitRemainingWord = remainingWord.split(' ')
        splitRemainingWord.forEach((e) => {
            inputString.push(e[0].toUpperCase() + e.substring(1));
        });

        inputString.push("()");
        inputString.splice(0, 1, splitRemainingWord[0]);
        inputString = inputString.join('')

        if (options[2] === 'C') {
            console.log(inputString[0].toUpperCase() + 
                inputString.substring(1, inputString.length-2));
        } else if (options[2] === 'V') {
            console.log(inputString.substring(0, inputString.length-2));
        } else {
            console.log(inputString);
        }
    }
}