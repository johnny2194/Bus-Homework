import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus();
    person = new Person();
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAddPerson(){
    bus.add(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i<25; i++){
      bus.add(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void canNotAddPersonWhenBusFull(){
    for(int i = 0; i<30; i++){
      bus.add(person);
    }
    assertEquals(25, bus.passengerCount());
  }

  @Test
  public void shouldEmptyBusAfterDestination(){
    bus.add(person);
    bus.destination();
    assertEquals(0, bus.passengerCount());
  }

}