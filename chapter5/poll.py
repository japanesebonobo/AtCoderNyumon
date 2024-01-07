from collections import defaultdict

def calculator(N, S):
    result = defaultdict(int)
    for i in S:
        result[i] +=1
    mx = max(result.values())
    ans = []
    for i in result.keys():
        if result[i] == mx:
            ans.append(i)
    ans.sort()
    print(*ans)

N = int(input())
S = list(input() for _ in range(N))
calculator(N,S)