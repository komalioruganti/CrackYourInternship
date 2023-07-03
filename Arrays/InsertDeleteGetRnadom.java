//https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/

class RandomizedCollection {
    public ArrayList<Integer> a;
 
     public RandomizedCollection() {
         a = new ArrayList<>();
     }
     
     public boolean insert(int val) {
         boolean ans = a.contains(val);
         a.add(val);
         return !ans;
     }
     
     public boolean remove(int val) {
         boolean ans = a.contains(val);
         if(a.contains(val)){
             for(int i = 0;i<a.size();i++){
                 if(a.get(i) == val){
                     a.remove(i);
                     break;
                 }
             }
         }
         return ans;
     }
     
     public int getRandom() {
         int ans = 0;
         Random rand = new Random();
         int rand1 = rand.nextInt(a.size());
         if(a.size()>0){
             ans = a.get(rand1);
         }
     return ans;
     }
 }
 
 /**
  * Your RandomizedCollection object will be instantiated and called as such:
  * RandomizedCollection obj = new RandomizedCollection();
  * boolean param_1 = obj.insert(val);
  * boolean param_2 = obj.remove(val);
  * int param_3 = obj.getRandom();
  */