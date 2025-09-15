package OOPs;

public class Item {
    String[] itemCode;
    String[] itemName;
    double[] price;

    public Item(String[] itemCode,String[] itemName,double[] price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    public void displayDetails(int i){
        System.out.println("Item Code: "+itemCode[i]);
        System.out.println("Item Name: "+itemName[i]);
        System.out.println("Price: "+price[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        String[] itemCode = {"101","102","103"};
        String[] itemName = {"TV","Laptop","AC"};
        double[] price = {81000,125000,65000};
        double totalCost=0;
        Item item = new Item(itemCode, itemName, price);
        for(int i=0;i<itemCode.length;i++){
            item.displayDetails(i);
            totalCost=totalCost + price[i];
        }
        System.out.println("Total Price of items: "+ totalCost);    
    }
}
