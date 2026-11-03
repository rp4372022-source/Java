package oops.thisKeyword;

class Pizza{
    private String size;
    private boolean hasCheese = false;
    private boolean hasPepperoni = false;

    Pizza setSize(String size){
        this.size = size;
        return this;
    }

    Pizza addCheese(){
        this.hasCheese = true;
        return this;
    }

    Pizza addPepperoni(){
        this.hasPepperoni = true;
        return this;
    }

    void bake(){
        System.out.println("baking");
    }

}
public class A4_ReturningCurrentClassInstance {
    public static void main(String[] args) {
        Pizza myOrder = new Pizza();
        myOrder.setSize("Large")
            .addCheese()
            .addPepperoni()
            .bake();
    }
}
