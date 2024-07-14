// Merge sort without duplicates.
#include <stdio.h>
#include <stdlib.h>

// Function to find the maximum in an array
int maximum(int n, int a[]) {
    int max = a[0];
    for (int i = 1; i < n; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }
    return max;
}

// Function to find the minimum in an array
int minimum(int n, int a[]) {
    int min = a[0];
    for (int i = 1; i < n; i++) {
        if (a[i] < min) {
            min = a[i];
        }
    }
    return min;
}

int main() {
    int n1, n2;

    // Read the size of the first array
    scanf("%d", &n1);
    int a[n1];
    for (int i = 0; i < n1; i++) {
        scanf("%d", &a[i]);
    }

    // Read the size of the second array
    scanf("%d", &n2);
    int b[n2];
    for (int i = 0; i < n2; i++) {
        scanf("%d", &b[i]);
    }

    // Find the max and min values in both arrays
    int max1 = maximum(n1, a);
    int max2 = maximum(n2, b);
    int min1 = minimum(n1, a);
    int min2 = minimum(n2, b);
    int maxi = (max1 > max2) ? max1 : max2;
    int mini = (min1 < min2) ? min1 : min2;

    // Create an array to use as a hash table
    int size = maxi - mini + 1;
    int c[size];
    for (int i = 0; i < size; i++) {
        c[i] = 0;
    }

    // Hash the elements of the first array
    for (int i = 0; i < n1; i++) {
        c[a[i] - mini]++;
    }

    // Hash the elements of the second array
    for (int i = 0; i < n2; i++) {
        c[b[i] - mini]++;
    }

    // Print the unique elements in sorted order
    for (int i = 0; i < size; i++) {
        if (c[i] != 0) {
            printf("%d ", i + mini);
        }
    }

    return 0;
}
