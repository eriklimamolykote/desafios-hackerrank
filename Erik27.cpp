// C++ - Strings

#include <iostream>
#include <string>

using namespace std;

int main() {

    // Variables declaration
    string a;
    string b;

    cin >> a >> b;

    // First line
    cout << a.length();
    cout << ' ';
    cout << b.length();
    cout << endl;

    // Second line
    cout << a + b;
    cout << endl;

    // Third line
    std::swap(a[ 0 ], b[ 0 ] );
    std::cout << a << ' ' << b;
    cout << endl;

    return 0;

}