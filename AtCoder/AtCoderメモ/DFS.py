W, N = map(int, input().split())
A = []

visited = [[False for _ in range(W)] for _ in range(2)]

for i in range(2):
    tmp = list(map(int, input().split()))
    A.append(tmp)

# targetは探索しているもの

def dfs(grid, row, col, target):
    if(row < 0 or col < 0 or row >= len(grid) or col >= len(grid[0]) or grid[row][col] != target):
        return
    
    if(visited[row][col] == True):
        return

    # このセルを訪れたことをマーク
    visited[row][col] = True

    dfs(grid, row+1, col, target)
    dfs(grid, row, col+1, target)
    dfs(grid, row-1, col, target)
    dfs(grid, row, col-1, target)

def count_islands(grid):
    if not grid or not grid[0]:
        return 0

    rows, cols = len(grid), len(grid[0])
    island_count = 0

    for i in range(rows):
        for j in range(cols):
            if visited[i][j] == False:
                print(i,j)
                island_count += 1
                dfs(grid, i, j, grid[i][j])

    return island_count
    
print(count_islands(A))

