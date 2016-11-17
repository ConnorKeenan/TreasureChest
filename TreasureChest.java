public class TreasureChest
{
private ArrayList<Bag> myChest; //An arraylist, representing many objects of Bag

public TreasureChest(Bag b1 Bag b2, Bag b3) //Takes in three Bags as parameters 
{
myChest = new ArrayList<>(); //Initializes the Arraylist
}

public int getTotal() //For every Bag in myChest, the total value of each bag is added together
{
int total = 0;
for(Bag b:myChest)
{
total = total+b.getValue();
}
return total;
}

public boolean getType(String type) //Searches each bag for a specific substring, a part of the String
for(bag b: myChest)
{
if(b.getDescription().contains(type)
{
return true;
}
return false;
}
}

public int getNumBags(String description) //Searches for specific bags, counts how many there are
{
int count = 0;
for(Bag b:myChest)
{
if(b.getDescription().equals(description)
{
count++;
}
}
return count;
}

public int getSpecialItems() //Looks for item within Bag
{
int count
for(myBag:myChest)
{
if(b.getDescription().contains(String description))
{
count = b.getCount+count;
}
}
return count;}
