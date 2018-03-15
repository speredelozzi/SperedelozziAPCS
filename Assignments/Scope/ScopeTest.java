class ScopeTest {
        // public static String message = "Hello";
        // public static Boolean shouldLoop = false;
        // public static int i = -1;
        // public static int n = -1;

        // public static void main(String args[]) {
            // while(i <= 10) {
            //     n = i * 2;
            //     System.out.println(n);
            //     i++;
            // }

            // if(n > 10) {
            //     String message = "Hello World";
            //     System.out.println(message);
            // }

            // Boolean shouldLoop = true;
            // i = 0;
            // while(shouldLoop) {
            //     if(i < 10) {
            //         System.out.println(message);                    
            //     } else {
            //         shouldLoop = false;
            //     }
            //     i++;
            // }

        // String message = "Hello World";
        // int i;
        // for(i = 0; i < message.length(); i++) {
        //     if(message.charAt(i) == 'W') {
        //         break;
        //     }
        // }
        // System.out.println("W found at index " + i);
        // }

// class Powers {
    
    public static final int n = 32;
    public static int base = 2;

    public static void main(String[] args) {
        for(int i = 0; i <= n; i++) {
            power(i);            
        }
    }

    public static double power(int i) {
        double x = Math.pow( base , i );
        System.out.println(x);
        return x;
    }
}
    