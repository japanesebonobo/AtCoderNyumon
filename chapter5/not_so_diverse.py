from collections import defaultdict
def calculator(N,K,A):
    A.sort()
    data = defaultdict(list)
    for i in range(N):
        data[A[i]].append(1)
    
    counter = 0
    num = []
    for i in data:
        if (len(data.get(i))>=1):
            counter +=1
            num.append(len(data.get(i)))
    ans = counter - K 
    if ans<0:
        ans = 0
    num.sort()
    result = 0
    for i in range(ans):
        result += num[i]
    return result

N, K = map(int,input().split())
A = list(map(int, input().split()))

ans = calculator(N,K,A)
print(ans)