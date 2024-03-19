def calculator(N, S):
    ansSet = set()
    for i in range(N):
        ansSet.add(S[i])
    return len(ansSet)

N = int(input())
S = list(input() for _ in range(N))
ans = calculator(N,S)
print(ans)
