class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        res=[]
        tar=0
        for i in range(1,n+1):
            if tar == len(target):
                break
            res.append("Push")
            if target[tar]==i:
                tar+=1
            else:
                res.append("Pop")
        return res