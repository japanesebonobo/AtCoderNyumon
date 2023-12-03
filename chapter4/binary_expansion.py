def bit_count(N):
    sum_digit = 0
    while N > 0:
        sum_digit += N % 2
        N //= 2
    return sum_digit

N = int(input())
ans = bit_count(N)
print(ans)