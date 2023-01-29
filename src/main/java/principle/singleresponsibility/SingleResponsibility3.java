package principle.singleresponsibility;

/**
 * @PROJECT_NAME: DesignPattern
 * @PACKAGE_NAME: principle.singleresponsibility
 * @FILE_NAME: SingleResponsibility3
 * @Author: Jayfei-Wu
 * @create: 2023-01-29 3:12
 * @DESCRIPTION: TODO
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");

    }
}

/**
 * 交通工具类
 * 方式3
 * 1.这种修改方法没有对原来的类做大的修改，只是增加了方法
 * 2.这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上仍然遵守单一职责
 */

class Vehicle2 {

    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水里运行...");
    }
}