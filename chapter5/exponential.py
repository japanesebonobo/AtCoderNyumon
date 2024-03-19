def calculator(X):
    max = -1
    if (X == 1):
        return 1
    for i in range(1, X):
        for j in range(2, X):
            Y  = i**j
            if (Y > X):
                break
            if (Y >= max):
                max = Y
    return max

X = int(input())
ans = calculator(X)
print(ans)