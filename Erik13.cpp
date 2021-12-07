// C++ - Basic data types

#include <bits/stdc++.h>

using namespace std;

int main() {

    int integerNumber = 3;
    long longNumber = 12345678912345;
    char letter = 'a';
    float floatNumber = 334.23;
    double doubleNumber = 14049.30493;

    cin >> integerNumber >> longNumber >> letter >> floatNumber >> doubleNumber;

    cout << integerNumber << "\n" << longNumber << "\n" << letter << "\n";
    cout << fixed << setprecision(3) << floatNumber << "\n";
    cout << fixed << setprecision(9) << doubleNumber << "\n";
    return 0;

}