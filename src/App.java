public static void main (String[] args) {
public class App {

    public void printBasket() {
        boolean isEmpty = true;
        for (Product product: products) {
            if (isEmpty == false) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
            if (isEmpty == true) {
                System.out.println("В корзине пусто ");
            }
        }
        System.out.println("Итого: " + getTotalCost());
    }
}
}
