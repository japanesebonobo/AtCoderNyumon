def calculator(N,S):
    ans = 0
    i = 0
    while i < N:
        j = i
        while j < N and S[j]==S[i]:
            j+=1
        ans+=1
        i = j

    print(ans)

N = int(input())
S = input()
calculator(N,S)