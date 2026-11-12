public class decreasing_numstars{
    public static void main(String[] args) {
        
        for(int i = 1; i<=6; i++){
            for( int j=6; j>=i; j--){
                System.out.print(6-j+1);
            }
            System.out.println();
        }
    }
}