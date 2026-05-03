#include <stdio.h>
#include <unistd.h>
int main() {
    printf("Hello from Rini's embedded build!\n");
    printf("PID: %d\n", getpid());
    return 0;
}

