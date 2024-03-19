def calculator(N, A, B, C):
    ans = 9999
    for i in range(10000):
        for j in range(10000-i):
            if (N - A*i - B*j)%C == 0 and N - A*i - B*j >= 0:
                k = (N - A*i - B*j)//C
                ans = min(ans, i+j+k)
    return ans

N = int(input())
A, B, C = map(int, input().split())
ans = calculator(N, A, B, C)
print(ans)