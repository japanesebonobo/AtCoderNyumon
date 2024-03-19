def calculator(S):
    ope = [[0,0,0],[0,0,1],[0,1,0],[0,1,1],[1,0,0],[1,0,1],[1,1,0],[1,1,1]]
    for i in range(len(ope)):
        sum = S[0]
        for j in range(3):
            if (ope[i][j] == 1):
                sum += S[j+1]
            else:
                sum -= S[j+1]
        if sum == 7:
            ans = ""
            for k in range(len(S)):
                element = str(S[k])
                if k == 1 or k == 2 or k == 3:
                    if ope[i][k-1]==1:
                        ans += "".join("+"+element)
                    else:
                        ans += "".join("-"+element) 
                else:
                    ans += "".join(element)
            ans += "=7"
            return ans

S = list(map(int, input()))
ans = calculator(S)
print(ans)