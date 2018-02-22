class Loops {
    public static void main(String[] args) {
        // int n = 1;
        // while(n < 100) {
        //     System.out.println(n);
        //     n *= 5;
        // } //prediction: print 1,5,25
    
        // int n = 19;
        // while(n % 2 == 0) {
        //     System.out.println(n);
        //     n--;        
        // } //prediction: 9,8,7,6,5,4,3,2,1,0

        // int n = 1;
        // while(n < 100) {
        //     System.out.println(n);
        //     n += n;        
        // } //prediction: 1,2,4,8,16,32,64

        // Boolean shouldLoop = true;
        // int n = 0;
        // while(shouldLoop) {
        //     if(n == 20) {
        //         shouldLoop = false;
        //     }
        //     System.out.println(n);
        //     n++;
        // } // prediction: 0,1,2,3...19

        int n = 0;
        while(true) {
            System.out.println("Hello World");
            n++;
            if(n == 10){
                break;
            }
        } //prediction: "Hello World" prints 10 times
    }
}
