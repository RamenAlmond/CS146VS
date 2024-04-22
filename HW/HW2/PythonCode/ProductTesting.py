class ProductTesting:
    def firstBadVersion(self, version):
        start = 1
        end = version
        firstBad = -1
        while start <= end:
            mid = (start + end)/2
            if isBadVersion(mid):
                firstBad = mid
                end = mid - 1
            else:
                start = mid + 1
        return firstBad