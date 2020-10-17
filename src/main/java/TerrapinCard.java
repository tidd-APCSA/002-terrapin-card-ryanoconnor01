public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balance) {
  // write code here
    this.balance = balance;
  }

  public void payEconomical() {
// write code here
    if (this.balance >= 2.5) {
      this.balance = balance - 2.5;
    }
  }

  public void payGourmet() {
  // write code here
   if (this.balance >= 4.0) {
    this.balance = balance - 4.0;
   }
  }

// fixed up your loadMoney method. Check it out. Run your tests and see what happens 👨‍💻
  public void loadMoney(double amount) {
        if(amount < 0){
            this.balance = this.balance;
        }else if((this.balance + amount) > 150){
            this.balance = 150;
        }else{
            this.balance += amount;
        }
   }
//getter method
   public double getBalance(){
     return this.balance;
   }

  public String toString() {
  // write code here
    return "The card has " + this.balance + " dollars";
  }

}