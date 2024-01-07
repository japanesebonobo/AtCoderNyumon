from collections import defaultdict

def calculator(N,S):
    tmp = defaultdict(list)
    for i in range(N):
        tmp[S[i]].append(1)
        if len(tmp[S[i]]) == 1:
            print(i+1)

N = int(input())
S = list(input() for _ in range(N))
calculator(N,S)