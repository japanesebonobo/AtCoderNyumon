def calculator(N, P, Q, A):
    ans = 0
    for i in range(N):
        for j in range(i):
            for k in range(j):
                for l in range(k):
                    for m in range(l):
                        if (A[i]*A[j]*A[k]*A[l]*A[m]%P==Q):
                            ans+=1
    return ans

N, P, Q = map(int, input().split())
A = list(map(int, input().split()))
ans = calculator(N, P, Q, A)
print(ans)
