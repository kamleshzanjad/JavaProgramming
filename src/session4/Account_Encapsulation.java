package session4;
/*
Encapsulation in Java is a process of wrapping code and data together into a single unit,
        for example, a capsule which is mixed of several medicines.

We can create a fully encapsulated class in by making all the data members of the class private.
Now we can use setter and getter methods to set and get the data in it.
Navigate to Menu Code>Generate > Select Getter or Setter
*/

class Account {
    //private data members
    private long acc_no;
    private String name;
    private float amount;

    //public getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
}

 class TestEncapsulation {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAcc_no(7560504000L);
        acc.setName("FirstName MiddleName LastName");
        acc.setAmount(500000f);
        System.out.println("Account Name is: " + acc.getAcc_no()+"\nAccount Name: "+acc.getName()+" \nAmount: "+acc.getAmount());

        // Try to uncomment below line. Private members can not be access out side Class Acount

       // acc.name = "Account name";
       // acc.amount =1000;
    }
}

/*
Account Name is: 7560504000
Account Name: FirstName MiddleName LastName
Amount: 500000.0
 */