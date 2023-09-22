public class B extends A{
    int k;
    B(int i,int j, int k){
        super(i,j);
        this.k=k;
    }

    void show(String msg) {
        System.out.println(msg+k);
    }
}