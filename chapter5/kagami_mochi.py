def calculator(N, d):
    d.sort()
    ans = 1
    for i in range(1, N):
        if (d[i-1] != d[i]):
            ans+=1
    return ans    

N = int(input())
d = [int(input()) for _ in range(N)]
ans = calculator(N, d)
print(ans)