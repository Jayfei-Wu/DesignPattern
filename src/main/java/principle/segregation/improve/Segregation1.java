package principle.segregation.improve;

/**
 * @PROJECT_NAME: DesignPattern
 * @PACKAGE_NAME: principle.segregation
 * @FILE_NAME: Segregation1
 * @Author: Jayfei-Wu
 * @create: 2023-01-30 3:24
 * @DESCRIPTION: TODO
 */
public class Segregation1 {

    public static void main(String[] args) {

        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }

}


/**
 * 类 A通过接口 interface1 依赖类 B，类 C通过接口 interface1依赖类 D，
 * 如果接口 interface1 对于类 A 和类 C来说不是最小接口，那么类 B和类 D必须去实现他们不需要的方法
 * 将接口interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
 */
interface Interface1 {

    void method1();

}

interface Interface2 {

    void method2();
    void method3();

}

interface Interface3 {

    void method4();
    void method5();

}

class B implements Interface1,Interface2 {

    @Override
    public void method1() {
        System.out.println(" B 实现了 method1");
    }

    @Override
    public void method2() {
        System.out.println(" B 实现了 method2");
    }

    @Override
    public void method3() {
        System.out.println(" B 实现了 method3");
    }

}


class D implements Interface1,Interface3 {

    @Override
    public void method1() {
        System.out.println(" D 实现了 method1");
    }

    @Override
    public void method4() {
        System.out.println(" D 实现了 method4");
    }

    @Override
    public void method5() {
        System.out.println(" D 实现了 method5");
    }
}

/**
 * A 类通过接口Interface1 依赖（使用）B类，但是只会用到1，2，3方法
 */
class A {
    public void depend1(Interface1 i) {
        i.method1();
    }
    public void depend2(Interface2 i) {
        i.method2();
    }
    public void depend3(Interface2 i) {
        i.method3();
    }
}

/**
 * C 类通过接口Interface1 依赖（使用）D类，但是只会用到1，4，5方法
 */
class C {
    public void depend1(Interface1 i) {
        i.method1();
    }
    public void depend4(Interface3 i) {
        i.method4();
    }
    public void depend5(Interface3 i) {
        i.method5();
    }
}