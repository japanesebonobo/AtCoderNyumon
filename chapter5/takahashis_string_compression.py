def calculator(s):
    i = 0
    ans = []
    while i < len(s):
        j = i
        cnt = 0
        while j < len(s) and s[j] == s[i]:
            cnt += 1
            j += 1
        ans.append(s[i]+str(cnt))
        i = j
    print("".join(ans))


s = input()
calculator(s)