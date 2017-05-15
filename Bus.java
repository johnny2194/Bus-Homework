public class Bus{
  private Person[] passengers;

  public Bus() {
    this.passengers = new Person[25];
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

  public void add(Person person) {
      if (isBusFull()) {
        return;
      }
      passengers[passengerCount()] = person;
    }
  


  public boolean isBusFull() {
    return passengerCount() >= passengers.length;
  }  


}
