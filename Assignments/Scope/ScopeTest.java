 class ScopeTest {

        public static String message = "Hello";
        public static Boolean shouldLoop = false;
        public static int i;

        public static void main(String args[]) {
            // while(i <= 10) {
            //     int n = i * 2;
            //     System.out.println(n);
            //     i++;

            //     if(n > 10) {
            //         String message = "Hello World";
            //         System.out.println(message);
            //     }
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
            String message = "Hello World";
            for(int i = 0; i < message.length(); i++) {
                if(message.charAt(i) == 'W') {
                    break;
                }
            }
            int i = 6;
            System.out.println("W found at index " + i);
        }
    }
        