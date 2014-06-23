public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(ComponentInterface component) {
        super(component);
    }

    public void operation() {
        System.out.print("ConcreteDecoratorB called");
    }
}
