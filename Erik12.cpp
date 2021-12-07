// C++ - Input and output
// Read 3 numbers from stdin and print their sum to stdout.

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main() {

    int sumOfNumbers = 0;
    int number1, number2, number3;

    cin >> number1 >> number2 >> number3;

    sumOfNumbers = number1 + number2 + number3;

    cout << sumOfNumbers << endl;

}