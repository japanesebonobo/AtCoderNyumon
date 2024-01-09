def calculator(N,A):
    result = set()
    for i in range(N):
        size = len(result)
        result.add(A[i])
        if size + 1 != len(result):
            result.remove(A[i])
    print(len(result))

N = int(input())
A = list(int(input()) for _ in range(N))
calculator(N,A)