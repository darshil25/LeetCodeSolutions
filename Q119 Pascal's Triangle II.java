class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();

       list.add(1);
       long previous = 1;
       for( int i=1; i<=rowIndex; i++){
           long next = previous*(rowIndex - i +1) / i;
           list.add((int) next);
           previous = next;
       }
        return list;
    }
}
