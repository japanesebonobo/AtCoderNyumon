def calculator(N,A):
    i = 0
    ans = 0
    while i < N-1:
        j = i + 1
        if A[i] == A[j] and i != j:
            ans+=1
            i = j + 1
        else:
            i = j
    print(ans)


N = int(input())
A = list(map(int,input().split()))
calculator(N,A)