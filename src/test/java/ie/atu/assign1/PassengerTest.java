package ie.atu.assign1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    void setUp(){
        passenger = new Passenger();
    }

    @Test
    void testTitlePass(){
        passenger.setTitle("Mr");
        assertEquals("Mr", passenger.getTitle());
    }

    @Test
    void exceptionTestingTitle() {
        Exception exMsg = assertThrows(IllegalArgumentException.class, () -> passenger.setTitle("xx"));
        assertEquals("Title invalid, try again", exMsg.getMessage());
    }

    @Test
    void testNamePass(){
        passenger.setName("John");
        assertEquals("John", passenger.getName());
    }

    @Test
    void exceptionTestingName() {
        Exception exMsg = assertThrows(IllegalArgumentException.class, () -> passenger.setName("zz"));
        assertEquals("Name invalid, try again", exMsg.getMessage());
    }

    @Test
    void testIdPass(){
        passenger.setId("G012345678");
        assertEquals("G012345678", passenger.getId());
    }

    @Test
    void exceptionTestingId() {
        Exception exMsg = assertThrows(IllegalArgumentException.class, () -> passenger.setId("qwerty"));
        assertEquals("Id invalid, try again", exMsg.getMessage());
    }

    @Test
    void testPhonePass(){
        passenger.setPhone("08712345");
        assertEquals("08712345", passenger.getPhone());
    }

    @Test
    void exceptionTestingPhone() {
        Exception exMsg = assertThrows(IllegalArgumentException.class, () -> passenger.setPhone("087123"));
        assertEquals("Phone number invalid, try again", exMsg.getMessage());
    }


    @Test
    void testAgePass(){
        passenger.setAge(25);
        assertEquals(25, passenger.getAge());
    }

    @Test
    void exceptionTestingAge() {
        Exception exMsg = assertThrows(IllegalArgumentException.class, () -> passenger.setAge(14));
        assertEquals("Age invalid, try again", exMsg.getMessage());
    }

    @AfterEach
    void tearDown(){

    }
}
