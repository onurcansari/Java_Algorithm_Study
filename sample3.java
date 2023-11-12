
public class sample3 {
    public static void main(String[] args) {
        int A[] = { 5, 62, 8, 65, 222, 785, 2, 1, 557, 95, -8, -852, 455 };
        int eB = A[0];
        int eK = A[0];
        int Bk = 0;
        int Kk = 0;
        for (int i = 0; i < A.length; i++) {
            if (eB < A[i]) {
                eB = A[i];
                Bk = i;
            } else if (eK > A[i]) {
                eK = A[i];
                Kk = i;
            }
        }
        A[Kk] = eB;
        A[Bk] = eK;
        for (int j = 0; j <A.length; j++){
            System.out.println(" " + A[j]); //accuracy check
        }
    }
}
