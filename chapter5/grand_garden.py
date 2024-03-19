from collections import defaultdict

def calculator(N, h):
    ans = 0
    active = 0
    for i in range(N):
        if h[i] > active:
            ans += h[i] - active
        active = h[i]
    return ans

N = int(input())
h = list(map(int, input().split()))
ans = calculator(N, h)
print(ans)