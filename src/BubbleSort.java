
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int data[]=new int[9];//={4,2,9,7,5,8};
            int temp=0;
            for(int k=0;k<data.length-1;k++){
                data[k]=(int) (Math.random()*20+10);
            }
             for(int x=0;x<data.length-1;x++){
                System.out.print(data[x]+" ");
            }
        System.out.println("");
            try{
            for(int i=0;i<data.length-1;i++){
                for(int j=i+1;j<data.length-1;j++){
                   if(data[i]>data[j]){
                       temp=data[i];
                       data[i]=data[j];
                       data[j]=temp;
                   } 
                }
                //for(int x=0;x<data.length-1;x++){
               // System.out.print(data[x]+" ");
           // }
            }
            }catch(ArrayIndexOutOfBoundsException ar){
            }
            try{
            for(int x=0;x<data.length-1;x++){
                System.out.print(data[x]+" ");
            }
        
        
    }catch(ArrayIndexOutOfBoundsException are){
        
    }
    
}}
