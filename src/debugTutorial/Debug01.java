package debugTutorial;

public class Debug01 {
    public static void main(String[] args) {
        dongu1();
    }
    public static void dongu1(){
        int y=0;
        for (int i=1;i<=10 ;i++){
            System.out.print(i+" ");
            y+=i*2;
        }
        dongu2();
        dongu3();
    }
    public static void dongu2(){
        for (int x=1;x<=5 ;x++){
            System.out.print(x+" ");
        }

}
    public static void dongu3(){
        for (int y=1;y<=2 ;y++){
            System.out.print(y+" ");
        }

}

}
