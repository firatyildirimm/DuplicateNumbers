public class DuplicateNumbers {
    static boolean isFind(int[] arr , int value){
      for(int i : arr){
          if(i == value){
              return true;
          }
      }
      return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,56,5,1,3,5,4,5,2,2,6,6,6,8,7,9,4,5};
        int[] duplicate = new int[array.length];
        int startIndex=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if((i!=j && array[i]==array[j]) && array[i]%2 ==0 ){
                    if(!isFind(duplicate, array[i])){
                        duplicate[startIndex++]=array[i];
                        break;
                    }

                }
            }
        }

        for(int i=0;i< duplicate.length;i++){
            if(duplicate[i] != 0){
            System.out.println(duplicate[i]);
        }}
    }
}
