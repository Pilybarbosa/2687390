public class MisArrays {
    public static void main(String[] args) {
        int [] vector1=new int[10];
        int [] vector={,30,50,25,85,12,6,32,41,23,63};
        vector1[6]=32;
        for (int p = 0; p<=vector.length; p++) {
            System.out.println(vector[p]+" ");
        } for (int i : vector) {
            System.out.println(i);
        }
    }
}
