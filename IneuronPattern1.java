public class IneuronPattern1 {
    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < n; i++) {

            //Printing "I" Pattern

            for (int j = 0; j < n; j++) {

                if (i==0 ||i ==n - 1 ||j==(n-1)/2) {
                    System.out.print("*");
                }
                 else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //Printing  N pattern

                for (int j=0;j<n;j++){
                    if(j==0||j==n-1||j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }

                //printing E Pattern
                for (int j =0;j<n;j++){
                    if(i==0||i==n-1||j==0||i==(n-1)/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }


                //printing U pattern

                for (int j =0;j<n;j++){
                    if(j==0||j==n-1||i==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }


                //printing R Pattern
            for (int j =0;j<n;j++){

                if((i==0 && j!=n-1) || j==0 || (j==n-1 && i!=0 && i<(n-1)/2) || (i==(n-1)/2 && j!=n-1) || 2*i-j==(n-1) )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }



            //Printing 0 Pattern
            for(int j =0;j<n;j++){

                if(i==0&& j!=0 &&j!=n-1 || j==0&&i!=0&i!=n-1 || j==n-1&&1!=0&&i!=n-1 ||i==n-1&&j!=0&&j!=n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }


            //printing N pattern
            for (int j=0;j<n;j++){
                if(j==0||j==n-1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }

                System.out.println( );
        }


    }
}







