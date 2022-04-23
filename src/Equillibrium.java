public class Equillibrium {
    public String equib(int arr[][],int k ){
        int x=0,y=0,z=0;
        for (int i =0;i<k;i++){
            x+=arr[i][0];
            y+=arr[i][1];
            z+=arr[i][2];
        }
        if(x==0 && y==0 && z==0)
            return "YES";
        else
            return "NO";

    }
}
