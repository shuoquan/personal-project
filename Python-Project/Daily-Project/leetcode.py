# leetcode 1582
class Solution:
    def numSpecial(self, mat) -> int:
        columnList = [0] * len(mat[0])
        total = 0
        for index in range(len(columnList)):
            sum = 0
            for row in mat:
                sum += row[index]
            columnList[index] = sum
        for row in mat:
            targetList = []
            for index in range(len(row)):
                if row[index] == 1:
                    targetList.append(index)
            if len(targetList) == 1:
                for target in targetList:
                    if columnList[target] == 1:
                        total += 1
        return total




if __name__ == '__main__':
    solution = Solution()
    target = [[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,1,0,0,0],[0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,0,1,0],[0,0,0,1,0,0,0,0,0,1],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,1,0,0,0,0]]    # print(len(target))
    result = solution.numSpecial(target)
    print(result)