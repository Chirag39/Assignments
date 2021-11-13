import org.junit.jupiter.api.*;

class CalcTest {

    @BeforeAll
    static void init(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void startup(){
        System.out.println("@BeforeEach executed");
    }

    @Test
    @DisplayName("@Test1")
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calc.add(2, 2));
    }

    @Test
    @DisplayName("@Test2")
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calc.add(2, 4));
    }

    @AfterEach
    void cleanup(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void exit(){
        System.out.println("@AfterAll executed");
    }
}