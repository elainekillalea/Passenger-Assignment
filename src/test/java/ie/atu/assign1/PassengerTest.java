package ie.atu.assign1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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
    void testTitleFail(){
        passenger.setTitle("xx");
        assertNull(passenger.getTitle());
    }

    @Test
    void testNamePass(){
        passenger.setName("John");
        assertEquals("John", passenger.getName());
    }

    @Test
    void testNameFail(){
        passenger.setName("zz");
        assertNull(passenger.getName());
    }

    @Test
    void testIdPass(){
        passenger.setId("G012345678");
        assertEquals("G012345678", passenger.getId());
    }

    @Test
    void testIdFail(){
        passenger.setId("qwerty");
        assertNull(passenger.getId());
    }


    @Test
    void testPhonePass(){
        passenger.setPhone("08712345");
        assertEquals("08712345", passenger.getPhone());
    }

    @Test
    void testPhoneFail(){
        passenger.setPhone("087123");
        assertNull(passenger.getPhone());
    }


    @Test
    void testAgePass(){
        passenger.setAge(25);
        assertEquals(25, passenger.getAge());
    }

    @Test
    void testAgeFail(){
        passenger.setAge(14);
        assertEquals(0, passenger.getAge());
    }

}
