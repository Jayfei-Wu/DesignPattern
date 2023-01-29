package principle.singleresponsibility;

/**
 * @PROJECT_NAME: DesignPattern
 * @PACKAGE_NAME: principle.singleresponsibility
 * @FILE_NAME: SingleResponsibility1
 * @Author: Jayfei-Wu
 * @create: 2023-01-29 2:22
 * @DESCRIPTION: TODO
 */

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}


/**
 * 交通工具类
 * 方式1
 * 1.在方式1的run方法中，违反了单一职责原则
 * 2.解决的方案：根据交通工具运行方法不同，分解成不同类即可
 */
class Vehicle {

    /**
     * @Param: [vehicle]
     * @return: void
     * @Author: Jayfei-Wu
     * @Date: 2023/1/29 2:36
     * @Description: TODO
     **/
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }

}



