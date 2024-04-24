from typing import List


class WellCost:

    def findSet(target,setList):
        for i in range(len(setList)):
            set = setList[i]
            for numsInSet in set:
                for num in numsInSet:
                    if target == num:
                            return i
        return -1
    
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        edges = []
        sets = []
        cost = 0

        for house in range(len(wells)):
            edges.append([0,house + 1, wells[house]])
        
        for house in pipes:
            edges.append(house)
        
        edges.sort(key=lambda x: x[2])

        for set in edges:
            a = set[0]
            b = set[1]

            firstSetIndex = WellCost.findSet(a,sets)
            secondSetIndex = WellCost.findSet(b, sets)

            if firstSetIndex != -1 and secondSetIndex != -1 and firstSetIndex != secondSetIndex:
                sets[firstSetIndex].extend(sets[secondSetIndex])
                sets.pop(secondSetIndex)
                cost += set[2]

            elif firstSetIndex == -1 and secondSetIndex == -1:
                newSet = [[set[0],set[1]]]
                sets.append(newSet)
                cost += set[2]
            
            elif firstSetIndex != -1 and secondSetIndex == -1:
                sets[firstSetIndex].append([set[0],set[1]])
                cost += set[2]
            
            elif firstSetIndex == -1 and secondSetIndex != -1:
                sets[secondSetIndex].append([set[0],set[1]])
                cost += set[2]
            
            if len(sets) == 1 and len(sets[0]) == n:
                break
        
        return cost
    
test = WellCost()
houses = 2
wells = [1,1]
pipes = [[1,2,1], [1,2,2]]

print("Test 1: " + str(test.minCostToSupplyWater(houses,wells,pipes)))

houses = 3
wells = [3,3,3]
pipes = [[1,3,2],[1,1,4],[2,3,4]]

print("Test 2: " + str(test.minCostToSupplyWater(houses,wells,pipes)))