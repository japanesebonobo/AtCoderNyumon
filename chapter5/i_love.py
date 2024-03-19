from collections import defaultdict

def calculator(N, A, B, C):
    a = defaultdict(int)
    b = defaultdict(int)
    c = defaultdict(int)
    d = 46
    for i in range(N):
        a[(A[i]%d)] += 1
        b[(B[i]%d)] += 1
        c[(C[i]%d)] += 1
    
    ans = 0
    for i in a:
        for j in b:
            for k in c:
                if(i+j+k)%46==0:
                    ans += a[i]*b[j]*c[k]
    print(ans)

N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
C = list(map(int, input().split()))

calculator(N, A, B, C)