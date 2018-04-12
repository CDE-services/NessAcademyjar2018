public class PrintLine {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        if(size == 5) {
        	System.out.println("je to 5");
        } else {
        	System.out.println("nie je to 5");
        }
        
        System.out.println(size == 5 ? "je to 5" : "nie je to 5");
        String s = size == 5 ? "a" : "b";
        if(size == 5) {
        	s = "a";
        } else {
        	s = "b";
        }
        
        int month = 3;
        switch (month) {
        case 1: System.out.println("January"); break;
        case 2: System.out.println("February"); break;
        case 3: System.out.println("March"); break;
        case 4: System.out.println("April"); break;
        case 5: System.out.println("May"); break;
        case 6: System.out.println("June"); break;
        case 7: System.out.println("July"); break;
        case 8: System.out.println("August"); break;
        case 9: System.out.println("September"); break;
        case 10: System.out.println("October"); break;
        case 11: System.out.println("November"); break;
        case 12: System.out.println("December"); break;
        default: System.out.println("Invalid month.");break;
        }
    }
}
