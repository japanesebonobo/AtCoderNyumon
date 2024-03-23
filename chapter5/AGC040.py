def calculator(S):
    a = [0] * (len(S)+1)
    for i in range(len(S)):
        if S[i] == '<':
            a[i+1] = max(a[i]+1,a[i+1])
    for i in range(len(S)):
        if S[len(S)-i-1] == '>':
            a[len(S)-i-1] = max(a[len(S)-i-1],a[len(S)-i]+1)

    ans = sum(a)
    return ans

S = input()
ans = calculator(S)
print(ans)