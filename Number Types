import java.math.BigDecimal;

public class NumberTypes {

    public static void main(String[] args) {

        String types = "byte\t8 bits\t-128 to 127\n" +
                "short\t16 bits\t-32,768 to 32,767\n" +
                "char\t16 bits\t 0 to 65,535\n" +
                "int\t    32 bits\t-2,147,483,648 to 2,147,483,647\n" +
                "long\t64 bits\t-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807";

        System.out.println(types);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);


        BigDecimal a = new BigDecimal(Byte.MAX_VALUE);
        BigDecimal b = new BigDecimal(Short.MAX_VALUE);
        BigDecimal c = new BigDecimal(Integer.MAX_VALUE);
        BigDecimal d = new BigDecimal(Long.MAX_VALUE);

        BigDecimal e = a.multiply(b.multiply(c.multiply(d)));

        System.out.println(e);
//        byte	8 bits	-128 to 127
//        short	16 bits	-32,768 to 32,767
//        char	16 bits	0 to 65,535
//        int	32 bits	-2,147,483,648 to 2,147,483,647
//        long	64 bits	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    }
}
