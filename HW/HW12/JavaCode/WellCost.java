package HW.HW12.JavaCode;
import java.util.*;

public class WellCost{
    
    public int findSet(int target,ArrayList<ArrayList<int[]>> setList){
        for(int i = 0; i < setList.size(); i++){
            ArrayList<int[]> set = setList.get(i);
            for(int[] numsInSet : set){
                for(int num : numsInSet){
                    if(target == num){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {

        ArrayList<int[]> edges = new ArrayList<>();
        ArrayList<ArrayList<int[]>> sets = new ArrayList<>();
        int cost = 0;

        for(int house = 0; house < wells.length; house++){
            int[] x = {0, house + 1, wells[house]};
            edges.add(x);
        }
        
        for(int[] house : pipes){
            edges.add(house);
        }

        Collections.sort(edges, Comparator.comparingInt(a -> a[2]));

        for(int[] set : edges){
            int a = set[0];
            int b = set[1];

            int firstSetIndex = findSet(a, sets);
            int secondSetIndex = findSet(b, sets);

            if(firstSetIndex != -1 && secondSetIndex != -1 && firstSetIndex != secondSetIndex){ 
                sets.get(firstSetIndex).addAll(sets.get(secondSetIndex));
                sets.remove(secondSetIndex);
                cost += set[2];
            }

            else if(firstSetIndex == -1 && secondSetIndex == -1){ 
                ArrayList<int[]> newSet = new ArrayList<>();
                int[] tempSet = {set[0],set[1]};
                newSet.add(tempSet);
                sets.add(newSet);
                cost += set[2];
            }
            else if(firstSetIndex != -1 && secondSetIndex == -1){ 
                int[] tempSet = {set[0],set[1]};
                sets.get(firstSetIndex).add(tempSet);
                cost += set[2];
            }
            else if(firstSetIndex == -1 && secondSetIndex != -1){
                int[] tempSet = {set[0],set[1]};
                sets.get(secondSetIndex).add(tempSet);
                cost += set[2];
            }

            if(sets.size() == 1 && sets.get(0).size() == n){
                break;
            }
        }
                    
        return cost;
    }

    public static void main(String[] args) {
        int houses = 2;
        int[] wells = {1,1};
        int[][] pipes = {{1,2,1}, {1,2,2}};

        WellCost test = new WellCost();
        System.out.println("Test 1: " + test.minCostToSupplyWater(houses, wells, pipes)); 

        int houses2 = 3;
        int[] wells2 = {3,3,3};
        int[][] pipes2 =  {{1,3,2},{1,1,4},{2,3,4}};
        System.out.println("Test 2: "+ test.minCostToSupplyWater(houses2, wells2, pipes2)); 
    }
}