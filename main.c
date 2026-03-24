#include <stdio.h>

int main() {
    char name[50];
    int units;

    printf("Enter student name: ");
    scanf("%s", name);

    printf("Enter number of registered units: ");
    scanf("%d", &units);

    if (units > 7) {
        printf("Overload - Approval Required\n");
    } else {
        printf("Registration Accepted\n");
    }

    printf("\n--- Registration Summary ---\n");
    printf("Student: %s\n", name);
    printf("Units: %d\n", units);

    return 0;
}