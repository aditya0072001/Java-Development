
class Add{
  int res[]= new int[10];
  int sum;

  void sumT(int a[],int b[]){
    for(int i=0;i<9;i++){
      sum=a[i]+b[i];
     //System.out.println(sum);
      if(sum>=10){
        int temp=sum%10;
       // System.out.println(temp);
         res[i]=res[i]+temp;
         res[i+1]=res[i+1]+1;
      }else{
      // System.out.println(sum);
        res[i]=sum;
      }
    }
    for(int i=0;i<res.length;i++){
      System.out.println(res[i]);
    }
  }
}

class TenDigit{
    public static void main(String[] args){
        Add a = new Add();
       int t1[]=new int[]{9,9,9,9,9,9,9,9,9};
       int t2[]=new int[]{9,9,9,9,9,9,9,9,9};
        a.sumT(t1,t2);
    }
}

