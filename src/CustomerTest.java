import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Movie m1 = new Movie("movie1", 1);
    Movie m2 = new Movie("movie2", 2);
    Rental r1 = new Rental(m1, 10);
    Rental r2 = new Rental(m2, 5);
    Customer c1 = new Customer("joe");

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void statement() {
        c1.addRental(r1);   c1.addRental(r2);
        assertEquals("Rental Record for joe\n" +
                        "\tTitle		Days	Amount\n" +
                        "\tmovie1		10	30.0\n" +
                        "\tmovie2		5	4.5\n" +
                        "Amount owed is 34.5\n" +
                "You earned 3 frequent renter points", c1.statement());
    }
}