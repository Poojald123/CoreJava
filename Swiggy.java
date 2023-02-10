class Swiggy {

public static void findItem(String item) {
System.out.println(" Invoked findItem()");
if(item == "Ice Cream"){
System.out.println(" The Price of Ice Cream is 125");
return ;
}
else{ 
System.out.println("Item Not Avaliable");
}
System.out.println("end of findItem");
return ;

}
}