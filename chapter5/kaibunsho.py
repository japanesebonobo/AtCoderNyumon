def calculator(n,S):
    ans = []
    for i in "abcdefghijklmnopqrstuvwxyz":
        t = []
        for j in S:
            t.append(j.count(i))
        ans.append(i*min(t))
    print("".join(ans))

n = int(input())
S = [input() for _ in range(n)]
calculator(n,S)