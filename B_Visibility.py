H, W, X, Y = map(int, input().split())
squares = [list(input()) for _ in range(H)]
counter = -1

column = ''
for i in range(H):
    column += squares[i][Y-1]

for ii in range(len(column)):
    if '#' not in column[min(ii, X-1):max(ii, X-1)+1]:
        counter += 1

row = ''
for j in range(W):
    row += squares[X-1][j]

for jj in range(len(row)):
    if '#' not in row[min(jj, Y-1):max(jj, Y-1)+1]:
        counter += 1

print(counter)