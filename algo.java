import java.math.MathContext;
import java.util.Arrays;

public class Main {
    //one
 static int centered(int[] arr){
     int midIndex=(int) Math.floor(arr.length/2);
     int middleVal=arr[midIndex];
     Boolean isValid=true;
     if (arr.length%2==0 ||arr.length==0) return 0;
     for( int i=0; i<arr.length;i++){
         if(i==midIndex) continue;
         if(arr[i]<=middleVal) isValid=false;
     }
     return isValid? 1:0;
 }
 //two
 static int f(int[ ] a){
     int even=0;
     int odd=0;
     for( int i=0;i<a.length;i++){
         if(a[i]%2==0) even+=a[i];
         else odd+=a[i];
     }
     return odd-even;
 }
 //three
 static char[ ] f3(char[ ] a, int start, int len){
     int alen=a.length;
     if(len>alen-start || start<0 ||len<0) return null;
     char[] na=new char[len];
     for(int i=0;i<len;i++){
           na[i]=a[start+i];
     }
     return na;
 }
 static int f4(int n){ /* reverse the integer.*/
     String str=Integer.toString(n);
     String tot="";
     if(n<0) str=str.substring(1);//
     for(int i=str.length()-1;i>=0;i--){
         tot+= str.charAt(i) ;
     }
     if(n<0) tot="-"+tot;
     n=Integer.parseInt(tot);//
     return n;
 }//end
 static int[] f5(int[] first, int[] second){
     if(first ==null || second==null) return null;
     else if(first.length==0 || second.length==0) return new int[] {};
     else {
         int [] shrt;int[] lng;int[] temp;
         if(first.length>second.length){
             shrt=second;
             lng=first;
         }else{
             shrt=first;
             lng=second;
         }//end;
         temp=new int[shrt.length];int mismatch=0;
         for(int i=0;i<shrt.length;i++){
             for(int j=0;j<lng.length;j++){
                 if(shrt[i]==lng[j]) {
                     temp[i]=shrt[i];
                 }else mismatch++;
             }
         }
         int [] retunVal=new int[temp.length-mismatch];
         int jmp=0;
         for( int i=0;i<temp.length;i++){
             if(temp[i]!=0){
                 retunVal[temp.length-i-jmp-mismatch]=temp[i];
             }else{
                 jmp++;
             }
         }
         /*
         * {0,1,0,0,0,12},
         *
         *
         * */
         //System.out.println(Arrays.toString(temp)+temp.length);
         return temp;
         }
     }
 static int f7(int[] a){
     //point of equilibrium
     int [] lt;int [] rt;int pos=-1;//left and right sub array from the point of equilibrium.
     if(a==null||a.length==0) return pos;
     for(int i=0;i<a.length;i++){
         if(i==0) continue;
         else{
             lt=Arrays.copyOfRange(a,0,i);
             rt=Arrays.copyOfRange(a, i+1,a.length);
             int sumlt=0;int sumrt=0;
             for(int elem:lt ){
                 sumlt+=elem;
             }
             for(int elem:rt){
                 sumrt+=elem;
             }
             if(sumlt==sumrt) {
                 pos=i;
                 break;
             }
         }
     }
     return pos;
 }


 public static void main(String[] args){


     int val=Main.centered(new int[]{3, 3, 4, 4});
     int f=Main.f(new int[]{});
     char[] na=Main.f3(new char[]{'a', 'b', 'c'}, -3, 3);
     int[] ints=new int[]{1,2,3,4,5,6};
   System.out.print("the array is: "+ Main.f7(new int[]{1, 8, 3, 7, 10, 2})) ;
   //System.out.print("the array is: "+ Arrays.toString(Main.f5(new int[] { 4,5,10,11}, new int[] {1,2,3,4,5}))) ;//two large arrays.


 }
}
