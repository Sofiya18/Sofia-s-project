package methods;

public class AddToArray {
    public static void main(String[] args) {

    }

    public static String[] increaseArray(String[]arr,String word){
        String [] newArr=new String[arr.length+1];
        for(int i=0; i<arr.length; i++)
            newArr[i]=arr[i];
        newArr[newArr.length-1]=word;
        return newArr;

    }

}
