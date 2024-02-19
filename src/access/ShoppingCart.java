package access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItem(){
        System.out.println();
    }

}
