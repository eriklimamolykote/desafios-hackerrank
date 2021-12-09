// C++ - Arrays introduction
// You will be given an array of N integers and you have to print the integers in
// the reverse order.

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main() {

   int N, i = 0;
   std::cin >> N;
   int *A = new int[N];
   while (std::cin >> A[i++]);
   while (std::cout << A[--N] << ' ' && N);
   delete[] A;
   return 0;

}