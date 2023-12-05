package Unit13;

public class selectionFind {
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
