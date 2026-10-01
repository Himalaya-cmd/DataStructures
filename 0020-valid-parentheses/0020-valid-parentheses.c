// bool isValid(char* s) {
    
// }
#include <stdbool.h>
#include <string.h>

#define MAX_STACK_SIZE 10000

// Stack implementation for storing brackets
char stack[MAX_STACK_SIZE];
int top = -1;

int ismatching(char a, char b) {
    if (a == '(' && b == ')') return 1;
    if (a == '{' && b == '}') return 1;
    if (a == '[' && b == ']') return 1;
    return 0;
}

bool isValid(char* s) {  // LeetCode ke liye return type `bool`
    char stack[MAX_STACK_SIZE];
    top = -1;  // Reset stack for each function call
    int n = strlen(s);
    
    for (int i = 0; i < n; i++) {
        char current = s[i];
        if (current == '(' || current == '{' || current == '[') {
            stack[++top] = current;  // Stack push
        } else {
            if (top == -1 || !ismatching(stack[top], current)) {
                return false;  // Unbalanced case
            }
            top--;  // Stack pop
        }
    }
    return top == -1;
}
