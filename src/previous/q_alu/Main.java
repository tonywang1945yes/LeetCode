package previous.q_alu;

public class Main {
    public static void main(String [] args){
        ALU alu=new ALU();
//        System.out.println(alu.ieee754("-3.00",32));
//        System.out.println(alu.ieee754("-7.25",64));
//
//        System.out.println(alu.floatRepresentation("2147483647",2,4));
//        System.out.println(alu.floatRepresentation("13.25",8,23));
//        System.out.println(alu.floatTrueValue("01000001010101000000000000000000",8,23));
//        System.out.println(alu.floatRepresentation("-13.25",8,23));
//        System.out.println(alu.floatTrueValue("11000001010101000000000000000000",8,23));
//        System.out.println(alu.adder("11010","10011",'0',7));
//        System.out.println(alu.adder("1101","1000",'0',6));
        String a=alu.floatRepresentation("0.02",2,2);

        System.out.println("--------");
        System.out.println(a);

    }

//    @Test()
//    public void test100() {
//        ALU alu = new ALU();
//        assertEquals(alu.floatRepresentation("13.25",8,23),"01000001010101000000000000000000");
//        assertEquals(alu.floatRepresentation("-13.25",8,23),"11000001010101000000000000000000");
//        assertEquals(alu.floatTrueValue("11000001010101000000000000000000",8,23),"-13.25");
//        assertEquals(alu.floatTrueValue("01000001010101000000000000000000",8,23),"13.25");
//    }
//
//    @Test()
//    public void test101() {
//        ALU alu = new ALU();
//        assertEquals("NaN", alu.floatRepresentation(String.valueOf(Integer.MAX_VALUE), 2, 5));
//        assertEquals("+Inf", alu.floatRepresentation("2", -1, 1));
//        assertEquals("00010100", alu.floatRepresentation("0.01", 2, 5));
//    }
}
