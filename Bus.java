public class Bus{
  private Person[] passengers;

  public Bus() {
    this.passengers = new Person[6];
  }

  public int passengerCount(){
    int count = 0;
    for(Person person : passengers){
      if(person != null){
        count++;
      }
    }
    return count;
  }
}