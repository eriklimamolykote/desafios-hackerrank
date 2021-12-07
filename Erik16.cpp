// C++ - Conditional statements
// Given a positive integer n, do the following: If a <= n <= 9, print the
// lower case English word corresponding to the number (e.g., one for 1, two
// for 2 ,etc.).
// If n > 9, print "Greater than 9."

#include <bits/stdc++.h>

using namespace std;

int main() {

    string a[] = { "Greater than 9", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine" };

    int n;

    cin >> n;

    cout << ( (n > 9) ? a[0] : a[n] );

    return 0;
        
}