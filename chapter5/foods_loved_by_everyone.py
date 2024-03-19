from collections import defaultdict

def calculator(N, M, data):
    counter = defaultdict(list)
    ans = 0
    for i in range(N):
        for j in range(len(data[i])):
            counter[data[i][j]].append(1)
    for i in range(M):
        if counter.get(i+1) != None and len(counter.get(i+1)) == N:
            ans +=1
    return ans

N, M = map(int, input().split())
data = []
for i in range(N):
    row_input = input().split()
    K = int(row_input[0])
    row_elements = list(map(int, row_input[1:K+1]))
    data.append(row_elements)
ans = calculator(N,M,data)
print(ans)