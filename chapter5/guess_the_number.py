def calculator(N, M, s, c):
    ans = 1000
    for i in range(1000):
        flag = True
        num = str(i)
        if len(num) != N:
            continue
        for j in range(M):
            for k in range(N):
                if k+1 == s[j] and int(num[k]) != c[j]:
                    flag = False
        if flag:
            ans = min(ans, i)
    if ans == 1000:
     return -1
    return ans   


N, M = map(int, input().split())
S = []
C = []
for i in range(M):
    s, c = map(int, input().split())
    S.append(s)
    C.append(c)
ans = calculator(N, M, S, C)
print(ans)