package Patterns;



class NamePattern {
    NamePattern(){}
    public void PrintC(){
        int i,j,m=5,n=5;
        for(i=1; i<=m; i++){
            for(j=1;j<=n; j++){
                if (i == 1 || j == 1 || i == m) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PrintH() {
        int i,j,m=5,n=5;
        for(i=1; i<=m; i++){
            for(j=1;j<=n; j++){
                if (j == 1 || j == n || i == m - 2) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
    }

    public void PrintE() {
        int i,j,m=5,n=5;
        for(i=1; i<=m; i++){
            for(j=1;j<=n; j++){
                if (i == 1 || j == 1 || i == m || i == 3 ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PrintT() {
        int i,j,m=5,n=5;
        for (i = 1; i <=m; i++) {
            for(j=1; j<=n; j++){
                if (i == 1 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PrintA() {
        int i,j,m=5,n=5;
        for (i = 1; i <=m; i++) {
            for(j=1; j<=n; j++){
                if (i == 1 || j == 1  || i == m - 2 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PrintN() {
      int n = 5;
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              if( j==0 || j==n-1 || i == j )
              {
              System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
          }
          System.out.println();
      }
    }
    public static void main(String[] args) {
       //ArrayList<void> list = new ArrayList<void>();
    }
        
}
