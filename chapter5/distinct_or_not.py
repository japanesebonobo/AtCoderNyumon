def calculator(N, A):
    ans = "YES"
    tmp = set()
    for i in range(N):
        tmp.add(A[i])
    if len(A) != len(tmp):
        ans = "NO"
    return ans

N = int(input())
A = list(map(int, input().split()))
ans = calculator(N, A)
print(ans)