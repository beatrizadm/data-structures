def binarySearch(vector, target, left, right):
        if (left <= right and len(vector) != 0):
            mid = (left + right) / 2
            atual = vector[mid]
            if (atual == target): 
                return atual

            elif (atual < target):
                return binarySearch(vector, target, mid + 1, right)
            elif (atual > target):
                return binarySearch(vector, target, left, mid - 1)
        return -1