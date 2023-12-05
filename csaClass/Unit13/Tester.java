package csaClass.Unit13;
public class Tester {

    public static void main(String args[]) {
        int[] n= {1, 2, 3, 5, 5, 6, 7, 8, 9};
        selectionFind s = new selectionFind();
        binarySearch b = new binarySearch();

        System.out.println(s.sort(n, 4));
        System.out.println(b.bsort(n, 4, 0, n.length-1));


    }
    static class selectionFind {
        int key = 0;
        public int sort(int[] list, int find){

            if(key >= list.length-1){
                return -1;
            }
            else if(list[key] == find){
                return key;
            }
            else{
                key++;
                return sort(list, find);
            }
        }
    }
    static class binarySearch{

        public int bsort(int[] list, int search, int min, int max){

            int middle = ((min+max) /2);

            if(list[middle] == search){
                return middle;
            }
            else if(middle > max || middle < min){
                return -1;
            }
            else{
                if(search > list[middle] ){
                    return bsort(list, search, middle+1, max);
                }
                else{
                    return bsort(list, search, min, middle-1);
                }
            }
        }
    }
}


