class Solution {
    public void rotate(int[] arr, int k) {
        if(arr.length == 1) return;

        k = k%arr.length;
        
        int z = arr.length-k;

        int a = 0;
        int b = z-1;

        while(a<=b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        int c = z;
        int d = arr.length-1;

        while(c<=d){
            int temp = arr[c];
            arr[c] = arr[d];
            arr[d] = temp;
            c++;
            d--;
        }

        int x = 0;
        int y = arr.length-1;

        while(x<=y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }

        return ;
    }
}