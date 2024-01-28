class first{

    public static void main(String[] args){
        System.out.println("Welcome to java");
            series2();

        
    }

    public static void series1(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
            

        }
    }

    public static void series2(){
        int n=5;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(val);
                val++;
                
            }
            System.out.println();
            

        }
    }
}