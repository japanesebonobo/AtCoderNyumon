from collections import defaultdict

def calculator(N, A):
    ans = 0
    d = defaultdict(int)
    for i in range(N):
        d[A[i]%200] += 1
    for X in range(200):
        ans += d[X]*(d[X]-1)//2
    print(ans)

N = int(input())
A = list(map(int, input().split()))
d = defaultdict(int)
calculator(N, A)