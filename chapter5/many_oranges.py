def calculator(A, B, W):
    minimum = 10000000
    maximum = 0
    for i in range(1000001):
        if A*i<=1000*W and B*i>=1000*W:
            minimum = min(i, minimum)
            maximum = max(i, maximum)
    if maximum == 0:
        return 0, 0
    return minimum, maximum

A, B, W = map(int, input().split())
min, max = calculator(A, B, W)
if min==0 and max == 0:
    print("UNSATISFIABLE")
else:
    print(min, max)