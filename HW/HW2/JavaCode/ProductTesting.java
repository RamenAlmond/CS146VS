package HW.HW2.JavaCode;

public class ProductTesting {
    public int firstBadVersion(int version){
        int start = 1;
        int end = version;
        int firstBad = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(isBadVersion(mid)){
                firstBad = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return firstBad;
    }
}
