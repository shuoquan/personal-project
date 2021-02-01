import json
import time

data = {"name": "alice", "age": 12}
# for item in data:
#     print(item)
print(list(data.keys())[0])

# x=[2,5,4]
# y = [0] * 10
# print(y)

# list = [[0,0,0,0,0],[1,0,0,0,0],[0,1,0,0,0],[0,0,1,0,0],[0,0,0,1,1]]
# print(type(list))

timeList = []
start = 0
# while(start<100000000):
#     timeList.append(start)
#     start+=1
# print()

newList = [10, 2, 3]
# newList.reverse()
# newList.sort(key=None, reverse=True)
list1 = [1, 2, 3]
list2 = list1.copy()
list2[1] = 3
str = "123"
print(str.replace("1", "2"))

# for i in range(10000):
#
# start = int(time.time())
# for i in range(1000000000):
#     pass
# end = int(time.time())
# print(end - start)

# start = int(time.time())
# begin = 1000000000
# while begin>0:
#     begin-=1
# end = int(time.time())
# print(end - start)


data = [1, 2, 3, 2]
#
# print(list(map(lambda x:x**2,[1,2,3])))

x, y = 1, 2
[x, y] = [y, x]
print(x, y)
