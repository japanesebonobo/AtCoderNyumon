# 十分に大きい値
INF = 2 ** 30

N = int(input())
x = list(map(int, input().split()))
y = list(map(int, input().split()))

minimum_dist = INF

for i in range(N):
    for j in range(i+1, N):
        dx, dy = x[i] - x[j], y[i] - x[j]
        dist = dx ** 2 + dy ** 2

        minimum_dist = min(minimum_dist, dist)

print(minimum_dist)
