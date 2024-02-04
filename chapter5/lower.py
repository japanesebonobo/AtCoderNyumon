def calculator(N, H):
    ans = 0
    cnt = 0
    i = 0
    j = 1
    while i < N:
        cnt = 0
        while j < N and H[i] - H[j] >= 0:
            cnt += 1
            i += 1
            j += 1
        if ans < cnt:
            ans = cnt
        i = j
        j += 1
    print(ans)

N = int(input())
H = list(map(int, input().split()))

calculator(N,H)