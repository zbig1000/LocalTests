package MyLists;

public class PtrListLen {

    public static class Solution {
        public int solution(IntList L) {
            int countedSize=0;
            IntList tempIntList = L;
            while (tempIntList != null) {
                countedSize++;
                tempIntList = tempIntList.getNext();
            }
            return countedSize;
        }
    }

    public static void main(String[] args) {
        IntList int4 =  new IntList(44, null);
        IntList int3 =  new IntList(33, int4);
        IntList int2 =  new IntList(22, int3);
        IntList int1 =  new IntList(11, int2);

        System.out.println(new Solution().solution(int1));
    }
}
