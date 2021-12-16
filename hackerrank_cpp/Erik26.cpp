// C++ - String stream

#include <sstream>
#include <vector>
#include <iostream>

using namespace std;

vector<int> parseInts( string str ) {

    stringstream substring ( str );
    vector<int> output;
    char character;
    int temporary;

    while ( substring >> temporary ) // Extracts formatted data
    {

        output.push_back( temporary ); // Push temporary to vector
        substring >> character;

    }

    return output; // Return function output

}

int main() {

    string str;

    cin >> str;

    // Call function "parseInts" with a parameter returning a vector of the
    // parsed integers
    vector<int> integers = parseInts(str);

    // For loop iteration
    for ( int i = 0; i < integers.size(); i++ ) {

        cout << integers[ i ] << "\n";

    }

    return 0;

}