
class animal{
    String familia = "mammal";
    String name;
    String gene;
    animal(String name,String gene){
        this.name = name;
        this.gene = gene;
    }
    public  void printDetails(){
        System.out.printf("the name of family is %s and the name is animal is %s and his gene is %s\n", familia,this.name,this.gene);
    }
}


class dog extends animal{
    dog(String name, String gene) {
        super(name, gene); // reference var for calling the constructor of parent
        //TODO Auto-generated constructor stub
    }
    String breed = "labra";
    public void showdetails(){
        System.out.printf("the name of dog is %s and the breed is %s",this.name,breed);
    }
}


public class b
{
	
	public static void main(String[] args) {
		System.out.println("DOG'S DETAIL");
		animal a = new animal("buzo","n24");
		dog buzo = new dog("buzo","n24");
		buzo.printDetails();
		buzo.showdetails();
	}
}
