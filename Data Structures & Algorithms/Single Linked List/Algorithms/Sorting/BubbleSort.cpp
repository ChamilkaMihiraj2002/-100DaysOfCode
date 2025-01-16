#include <iostream>
using namespace std;

#define SIZE 8

int main() {
    int array[SIZE] = {10,8,5,6,7,8,2,3};
    int temp;

    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }

    for (int i = 0; i < SIZE; i++) {
        cout << array[i] << " ";
    }

    return 0;
}