package test;


class Exam_4673 {
    public static void main(String[] args){
        boolean check[]=new boolean[10001];
        for(int i=1;i<=10000;i++) check[i]=true;
        for(int i=1;i<=10000;i++){
            int n=sn(i);
            if(n<10001) check[n]=false; //출력하지 말라는 뜻으로 false
        }
        for(int i=1;i<=10000;i++){
            if(check[i]!=false) System.out.println(i);
        }
    }
    public static int sn(int n){
        int sum=n;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
