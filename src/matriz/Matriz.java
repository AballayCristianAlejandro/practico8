
package matriz;


public class Matriz {
        
    public void armar(){
    int [][]arr=new int[4][];
    
      arr [0] = new int [4];
      arr [1] = new int [3];
      arr [2] = new int [5];
      arr [3] = new int [2];
      
      arr[0][0]=3;
      arr[0][1]=6;
      arr[0][2]=9;
      arr[0][3]=12;
      
      arr[1][0]=15;
      arr[1][1]=18;
      arr[1][2]=21;
      
      arr[2][0]=24;
      arr[2][1]=27;
      arr[2][2]=30;
      arr[2][3]=33;
      arr[2][4]=36;
      
      arr[3][0]=39;
      arr[3][1]=42;

      for (int f=0;f<arr.length;f++){
          
          for(int c=0;c<arr[f].length;c++){
              
               if(arr[f][c]%2==0){
               System.out.print(arr[f][c]+" ");
               }
          }
          System.out.println("");
      }
      
    
    }
    
}
