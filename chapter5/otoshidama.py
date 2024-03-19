def calculator(N, Y):
    for i in range(N+1):
        for j in range(N+1):
            k = N - i - j
            if (k >= 0):
                if (10000*i+5000*j+1000*k==Y):
                    return i, j, k
    return -1, -1, -1
    
N, Y = map(int, input().split())
a, b, c = calculator(N, Y)
print(a, b, c)
