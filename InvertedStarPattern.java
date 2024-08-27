public class InvertedStarPattern {
    public static void main(String[] args) {
        int star = 4;
        for(int i = 1; i<=star;i++){
            for(int j=1; j<=star-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
}
