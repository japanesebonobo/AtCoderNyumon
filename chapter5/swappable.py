from collections import defaultdict

def calculator(N, A, d):
    d = defaultdict(int)
    ans = N*(N-1)//2

    for i in range(N):
        d[A[i]] += 1
    
    for i in d.values():
        equals = i*(i-1)//2
        if equals > 0:
            ans -= equals
    print(ans)

N = int(input())
A = list(map(int,input().split()))
calculator(N,A)