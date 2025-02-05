package collection

def nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 3]
println nums
println nums.class

nums[0] = 11
nums << 99
def numsAdded = nums + 77
println nums
println numsAdded

assert [1, 3, 5, 7, 9, 5] - 5 == [1, 3, 7, 9]
assert ([1, 3, 5, 7, 9, 5] << 9) == [1, 3, 5, 7, 9, 5, 9]

assert [1, 5, 2, 4, 3].sort() == [1, 2, 3, 4, 5]
assert [1, 5, 2, 4, 3, 3, 1] as SortedSet == [1, 2, 3, 4, 5] as Set
