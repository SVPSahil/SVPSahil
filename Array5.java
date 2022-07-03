public class Array5 
{
    public static void main(String[] args)
    {
        int[] list={3,4,5,2,6,7,2,7,9};
        int n=list.length;
        int[] list1=new int[n];
        for(int i=0;i<n;i++){
            list1[i]=list[i];
        }
        System.out.println("your orignal array is....");
        for(int i=0;i<n;i++){
            System.out.print(list[i]+"\t");
        }
        System.out.println("\nyour coppied array is....");
        for(int i=0;i<n;i++){
            System.out.print(list1[i]+"\t");
        }
    }  
}
