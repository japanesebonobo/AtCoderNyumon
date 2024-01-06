from collections import defaultdict

def calculator(N, s):
    num = defaultdict(list)
    for i in range(N):
        s[i] = "".join(sorted(s[i]))

    for i in s:
        num[i].append(1)

    ans = 0
    for i in num:
        n = len(num[i])
        ans += n * (n - 1) // 2
    return ans

N = int(input())
s = [input() for _ in range(N)]
ans = calculator(N, s)
print(ans)