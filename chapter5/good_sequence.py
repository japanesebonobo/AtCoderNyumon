from collections import defaultdict

def calculator(N, a):
    result = defaultdict(list)
    for i in range(N):
        result[a[i]].append(1)
    keys = result.keys()
    ans = 0
    for i in keys:
        if(i < len(result[i])):
            ans += len(result[i]) - i
        if(i > len(result[i])):
            ans += len(result[i])
    print(ans)

N = int(input())
a = list(map(int,input().split()))
calculator(N, a)