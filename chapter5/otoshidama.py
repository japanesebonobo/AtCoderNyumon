def calculator(N, Y):
    for i in range(N+1):
        for j in range(N+1):
            if (Y == 10000*i+5000*j+1000*(N - i - j)):
                    a, b, c = i, j, N - i - j
                    return a, b, c

N, Y = map(int, input().split())
a, b, c = calculator(N, Y)
print(a, b, c)
