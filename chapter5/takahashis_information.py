def calculator(C):
    ans = "No"
    for i in range(101):
        for j in range(101):
            for k in range(101):
                a = []
                b = []
                a.append(i)
                a.append(j)
                a.append(k)
                b.append(int(C[0][0]) - a[0])
                b.append(int(C[1][1]) - a[1])
                b.append(int(C[2][2]) - a[2])
                count = 0
                for l in range(3):
                    for m in range(3):
                        if a[l]+b[m]==int(C[l][m]):
                            count+=1
                if count==9:
                    ans = "Yes"
                    return ans
    return ans

C = list(input().split() for _ in range(3))
ans = calculator(C)
print(ans)

