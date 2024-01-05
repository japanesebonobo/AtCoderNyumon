import math

def calculate(A, B, C, X, Y):
    minimum = 10000000000
    for i in range(max(X,Y)*2+1):
        sum = C*i
        if i/2 < X:
            sum+=A*math.ceil(X-i/2)
        if i/2 < Y:
            sum+=B*math.ceil(Y-i/2)
        minimum = min(minimum, sum)
    return minimum

A, B, C, X, Y = map(int, input().split())
ans = calculate(A, B, C, X, Y)
print(ans)
