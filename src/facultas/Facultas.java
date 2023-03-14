package facultas;

public abstract class Facultas {
    public static int calculatefaculty(int i){
        if(i==0 || i==1) return 1;
        return i*calculatefaculty(i-1);
    }
}
